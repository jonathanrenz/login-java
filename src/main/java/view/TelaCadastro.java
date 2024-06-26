/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import DAO.UsuarioDAO;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import modelDominio.Usuario;

/**
 *
 * @author Jonathan Renz
 */
public class TelaCadastro extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastro
     */
    public TelaCadastro() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jFTFTelefone = new javax.swing.JFormattedTextField();
        jTFEmail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPFSenha = new javax.swing.JPasswordField();
        jBCancelar = new javax.swing.JButton();
        jBCadastrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jFTFDataNasc = new javax.swing.JFormattedTextField();
        jTFNome = new javax.swing.JTextField();
        jFTFCpf = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel3.setText("Email:");

        try {
            jFTFTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel4.setText("Telefone:");

        jLabel5.setText("Data de Nascimento:");

        jLabel6.setText("CPF:");

        jLabel7.setText("Senha:");

        jBCancelar.setText("Cancelar");
        jBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarActionPerformed(evt);
            }
        });

        jBCadastrar.setText("Cadastrar");
        jBCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastrarActionPerformed(evt);
            }
        });

        jLabel1.setText("CADASTRO DE NOVOS USUÁRIOS:");

        jLabel2.setText("Nome:");

        try {
            jFTFDataNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jTFNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNomeActionPerformed(evt);
            }
        });

        try {
            jFTFCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBCancelar)
                                .addGap(30, 30, 30)
                                .addComponent(jBCadastrar)
                                .addGap(28, 28, 28))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                                    .addComponent(jPFSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jFTFDataNasc))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel6))
                                    .addGap(24, 24, 24)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTFNome, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                                        .addComponent(jTFEmail)
                                        .addComponent(jFTFCpf)
                                        .addComponent(jFTFTelefone))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel1)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jFTFCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTFEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jFTFTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jFTFDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jPFSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBCadastrar)
                    .addComponent(jBCancelar))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
        // TODO add your handling code here:
        limpaCampos();
    }//GEN-LAST:event_jBCancelarActionPerformed

    private void jBCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastrarActionPerformed
        // TODO add your handling code here:

        Date dataNasc;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            dataNasc = sdf.parse(jFTFDataNasc.getText());
        } catch (Exception e) {
            dataNasc = null;
        }

        if (!jTFNome.getText().equals("")) {
            if (!jFTFCpf.getText().equals("")) {
                if ((Pattern.matches("^[a-zA-Z0-9]+[@]{1}+[a-zA-Z0-9]+[.]{1}+[a-zA-Z0-9]+$", jTFEmail.getText()))) {
                    if (!jFTFTelefone.getText().equals("")) {
                        if (!jFTFDataNasc.getText().equals("")) {
                            if (!jPFSenha.getText().equals("")) {
                                String nome = jTFNome.getText();
                                String cpf = jFTFCpf.getText();
                                String email = jTFEmail.getText();
                                String telefone = jFTFTelefone.getText();
                                String senha = jPFSenha.getText();

                                Usuario user = new Usuario(nome, cpf, senha, telefone, email, dataNasc);

                                boolean ok = new UsuarioDAO().adicionarUsuario(user);

                                if(!ok) {
                                    JOptionPane.showMessageDialog(rootPane, "Erro ao tentar cadastrar.");
                                } else {
                                    JOptionPane.showMessageDialog(rootPane, "Usuário cadastrado com sucesso!");
                                    limpaCampos();
                                }
                            } else {
                                JOptionPane.showMessageDialog(rootPane, "Erro: informe uma senha. ");
                                jPFSenha.requestFocus();
                            }
                        } else {
                            JOptionPane.showMessageDialog(rootPane, "Erro: informe uma data de nascimento. ");
                            jFTFDataNasc.requestFocus();
                        }

                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Erro: informe um telefone. ");
                        jFTFTelefone.requestFocus();
                    }

                } else {
                    JOptionPane.showMessageDialog(rootPane, "Erro: informe um email. ");
                    jTFEmail.requestFocus();
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Erro: informe um CPF. ");
                jFTFCpf.requestFocus();
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Erro: informe um nome. ");
            jTFNome.requestFocus();
        }
    }//GEN-LAST:event_jBCadastrarActionPerformed

    private void jTFNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNomeActionPerformed
    
    public void limpaCampos() {
        jTFNome.setText("");
        jFTFCpf.setText("");
        jTFEmail.setText("");
        jFTFDataNasc.setText("");
        jFTFTelefone.setText("");
        jPFSenha.setText("");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCadastrar;
    private javax.swing.JButton jBCancelar;
    private javax.swing.JFormattedTextField jFTFCpf;
    private javax.swing.JFormattedTextField jFTFDataNasc;
    private javax.swing.JFormattedTextField jFTFTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPasswordField jPFSenha;
    private javax.swing.JTextField jTFEmail;
    private javax.swing.JTextField jTFNome;
    // End of variables declaration//GEN-END:variables
}
