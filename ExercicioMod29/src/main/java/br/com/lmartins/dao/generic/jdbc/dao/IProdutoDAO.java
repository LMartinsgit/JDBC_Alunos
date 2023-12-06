package br.com.lmartins.dao.generic.jdbc.dao;

import java.util.List;

import br.com.lmartins.domin.Produto;

/**
 * @author lucas
 *
 */

public interface IProdutoDAO {

    Integer cadastrar(Produto produto) throws Exception;

    Integer atualizar(Produto produto) throws Exception;

    Produto buscar(String codigo) throws Exception;

    List<Produto> buscarTodos() throws Exception;

    Integer excluir(Produto produto) throws Exception;
}
