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

import Persistence.EventoDAO;
import controller.Action;
import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Evento;



public class GravarEventoAction implements Action{
    
    public void execute(HttpServletRequest request, HttpServletResponse response)
            throws IOException{
        String descricao = request.getParameter("textDescricao");
        String data = request.getParameter("textData");
        int contato = Integer.parseInt(request.getParameter("textContato"));

        if (descricao.equals("") || data.equals("")) {
            response.sendRedirect("index.jsp"); //FALTOU O CONTATO.EQUALS ???
        } else {
            try {
                Evento evento = new Evento(descricao, data);
                EventoDAO.getInstance().formSave(evento);
                response.sendRedirect("eventoSucesso.jsp");
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            } catch (SQLException ex) {
                response.sendRedirect("eventoErro.jsp");
                ex.printStackTrace();
            }
        }
        
    }
    
}
