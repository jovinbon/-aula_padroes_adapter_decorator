package decoratorferrari;

public class CarroMain {

	public static void main(String[] args) {
		// cria um carro
		System.out.println("---- Ferrari padrão-----");
		Carro carro = new Ferrari();
		System.out.println("Descrição -->" + carro.getDescricao());
		System.out.println("Preço -->" + carro.getPreco());
		// decorador
		System.out.println("---- Ferrari decorada-----");
		// decora o carro com o banco de couro
		carro = new FerrariCouro(carro);
		// decora o carro com o motor turbo
		//carro = new FerrariTurbo(carro);
		System.out.println("Descrição -->" + carro.getDescricao());
		System.out.println("Preço -->" + carro.getPreco());

	}

}
