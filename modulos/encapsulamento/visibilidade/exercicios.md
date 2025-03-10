# Exercícios - Atributos e Métodos Públicos, Protegidos e Privados
[<-- Voltar](./README.md)

### 1. Chat

Você foi contratado para desenvolver um novo aplicativo de mensagens chamado ZipZap. O seu trabalho é programar a classe de usuários ```Usuario``` de acordo com os métodos e atributos mostrados nas tabelas a seguir:

- Atributos:

| Nome | Visibilidade | Tipo | Descrição |
|------|--------------|------|-----------|
| ```numero``` | Pública | String | Número de contato do ZipZap do usuário |
| ```conversas``` | Privado | HashMap | Histórico de todas as conversas do usuário |

- Métodos:

| Nome | Visibilidade | Argumentos | Descrição |
|------|--------------|------------|-----------|
| ```enviarMensagem``` | pública | msg ```String```, destinatario ```Usuario``` | Envia uma mensagem para o destinatário (Salva a mensagem em ```conversas``` e invoca o método ```receberMensagem``` em ```destinatario```) |
| ```receberMensagem``` | privada | msg ```String```, numRemetente ```String``` | Salva a mensagem recebida em ```conversas``` |
