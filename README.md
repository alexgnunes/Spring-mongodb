# Projeto MongoDB com Spring Boot

 Projeto realizado durante o curso de Java orientado a objetos, com a finalidade de cadastrar usuários em um blog, além de suas postagens e comentários. Foi utilizado no projeto banco de dados não relacional MongoDB.

## Objetivo geral:
- Compreender as principais diferenças entre paradigma orientado a documentos e relacional
- Implementar operações de CRUD
- Refletir sobre decisões de design para um banco de dados orientado a documentos
- Implementar associações entre objetos
- Objetos aninhados
- Realizar consultas com Spring Data e MongoRepository

## Padrão de camadas do projeto

![Padrão de camadas](https://github.com/alexgnunes/Spring-mongodb/blob/main/assets/padrao%20de%20camadas.png)

## Modelo conceitual
![Modelo Conceitual](https://github.com/alexgnunes/Spring-mongodb/blob/main/assets/modelo%20conceitual.png)

## Tecnologias utilizadas

- Java
- Spring Boot
- MongoDB
- Maven
- Postman

## Como executar o projeto

Pré-requisitos: 

- Java 17
- MongoDB versão 3.6.23
- Postman

### Clonar repositório

[![github](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/alexgnunes/Spring-mongodb)

### Entrar na pasta do projeto springWithMongodb

### Executar o mongoDB

no prompt de comando:  mongod

### Executar o projeto
./mvnw spring-boot:run (executo no próprio gitbash)

### Teste de requisições feito pelo Postman

- Retorna todos usuários ➡️ GET: http://localhost:8080/users
- Busca por título ➡️ GET: http://localhost:8080/posts/titleserch?text=bom (nesse exemplo títulos com a palavra "bom")
- Insere usuário ➡️ POST: http://localhost:8080/users

  - Comando JSON adicionado ao body do post:
    - {
    "name" : "Tony",
    "email" : "tony@gmail.com"}

- Deleta usuário ➡️ DELETE: http://localhost:8080/users/{/id}


