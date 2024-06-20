package projeto.model;


public class Bebida extends Produto {
	private String temperatura;
	boolean gaseificada;

	public Bebida(String nome, int codigo, float preco, String temperatura, boolean gaseificada) {
		super(nome, codigo, preco);
		this.temperatura = temperatura;
		this.gaseificada = gaseificada;
		
	}

	public String getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(String temperatura) {
		this.temperatura = temperatura;
	}

	public boolean isGaseificada() {
		return gaseificada;
	}

	public void setGaseificada(boolean gaseificada) {
		this.gaseificada = gaseificada;
	}
	

	

}
