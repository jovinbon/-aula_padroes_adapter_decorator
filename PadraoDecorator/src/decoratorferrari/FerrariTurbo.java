package decoratorferrari;

public class FerrariTurbo extends DecoratorCarro{
	private Double preco = 9500.50;
	private String descricao = "Turbo, ";

	public FerrariTurbo(Carro carro) {
		super(carro);
	}
	
    public Double getPreco() {
    	return super.getPreco() + preco;
    }         
    
    public String getDescricao() {
    	return super.getDescricao() + descricao;
    }

}
