package cafedecorator;

public abstract class CafeDecorator implements Cafe{
	
	private Cafe cafeDecorator;

	public CafeDecorator(Cafe cafeDecorator) {
		this.cafeDecorator = cafeDecorator;
	}

	@Override
	public String cafeSimples() {
		return this.cafeDecorator.cafeSimples();
	}

	@Override
	public double preco() {
		return this.cafeDecorator.preco();
	}
	
	public void imprimirPreco() {
		System.out.println(preco());
	}

}
