package br.com.desafios;

public class DescontoClienteVIP implements DescontoStrategy {
    private final double fatorPromocional;

    public DescontoClienteVIP(double fatorPromocional) {
        this.fatorPromocional = fatorPromocional;
    }

    @Override
    public double calcularDesconto(double precoOriginal) {
        return precoOriginal * (1 - fatorPromocional);
    }
}
