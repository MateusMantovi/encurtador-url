# 📘 Encurtador de URL Profissional

<p align="center">
  <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original-wordmark.svg" alt="Java" width="100">
  <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/spring/spring-original-wordmark.svg" alt="Spring" width="100">
  <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/postgresql/postgresql-original-wordmark.svg" alt="PostgreSQL" width="100">
  <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/docker/docker-original-wordmark.svg" alt="Docker" width="100">
</p>

<p align="center"><em>Um serviço de backend para transformar URLs longas em links curtos.</em></p>

---

## 📖 Sobre o Projeto

O **Encurtador de URL** é um serviço de backend desenvolvido em Java com Spring Boot. Ele permite criar links curtos e redirecionar para URLs longas com rapidez e eficiência. Utiliza PostgreSQL para persistência de dados e Docker para facilitar a execução.

---

## ✨ Features

- `POST /api/v1/encurtar`: Encurtamento de URL.
- `GET /{shortCode}`: Redirecionamento para a URL original.

---

## 🛠️ Tecnologias

| Categoria               | Tecnologias                    |
|-------------------------|--------------------------------|
| Linguagem & Framework   | Java 21, Spring Boot 3.4.7         |
| Acesso a Dados          | Spring Data JPA, Hibernate     |
| Banco de Dados          | PostgreSQL 17                  |
| Infraestrutura          | Docker, Docker Compose         |
| Build Tool              | Maven                          |
| Extras                  | Lombok                         |

---

## 🚀 Como Rodar

### Pré-requisitos

- Java JDK 21+
- Docker e Docker Compose
- Git

### Passos

```bash
git clone https://github.com/SEU_USUARIO/encurtador-url.git
cd encurtador-url
docker-compose up --build
```

> A API estará disponível em: [http://localhost:8080](http://localhost:8080)

---

## 🧪 Testando a API

### Criar URL Curta:

```powershell
$body = @{ originalUrl = "https://github.com/google/gemini-pro" } | ConvertTo-Json
Invoke-RestMethod -Uri http://localhost:8080/api/v1/encurtar -Method Post -Body $body -ContentType "application/json"
```

### Acessar URL Curta:

```text
http://localhost:8080/{shortCode}
```

---

## 🤝 Contribuindo

1. Faça um Fork
2. Crie uma branch: `git checkout -b feature/nome-da-feature`
3. Commit: `git commit -m 'feat: Minha nova feature'`
4. Push: `git push origin feature/nome-da-feature`
5. Abra um Pull Request

---

## 📜 Licença

Distribuído sob a Licença MIT.

---

## 👤 Autor

- **Mateus Mantovi Costa** – [mateusmantovi@gmail.com] [https://www.linkedin.com/in/mateusmantovi/]
