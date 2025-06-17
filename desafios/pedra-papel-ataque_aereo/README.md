# ☄️ Jogo: Pedra, Papel e Ataque Aéreo

> Exercício de lógica condicional em Java  
> Nível: Iniciante Intermediário | Foco: Condições múltiplas + entrada estruturada

---

## 📘 Descrição

Este programa simula um jogo alternativo de "Pedra, Papel e Tesoura", onde os jogadores escolhem entre:

- `ataque` (Ataque Aéreo)
- `pedra` (Pedra)
- `papel` (Papel)

As decisões são tomadas com base em regras especiais (ver abaixo). O objetivo do programa é determinar quem venceu cada partida com base nas escolhas dos jogadores.

---

## 🧠 Regras do Jogo

| Jogador 1      | Jogador 2      | Resultado               |
|----------------|----------------|--------------------------|
| ataque         | ataque         | Aniquilação mútua        |
| pedra          | pedra          | Sem ganhador             |
| papel          | papel          | Ambos venceram           |
| ataque         | pedra          | Jogador 1 venceu         |
| pedra          | ataque         | Jogador 2 venceu         |
| ataque         | papel          | Jogador 1 venceu         |
| papel          | ataque         | Jogador 2 venceu         |
| pedra          | papel          | Jogador 1 venceu         |
| papel          | pedra          | Jogador 2 venceu         |

---

## 🖥️ Entrada

- A primeira linha conterá um número inteiro `N` (1 ≤ N ≤ 1000), representando a quantidade de partidas.
- Em seguida, haverá `N` blocos, cada um com 2 linhas:
  - Linha 1: escolha do Jogador 1 (`ataque`, `pedra`, ou `papel`)
  - Linha 2: escolha do Jogador 2 (`ataque`, `pedra`, ou `papel`)

---

## ✅ Saída

Para cada caso de teste, deve ser impressa uma das seguintes mensagens:

- `Jogador 1 venceu`
- `Jogador 2 venceu`
- `Ambos venceram`
- `Sem ganhador`
- `Aniquilacao mutua`

---