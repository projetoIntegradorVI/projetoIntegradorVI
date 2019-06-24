/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;

import java.awt.Component;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author Olivercom
 */
public class ConectaBanco {
    private static final String DRIVER = "org.postgresql.Driver";
    private static final String URL = "jdbc:postgresql://localhost/bd001";
    private static final String USER = "postgres";
    private static final String PASS = "sistemas01";
    
 public ConectaBanco() {
    }    
  public static Connection getConnection() {
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASS );
        } catch (SQLException | ClassNotFoundException var1) {
            JOptionPane.showMessageDialog((Component)null, "erro conecta banco");
            throw new RuntimeException("Erro na conexão: ", var1);
            
        }
    }
   public static void fechaConnection(Connection con)  {
       if (con != null) {
           try {
               con.close();
           } catch (SQLException ex) {
               Logger.getLogger(ConectaBanco.class.getName()).log(Level.SEVERE, null, ex);
           }
       }

    }
    public static void fechaConnection(Connection con, PreparedStatement stmt) {
        fechaConnection(con);

        try {
            if (stmt != null) {
                stmt.close();
            }
        } catch (SQLException var3) {
            Logger.getLogger(ConectaBanco.class.getName()).log(Level.SEVERE, (String)null, var3);
        }

    }

    public static void fechaConnection(Connection con, PreparedStatement stmt, ResultSet rs) {
        fechaConnection(con, stmt);

        try {
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException var4) {
            Logger.getLogger(ConectaBanco.class.getName()).log(Level.SEVERE, (String)null, var4);
        }

    }
}
