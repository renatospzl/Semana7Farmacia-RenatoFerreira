package br.com.alura;

import br.com.alura.dao.ProdutoDao;
import br.com.alura.util.JPAUtil;
import javax.persistence.EntityManager;

public class Main5 {
    public static void main(String[] args) {
        EntityManager em = JPAUtil.getEntityManager();
        em.getTransaction().begin();

        ProdutoDao produtoDao = new ProdutoDao(em);
        var produto = produtoDao.buscarPorId(1);



        em.getTransaction().commit();
        em.close();
    }
}
