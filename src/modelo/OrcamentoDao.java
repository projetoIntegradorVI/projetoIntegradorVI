/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import conexao.ConectaBanco;
import controle.Cadastro;
import controle.Orcamento;
import java.awt.Component;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Olivercom
 */
public class OrcamentoDao {
    public OrcamentoDao(){
        
    }
    public void inserir(Orcamento o ) {
        Connection con = ConectaBanco.getConnection();
        PreparedStatement stmt = null;
        SimpleDateFormat sdfs = new SimpleDateFormat( "yyyy-MM-dd" ); 
        String sValue = sdfs.format(o.getDate());
        java.sql.Date  dtValue = java.sql.Date.valueOf(sValue);
        try {
          stmt = con.prepareStatement("INSERT INTO orcamento (disc_orcamento, emp_orcamento, tel_orcamento, data_orcamento, obs_orcamento)VALUES(?,?,?,?,?)");
            stmt.setString(1, o.getDiscricao());
            stmt.setString(2, o.getEmpresa());
            stmt.setString(3, o.getTelefone());
            stmt.setDate(4, dtValue);
            stmt.setString(5, o.getObs());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog((Component)null, "Salvo com sucesso!");
        } catch (SQLException var8) {
            JOptionPane.showMessageDialog((Component)null, "falha  inserir "+var8);
           
        } finally {
            ConectaBanco.fechaConnection(con, stmt);
        }
    }
    public void deletar(int id) {
        Connection con = ConectaBanco.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("DELETE FROM orcamento WHERE id_orcamento = "+id);        
            stmt.executeUpdate();
            JOptionPane.showMessageDialog((Component)null, "Excluido com sucesso!");
        } catch (SQLException var8) {
            JOptionPane.showMessageDialog((Component)null, "Erro ao excluir: " + var8);
        } finally {
            ConectaBanco.fechaConnection(con, stmt);
        }
    }
    public void atualiza(Orcamento o) {
        Connection con = ConectaBanco.getConnection();
        PreparedStatement stmt = null;
        SimpleDateFormat sdfs = new SimpleDateFormat( "yyyy-MM-dd" ); 
        String sValue = sdfs.format(o.getDate());
        java.sql.Date  dtValue = java.sql.Date.valueOf(sValue);
        try {
            stmt = con.prepareStatement("UPDATE orcamento SET disc_orcamento = ?, emp_orcamento = ?, tel_orcamento = ?, data_orcamento = ? , obs_orcamento = ?  WHERE id_orcamento = "+o.getCod());
            stmt.setString(1, o.getDiscricao());
            stmt.setString(2, o.getEmpresa());
            stmt.setString(3, o.getTelefone());
            stmt.setDate(4, dtValue);
            stmt.setString(5, o.getObs());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog((Component)null, "Atualizado com sucesso!");
        } catch (SQLException var8) {
            JOptionPane.showMessageDialog((Component)null, "Erro ao atualizar: " + var8);
        } finally {
            ConectaBanco.fechaConnection(con, stmt);
        }
    }    
    public List<Orcamento> read() {
        Connection con = ConectaBanco.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList orcamentos = new ArrayList();

        try {
            stmt = con.prepareStatement("SELECT * FROM orcamento");
            rs = stmt.executeQuery();

            while(rs.next()) {
                Orcamento o = new Orcamento();              
                o.setCod(rs.getInt("id_orcamento"));
                o.setDiscricao(rs.getString("disc_orcamento"));
                o.setEmpresa(rs.getString("emp_orcamento"));
                o.setTelefone(rs.getString("tel_orcamento"));
                o.setDate(rs.getDate("data_orcamento")); 
                o.setObs(rs.getString("obs_orcamento")); 
                orcamentos.add(o);
            }
        } catch (SQLException var9) {
            Logger.getLogger(CadastroDao.class.getName()).log(Level.SEVERE, (String)null, var9);
        } finally {
            ConectaBanco.fechaConnection(con, stmt, rs);
        }

        return orcamentos;
    }
}
