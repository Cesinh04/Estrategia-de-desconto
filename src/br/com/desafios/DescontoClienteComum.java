package br.com.desafios;

public class DescontoClienteComum implements DescontoStrategy {
    @Override
    public double calcularDesconto(double precoOriginal) {
        return precoOriginal * 0.95; // 5% de desconto
    }
}
