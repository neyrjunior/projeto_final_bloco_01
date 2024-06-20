package projeto.repository;

import projeto.model.Produto;

public interface ProjetoRepository {

	public void cadastrar();
	public void listar();
	public void atualizar(Produto produto);
	public void excluir(int codigo);
}
