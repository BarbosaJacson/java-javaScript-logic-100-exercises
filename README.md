# 🚀 Resolução da Lista de Exercícios de Lógica & Algoritmos (IFBA)

![Java](https://img.shields.io/badge/Java-21-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![JavaScript](https://img.shields.io/badge/JavaScript-ES6+-F7DF1E?style=for-the-badge&logo=javascript&logoColor=black)
![License](https://img.shields.io/badge/License-MIT-green?style=for-the-badge)

## 📌 Sobre o Projeto

Este repositório foi iniciado em **15 de agosto de 2025** com o objetivo principal de praticar, consolidar e aperfeiçoar os conceitos fundamentais de lógica de programação, algoritmos e estruturas de dados. 

Ao longo da jornada, a resolução da lista com **100 exercícios graduais** (abrangendo desde operações aritméticas simples até matrizes multidimensionais e validações de permutações complexas) foi implementada em duas linguagens modernas: **Java 21+** e **JavaScript (ES6+)**.

---

## 🛠️ Arquitetura e Boas Práticas

O desenvolvimento foi guiado por padrões rigorosos de Engenharia de Software adotados pelo mercado:

- **SOLID (Single Responsibility Principle)**: Separação clara entre a camada de serviço/domínio (`Service`) e a camada de execução de terminal (`Runner`/`Main`).
- **Clean Code**: Funções concisas, nomeação semântica e legibilidade.
- **Validação Defensiva (Fail-Fast)**: Tratamento e encerramento antecipado do fluxo em caso de dados inválidos.
- **Módulos Modernos**: Uso de `ES Modules` (`import`/`export`) no Node.js e recursos do Java 21 LTS.
- **Git Flow & Conventional Commits**: Histórico de commits versionado no padrão internacional.

---

## 📂 Estrutura de Diretórios

```text
listaExercicioIfbaV5/
├── java/                         # Implementação em Java 21+
│   └── src/
│       ├── main/java/services/   # Regras de negócio e algoritmos puros
│       └── main/java/Main.java   # Runners de console interativo
└── js/                           # Implementação em JavaScript (ES6+)
    └── src/
        ├── services/             # Classes de serviços modulares
        └── runners/              # Executáveis com readline interativo
