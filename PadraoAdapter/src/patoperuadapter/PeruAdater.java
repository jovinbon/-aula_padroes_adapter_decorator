package patoperuadapter;

public class PeruAdater implements Pato {
	
	private Peru peru;
	
	public PeruAdater(Peru peru) {
		this.peru = peru;
	}

	@Override
	public void grasnar() {
		this.peru.soar();
	}

	@Override
	public void voar() {
		this.peru.voar();
	}

}
