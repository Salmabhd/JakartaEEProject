package com.example.servlet;

import com.example.dao.DepartementDAO;
import com.example.model.Departement;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.util.List;

public class ListeDepartementsServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        DepartementDAO dao = new DepartementDAO();
        List<Departement> departements = dao.getAll();
        req.setAttribute("departements", departements);
        req.getRequestDispatcher("departements.jsp").forward(req, res);
    }
}
