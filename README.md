# Testes automatizados com Selenium

![Java](https://img.shields.io/badge/Java-8-orange) ![Cucumber](https://img.shields.io/badge/Cucumber-6.8.1-green) ![Selenium](https://img.shields.io/badge/Selenium-3.141.59-brightgreen)

## 🚀 Tecnologias Utilizadas

- **Java 8** - Linguagem de programação
- **Maven** - Gerenciamento de dependências e build
- **Cucumber 6.8.1** - Framework BDD para testes
- **Selenium WebDriver 3.141.59** - Automação de navegadores
- **JUnit 4.12** - Framework de testes
- **WebDriverManager 4.4.3** - Gerenciamento automático de drivers
- **ExtentReports 3.1.5** - Relatórios de testes

## 📁 Estrutura do Projeto

```
bdd-java/
├── src/
│   └── test/
│       ├── java/
│       │   └── com/
│       │       └── everis/
│       │           ├── pages/          # Page Objects
│       │           │   ├── BasePage.java
│       │           │   ├── CarrinhoPage.java
│       │           │   ├── HomePage.java
│       │           │   ├── ResultadoPesquisaPage.java
│       │           │   └── DetalheProdutoPage.java
│       │           ├── steps/          # Step Definitions
│       │           │   ├── HomeSteps.java
│       │           │   ├── ResultadoPesquisaSteps.java
│       │           │   ├── DetalheProdutoSteps.java
│       │           │   └── CarrinhoSteps.java
│       │           ├── tests/          # Test Runners
│       │           │   └── RunnerTest.java
│       │           └── util/           # Utilitários
│       │               ├── Hooks.java
│       │               └── Utils.java
│       └── resources/
│           └── features/               # Cenários BDD em Gherkin
│               └── RealizaCompra.feature
├── pom.xml
└── README.md
```

## 🎯 Funcionalidades Testadas

O projeto cobre os seguintes cenários de teste no site [Automation Practice](http://automationpractice.com):

### Cenário 1: Adicionar produto ao carrinho
- Acessar o site
- Pesquisar por produto
- Adicionar produto ao carrinho
- Validar se o produto está no carrinho

### Cenário 2: Aumentar quantidade de produto através dos detalhes
- Acessar o site
- Pesquisar por produto
- Acessar os detalhes do produto
- Aumentar a quantidade
- Adicionar ao carrinho
- Validar quantidade no carrinho

## ⚙️ Pré-requisitos

- Java JDK 8 ou superior
- Maven 3.6 ou superior
- Chrome (o WebDriverManager baixa o driver automaticamente)

## 🔧 Instalação

1. Clone o repositório:
```bash
git clone <url-do-repositorio>
cd bdd-java
```

2. Instale as dependências:
```bash
mvn clean install
```

## ▶️ Executando os Testes

### Executar todos os testes:
```bash
mvn test
```

### Executar com tag específica:
```bash
mvn test -Dcucumber.filter.tags="@test"
```

### Executar modo dry-run (validar steps sem executar):
Altere `dryRun = true` no arquivo `RunnerTest.java`

## 🏗️ Padrões Utilizados

- **Page Object Model (POM)**: Separação entre lógica de teste e interação com elementos
- **BDD (Behavior Driven Development)**: Cenários escritos em linguagem natural (Gherkin)
- **Step Definitions**: Mapeamento entre Gherkin e código Java