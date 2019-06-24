/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import conexao.ConectaBanco;
import controle.Cadastro;
import controle.Funcionario;
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
public class FuncionarioDao {
     public FuncionarioDao() {
    }
     public void inserir(Funcionario f ) {
        Connection con = ConectaBanco.getConnection();
        PreparedStatement stmt = null;

        try {
          stmt = con.prepareStatement("INSERT INTO funcionario (nome_func, doc_func, empresa_func, funcao_func, telef_func, end_func, cidade_func )VALUES(?,?,?,?,?,?,?)");
            stmt.setString(1, f.getNomeFunc());
            stmt.setString(2, f.getDocumento());
            stmt.setString(3, f.getEmpresa());
            stmt.setString(4, f.getFuncao());
            stmt.setString(5, f.getTelefone());
            stmt.setString(6, f.getEndereco());
            stmt.setString(7, f.getCidade());
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
            stmt = con.prepareStatement("DELETE FROM funcionario WHERE idFunc = "+id);
           // stmt.setInt(1, c.getCod());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog((Component)null, "Excluido com sucesso!");
        } catch (SQLException var8) {
            JOptionPane.showMessageDialog((Component)null, "Erro ao excluir: " + var8);
        } finally {
            ConectaBanco.fechaConnection(con, stmt);
        }

    }
    public void atualiza(Funcionario f) {
        Connection con = ConectaBanco.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE funcionario SET nome_func = ?, doc_func = ?, empresa_func = ?, funcao_func = ?, telef_func = ?, end_func = ?, cidade_func = ? WHERE idfunc = "+f.getCod());
            stmt.setString(1, f.getNomeFunc());
            stmt.setString(2, f.getDocumento());
            stmt.setString(3, f.getEmpresa());
            stmt.setString(4, f.getFuncao());
            stmt.setString(5, f.getTelefone());
            stmt.setString(6, f.getEndereco());
            stmt.setString(7, f.getCidade());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog((Component)null, "Atualizado com sucesso!");
        } catch (SQLException var8) {
            JOptionPane.showMessageDialog((Component)null, "Erro ao atualizar: " + var8);
        } finally {
            ConectaBanco.fechaConnection(con, stmt);
        }

    }
    
    public List<Funcionario> read() {
        Connection con = ConectaBanco.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList funcionarios = new ArrayList();

        try {
            stmt = con.prepareStatement("SELECT * FROM funcionario");
            rs = stmt.executeQuery();

            while(rs.next()) {
                Funcionario f = new Funcionario();
                f.setCod(rs.getInt("idfunc"));
                f.setNomeFunc(rs.getString("nome_func"));
                f.setDocumento(rs.getString("doc_func"));
                f.setEmpresa(rs.getString("empresa_func"));
                f.setFuncao(rs.getString("funcao_func"));
                f.setTelefone(rs.getString("telef_func"));
                f.setEndereco(rs.getString("end_func"));
                f.setCidade(rs.getString("cidade_func"));
                funcionarios.add(f);
            }
        } catch (SQLException var9) {
            Logger.getLogger(CadastroDao.class.getName()).log(Level.SEVERE, (String)null, var9);
        } finally {
            ConectaBanco.fechaConnection(con, stmt, rs);
        }

        return funcionarios;
    }
}
