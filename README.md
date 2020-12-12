# Projeto template utilizando Spring Boot com autenticação JWT.
#### Este template tem como unico objetivo ser um ponto de partida para sistemas pequenos, ja fazendo autenticacao jwt, conexao com banco, validação de usuario no banco de dados, geração de logs e rotacionamento.

### Utilizado
#### java 1.8
#### lombok
#### Banco de Dados H2
#### JJWT
#### ModelMapper

### Para subir o projeto
#### basta fazer um `git clone` do projeto e buildar
#### `mvn clean install`
#### `mvn spring-boot:run`


### URLS

#### Login no backend


POST: localhost:8081/users/signin


```json
{
    "username":"admin",
    "password":"admin"
}
```

ou 

```json
{
    "username":"client",
    "password":"client"
}
```

Retorno: String com TOKEN JWT


exemplo:

```json
yJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZG1pbiIsImF1dGgiOlt7ImF1dGhvcml0eSI6IlJPTEVfQURNSU4ifV0sImlhdCI6MTYwNzY5NjMyNiwiZXhwIjoxNjA3Njk2NjI2fQ.EtQ5TVp3ZzhajHHeg7x5I4xswqIrZXkie2y1Mf66OYQ
```

#### Consulta Usuario no backend

GET: localhost:8081/users/${username}

Header bearer token requerido com role de ADMIN


retorno

```json
{
    "id": 2,
    "username": "client",
    "email": "client@email.com",
    "roles": [
        "ROLE_CLIENT"
    ]
}
```


#### Consulta Usuario do token no backend

GET: localhost:8081/users/me

Header bearer token requerido


retorno

```json
{
    "id": 2,
    "username": "client",
    "email": "client@email.com",
    "roles": [
        "ROLE_CLIENT"
    ]
}
```