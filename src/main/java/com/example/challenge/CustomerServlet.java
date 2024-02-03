package com.example.challenge;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "customer",urlPatterns = "/customer")
public class CustomerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String segments [] = req.getRequestURI().split("/");
        System.out.println("Last path segment - "+segments[segments.length-1]);

        System.out.println("Customer header - "+req.getHeader("Custom-Header"));
        System.out.println("Customer header - "+req.getHeader("Host"));
    }
}
