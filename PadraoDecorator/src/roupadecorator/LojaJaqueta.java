package roupadecorator;

public class LojaJaqueta extends RoupaDecorator{
    private String informarDescricao = " com Jaqueta Jeans";
    private double precoPeca = 250;
	
	public LojaJaqueta(Roupa roupa) {
		super(roupa);
	}

	@Override
	public String informarDescricao() {
		return super.informarDescricao() + informarDescricao;
	}

	@Override
	public double informarPreco() {
		return super.informarPreco() + precoPeca;
	}
}
