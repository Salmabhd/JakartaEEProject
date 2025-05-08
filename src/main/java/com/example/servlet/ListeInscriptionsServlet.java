package com.example.servlet;

import com.example.dao.InscriptionDAO;
import com.example.model.Inscription;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.util.List;

public class ListeInscriptionsServlet extends HttpServlet {
protected void doGet(HttpServletRequest req, HttpServletResponse res)
throws ServletException, IOException {

    InscriptionDAO dao = new InscriptionDAO();
    List<Inscription> inscriptions = dao.getAll();

    req.setAttribute("inscriptions", inscriptions);
    req.getRequestDispatcher("inscription.jsp").forward(req, res);

}
}