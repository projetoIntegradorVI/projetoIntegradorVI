/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

/**
 *
 * @author Automacao
 */
public class TelaLogin extends javax.swing.JDialog {

    /**
     * Creates new form Login
     */
    public TelaLogin(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public TelaLogin() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPCentro = new javax.swing.JPanel();
        jB_icoLogin = new javax.swing.JButton();
        jB_icoSenha = new javax.swing.JButton();
        jT_Usuario = new javax.swing.JTextField();
        jP_Senha = new javax.swing.JPasswordField();
        jL_usuario = new javax.swing.JLabel();
        jL_Senha = new javax.swing.JLabel();
        jB_Logar = new javax.swing.JButton();
        jB_Cancelar = new javax.swing.JButton();
        jB_Sair = new javax.swing.JButton();
        jPTitulo = new javax.swing.JPanel();
        jL_img_titulo = new javax.swing.JLabel();
        jLabel_titulo = new javax.swing.JLabel();
        jPBaixo = new javax.swing.JPanel();
        jDireita = new javax.swing.JLabel();
        jLEsquerda = new javax.swing.JLabel();
        jLCentro_msg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setName("dialog_Login"); // NOI18N
        setResizable(false);

        jPCentro.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPCentro.setLayout(new java.awt.GridBagLayout());

        jB_icoLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/user-icon.png"))); // NOI18N
        jB_icoLogin.setToolTipText("Clique aqui para limpar o campo usuário");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = -26;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(48, 10, 0, 0);
        jPCentro.add(jB_icoLogin, gridBagConstraints);

        jB_icoSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Register-icon.png"))); // NOI18N
        jB_icoSenha.setToolTipText("Clique aqui para limpar o campo senha");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = -26;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 10, 0, 0);
        jPCentro.add(jB_icoSenha, gridBagConstraints);

        jT_Usuario.setText(" Usuário");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 191;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(48, 6, 0, 0);
        jPCentro.add(jT_Usuario, gridBagConstraints);

        jP_Senha.setText("Senha");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 191;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 6, 0, 0);
        jPCentro.add(jP_Senha, gridBagConstraints);

        jL_usuario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jL_usuario.setText("Usuário:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = 16;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(48, 43, 0, 0);
        jPCentro.add(jL_usuario, gridBagConstraints);

        jL_Senha.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jL_Senha.setText("Senha:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipady = 16;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 53, 0, 0);
        jPCentro.add(jL_Senha, gridBagConstraints);

        jB_Logar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jB_Logar.setText("Logar");
        jB_Logar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_LogarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(33, 60, 35, 0);
        jPCentro.add(jB_Logar, gridBagConstraints);

        jB_Cancelar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jB_Cancelar.setText("Cancelar");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(33, 29, 35, 0);
        jPCentro.add(jB_Cancelar, gridBagConstraints);

        jB_Sair.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jB_Sair.setText("Sair");
        jB_Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_SairActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(33, 45, 35, 61);
        jPCentro.add(jB_Sair, gridBagConstraints);

        getContentPane().add(jPCentro, java.awt.BorderLayout.CENTER);

        jPTitulo.setBackground(new java.awt.Color(102, 102, 102));
        jPTitulo.setPreferredSize(new java.awt.Dimension(0, 80));

        jL_img_titulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/user-login-icon.png"))); // NOI18N
        jPTitulo.add(jL_img_titulo);

        jLabel_titulo.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel_titulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_titulo.setText("LOGIN");
        jLabel_titulo.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPTitulo.add(jLabel_titulo);

        getContentPane().add(jPTitulo, java.awt.BorderLayout.PAGE_START);

        jPBaixo.setLayout(new java.awt.BorderLayout());

        jDireita.setText("Usuário Logado");
        jPBaixo.add(jDireita, java.awt.BorderLayout.EAST);

        jLEsquerda.setText("Status: ");
        jPBaixo.add(jLEsquerda, java.awt.BorderLayout.WEST);

        jLCentro_msg.setText("Login OK");
        jPBaixo.add(jLCentro_msg, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPBaixo, java.awt.BorderLayout.PAGE_END);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jB_LogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_LogarActionPerformed
        abreSistema();
    }//GEN-LAST:event_jB_LogarActionPerformed

    private void jB_SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_SairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jB_SairActionPerformed
     public void abreSistema() {
        FrmPrincipal f = new FrmPrincipal();
        f.setVisible(true);
        this.dispose();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaLogin dialog = new TelaLogin(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_Cancelar;
    private javax.swing.JButton jB_Logar;
    private javax.swing.JButton jB_Sair;
    private javax.swing.JButton jB_icoLogin;
    private javax.swing.JButton jB_icoSenha;
    private javax.swing.JLabel jDireita;
    private javax.swing.JLabel jLCentro_msg;
    private javax.swing.JLabel jLEsquerda;
    private javax.swing.JLabel jL_Senha;
    private javax.swing.JLabel jL_img_titulo;
    private javax.swing.JLabel jL_usuario;
    private javax.swing.JLabel jLabel_titulo;
    private javax.swing.JPanel jPBaixo;
    private javax.swing.JPanel jPCentro;
    private javax.swing.JPanel jPTitulo;
    private javax.swing.JPasswordField jP_Senha;
    private javax.swing.JTextField jT_Usuario;
    // End of variables declaration//GEN-END:variables

    
}

