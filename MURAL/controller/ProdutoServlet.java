package com.meuprojeto.controller;

import com.meuprojeto.dao.ProdutoDAO;
import com.meuprojeto.dao.impl.ProdutoDAOImpl;
import com.meuprojeto.model.Produto;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProdutoServlet", urlPatterns = {"/produto"})
public class ProdutoServlet extends HttpServlet {
    private ProdutoDAO produtoDAO = new ProdutoDAOImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            List<Produto> produtos = produtoDAO.findAll();
            req.setAttribute("produtos", produtos);
            req.getRequestDispatcher("/WEB-INF/views/produtos.jsp").forward(req, resp);
        } catch (Exception e) {
            throw new ServletException(e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nome = req.getParameter("upr_nome");
        String complemento = req.getParameter("upr_complemento");
        String und = req.getParameter("upr_und");
        String preco = req.getParameter("upr_preco");
        try {
            Produto p = new Produto();
            p.setUprNome(nome);
            p.setUprComplemento(complemento);
            p.setUprUnd(und);
            p.setUprPreco(new java.math.BigDecimal(preco != null && !preco.isEmpty() ? preco : "0.00"));
            produtoDAO.create(p);
            resp.sendRedirect(req.getContextPath() + "/produto");
        } catch (Exception e) {
            throw new ServletException(e);
        }
    }
}
