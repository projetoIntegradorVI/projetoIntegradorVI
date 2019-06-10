/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetointergradorvi;

import telas.TelaLogin;



/**
 *
 * @author 
 * 
 */
public class ProjetoIntergradorVI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        TelaLogin tl = new TelaLogin(new javax.swing.JFrame(), true); //modificado 10/06/19
        tl.setVisible(true);
        
    }
    

 
}