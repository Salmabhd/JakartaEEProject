package com.example.servlet;

import com.example.dao.SalleDAO;
import com.example.model.Salle;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.util.List;


public class ListeSalleServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        SalleDAO dao = new SalleDAO();
        List<Salle> salle = dao.getAll();
        req.setAttribute("salle", salle);
        req.getRequestDispatcher("salle.jsp").forward(req, res);
    }
}
