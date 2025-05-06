package com.example.servlet;

import com.example.dao.FiliereDAO;
import com.example.model.Filiere;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.util.List;


public class ListeFiliereServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        FiliereDAO dao = new FiliereDAO();
        List<Filiere> salle = dao.getAll();
        req.setAttribute("filieres", salle);
        req.getRequestDispatcher("listeFilieres.jsp").forward(req, res);
    }
}
