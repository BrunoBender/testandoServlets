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
public class ServletVerificarLogin  extends HttpServlet{
    
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        
        PrintWriter out = resp.getWriter();
        out.println("<h1>Verificando Login</h1>");
        
        if (req.getSession().getAttribute("usuarioLogado") == null) {
            out.println("Não existe usuário logado no sistema no momento");
        } else {
            Usuario usuario = (Usuario) req.getSession().getAttribute("usuarioLogado");
            out.println(usuario.toString());
        }
        
        out.close();
    }
}
