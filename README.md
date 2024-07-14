# Calculador de Áreas

Este projeto é um calculador de áreas para polígonos regulares (triângulos e quadrados).

## Estrutura do Projeto

```
CalculadorDeAreas/
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── adryel/
│                   └── calculadorDeAreas/
│                       ├── Main.java
│                       ├── Polygon.java
│                       ├── Triangle.java
│                       └── Square.java
├── .gitignore
├── pom.xml
└── README.md
```

## Como Executar

1. Compile o projeto:

   ```sh
   mvn clean install
   ```
2. Execute a classe principal:

   ```sh
   java -cp target/calculadorDeAreas-1.0-SNAPSHOT.jar com.adryel.calculadorDeAreas.Main
   ```

## Exemplo de Saída

Triângulo de lado 3 cm e área 3,89 cm²
Triângulo de lado 4 cm e área 6,92 cm²
Quadrado de lado 4 cm e área 16 cm²

Área total 26,81 cm²
