package cafedecorator;

public class CafeMain {
	public static void main(String[] args) {
       
        Cafe cafeSimples = new Cafezinho();
        
        System.out.println(cafeSimples.cafeSimples());
        System.out.println(cafeSimples.preco());
        
        //cafeSimples = new CafeLeite(cafeSimples);
        //System.out.println(cafeSimples.cafeSimples());
        //System.out.println(cafeSimples.preco());
        
        cafeSimples = new CafeChocolate(cafeSimples);
        System.out.println(cafeSimples.cafeSimples());
        System.out.println(cafeSimples.preco());
	}
}
