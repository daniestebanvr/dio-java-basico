# 🔢 Contador Interativo em Java

> Projeto simples de contagem com validação de entrada, usando `Scanner`, `try-catch` e lógica condicional.

---

## 📘 Descrição

Este projeto consiste em um programa de console Java que solicita dois números inteiros positivos ao usuário. Ele realiza uma validação completa das entradas e, em seguida, exibe uma contagem de quantas iterações seriam realizadas entre esses dois números.

O objetivo principal é exercitar:

- Entrada de dados com `Scanner`
- Tratamento de exceções com `try-catch`
- Lógica condicional (`if`, `else if`)
- Estrutura de repetição com `for`
- Manipulação de arrays

---

## 🚀 Funcionalidades

- Solicita dois números inteiros do usuário.
- Verifica se os números são positivos.
- Garante que o primeiro número seja menor que o segundo.
- Em caso de erro de digitação (ex: letras), trata com `InputMismatchException`.
- Exibe quantas iterações serão feitas.
- Imprime a sequência da contagem com mensagens personalizadas.

---

## 🧠 Lógica de Contagem

A lógica central está no método `contar(int numero1, int numero2)`:

```java
int quantidadeIteracoes = numero2 - numero1;
