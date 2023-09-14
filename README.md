# Sistema de Gerenciamento de Funcionários

Este projeto é um sistema de gerenciamento de funcionários construído com Java 11, Spring Boot e outras tecnologias.

## Tecnologias Utilizadas

- Java 11
- Spring Boot
- Maven
- Swagger
- Banco de Dados PostgreSQL
- IntelliJ IDEA (ou sua IDE preferida)

## Configuração do Ambiente de Desenvolvimento

1. Certifique-se de ter o Java 11 instalado. Você pode verificar a versão do Java com o comando:
2. 1 - No seu teclado digite o comando " + R ", digite cmd e clique em OK:
3. 2 - Após aberto o Prompt de Comando, digite: java -version. Esse comando mostrará a versão do Java configurado no Ambiente.

## Instale o Maven em seu sistema. Você pode verificar a instalação do Maven com o comando:

Para instalar o Maven é necessário possuir o JDK (Java Development Kit), que pode ser instalado através dos seguintes comandos:
sudo apt update. $ sudo apt install -y default-jdk. ...
java -version. Para instalar o Maven, utilizaremos o apt, assim como foi utilizado na instalação do JDK:
sudo apt install -y maven. ...
mvn -version.

## Clone este repositório para sua máquina local:
https://github.com/VinePolvora/Funcionarios.git


4. Abra o projeto em sua IDE. Recomendamos o uso do IntelliJ IDEA

## Executando o Projeto

1. Abra o projeto em sua IDE e execute a classe principal `FuncionariosApplication.java`.

2. Acesse a documentação da API através da URL: `http://localhost:8080/funcionarios/public/swagger`.

## Uso da API

A API oferece os seguintes endpoints:

- `GET /api/funcionarios`: Retorna a lista de todos os funcionários cadastrados.
- `GET /api/funcionarios/{idFuncionario}`: Retorna os detalhes de um funcionário específico com base no ID.
- `POST /api/funcionarios`: Adiciona um novo funcionário.
- `PUT /api/funcionarios/{idFuncionario}`: Atualiza os detalhes de um funcionário existente com base no ID.
- `DELETE /api/funcionarios/{idFuncionario}`: Exclui um funcionário com base no ID.

## Documentação da API

A documentação da API é gerada automaticamente pelo Swagger. Para acessar, inicie o projeto e abra a URL `http://localhost:8080/funcionarios/public/swagger` no seu navegador.

## Descrição do projeto

O Sistema de Gerenciamento de Funcionários é uma aplicação desenvolvida em Java 11 utilizando o framework Spring Boot. Essa aplicação foi criada com o propósito de facilitar o controle e gestão de informações relacionadas aos funcionários de uma organização. O sistema oferece uma API completa que permite adicionar, visualizar, atualizar e excluir detalhes dos funcionários de forma eficiente e organizada.
