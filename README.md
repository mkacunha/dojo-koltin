# DOJO Com Kotlin

## Executando testes no terminal

- Todos: `mvn test`
- Uma classe de teste: `mvn -Dtest=ClasseTesteExemplo test`
- Um teste de uma classe: `mvn -Dtest=ClasseTesteExemplo#nomeToMetodo test`

## Abrir projeto no Gitpod

No navegador cole `https://gitpod.io#/` antes da URL do projeto no `Github`, exemplo: https://gitpod.io/#/https://github.com/mkacunha/dojo-koltin

## Gere seu próprio projeto Koltin com Maven

### Ambiente necessário

- JDK 8 ou maior
- Maven 3.6.2 ou maior

### Comando

`mvn archetype:generate -DgroupId=com.db1group.dojo -DartifactId=dojo-kotlin -DarchetypeGroupId=org.jetbrains.kotlin -DarchetypeArtifactId=kotlin-archetype-jvm -DarchetypeVersion=1.3.72 -DinteractiveMode=false`