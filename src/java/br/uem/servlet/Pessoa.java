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
public class Pessoa {
    private String nome;
    private String endereco;
    
    public Pessoa(){
        
    }
    
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getENdereco(){
        return this.endereco;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    
    @Override
    public String toString(){
        return "Pessoa{" + "nome="+ nome +", endereco="+ endereco +"}";
    }
    
}
