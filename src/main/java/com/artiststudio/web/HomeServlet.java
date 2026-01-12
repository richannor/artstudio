package com.artiststudio.web;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class HomeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        req.setAttribute("artistName", "Your Name Here");
        req.setAttribute("tagline", "Original Art • Studio Works • Commissions");

        req.getRequestDispatcher("/index.jsp").forward(req, resp);
    }
}
