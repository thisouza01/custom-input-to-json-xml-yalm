# Conversor de Entrada Personalizada para JSON, XML e YAML

Este projeto em Java permite que o usuário informe dados no formato personalizado `NOME_CAMPO;VALOR;TIPO`, múltiplas vezes, e converte essas entradas para os formatos **JSON**, **XML** e **YAML**.

---

## 🧠 Como funciona?

1. O usuário informa entradas como:

```
nome;Thiago;text

idade;23;int

nascimento;10/04/2002;date

ativo;true;boolean

,
```

2. O sistema:
- Valida se a entrada tem **pelo menos 3 campos**.
- Converte o valor informado para o tipo correto (`int`, `boolean`, `date`, etc).
- Armazena em objetos do tipo `EntryField`.

3. Após o fim das entradas (ao digitar `,`), o sistema exibe os dados formatados em **JSON**, **XML** e **YAML**.

---


