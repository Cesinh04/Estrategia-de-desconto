# Sistema de Descontos - Estratégia de Desconto

Este projeto implementa o padrão de projeto **Strategy** para calcular diferentes tipos de descontos para clientes com base no tipo de associação (Comum, Premium, VIP). O sistema permite a aplicação de diferentes estratégias de desconto de forma flexível e extensível.

## Estrutura do Projeto

A estrutura do projeto segue o padrão de organização de pacotes do Java e contém as seguintes classes:

- **DescontoStrategy**: Interface que define o método `calcularDesconto`.
- **DescontoClienteComum**: Implementa a estratégia de desconto para clientes comuns (5% de desconto).
- **DescontoClientePremium**: Implementa a estratégia de desconto para clientes premium (10% de desconto).
- **DescontoClienteVIP**: Implementa a estratégia de desconto para clientes VIP, com um fator promocional configurável.
- **CalculadoraDeDescontos**: Classe que aplica a estratégia de desconto configurada.
- **Main**: Classe principal que demonstra o uso das diferentes estratégias de desconto.

## Como Funciona

O sistema permite trocar a estratégia de desconto dinamicamente, utilizando a classe **CalculadoraDeDescontos**. Você pode criar diferentes tipos de clientes (Comum, Premium, VIP) e aplicar a estratégia de desconto correspondente. 

### Exemplo de Uso

No arquivo **Main.java**, temos o seguinte código de exemplo:

```java
public class Main {
    public static void main(String[] args) {
        double precoOriginal = 100.0;

        // Cliente Comum
        CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos(new DescontoClienteComum());
        System.out.println("Preço com desconto (Cliente Comum): " + calculadora.aplicarDesconto(precoOriginal));

        // Cliente Premium
        calculadora.setEstrategia(new DescontoClientePremium());
        System.out.println("Preço com desconto (Cliente Premium): " + calculadora.aplicarDesconto(precoOriginal));

        // Cliente VIP com fator promocional de 15%
        calculadora.setEstrategia(new DescontoClienteVIP(0.15));
        System.out.println("Preço com desconto (Cliente VIP): " + calculadora.aplicarDesconto(precoOriginal));
    }
}
