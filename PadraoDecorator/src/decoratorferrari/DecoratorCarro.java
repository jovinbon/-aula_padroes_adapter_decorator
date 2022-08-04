package decoratorferrari;

public class DecoratorCarro extends Carro{
	
	private Carro carroDecorador;        
    public DecoratorCarro(Carro carro) {
         this.carroDecorador = carro;
   }

   public Double getPreco() {
	   return this.carroDecorador.getPreco();
   }

   public String getDescricao() {
	   return this.carroDecorador.getDescricao();
   }


}
