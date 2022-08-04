package decoratorferrari;

public class FerrariCouro extends DecoratorCarro{
	private Double preco = 4250.25;
	private String descricao = "Banco de couro, ";

	public FerrariCouro(Carro carro) {
		super(carro);
	}
	
    public Double getPreco() {
    	return super.getPreco() + preco;
    }         
    
    public String getDescricao() {
    	return super.getDescricao() + descricao;
    }

}
