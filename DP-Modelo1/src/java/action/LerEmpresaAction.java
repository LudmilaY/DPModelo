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

import Persistence.EmpresaDAO;
import controller.Action;
import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Empresa;



public class LerEmpresaAction implements Action{
    
    public void execute(HttpServletRequest request, HttpServletResponse response)
            throws IOException{
        String nome = request.getParameter("textNome");
        
        if (nome.equals("")) {
            response.sendRedirect("index.jsp"); //FALTOU O CODIGO.EQUALS ???
        } else {
            try {
                Empresa empresa = new Empresa(nome);
                EmpresaDAO.getInstance().formLer(empresa);
                response.sendRedirect("empresaSucesso.jsp");
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            } catch (SQLException ex) {
                response.sendRedirect("empresaErro.jsp");
                ex.printStackTrace();
            }
        }
    }
    
}
