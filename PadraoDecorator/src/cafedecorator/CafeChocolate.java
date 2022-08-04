package cafedecorator;

public class CafeChocolate extends CafeDecorator{
	private String cafeChocolate = " com chocolate";
	private double precoChocolate = 2.5;

	public CafeChocolate(Cafe cafeDecorator) {
		super(cafeDecorator);
	}
	
	@Override
	public String cafeSimples() {
		return super.cafeSimples() + cafeChocolate;
	}

	@Override
	public double preco() {
		return super.preco() + precoChocolate;
	}

}
