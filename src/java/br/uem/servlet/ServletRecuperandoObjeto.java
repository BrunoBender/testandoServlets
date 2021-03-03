/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uem.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author bruno
 */
public class ServletRecuperandoObjeto extends HttpServlet{
    @Override
    protected void doGet (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        Pessoa objCompartilhado = (Pessoa) getServletContext().getAttribute("pessoa");
        
        PrintWriter out = resp.getWriter();
        out.println("<h1>Recuperando Objeto Pessoa</h1>");
        out.print(objCompartilhado.toString());
        out.close();
    }
    
}
