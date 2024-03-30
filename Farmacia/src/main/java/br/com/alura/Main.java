package br.com.alura;

import br.com.alura.dao.FabricanteDao;
import br.com.alura.dao.ProdutoDao;
import br.com.alura.modelo.Fabricante;
import br.com.alura.modelo.Produto;
import br.com.alura.util.JPAUtil;
import javax.persistence.EntityManager;


public class Main {
    public static void main(String[] args) {
        EntityManager em = JPAUtil.getEntityManager();
        em.getTransaction().begin();

        FabricanteDao fabricanteDao = new FabricanteDao(em);
        ProdutoDao produtoDao = new ProdutoDao(em);

        Fabricante fabricante = new Fabricante("Medley");
        fabricanteDao.cadastrar(fabricante);

        Produto produto = new Produto("Losartana", "Para controle da pressão arterial", 15, fabricante);
        produtoDao.cadastrar(produto);

        em.getTransaction().commit();
        em.close();
    }
}