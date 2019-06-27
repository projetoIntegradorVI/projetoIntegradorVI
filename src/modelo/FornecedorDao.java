/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import conexao.ConectaBanco;
import controle.Cadastro;
import controle.Fornecedor;
import java.awt.Component;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Olivercom
 */
public class FornecedorDao {
     public FornecedorDao() {
    }
     public void inserir(Fornecedor c ) {
        Connection con = ConectaBanco.getConnection();
        PreparedStatement stmt = null;

        try {
          stmt = con.prepareStatement("INSERT INTO fornecedor (nome_fantasia, doc, resp, telef, endereco, cid)VALUES(?,?,?,?,?,?)");
            stmt.setString(1, c.getEmpresa());
            stmt.setString(2, c.getDocumento());
             stmt.setString(3, c.getResponsavel());
             stmt.setString(4, c.getTelefone());
            stmt.setString(5, c.getEndereco());            
            stmt.setString(6, c.getCidade());
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
            stmt = con.prepareStatement("DELETE FROM fornecedor WHERE id_forn = "+id);
           // stmt.setInt(1, c.getCod());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog((Component)null, "Excluido com sucesso!");
        } catch (SQLException var8) {
            JOptionPane.showMessageDialog((Component)null, "Erro ao excluir: " + var8);
        } finally {
            ConectaBanco.fechaConnection(con, stmt);
        }
    }
    public void atualiza(Fornecedor c) {
        Connection con = ConectaBanco.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE fornecedor SET nome_fantasia = ?, doc = ?, resp = ?, telef = ? , endereco = ?, cid = ?  WHERE id_forn = "+c.getCod());
            stmt.setString(1, c.getEmpresa());
            stmt.setString(2, c.getDocumento());
             stmt.setString(3, c.getResponsavel());
             stmt.setString(4, c.getTelefone());
            stmt.setString(5, c.getEndereco());            
            stmt.setString(6, c.getCidade());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog((Component)null, "Atualizado com sucesso!");
        } catch (SQLException var8) {
            JOptionPane.showMessageDialog((Component)null, "Erro ao atualizar: " + var8);
        } finally {
            ConectaBanco.fechaConnection(con, stmt);
        }
    }
    
    public List<Fornecedor> read() {
        Connection con = ConectaBanco.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList fornecedor = new ArrayList();
        try {
            stmt = con.prepareStatement("SELECT * FROM fornecedor");
            rs = stmt.executeQuery();
            while(rs.next()) {
                Fornecedor cad = new Fornecedor();
                cad.setCod(rs.getInt("id_forn"));
                cad.setEmpresa(rs.getString("nome_fantasia"));
                cad.setDocumento(rs.getString("doc"));
                cad.setResponsavel(rs.getString("resp"));
                cad.setTelefone(rs.getString("telef"));
                cad.setEndereco(rs.getString("endereco"));
                cad.setCidade(rs.getString("cid"));
                fornecedor.add(cad);
            }
        } catch (SQLException var9) {
            Logger.getLogger(CadastroDao.class.getName()).log(Level.SEVERE, (String)null, var9);
        } finally {
            ConectaBanco.fechaConnection(con, stmt, rs);
        }
        return fornecedor;
    }
}
