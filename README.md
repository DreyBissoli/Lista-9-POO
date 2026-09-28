# Lista 09 - POO

Projeto Java (JDK 17+) referente à Lista 09 de Programação Orientada a Objetos.

## Estrutura

- `br.com.javaflix.model` — classes de domínio
- `br.com.javaflix.main` — classes executáveis de teste

## Compilação

```bash
javac -d bin $(find src -name "*.java")
```

## Execução

```bash
java -cp bin br.com.javaflix.main.MainStreaming
java -cp bin br.com.javaflix.main.MainMemoria
java -cp bin br.com.javaflix.main.MainPagamento
java -cp bin br.com.javaflix.main.MainSeguranca
```

`MainSeguranca` termina propositalmente com `ArrayIndexOutOfBoundsException` ao acessar a quarta posição de um array com exatamente três posições, conforme solicitado na Questão 20.
