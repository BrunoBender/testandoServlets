/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uem.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author bruno
 */
public class ServletConexaoBD extends HttpServlet{
    @Override
    protected void doGet (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        ServletContext context = getServletContext();
        String dbUrl = context.getInitParameter("bdUrl");
        
        PrintWriter out = resp.getWriter();
        out.println("<h1>ServletContext recuperando Url para conexão com o banco de dados "+dbUrl+"</h1>");
        
        out.close();
    }
    
}
