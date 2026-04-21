-- ==========================================
-- FASE 1: TABELAS INDEPENDENTES
-- ==========================================

-- 1. Hospital (10 registros)
INSERT INTO hospital (cnpj, nome) VALUES
('11.111.111/0001-11', 'Hospital Central'),
('22.222.222/0001-22', 'Hospital São José'),
('33.333.333/0001-33', 'Hospital Santa Maria'),
('44.444.444/0001-44', 'Clínica Norte'),
('55.555.555/0001-55', 'Hospital Universitário'),
('66.666.666/0001-66', 'Maternidade Luz'),
('77.777.777/0001-77', 'Hospital do Coração'),
('88.888.888/0001-88', 'Hospital das Clínicas'),
('99.999.999/0001-99', 'Pronto Socorro Leste'),
('10.101.010/0001-10', 'Hospital Adventista');

-- 2. Plano de Saúde (10 registros - ENUM: nacional, regional)
INSERT INTO plano_saude (nome, telefone, cobertura) VALUES
('Unimed', '(11) 9999-9999', 'nacional'),
('Bradesco Saúde', '(11) 8888-8888', 'nacional'),
('Amil', '(11) 7777-7777', 'nacional'),
('SulAmérica', '(11) 6666-6666', 'nacional'),
('Hapvida', '(85) 5555-5555', 'regional'),
('NotreDame Intermédica', '(11) 4444-4444', 'regional'),
('Prevent Senior', '(11) 3333-3333', 'regional'),
('Cassi', '(61) 2222-2222', 'nacional'),
('Porto Seguro Saúde', '(11) 1111-1111', 'regional'),
('Allianz Saúde', '(11) 0000-0000', 'nacional');

-- 3. Paciente (10 registros)
INSERT INTO paciente (nome, cpf) VALUES
('João da Silva', '111.111.111-11'),
('Maria Oliveira', '222.222.222-22'),
('Carlos Souza', '333.333.333-33'),
('Ana Costa', '444.444.444-44'),
('Pedro Santos', '555.555.555-55'),
('Lucas Pereira', '666.666.666-66'),
('Juliana Lima', '777.777.777-77'),
('Marcos Ferreira', '888.888.888-88'),
('Fernanda Alves', '999.999.999-99'),
('Rafael Gomes', '000.000.000-00');

-- 4. Especialidade (10 registros)
INSERT INTO especialidade (nome) VALUES
('Cardiologia'), ('Pediatria'), ('Ortopedia'), ('Neurologia'), ('Dermatologia'),
('Ginecologia'), ('Oftalmologia'), ('Oncologia'), ('Endocrinologia'), ('Psiquiatria');

-- 5. Medicamento (10 registros)
INSERT INTO medicamento (nome) VALUES
('Dipirona 500mg'), ('Paracetamol 750mg'), ('Amoxicilina 500mg'), ('Ibuprofeno 400mg'),
('Omeprazol 20mg'), ('Losartana 50mg'), ('Simvastatina 20mg'), ('Aspirina 100mg'),
('Azitromicina 500mg'), ('Clonazepam 2mg');

-- 6. Laboratório (10 registros - ENUM: interno, externo)
INSERT INTO laboratorio (nome, tipo) VALUES
('Lab Central', 'interno'), ('Lab São José', 'interno'), ('Sabin', 'externo'),
('Fleury', 'externo'), ('Hermes Pardini', 'externo'), ('Lab Universitário', 'interno'),
('Dasa', 'externo'), ('Lab Santa Maria', 'interno'), ('Lab do Coração', 'interno'),
('Exame Fácil', 'externo');


-- ==========================================
-- FASE 2: TABELAS COM DEPENDÊNCIA NÍVEL 1
-- ==========================================

-- 7. Médico (10 registros)
INSERT INTO medico (nome, crm, especialidade_id) VALUES
('Dr. Roberto', '12345-SP', 1), ('Dra. Camila', '23456-SP', 2),
('Dr. Fernando', '34567-RJ', 3), ('Dra. Beatriz', '45678-MG', 4),
('Dr. Marcelo', '56789-SP', 5), ('Dra. Laura', '67890-RS', 6),
('Dr. Thiago', '78901-PR', 7), ('Dra. Sofia', '89012-SC', 8),
('Dr. André', '90123-BA', 9), ('Dra. Mariana', '01234-SP', 10);

-- 8. Credenciados (10 registros)
INSERT INTO credenciados (hospital_id, plano_saude_id, data_credenciamento) VALUES
(1, 1, '2020-01-15'), (1, 2, '2020-02-20'), (2, 1, '2021-03-10'),
(2, 3, '2021-04-05'), (3, 4, '2019-05-12'), (4, 5, '2022-06-18'),
(5, 6, '2023-07-22'), (6, 7, '2020-08-30'), (7, 8, '2021-09-14'),
(8, 9, '2022-10-25');

-- 9. Ala (10 registros - Sem a enfermeira chefe por enquanto)
-- ENUM: uti, enfermaria, pediatria
INSERT INTO ala (tipo, num_leitos_disponiveis, hospital_id, enfermeira_responsavel_id) VALUES
('uti', 10, 1, NULL), ('enfermaria', 50, 1, NULL), ('pediatria', 20, 1, NULL),
('uti', 15, 2, NULL), ('enfermaria', 40, 2, NULL), ('uti', 12, 3, NULL),
('enfermaria', 30, 3, NULL), ('pediatria', 25, 4, NULL), ('uti', 8, 5, NULL),
('enfermaria', 60, 6, NULL);


-- ==========================================
-- FASE 3: TABELAS COM DEPENDÊNCIA NÍVEL 2
-- ==========================================

-- 10. Leito (10 registros - ENUM: ocupado, livre, em_manutencao)
INSERT INTO leito (identificador, status, ala_id) VALUES
('UTI-01', 'ocupado', 1), ('UTI-02', 'livre', 1), ('ENF-101', 'ocupado', 2),
('ENF-102', 'livre', 2), ('PED-01', 'em_manutencao', 3), ('PED-02', 'livre', 3),
('UTI-03', 'ocupado', 4), ('ENF-201', 'livre', 5), ('UTI-04', 'ocupado', 6),
('ENF-301', 'livre', 7);

-- 11. Enfermeira (10 registros - ENUM: manha, tarde, noite)
-- A Enfermeira 1 será a Chefe Geral (enfermeira_chefe_id = NULL)
INSERT INTO enfermeira (nome, turno, cre, ala_id, enfermeira_chefe_id) VALUES
('Enf. Alice (Chefe)', 'manha', '11111-SP', 1, NULL),
('Enf. Bruna', 'tarde', '22222-SP', 1, 1),
('Enf. Carla', 'noite', '33333-SP', 2, 1),
('Enf. Daniela', 'manha', '44444-RJ', 3, 1),
('Enf. Elaine', 'tarde', '55555-MG', 4, 1),
('Enf. Fabiana', 'noite', '66666-RS', 5, 1),
('Enf. Gabriela', 'manha', '77777-PR', 6, 1),
('Enf. Helena', 'tarde', '88888-SC', 7, 1),
('Enf. Isabela', 'noite', '99999-BA', 8, 1),
('Enf. Julia', 'manha', '00000-SP', 9, 1);

-- 12. Atualizando a Ala com as Enfermeiras Responsáveis
UPDATE ala SET enfermeira_responsavel_id = 1 WHERE id IN (1, 2, 3);
UPDATE ala SET enfermeira_responsavel_id = 4 WHERE id IN (4, 5);
UPDATE ala SET enfermeira_responsavel_id = 7 WHERE id IN (6, 7);
UPDATE ala SET enfermeira_responsavel_id = 10 WHERE id IN (8, 9, 10);

-- 13. Atendimento (10 registros)
-- ENUM TIPO: consulta, emergencia, revisao
-- ENUM STATUS: realizado, cancelado, agendado
INSERT INTO atendimento (paciente_id, tipo, status, observacoes_clinicas, medico_id, data_hora) VALUES
(1, 'emergencia', 'realizado', 'Paciente com dor no peito', 1, '2026-04-01 10:00:00'),
(2, 'consulta', 'realizado', 'Rotina pediátrica', 2, '2026-04-02 14:30:00'),
(3, 'revisao', 'realizado', 'Retorno pós-cirúrgico', 3, '2026-04-03 09:15:00'),
(4, 'consulta', 'agendado', 'Enxaqueca frequente', 4, '2026-04-25 11:00:00'),
(5, 'emergencia', 'realizado', 'Reação alérgica', 5, '2026-04-05 20:45:00'),
(6, 'consulta', 'cancelado', 'Paciente não compareceu', 6, '2026-04-06 15:00:00'),
(7, 'revisao', 'realizado', 'Exame de vista anual', 7, '2026-04-07 08:30:00'),
(8, 'consulta', 'realizado', 'Acompanhamento oncológico', 8, '2026-04-08 13:20:00'),
(9, 'emergencia', 'realizado', 'Crise de hipoglicemia', 9, '2026-04-09 18:10:00'),
(10, 'consulta', 'agendado', 'Sintomas de ansiedade', 10, '2026-04-26 16:00:00');


-- ==========================================
-- FASE 4: TABELAS DE PONTAS E FINANCEIRO
-- ==========================================

-- 14. Internação (10 registros)
INSERT INTO internacao (leito_id, data_entrada, data_saida, paciente_id) VALUES
(1, '2026-04-01 11:00:00', '2026-04-10 10:00:00', 1),
(3, '2026-04-02 15:00:00', '2026-04-05 14:00:00', 3),
(7, '2026-04-05 21:00:00', NULL, 5),
(9, '2026-03-20 08:00:00', '2026-04-01 09:00:00', 8),
(2, '2026-04-15 10:00:00', NULL, 9),
(4, '2026-02-10 12:00:00', '2026-02-15 12:00:00', 2),
(8, '2026-03-01 09:00:00', '2026-03-10 10:00:00', 4),
(10, '2026-04-10 14:00:00', '2026-04-12 15:00:00', 6),
(1, '2026-01-05 20:00:00', '2026-01-20 10:00:00', 7),
(3, '2026-03-25 11:00:00', '2026-03-28 10:00:00', 10);

-- 15. Prescrição (10 registros)
INSERT INTO prescricao (data, dosagem_quantidade, atendimento_id, medicamento_id) VALUES
('2026-04-01', '1 comprimido 8/8h', 1, 8),
('2026-04-02', '20 gotas 6/6h', 2, 1),
('2026-04-03', '1 comprimido 12/12h', 3, 4),
('2026-04-05', 'Dose única injetável', 5, 5),
('2026-04-07', '1 gota cada olho 12/12h', 7, 3),
('2026-04-08', '1 comprimido ao dia', 8, 2),
('2026-04-09', '1 comprimido ao acordar', 9, 6),
('2026-04-01', '1 comprimido após almoço', 1, 7),
('2026-04-02', '10ml 8/8h', 2, 9),
('2026-04-05', '1 comprimido SOS', 5, 10);

-- 16. Exame (10 registros com os novos tipos)
-- ENUM TIPO: sangue, imagem, raio-x, ultrassom
-- ENUM RESULTADO: normal, alterado, critico
INSERT INTO exame (paciente_id, laboratorio_id, arquivo_laudo, medico_id, tipo, custo, descricao, resultado, data_solicitacao, data_resultado) VALUES
(1, 1, NULL, 1, 'sangue', 150.00, 'Hemograma Completo', 'alterado', '2026-04-01 10:30:00', '2026-04-01 14:00:00'),
(1, 2, NULL, 1, 'imagem', 450.00, 'Tomografia de Crânio', 'critico', '2026-04-01 10:45:00', '2026-04-01 11:30:00'),
(2, 3, NULL, 2, 'sangue', 80.00, 'Glicemia de jejum', 'normal', '2026-04-02 15:00:00', '2026-04-03 08:00:00'),
(3, 4, NULL, 3, 'raio-x', 120.00, 'Raio-X de Tórax (PA e Perfil)', 'normal', '2026-04-03 09:30:00', '2026-04-03 10:00:00'),
(5, 5, NULL, 5, 'sangue', 200.00, 'Painel Alérgico', 'alterado', '2026-04-05 21:00:00', '2026-04-06 10:00:00'),
(7, 6, NULL, 7, 'ultrassom', 250.00, 'Ultrassom Abdominal Total', 'normal', '2026-04-07 09:00:00', '2026-04-08 14:00:00'),
(8, 7, NULL, 8, 'sangue', 850.00, 'Marcadores Tumorais', 'alterado', '2026-04-08 14:00:00', '2026-04-10 16:00:00'),
(9, 8, NULL, 9, 'sangue', 120.00, 'Hemoglobina Glicada', 'critico', '2026-04-09 18:30:00', '2026-04-10 09:00:00'),
(4, 9, NULL, 4, 'imagem', 1200.00, 'Ressonância Magnética Pélvica', 'normal', '2026-04-25 11:30:00', NULL),
(10, 10, NULL, 10, 'raio-x', 180.00, 'Raio-X de Joelho Direito', 'normal', '2026-04-26 16:30:00', NULL);

-- 17. Fatura (10 registros)
-- ENUM STATUS: pendente, pago, cancelado, em_analise
INSERT INTO fatura (paciente_id, data_emissao, data_vencimento, status, valor_total, forma_pagamento) VALUES
(1, '2026-04-10', '2026-04-20', 'pendente', 5000.00, 'Boleto'),
(2, '2026-04-03', '2026-04-10', 'pago', 350.00, 'Cartão de Crédito'),
(3, '2026-04-05', '2026-04-15', 'pago', 850.00, 'PIX'),
(4, '2026-04-25', '2026-05-05', 'pendente', 1500.00, 'Boleto'),
(5, '2026-04-06', '2026-04-16', 'em_analise', 2200.00, 'Plano de Saúde'),
(6, '2026-04-06', '2026-04-16', 'cancelado', 0.00, NULL),
(7, '2026-04-08', '2026-04-18', 'pago', 950.00, 'Cartão de Débito'),
(8, '2026-04-10', '2026-04-20', 'pendente', 8500.00, 'Plano de Saúde'),
(9, '2026-04-10', '2026-04-20', 'pendente', 450.00, 'PIX'),
(10, '2026-04-26', '2026-05-06', 'pendente', 600.00, 'Cartão de Crédito');

-- A TABELA 'nota_fiscal' FICA VAZIA!