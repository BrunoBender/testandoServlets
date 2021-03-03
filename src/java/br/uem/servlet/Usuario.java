/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uem.servlet;

/**
 *
 * @author bruno
 */
public class Usuario {
    
    private String nome;
    
    public Usuario(){}
    
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    @Override
    public String toString(){
        return "Usuario: " + " nome="+nome;
    }
}
