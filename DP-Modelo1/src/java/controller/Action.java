/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author Ludmila
 */

import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public interface Action {
    public void execute (HttpServletRequest request, HttpServletResponse response)
            throws IOException;
    
}
