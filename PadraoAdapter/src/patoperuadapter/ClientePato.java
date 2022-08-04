package patoperuadapter;

public class ClientePato {

	public static void main(String[] args) {
		PatoMarreco pato = new PatoMarreco();
		PeruAustraliano peru = new PeruAustraliano();
		
		PeruAdater peruAdapter = new PeruAdater(peru);
		
		Pato[] patos = {pato, peruAdapter};
		
		for (Pato p : patos) {
			System.out.println();
			p.grasnar();
			System.out.println();
			p.voar();
		}
		
		System.out.println();
		
		pato.voar();
	}

}
