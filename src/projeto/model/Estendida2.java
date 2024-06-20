package projeto.model;

public class Estendida2 extends Principal {
	String bebida;
	
	public Estendida2(String nome, int codigo, float preco, String bebida) {
		super(nome, codigo, preco);
		this.bebida = bebida;
		
	}

	public String getBebida() {
		return bebida;
	}

	public void setBebida(String bebida) {
		this.bebida = bebida;
	}
	

}
