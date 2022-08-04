package cafedecorator;

public class CafeLeite extends CafeDecorator{
	private String cafeLeite = " com leite";
	private double precoLeite = 0.5;

	public CafeLeite(Cafe cafeDecorator) {
		super(cafeDecorator);
	}
	
	@Override
	public String cafeSimples() {
		return super.cafeSimples() + cafeLeite;
	}

	@Override
	public double preco() {
		return super.preco() + precoLeite;
	}

}
