# 🗂️ Backlog do Projeto: Encurtador de URL

## Última atualização: 11 de Julho de 2025

---

## 🎯 Visão do Produto

Criar um serviço robusto e simples de encurtamento de URLs com potencial para expansões como personalização e analytics.

---

## 🚧 Fases do Projeto

1. MVP - Concluído
2. Funcionalidades Avançadas - Em Planejamento
3. Analytics - Planejado

---

## 🗺️ Roadmap

| ID     | Épico                  | Descrição                               | Status       |
| ------ | ---------------------- | --------------------------------------- | ------------ |
| EP-001 | MVP Funcional          | Encurtar e redirecionar URLs            | ✅ Concluído |
| EP-002 | Links Avançados        | Alias personalizado e expiração de URLs | 📝 Planejado |
| EP-003 | Analytics de Cliques   | Métricas e relatórios de acessos        | 📝 Planejado |
| EP-004 | Segurança e Validações | Erros, validações e segurança           | 📝 Planejado |

---

## ✅ Funcionalidades Concluídas

### US-001: Encurtar URL Longa

- Endpoint: `POST /api/v1/encurtar`
- Gera código curto aleatório
- Salva no banco de dados
- Retorna status 201

### US-002: Redirecionar URL

- Endpoint: `GET /{shortCode}`
- Busca no banco e redireciona com HTTP 302
- Retorna 404 se não existir

---

## 📝 Backlog de Funcionalidades

### US-003: Alias Personalizado

- Quero definir um alias como `/promo-natal`
- Prioridade: 🔥 Alta

### US-004: Expiração de Links

- Quero definir até quando o link será válido
- Prioridade: 🟧 Média

### US-005: Contagem de Cliques

- Quero saber quantas vezes o link foi acessado
- Prioridade: 🟧 Média

### US-006: Validação de URL

- Quero uma mensagem clara se a URL estiver inválida
- Prioridade: 🔥 Alta
