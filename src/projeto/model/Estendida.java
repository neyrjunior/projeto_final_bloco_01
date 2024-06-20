package projeto.model;


public class Estendida extends Principal {
	private String comida;

	public Estendida(String nome, int codigo, float preco, String comida) {
		super(nome, codigo, preco);
		this.comida = comida;
		
	}

	public String getComida() {
		return comida;
	}

	public void setAlimento(String comida) {
		this.comida = comida;
	}

	

}
