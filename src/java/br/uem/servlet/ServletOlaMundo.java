/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uem.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author bruno
 */
public class ServletOlaMundo extends HttpServlet{
    @Override
    public void init() throws ServletException{
        super.init();
        System.out.println("Inicializando...");
        
    }
    
    @Override
    protected void doGet (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        PrintWriter out = resp.getWriter();
        out.println("<h1>Olá Mundo</h1>");
        out.close();
    }
    
    @Override
    public void destroy(){
        System.out.println("Destruindo...");
        super.destroy();
    }
            
    
}
