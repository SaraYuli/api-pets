# 🐾 Pet API

## 📌 Descrição

Este projeto tem como objetivo o desenvolvimento de uma **API RESTful para gerenciamento de pets**, utilizando o **framework Spring Boot** e o banco de dados **H2 (em memória)**.

A aplicação permite o **cadastro, consulta, atualização e exclusão de pets**, oferecendo as operações básicas de um **CRUD completo**.  
O projeto foi desenvolvido como parte da avaliação final da disciplina de Desenvolvimento Web com Java.

---

## 🐕 Funcionalidades Principais

A API permite gerenciar informações sobre pets, incluindo:

- 🆕 Cadastro de novos pets  
- 🔍 Consulta de todos os pets ou de um pet específico pelo ID  
- ✏️ Atualização completa ou parcial de registros  
- ❌ Exclusão de pets cadastrados  

Cada pet contém os seguintes atributos:

| Campo   | Tipo    | Descrição |
|---------|---------|--------------------------------------------|
| `id`    | Long    | Identificador único do pet                 |
| `nome`  | String  | Nome do pet                                |
| `tipo`  | String  | Espécie (ex: cachorro, gato, pássaro, etc) |
| `raca`  | String  | Raça do pet                                |
| `idade` | Integer | Idade em anos                              |
| `tutor` | String  | Nome do tutor/responsável                  |

---

## 🔗 Endpoints da API

| Método | Rota | Descrição |
|--------|---------------------------|-------------------------------------------|
| GET | `/pets` | Retorna todos os pets cadastrados |
| GET | `/pets/{id}` | Retorna um pet pelo seu ID |
| POST | `/pets` | Cadastra um novo pet |
| PUT | `/pets/{id}` | Atualiza completamente os dados de um pet |
| PATCH | `/pets/{id}` | Atualiza parcialmente os dados de um pet |
| DELETE | `/pets/{id}` | Exclui um pet do sistema |

---

## 💾 Tecnologias Utilizadas

- ☕ **Java 17+**
- 🌱 **Spring Boot 3+**
- 🗃️ **Banco de Dados H2 (em memória)**
- 🔗 **Spring Data JPA**
- 📜 **Maven** (gerenciamento de dependências)
- 🧰 **Spring Web** (criação dos endpoints REST)



