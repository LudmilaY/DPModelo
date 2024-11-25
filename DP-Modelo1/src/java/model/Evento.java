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
public class Evento {

    private String descricao;
    private String data;
    private int contato;

    public Evento() {
    }

    public Evento(String descricao, String data, Contato objContato) {
        super();
        this.descricao = descricao;
        this.data = data;
        this.contato = objContato.getCodigo();
    }

    public void setContato(int contato) {
        this.contato = contato;
    }

    public int getContato() {
        return contato;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

}
