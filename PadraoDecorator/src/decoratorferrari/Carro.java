package decoratorferrari;

public abstract class Carro {
	protected final Double preco = -1.0;
	protected final String descricao = "Carro abstrato.";

	public Double getPreco() {
		return preco;
	}

	public String getDescricao() {
		return descricao;
	}

}
