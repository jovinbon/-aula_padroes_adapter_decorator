package roupadecorator;

public class LojaBota extends RoupaDecorator{
    private String informarDescricao = " com Bota de Couro";
    private double precoPeca = 150;
	
	public LojaBota(Roupa roupa) {
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
