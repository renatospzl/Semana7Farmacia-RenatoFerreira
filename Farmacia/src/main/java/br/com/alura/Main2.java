package br.com.alura;

import br.com.alura.dao.ProdutoDao;
import br.com.alura.modelo.Produto;
import br.com.alura.util.JPAUtil;
import javax.persistence.EntityManager;
import java.util.List;


public class Main2 {
    public static void main(String[] args) {

        EntityManager em = JPAUtil.getEntityManager();

        em.getTransaction().begin();

        ProdutoDao produtoDao = new ProdutoDao(em);
        List< Produto> lista = produtoDao.listar();
        System.out.println(lista);

        em.getTransaction().commit();
        em.close();
    }
}
