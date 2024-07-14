# Calculador de Áreas

Este projeto é um calculador de áreas para polígonos regulares (triângulos e quadrados).

## Estrutura do Projeto

CalculadorDeAreas/</br>
├── src/</br>
│   └── main/</br>
│       └── java/</br>
│           └── com/</br>
│               └── adryel/</br>
│                   └── calculadorDeAreas/</br>
│                       ├── Main.java</br>
│                       ├── Polygon.java</br>
│                       ├── Triangle.java</br>
│                       └── Square.java</br>
├── .gitignore</br>
├── pom.xml</br>
└── README.md</br>

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

Triângulo de lado 3 cm e área 3,89 cm² </br>
Triângulo de lado 4 cm e área 6,92 cm² </br>
Quadrado de lado 4 cm e área 16 cm² </br>

Área total 26,81 cm²
