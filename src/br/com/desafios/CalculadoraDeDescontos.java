package br.com.desafios;

public class CalculadoraDeDescontos {
    private DescontoStrategy estrategia;

    // Construtor para inicializar a estratégia
    public CalculadoraDeDescontos(DescontoStrategy estrategia) {
        this.estrategia = estrategia;
    }

    // Método para mudar a estratégia de desconto
    public void setEstrategia(DescontoStrategy novaEstrategia) {
        this.estrategia = novaEstrategia;
    }

    // Método para aplicar o desconto
    public double aplicarDesconto(double precoOriginal) {
        return estrategia.calcularDesconto(precoOriginal);
    }
}
