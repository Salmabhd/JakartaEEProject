package com.example.servlet;
import com.example.dao.EnseignantDAO;
import com.example.model.Enseignant;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.util.List;

public class ListeEnseignantsServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        EnseignantDAO dao = new EnseignantDAO();
        List<Enseignant> enseignants = dao.getAll();
        req.setAttribute("enseignants", enseignants);
        req.getRequestDispatcher("enseignants.jsp").forward(req, res);
    }
}
