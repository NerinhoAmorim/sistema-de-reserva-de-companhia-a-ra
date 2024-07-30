# Sistema de Reservas de Companhias Aéreas

Este é um sistema de reservas de companhias aéreas desenvolvido em Java usando o framework Spring Boot. O sistema permite gerenciar passageiros, voos, reservas e aviões.

## Funcionalidades

- **Gerenciamento de Passageiros**: Adicionar, atualizar, listar e remover passageiros.
- **Gerenciamento de Voos**: Adicionar, atualizar, listar e remover voos.
- **Gerenciamento de Reservas**: Criar e gerenciar reservas de voos para passageiros.
- **Gerenciamento de Aviões**: Adicionar, atualizar, listar e remover aviões.

## Tecnologias Utilizadas

- **Java 17**
- **Spring Boot 3**
- **Spring Data JPA**
- **H2 Database** (ou outro banco de dados de sua escolha)
- **Maven**
- **Swagger**

## Estrutura do Projeto

O projeto está organizado nos seguintes pacotes:

- `domain`: Contém as classes de entidade.
- `repository`: Contém as interfaces de repositório.
- `service`: Contém a lógica de negócios.
- `controller`: Contém os endpoints REST.

## Configuração do Projeto

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/airline-reservation-system.git
   cd airline-reservation-system


## Endpoints
   
# Passageiros
**POST /passengers:** Cria um novo passageiro.

**GET /passengers:** Lista todos os passageiros.

**GET /passengers/{id}:** Obtém um passageiro pelo ID.

**PUT/PATCH /passengers/{id}:** Atualiza um passageiro pelo ID.

**DELETE /passengers/{id}:** Remove um passageiro pelo ID.

# Voos

**POST /flights:** Cria um novo voo.

**GET /flights:** Lista todos os voos.

**GET /flights/{flightNumber}:** Obtém um voo pelo número do voo.

**PUT/PATCH /flights/{flightNumber}:** Atualiza um voo pelo número do voo.

*DELETE /flights/{flightNumber}:** Remove um voo pelo número do voo.

# Reservas

**POST /reservations:** Cria uma nova reserva.

**GET /reservations:** Lista todas as reservas.

**GET /reservations/{id}:** Obtém uma reserva pelo ID.

**PUT/PATCH /reservations/{id}:** Atualiza uma reserva pelo ID.

**DELETE /reservations/{id}:** Remove uma reserva pelo ID.

# Aviões

**POST /planes:** Cria um novo avião.

**GET /planes:** Lista todos os aviões.

**GET /planes/{id}:** Obtém um avião pelo ID.

**PUT/PATCH /planes/{id}:** Atualiza um avião pelo ID.

**DELETE /planes/{id}:** Remove um avião pelo ID.

## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues e pull requests.

## Licença

Este projeto está licenciado sob a Licença MIT. Veja o arquivo LICENSE para mais detalhes.
