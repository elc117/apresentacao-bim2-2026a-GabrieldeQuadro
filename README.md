
# Parte 1 - Sistema de Quiz

## Objetivo

Desenvolver um sistema de quiz utilizando conceitos de Programação Orientada a Objetos em Java.

## Estrutura do projeto

### Superclasse

- `Question`

### Subclasses

- `TrueFalse`
- `MultipleChoice`

### Classe de gerenciamento

- `Quiz`

### Classe principal

- `Main`

---

## Conceitos utilizados

### Herança

As classes `TrueFalse` e `MultipleChoice` herdam da classe `Question` utilizando `extends`.

### Polimorfismo

O método `showQuestion()` possui implementações diferentes em cada subclasse.

### Encapsulamento

Os atributos foram definidos como `private` ou `protected`, sendo acessados por métodos.

### Reutilização de código

Foi utilizado `super()` para reutilizar o construtor da superclasse.

---

### Exemplo de execução

```bash
1 - Mostrar todas as questões
2 - Sortear uma questão
```

```bash
Questão sorteada:
Qual destas opções é uma linguagem de programação?
1 - Python
2 - HTML
3 - Java
4 - CSS
```

# Parte 2 — Fontes

## Fonte em Português

### DevMedia - Introdução à Programação Orientada a Objetos em Java
https://www.devmedia.com.br/introducao-a-programacao-orientada-a-objetos-em-java/26452

Comentário:
O texto foi utilizado para revisar coisas que foram aplicados na criação das subclasses `TrueFalse`, `MultipleChoice` e `GroupAssignment`.

---

## Fonte em Inglês

### Oracle Java Documentation - Object-Oriented Programming Concepts
https://docs.oracle.com/javase/tutorial/java/concepts/index.html

Comentário:
A documentação da Oracle ajudou na revisão e no entendimento de reutilização de código utilizando herança e `super()`.

---

## Fonte complementar

### W3Schools - Java Inheritance
https://www.w3schools.com/java/java_inheritance.asp

Comentário:
Foi utilizada como apoio rápido para revisar a sintaxe de herança em Java e o uso de `extends` e `super`.

---

## Relação com a Parte 1

Os conceitos estudados nas referências foram aplicados diretamente no sistema de quiz desenvolvido na Parte 1.

Exemplos:
- `TrueFalse` e `MultipleChoice` herdam da classe `Question`;
- `GroupAssignment` herda da classe `Assignment`;
- sobrescrita de métodos como `showQuestion()` e `notificationMessage()`;
- reutilização de código utilizando `super()`;
- uso de polimorfismo com `ArrayList<Question>`.

---

## Processo de realização

Durante a atividade já existia um conhecimento básico sobre classes e objetos, mas foi necessário revisar rapidamente alguns conceitos de Programação Orientada a Objetos.

As principais consultas realizadas foram sobre:
- herança;
- sobrescrita de métodos;
- uso de `super`;
- uso de `ArrayList` com subclasses.

O desenvolvimento foi feito de forma incremental, começando pelas superclasses e depois adicionando funcionalidades específicas nas subclasses e classes de gerenciamento.
