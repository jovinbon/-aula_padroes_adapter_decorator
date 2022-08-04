package roupadecorator;

public class LojaCinto extends RoupaDecorator{
    private String informarDescricao = " com Cinto de Couro";
    private double precoPeca = 50;
	
	public LojaCinto(Roupa roupa) {
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
