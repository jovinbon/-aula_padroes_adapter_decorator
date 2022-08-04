package roupadecorator;

public class Vestido implements Roupa{
	private String descricaoPeca = "Vestido ";
	private double precoPeca = 100.0;

	@Override
	public String informarDescricao() {
		return descricaoPeca;
	}

	@Override
	public double informarPreco() {
		return precoPeca;
	}

}
