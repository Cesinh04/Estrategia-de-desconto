package br.com.desafios;

public class DescontoClientePremium implements DescontoStrategy {
    @Override
    public double calcularDesconto(double precoOriginal) {
        return precoOriginal * 0.90; // 10% de desconto
    }
}
