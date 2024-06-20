package projeto.model;

public class Principal {
	private String nome;
	private int codigo;
	private float preco;
	public Principal(String nome, int codigo, float preco) {
		this.nome = nome;
		this.codigo = codigo;
		this.preco = preco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public void visualizar() {
		System.out.println("Nome: "+this.nome);
		System.out.println("Código: "+this.codigo);
		System.out.println("Preço: "+this.preco);
;
	}

}
