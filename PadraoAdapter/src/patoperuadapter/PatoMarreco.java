package patoperuadapter;

public class PatoMarreco implements Pato{

	@Override
	public void grasnar() {
		System.out.println("Quack");
	}

	@Override
	public void voar() {
		System.out.println("Voo do pato");
	}

}
