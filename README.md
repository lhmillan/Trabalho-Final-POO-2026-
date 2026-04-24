# 🏥 Sistema de Faturamento Hospitalar - Residência Serratec 2026.1

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-316192?style=for-the-badge&logo=postgresql&logoColor=white)
![VS Code](https://img.shields.io/badge/Visual%20Studio%20Code-0078d7.svg?style=for-the-badge&logo=visual-studio-code&logoColor=white)

Projeto final desenvolvido para a disciplina de **Programação Orientada a Objetos (POO)** dentro da residência em TIC do **Serratec**. O sistema simula a gestão operacional e financeira de um complexo hospitalar, integrando um banco de dados robusto com uma aplicação Java desktop.

## 📋 Sobre o Projeto

O sistema foi desenhado para gerir desde a infraestrutura física (alas, leitos e equipamentos) até o ciclo financeiro final (emissão de Notas Fiscais e exportação de dados). O foco principal foi a aplicação de conceitos avançados de POO, integridade referencial em banco de dados e precisão em cálculos matemáticos financeiros.

### Principais Funcionalidades
- **Gestão Clínica:** Cadastro de pacientes, médicos (por especialidade), enfermeiras e laboratórios.
- **Estrutura Hospitalar:** Controle de alas, leitos e status de ocupação.
- **Movimentações:** Registro de atendimentos (consultas, emergências) e internações com controle de data/hora.
- **Módulo Financeiro:** - Cálculo automatizado de impostos (**PIS, COFINS, ISS, IRPJ e CSLL**) usando `BigDecimal`.
  - Geração de Notas Fiscais a partir de faturas pendentes.
  - **Exportação de Relatórios:** Geração automática de arquivo `.csv` com os dados consolidados.

## 🏗️ Arquitetura e Tecnologias

A aplicação segue o padrão de arquitetura **MVC (Model-View-Controller)** e utiliza o padrão **DAO (Data Access Object)** para isolar a lógica de persistência.

### Tecnologias Utilizadas:
- **Linguagem:** Java 17+
- **Banco de Dados:** PostgreSQL 15+
- **Persistência:** JDBC (Java Database Connectivity)
- **IDE:** Visual Studio Code

### Estrutura de Pacotes:
- `br.com.serratec.model`: Entidades que representam as tabelas do banco.
- `br.com.serratec.dao`: Classes responsáveis pelo CRUD e consultas SQL.
- `br.com.serratec.service`: Regras de negócio e cálculos de impostos.
- `br.com.serratec.enums`: Tipagens seguras (Enums) para Status e Tipos.
- `br.com.serratec.util`: Fábrica de conexões com o banco de dados.

## 🗄️ Banco de Dados

O modelo relacional conta com **17 tabelas** normalizadas, garantindo a integridade dos dados e evitando redundâncias.

- **Normalização Avançada:** Tabelas separadas para `Especialidade`, `Ala`, `Laboratório` e `Medicamento`.
- **Integridade:** Uso extensivo de restrições `CHECK` para simular tipos enumerados e garantir que valores financeiros nunca sejam negativos.
- **Relacionamentos:** Implementação de tabelas associativas (N:M) e chaves estrangeiras (FK) estratégicas.

## 🚀 Como Executar o Projeto

1. **Clone o repositório:**
   ```bash
   git clone [https://github.com/lhmillan/Trabalho-Final-POO-2026-.git](https://github.com/lhmillan/Trabalho-Final-POO-2026-.git)
