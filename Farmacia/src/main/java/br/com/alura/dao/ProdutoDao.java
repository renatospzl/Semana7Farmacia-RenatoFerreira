package br.com.alura.dao;

import br.com.alura.modelo.Produto;

import javax.persistence.EntityManager;
import java.util.List;

public class ProdutoDao {
    private EntityManager em;
    public ProdutoDao(EntityManager em){

        this.em = em;
    }

    public void cadastrar(Produto produto){

        this.em.persist(produto);
    }

    public List<Produto> listar(){
        String jpql = "SELECT p FROM Produto p";
        return em.createQuery(jpql, Produto.class).getResultList();
    }

    public Produto buscarPorId(int id){
        return em.find(Produto.class, id);
    }

    public void atualizar(Produto produto){
        this.em.merge(produto);
    }

    public void remover(Produto produto){
        this.em.remove(produto);
    }
}
