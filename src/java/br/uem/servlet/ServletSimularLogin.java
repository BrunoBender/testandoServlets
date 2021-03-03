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
public class ServletSimularLogin extends HttpServlet{
    
    @Override
    protected void doGet (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Usuario usuario = new Usuario();
        usuario.setNome("Joao");
        
        //aqui estamos usando o Request ao invés do context pois é o compartilhamento de obj de uma sessão
        req.getSession().setAttribute("usuarioLogado", usuario);
        
        PrintWriter out = resp.getWriter();
        out.println("<h1>Simulando Login</h1>");
        out.println("Usuário "+ usuario.getNome() +" acaba de logar ao sistema");
        out.close();
        
    }
}
