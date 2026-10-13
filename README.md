# Baozi API

API REST desenvolvida para a atividade prática da disciplina de Desenvolvimento Web Back-End.

## Descrição

A Baozi Store é uma pequena loja especializada na venda de pão chinês (Baozi). O sistema foi desenvolvido para controlar clientes, produtos e pedidos, permitindo o gerenciamento das operações básicas da loja.

Cliente cadastrado no sistema:

- Kaique5207084

Produto comercializado:

- Baozi

---

# Especificação da API Desenvolvida

A API foi desenvolvida utilizando Java, Spring Boot, Spring Web e Spring Data JPA, seguindo o padrão REST e utilizando JSON para troca de informações.

## Entidades

### Cliente

| Campo | Tipo |
|---------|---------|
| id | Long |
| nome | String |

### Produto

| Campo | Tipo |
|---------|---------|
| id | Long |
| nome | String |
| preco | Double |

### Pedido

| Campo | Tipo |
|---------|---------|
| id | Long |
| cliente | Cliente |
| produto | Produto |
| quantidade | Integer |

---

## Endpoints

### Cliente

#### Cadastrar Cliente

**POST**

```http
/clientes
```

**Body**

```json
{
  "nome": "Kaique5207084"
}
```

**Resposta**

```json
{
  "id": 1,
  "nome": "Kaique5207084"
}
```

**Postman**

![Cadastrar Cliente](https://raw.githubusercontent.com/kaiquesouzasantoss/uninter-back-end-baozi-api/refs/heads/main/postman/01.png)

---

#### Consultar Clientes

**GET**

```http
/clientes
```

**Resposta**

```json
[
  {
    "id": 1,
    "nome": "Kaique5207084"
  }
]
```

**Postman**

![Consultar Clientes](https://raw.githubusercontent.com/kaiquesouzasantoss/uninter-back-end-baozi-api/refs/heads/main/postman/02.png)

---

### Produto

#### Cadastrar Produto

**POST**

```http
/produtos
```

**Body**

```json
{
  "nome": "Baozi",
  "preco": 5.00
}
```

**Resposta**

```json
{
  "id": 1,
  "nome": "Baozi",
  "preco": 5.00
}
```

**Postman**

![Cadastrar Produto](https://raw.githubusercontent.com/kaiquesouzasantoss/uninter-back-end-baozi-api/refs/heads/main/postman/03.png)

---

#### Consultar Produtos

**GET**

```http
/produtos
```

**Resposta**

```json
[
  {
    "id": 1,
    "nome": "Baozi",
    "preco": 5.00
  }
]
```

**Postman**

![Consultar Produtos](https://raw.githubusercontent.com/kaiquesouzasantoss/uninter-back-end-baozi-api/refs/heads/main/postman/04.png)

---

### Pedido

#### Realizar Pedido

**POST**

```http
/pedidos
```

**Body**

```json
{
  "clienteId": 1,
  "produtoId": 1,
  "quantidade": 10
}
```

**Resposta**

```json
{
  "id": 1,
  "cliente": "Kaique5207084",
  "produto": "Baozi",
  "quantidade": 10
}
```

**Postman**

![Realizar Pedido](https://raw.githubusercontent.com/kaiquesouzasantoss/uninter-back-end-baozi-api/refs/heads/main/postman/05.png)


---

#### Consultar Pedidos

**GET**

```http
/pedidos
```

**Resposta**

```json
[
  {
    "id": 1,
    "cliente": "Kaique5207084",
    "produto": "Baozi",
    "quantidade": 10
  }
]
```

**Postman**

![Consultar Pedidos](https://raw.githubusercontent.com/kaiquesouzasantoss/uninter-back-end-baozi-api/refs/heads/main/postman/06.png)

---

## Métodos HTTP Utilizados

| Método | Descrição |
|----------|----------|
| GET | Consulta de registros |
| POST | Inclusão de registros |
| PUT | Atualização de registros |
| DELETE | Exclusão de registros |

---

## Tecnologias Utilizadas

- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA
- H2
- Maven
- JSON
- Postman

---


# Repositório

GitHub:

https://github.com/kaiquesouzasantoss/uninter-back-end-baozi-api

---

# Autor

Kaique Souza Santos
RU: 5207084
Centro Universitário Internacional UNINTER
