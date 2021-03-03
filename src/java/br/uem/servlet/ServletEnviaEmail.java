/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uem.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author bruno
 */
public class ServletEnviaEmail extends HttpServlet{
    private String email;
    
    @Override
    public void init(ServletConfig config) throws ServletException{
        super.init(config);
        email = config.getInitParameter("email");
        
    }
    
    @Override
    protected void doGet (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        PrintWriter out = resp.getWriter();
        out.println("<h1>Enviando Email</h1>");
        out.println("<h1>Email enviado para "+email+"</h1>");
        out.close();
    }
    
}
