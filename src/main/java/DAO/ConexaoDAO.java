/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Jonathan Renz
 */
public class ConexaoDAO {

    Informacoes informacoes;

    public Connection conectaBD() {
        Connection conn = null;

        try {
            String url = "jdbc:mysql://localhost:3306/";
            String banco = "gremiofbpa";
            String usuario = "root";
            String senha = "";

            conn = DriverManager.getConnection(url + banco, usuario, senha);

            System.out.println("Conexao efetuada com sucesso no banco " + banco + "!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        return conn;
    }
}
