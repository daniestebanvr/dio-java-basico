# App Banco

## Descrição do Projeto

O **App Banco** é uma aplicação Java que simula a criação de contas bancárias em diferentes instituições financeiras. O usuário pode escolher entre quatro bancos e criar uma conta corrente, poupança ou ambas. O sistema valida os dados inseridos pelo usuário, como nome e agência, utilizando expressões regulares para garantir a consistência das informações.

---

## Funcionalidades

- **Escolha de Banco:** O usuário pode selecionar entre quatro opções de bancos:
  - Santander
  - Bradesco
  - Banco do Brasil
  - Itaú

- **Criação de Conta:** Suporte para criação de:
  - Conta Corrente
  - Conta Poupança
  - Ambas as contas (Corrente e Poupança)

- **Validação de Dados:**
  - Nome do cliente: Validado com expressão regular para permitir apenas letras, espaços e hífens.
  - Agência: Validada para conter exatamente 4 dígitos numéricos.

- **Exibição de Dados:** Após a criação da conta, os dados são exibidos na tela, incluindo agência, nome do cliente e tipo de conta.

---

## Estrutura do Projeto

### Pacotes e Classes

- **Pacote `App`:**
  - Classe `Main`: Ponto de entrada da aplicação. Gerencia a interação com o usuário e chama os métodos responsáveis pela criação da conta.

- **Pacote `MeuBanco`:**
  - Classe `ContaBanco`: Classe base abstrata que define os atributos e métodos comuns a todas as contas.
  - Classe `ContaCorrente`: Subclasse de `ContaBanco` para representar contas correntes.
  - Classe `ContaPoupanca`: Subclasse de `ContaBanco` para representar contas poupança.

---

## Como Executar o Projeto

1. **Pré-requisitos:**
   - Java Development Kit (JDK) instalado na máquina.
   - Um editor de código ou IDE (ex.: IntelliJ IDEA, Eclipse, VSCode).

---

2. **Interaja com o Programa:**
   - Siga as instruções no terminal para criar uma conta bancária.

---

## Exemplo de Uso

```plaintext
=== App Banco ===
Criar conta no banco? (s/n)
s

# Escolha o banco:
1 - Santander
2 - Bradesco
3 - Banco do Brasil
4 - Itaú
1

=== Criando Conta no Banco: Santander ===
Insira seu nome:
Maria Silva
Informe sua agência:
5678
# Escolha o tipo da sua conta:
1 - Conta corrente
2 - Conta poupança
3 - Ambos
3
Conta corrente criada com sucesso!
Agência: 5678
Nome: Maria Silva
Tipo de Conta: Conta Corrente
Conta poupança criada com sucesso!
Agência: 5678
Nome: Maria Silva
Tipo de Conta: Conta Poupança
Fechando App...