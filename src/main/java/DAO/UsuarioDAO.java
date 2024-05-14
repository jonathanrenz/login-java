/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelDominio.Usuario;

/**
 *
 * @author Jonathan Renz
 */
public class UsuarioDAO {

    Connection conn;
    Usuario user;
    Informacoes informacoes;

    public UsuarioDAO() {
        this.conn = new ConexaoDAO().conectaBD();
    }

    public UsuarioDAO(Informacoes informacoes) {
        this.informacoes = informacoes;
    }

    public ResultSet autenticacaoUsuario(Usuario user) {
        try {
            String sql = "SELECT * FROM usuario WHERE senha = ? AND email_usuario = ?";
            PreparedStatement smtp = conn.prepareStatement(sql);
            smtp.setString(1, user.getSenha_usuario());
            smtp.setString(2, user.getEmail_usuario());
            return smtp.executeQuery();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "UsuarioDao" + e);
            return null;
        }
    }

    public ResultSet autenticacaoEmail(Usuario user) {
        try {
            String sql = "SELECT * FROM usuario WHERE email_usuario = ?";
            PreparedStatement smtp = conn.prepareStatement(sql);
            smtp.setString(1, user.getEmail_usuario());
            return smtp.executeQuery();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "UsuarioDao" + e);
            return null;
        }
    }

    public boolean trocarSenha(Usuario user) {
        PreparedStatement stmt = null;
        try {
            conn.setAutoCommit(false);
            String sql = "UPDATE usuario SET senha = ? WHERE email_usuario = ?";
            stmt = conn.prepareStatement(sql);

            stmt.setString(1, user.getSenha_usuario());
            stmt.setString(2, user.getEmail_usuario());

            stmt.executeUpdate();

            conn.commit();
            return true; 
        } catch (SQLException e) {
            try {
                conn.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
            return false; 
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                conn.setAutoCommit(true);
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public boolean adicionarUsuario(Usuario user) {
        try {
            String sql = "INSERT INTO usuario(nome_usuario, senha, cpf_usuario, telefone_usuario, email_usuario, dataNasc_usuario) VALUES(?,?,?,?,?,?)";
            PreparedStatement smtp = conn.prepareStatement(sql);
            smtp.setString(1, user.getNome_usuario());
            smtp.setString(2, user.getSenha_usuario());
            smtp.setString(3, user.getCpf_usuario());
            smtp.setString(4, user.getTelefone_usuario());
            smtp.setString(5, user.getEmail_usuario());
            smtp.setDate(6, new java.sql.Date(user.getDataNasc_usuario().getTime()));
            int rowsAffected = smtp.executeUpdate();
            return rowsAffected > 0; 
        } catch (SQLException e) {
            e.printStackTrace();
            return false; 
        }
    }

    public Usuario buscarPorEmail(String email) {
        Usuario user = null;
        PreparedStatement smtp = null; // Declaração da variável smtp

        try {
            String sql = "SELECT * FROM usuario WHERE email_usuario = ?";
            smtp = conn.prepareStatement(sql);
            smtp.setString(1, email);
            ResultSet rs = smtp.executeQuery();

            if (rs.next()) {
                user = new Usuario();
                user.setNome_usuario(rs.getString("nome_usuario"));
                user.setEmail_usuario(rs.getString("email_usuario"));
                user.setSenha_usuario(rs.getString("senha"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (smtp != null) {
                try {
                    smtp.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        return user;
    }

}
