package cafedecorator;

public class Cafezinho implements Cafe{
	private String descricao = "Café simples";
	private double preco = 1.0;
	
	@Override
	public String cafeSimples() {
		return descricao;
	}
	@Override
	public double preco() {
		return preco;
	}
	
}
