-- Tabelas independentes
create table hospital (
	id serial primary key,
	cnpj varchar(18) not null check (char_length(cnpj) >= 14),
	nome varchar(100) not null
);

create table plano_saude (
	id serial primary key,
	nome varchar(100) unique not null, -- Não pode conter Planos de Saúde com o mesmo nome
	telefone varchar(20),
	cobertura varchar(50) not null check (cobertura in ('nacional','regional')) -- ENUM: Nacional, Regional
);

create table paciente (
	id serial primary key,
	nome varchar(100) not null,
	cpf varchar(14) unique not null check (char_length(cpf) >= 11)
);

create table especialidade (
	id serial primary key,
	nome varchar(100) unique not null
);

create table medico (
	id serial primary key,
	nome varchar(100) not null,
	crm varchar(20) unique not null,
	especialidade_id int not null,
	foreign key (especialidade_id) references especialidade(id)
);

create table medicamento (
	id serial primary key,
	nome varchar(100) unique not null
);

create table laboratorio (
	id serial primary key,
	nome varchar(100) not null,
	tipo varchar(50) not null check (tipo in ('interno', 'externo'))-- ENUM: interno, externo
);

-- Tabela relacionamento N:M
create table credenciados (
	hospital_id int not null,
	plano_saude_id int not null,
	data_credenciamento date not null default current_date,
	primary key (hospital_id, plano_saude_id),
	foreign key (hospital_id) references hospital(id),
	foreign key (plano_saude_id) references plano_saude(id)
);


-- Estrutura do Hospital
create table ala (
	id serial primary key,
	tipo varchar(50) not null check (tipo in  ('uti','enfermaria','pediatria')), -- ENUM, UTI, enfermaria, pediatria
	num_leitos_disponiveis INT check (num_leitos_disponiveis >= 0),
	hospital_id int not null,
	enfermeira_responsavel_id int,
	foreign key (hospital_id) references hospital(id)
);

create table leito (
	id serial primary key,
	identificador varchar(20) unique not null,
	status varchar(50) not null check (status in ('ocupado','livre','em_manutencao')), -- ENUM: ocupado, livre,  em_manutencao
	ala_id int not null,
	foreign key (ala_id) references ala(id)
);

create table enfermeira (
	id serial primary key,
	nome varchar(100) not null,
	turno varchar(50) not null check (turno in ('manha', 'tarde', 'noite')), -- ENUM: manhã, tarde, noite
	cre varchar(20) unique not null,
	ala_id int not null,
	enfermeira_chefe_id int,
	foreign key (ala_id) references ala(id),
	foreign key (enfermeira_chefe_id) references enfermeira(id)
);

-- Adicionando a FK da enfermeira responsável na Ala
alter table ala 
add constraint fk_ala_enfermeira_responsavel 
foreign key (enfermeira_responsavel_id) references enfermeira(id);

-- Movimentações Médicas
create table internacao (
	id serial primary key,
	leito_id int not null,
	data_entrada timestamp not null default now(),
	data_saida timestamp check (data_saida is null or data_saida > data_entrada),
	paciente_id int not null,
	foreign key (leito_id) references leito(id),
	foreign key (paciente_id) references paciente(id)
);

create table atendimento (
	id serial primary key,
	paciente_id int not null,
	tipo varchar(50) not null check (tipo in ('consulta','emergencia','revisao')), -- ENUM: consulta, emergência, revisão
	status varchar(50) not null check (status in ('realizado','cancelado','agendado')), -- ENUM: realizado, cancelado, agendado
	observacoes_clinicas TEXT,
	medico_id int not null,
	data_hora timestamp not null default now(),
	foreign key (paciente_id) references paciente(id),
	foreign key (medico_id) references medico(id)
);

create table prescricao (
	id serial primary key,
	data date not null default current_date,
	dosagem_quantidade varchar(50) not null,
	atendimento_id int not null,
	medicamento_id int not null,
	foreign key (atendimento_id) references atendimento(id),
	foreign key (medicamento_id) references medicamento(id)
);

create table exame (
	id serial primary key,
	paciente_id int not null,
	laboratorio_id int not null,
	arquivo_laudo bytea,
	medico_id int not null,
	tipo varchar(50) not null check (tipo in ('sangue', 'imagem', 'raio-x', 'ultrassom')), -- sangue, imagem, etc...
	custo decimal(10,2) not null check (custo >= 0),
	descricao TEXT,
	resultado VARCHAR(50) not null check (resultado in ('normal', 'alterado', 'critico')), -- ENUM: normal, alterado, crítico
	data_solicitacao timestamp not null default now(),
	data_resultado timestamp,
	foreign key (paciente_id) references paciente(id),
	foreign key (laboratorio_id) references laboratorio(id),
	foreign key (medico_id) references medico(id)
);


-- Financeiro
create table fatura (
	id serial primary key,
	paciente_id int not null,
	data_emissao date not null,
	data_vencimento date not null check (data_vencimento >= data_emissao),
	status varchar(50) not null check (status in ('pendente','pago','cancelado','em_analise')), -- ENUM: pendente, pago, cancelado, em_analise
	valor_total decimal(10,2) not null check (valor_total >= 0),
	forma_pagamento varchar(50),
	foreign key (paciente_id) references paciente(id)
);

create table nota_fiscal (
	id serial primary key,
	fatura_id int not null,
	nome_emissor varchar(100),
	paciente_id int not null,
	data_emissao date not null default current_date,
	descricao_atendimento TEXT,
	valor_bruto decimal(10,2) not null check (valor_bruto >= 0),
	pis decimal(10,2) not null check (pis >= 0),
	cofins decimal(10,2) not null check (cofins >= 0),
	iss decimal(10,2) not null check (iss >= 0),
	irpj decimal(10,2) not null check (irpj >= 0),
	csll decimal(10,2) not null check (csll >= 0),
	paciente_nome varchar(100) not null,
	foreign key (fatura_id) references fatura(id),
	foreign key (paciente_id) references paciente(id)
);

