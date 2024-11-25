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
public class Contato {

    private int codigo;
    private String nome;
    private String email;
    private String empresa;

    public Contato() {
    }
    
    public Contato(String  nome){
        this.nome = nome;
    }

    public Contato(String nome, String email, int codigo, String empresa) {
        super();
        this.nome = nome;
        this.email = email;
        this.empresa = empresa;
        this.codigo = codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
