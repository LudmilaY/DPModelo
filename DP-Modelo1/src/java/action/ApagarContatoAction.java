/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package action;

/**
 *
 * @author Ludmila
 */

import Persistence.ContatoDAO;
import controller.Action;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Contato;


public class ApagarContatoAction implements Action{
    
    public void execute(HttpServletRequest request, HttpServletResponse response)
            throws IOException{
        String nome = request.getParameter("textNome");
        String email = request.getParameter("textEmail");
        int codigo = Integer.parseInt(request.getParameter("textCodigo"));
        String empresa = request.getParameter("textEmpresa");

        if (nome.equals("") || email.equals("") || empresa.equals("")) {
            response.sendRedirect("index.jsp"); //FALTOU O CODIGO.EQUALS ???
        } else {
            try {
                Contato contato = new Contato(nome, email, codigo, empresa);
                ContatoDAO.getInstance().formDelete(contato);
                response.sendRedirect("contatoSucesso.jsp");
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            } catch (SQLException ex) {
                response.sendRedirect("contatoErro.jsp");
                ex.printStackTrace();
            }
        }
        
    }
    
}
