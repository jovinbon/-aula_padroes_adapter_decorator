package roupadecorator;

public class MainRoupa {

	public static void main(String[] args) {
		
		Roupa vestido = new Vestido();
		
		System.out.print(vestido.informarDescricao());
		System.out.print(" R$ ");
		System.out.println(vestido.informarPreco());
		
		vestido = new LojaCinto(vestido);
		System.out.print(vestido.informarDescricao());
		System.out.print(" R$ ");
		System.out.println(vestido.informarPreco());

		vestido = new LojaBota(vestido);
		System.out.print(vestido.informarDescricao());
		System.out.print(" R$ ");
		System.out.println(vestido.informarPreco());
		
		vestido = new LojaJaqueta(vestido);
		System.out.print(vestido.informarDescricao());
		System.out.print(" R$ ");
		System.out.println(vestido.informarPreco());
	}

}
