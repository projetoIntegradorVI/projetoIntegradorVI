/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import controle.Cadastro;
import conexao.ConectaBanco;
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
public class CadastroDao {

    public CadastroDao() {
    }
    public void inserir(Cadastro c ) {
        Connection con = ConectaBanco.getConnection();
        PreparedStatement stmt = null;

        try {
          stmt = con.prepareStatement("INSERT INTO clientes (nomecli, doccli, endcli, telcli, cidcli)VALUES(?,?,?,?,?)");
            stmt.setString(1, c.getNome());
            stmt.setString(2, c.getDocumento());
            stmt.setString(3, c.getEndereco());
            stmt.setString(4, c.getTelefone());
            stmt.setString(5, c.getCidade());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog((Component)null, "Salvo com sucesso!");
        } catch (SQLException var8) {
            JOptionPane.showMessageDialog((Component)null, "falha  inserir "+var8);
           
        } finally {
            ConectaBanco.fechaConnection(con, stmt);
        }

    }
    public void deletar(Cadastro c) {
        Connection con = ConectaBanco.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM produto WHERE id = ?");
            stmt.setInt(1, c.getCod());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog((Component)null, "Excluido com sucesso!");
        } catch (SQLException var8) {
            JOptionPane.showMessageDialog((Component)null, "Erro ao excluir: " + var8);
        } finally {
            ConectaBanco.fechaConnection(con, stmt);
        }

    }
    public void atualiza(Cadastro c) {
        Connection con = ConectaBanco.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE clientes SET nomecli = ?, doccli = ?, endcli = ?, telcli = ? , cidcli = ?  WHERE id = ?");
            stmt.setString(1, c.getNome());
            stmt.setString(2, c.getDocumento());
            stmt.setString(3, c.getEndereco());
            stmt.setString(4, c.getTelefone());
            stmt.setString(5, c.getCidade());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog((Component)null, "Atualizado com sucesso!");
        } catch (SQLException var8) {
            JOptionPane.showMessageDialog((Component)null, "Erro ao atualizar: " + var8);
        } finally {
            ConectaBanco.fechaConnection(con, stmt);
        }

    }
    
    public List<Cadastro> read() {
        Connection con = ConectaBanco.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList clientes = new ArrayList();

        try {
            stmt = con.prepareStatement("SELECT * FROM clientes");
            rs = stmt.executeQuery();

            while(rs.next()) {
                Cadastro cad = new Cadastro();
                cad.setCod(rs.getInt("idcli"));
                cad.setNome(rs.getString("nomecli"));
                cad.setDocumento(rs.getString("doccli"));
                cad.setEndereco(rs.getString("endcli"));
                cad.setTelefone(rs.getString("telcli"));
                cad.setCidade(rs.getString("cidcli"));
                clientes.add(cad);
            }
        } catch (SQLException var9) {
            Logger.getLogger(CadastroDao.class.getName()).log(Level.SEVERE, (String)null, var9);
        } finally {
            ConectaBanco.fechaConnection(con, stmt, rs);
        }

        return clientes;
    }
}
