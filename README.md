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

![Descrição da imagem](postman/01.img)

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
- MySQL
- Maven
- JSON
- Postman

---

# Prints do Postman

## Cadastro de Cliente

**Espaço para Print**

![Cadastro Cliente](docs/printsg

---

## Consulta de Clientes

**Espaço para Print**

docs/prints/lista-clientes.png

---

## Cadastro de Produto

**Espaço para Print**

docs/prints/cadastro-produto.png

---

## Consulta de Produtos

**Espaço para Print**

docs/prints/lista-produtos.png

---

## Realização de Pedido

**Espaço para Print**

docs/prints/cadastro-pedido.png

---

## Consulta de Pedidos

**Espaço para Print**

![Listaints/lista-pedidos.png

---

# Repositório

GitHub:

https://github.com/kaiquesouzasantoss/uninter-back-end-baozi-api

---

# Autor

Kaique Souza Santos

RU: 5207084

Centro Universitário Internacional UNINTER
