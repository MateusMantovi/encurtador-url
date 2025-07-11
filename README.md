<p align="center">
  <a href="#">
    <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original-wordmark.svg" alt="Java" width="100">
  </a>
  <a href="#">
    <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/spring/spring-original-wordmark.svg" alt="Spring" width="100">
  </a>
  <a href="#">
    <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/postgresql/postgresql-original-wordmark.svg" alt="PostgreSQL" width="100">
  </a>
  <a href="#">
    <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/docker/docker-original-wordmark.svg" alt="Docker" width="100">
  </a>
</p>

<h1 align="center">Encurtador de URL</h1>

<p align="center">
  <em>Um serviço de backend robusto e escalável para transformar URLs longas em links curtos e elegantes.</em>
</p>

<p align="center">
  <a href="#">
    <img src="https://img.shields.io/github/actions/workflow/status/SEU_USUARIO/encurtador-url/main.yml?style=for-the-badge&logo=githubactions&logoColor=white" alt="Build Status">
  </a>
  <a href="LICENSE">
    <img src="https://img.shields.io/badge/license-MIT-blue?style=for-the-badge" alt="Licença">
  </a>
  <img src="https://img.shields.io/badge/version-1.0.0-informational?style=for-the-badge" alt="Versão">
  <img src="https://img.shields.io/github/languages/top/SEU_USUARIO/encurtador-url?style=for-the-badge&color=orange" alt="Linguagem Principal">
</p>

<p align="center">
  <a href="#-sobre-o-projeto">Sobre</a> •
  <a href="#-features">Features</a> •
  <a href="#-tecnologias">Tecnologias</a> •
  <a href="#-como-rodar-getting-started">Como Rodar</a> •
  <a href="#-autores">Autores</a>
</p>

---

## 📖 Sobre o Projeto

O **Encurtador de URL** é um serviço de backend desenvolvido em Java com Spring Boot. Ele permite criar links curtos e redirecionar para URLs longas com rapidez e eficiência. Utiliza PostgreSQL para persistência de dados e Docker para facilitar a execução.

---

## ✨ Features

- **✅ Encurtamento de URL:** `POST /api/v1/encurtar` salva a URL longa no banco e retorna um código curto.
- **✅ Redirecionamento Transparente:** `GET /{shortCode}` redireciona o usuário para a URL original.

---

## 🛠️ Tecnologias

| Categoria | Tecnologias |
| :--- | :--- |
| **Linguagem & Framework** | Java 21, Spring Boot 3 |
| **Acesso a Dados** | Spring Data JPA, Hibernate |
| **Banco de Dados** | PostgreSQL 17 |
| **Infraestrutura** | Docker, Docker Compose |
| **Build Tool** | Maven |
| **Extras** | Lombok |

---

## 🚀 Como Rodar (Getting Started)

### Pré-requisitos

- Java JDK 21+
- Docker e Docker Compose
- Git

### Instalação e Execução

```bash
git clone https://github.com/MateusMantovi
cd encurtador-url
docker-compose up --build
