package br.com.desafios;

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
