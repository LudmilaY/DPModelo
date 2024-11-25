/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import model.Evento;

/**
 *
 * @author Ludmila
 */
public class EventoDAO {

    private static EventoDAO instance = new EventoDAO();

    public static EventoDAO getInstance() {
        return instance;
    }

    private EventoDAO() {
    }

    public void formSave(Evento evento) throws SQLException, ClassNotFoundException {
        Connection conn = null;
        Statement st = null;
        try {
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            st.execute("insert into evento (descricao, data, contato)"
                    + " values ('" + evento.getDescricao() + "', '" + evento.getData() + "'," + evento.getContato() + "')");
        } catch (SQLException e) {
            throw e;
        } finally {
            closeResources(conn, st);

        }
    }
    
    public void formDelete(Evento evento) throws SQLException, ClassNotFoundException {
        Connection conn = null;
        Statement st = null;
        try {
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            st.execute("delete into evento (descricao, data, contato)"
                    + " values ('" + evento.getDescricao() + "', '" + evento.getData() + "'," + evento.getContato() + "')");
        } catch (SQLException e) {
            throw e;
        } finally {
            closeResources(conn, st);

        }
    }
    
    public void formLer(Evento evento) throws SQLException, ClassNotFoundException {
        Connection conn = null;
        Statement st = null;
        try {
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            st.execute("select into evento (descricao, data, contato)"
                    + " values ('" + evento.getDescricao() + "', '" + evento.getData() + "'," + evento.getContato() + "')");
        } catch (SQLException e) {
            throw e;
        } finally {
            closeResources(conn, st);

        }
    }

    public void closeResources(Connection conn, Statement st) {
        try {
            if (st != null) {
                st.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
        }
    }
}
