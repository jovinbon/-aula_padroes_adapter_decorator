package roupadecorator;

public abstract class RoupaDecorator implements Roupa{
	
	private Roupa roupa;

	public RoupaDecorator(Roupa roupa) {
		this.roupa = roupa;
	}

	@Override
	public String informarDescricao() {
		return this.roupa.informarDescricao();
	}

	@Override
	public double informarPreco() {
		return this.roupa.informarPreco();
	}

}
