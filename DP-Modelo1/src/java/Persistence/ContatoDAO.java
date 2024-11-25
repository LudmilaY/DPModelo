/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import model.Contato;

/**
 *
 * @author Ludmila
 */
public class ContatoDAO {

    private static ContatoDAO instance = new ContatoDAO();

    public static ContatoDAO getInstance() {
        return instance;
    }

    private ContatoDAO() {
    }

    public void formSave(Contato contato) throws SQLException, ClassNotFoundException {
        Connection conn = null;
        Statement st = null;
        try {
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            st.execute("insert into contato (nome, email, codigo, empresa)"
                    + " values ('" + contato.getNome() + "', '" + contato.getEmail() + "'," + contato.getCodigo() + "'," + contato.getEmpresa() + "')");
        } catch (SQLException e) {
            throw e;
        } finally {
            closeResources(conn, st);

        }
    }
    
    public void formDelete(Contato contato)throws SQLException, ClassNotFoundException {
        Connection conn = null;
        Statement st = null;
        try {
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            st.execute("delete into contato (nome, email, codigo, empresa)"
                    + " values ('" + contato.getNome() + "', '" + contato.getEmail() + "'," + contato.getCodigo() + "'," + contato.getEmpresa() + "')");
        } catch (SQLException e) {
            throw e;
        } finally {
            closeResources(conn, st);

        }
    }
    
    public void formLer(Contato contato)throws SQLException, ClassNotFoundException {
        Connection conn = null;
        Statement st = null;
        try {
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            st.execute("select into contato (nome, email, codigo, empresa)"
                    + " values ('" + contato.getNome() + "', '" + contato.getEmail() + "'," + contato.getCodigo() + "'," + contato.getEmpresa() + "')");
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
