package projeto.model;

public class Comida extends Produto {
	private String sabor;

	public Comida(String nome, int codigo, float preco, String sabor) {
		super(nome, codigo, preco);
		this.sabor = sabor;

	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

}
