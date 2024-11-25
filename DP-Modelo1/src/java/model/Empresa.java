/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Ludmila
 */
public class Empresa {

    private String nome;

    public Empresa() {
    }

    public Empresa(String nome) {
        super();
        this.nome = nome;
    }

    public Empresa(String nome, String email, int codigo, String empresa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
