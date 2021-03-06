/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import controle.Cadastro;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.CadastroDao;

/**
 *
 * @author Olivercom
 */
public class TelaCadastro extends javax.swing.JDialog {
FrmPrincipal f = new FrmPrincipal();
 int codigoAtualizacao;
    /**
     * Creates new form TelaCadastro
     */
    public TelaCadastro(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
    }
    public TelaCadastro(Cadastro c){        
        initComponents();     
     codigoAtualizacao = c.getCod();
     txtNomeCli.setText(c.getNome().toString());
     txtDocCli.setText(c.getDocumento().toString());
     txtTelCli.setText(c.getTelefone().toString());
    jDateChooser1.setDate(c.getDate());
     txtObsCli.setText(c.getObs().toString());
     btnCadCli.setText("ATUALIZAR");
       
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
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtNomeCli = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtDocCli = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTelCli = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtObsCli = new javax.swing.JTextField();
        btnCadCli = new javax.swing.JButton();
        jblimparCadCliente = new javax.swing.JButton();
        jbCanCadCliente = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jPTitulo = new javax.swing.JPanel();
        jL_img_Titulo = new javax.swing.JLabel();
        jLabel_titulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setResizable(false);

        jPCentro.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPCentro.setLayout(new java.awt.GridBagLayout());

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setText("Data");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 62;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(14, 19, 0, 0);
        jPCentro.add(jLabel4, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setText("Nome :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 48;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(33, 19, 0, 0);
        jPCentro.add(jLabel1, gridBagConstraints);

        txtNomeCli.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtNomeCli.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 228;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 10, 0, 0);
        jPCentro.add(txtNomeCli, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText("RG/ Cpf :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 38;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(14, 19, 0, 0);
        jPCentro.add(jLabel2, gridBagConstraints);

        txtDocCli.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtDocCli.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 228;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 10, 0, 0);
        jPCentro.add(txtDocCli, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setText("Telefone");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(14, 36, 0, 0);
        jPCentro.add(jLabel3, gridBagConstraints);

        txtTelCli.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtTelCli.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 228;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 10, 0, 0);
        jPCentro.add(txtTelCli, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel6.setText("Observações");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.ipadx = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(17, 17, 0, 0);
        jPCentro.add(jLabel6, gridBagConstraints);

        txtObsCli.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtObsCli.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 228;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(14, 10, 0, 0);
        jPCentro.add(txtObsCli, gridBagConstraints);

        btnCadCli.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnCadCli.setText("Salvar");
        btnCadCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadCliActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(28, 54, 28, 0);
        jPCentro.add(btnCadCli, gridBagConstraints);

        jblimparCadCliente.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jblimparCadCliente.setText("Limpar");
        jblimparCadCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jblimparCadClienteActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(28, 44, 28, 0);
        jPCentro.add(jblimparCadCliente, gridBagConstraints);

        jbCanCadCliente.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jbCanCadCliente.setText("Cancelar");
        jbCanCadCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCanCadClienteActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(28, 47, 28, 49);
        jPCentro.add(jbCanCadCliente, gridBagConstraints);

        jDateChooser1.setDateFormatString("dd/MM/yyyy");
        jDateChooser1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 165;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 10, 0, 0);
        jPCentro.add(jDateChooser1, gridBagConstraints);

        getContentPane().add(jPCentro, java.awt.BorderLayout.CENTER);

        jPTitulo.setBackground(new java.awt.Color(102, 102, 102));

        jL_img_Titulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/visitor_32.png"))); // NOI18N
        jPTitulo.add(jL_img_Titulo);

        jLabel_titulo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel_titulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_titulo.setText("CADASTRO DE VISITANTE");
        jPTitulo.add(jLabel_titulo);

        getContentPane().add(jPTitulo, java.awt.BorderLayout.PAGE_START);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadCliActionPerformed
       if(btnCadCli.getText() == "Salvar"){
        Cadastro c = new Cadastro();
        CadastroDao  cd = new CadastroDao();        
        c.setNome(txtNomeCli.getText());
        c.setDocumento(txtDocCli.getText());      
        c.setTelefone(txtTelCli.getText());
         c.setDate(jDateChooser1.getDate());
        c.setObs(txtObsCli.getText());
        cd.inserir(c);
        f.preencherTableCliente();
        f.panelConsultaAberto();
        clean();
        this.dispose();
       }else{
           Editar();
           f.preencherTableCliente();
           f.panelConsultaAberto();
           clean();
           this.dispose();
       }
    }//GEN-LAST:event_btnCadCliActionPerformed

    private void jbCanCadClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCanCadClienteActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbCanCadClienteActionPerformed

    private void jblimparCadClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jblimparCadClienteActionPerformed
        clean();
    }//GEN-LAST:event_jblimparCadClienteActionPerformed
    public void clean(){
     txtObsCli.setText("");
     txtDocCli.setText("");
     txtTelCli.setText("");
     txtNomeCli.setText("");
     jDateChooser1.setDate(null);
    
    }
    public void Editar(){
        Cadastro c = new Cadastro();
        CadastroDao  cd = new CadastroDao();
        c.setCod(codigoAtualizacao);
        c.setNome(txtNomeCli.getText());
        c.setDocumento(txtDocCli.getText());
         c.setTelefone(txtTelCli.getText());
         c.setDate(jDateChooser1.getDate());
        c.setObs(txtObsCli.getText());
        cd.atualiza(c);
     
    }
     public void teste(){
        JOptionPane.showMessageDialog(null, "nao implementado \n Aguarde....");
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
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaCadastro dialog = new TelaCadastro(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnCadCli;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jL_img_Titulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel_titulo;
    private javax.swing.JPanel jPCentro;
    private javax.swing.JPanel jPTitulo;
    private javax.swing.JButton jbCanCadCliente;
    private javax.swing.JButton jblimparCadCliente;
    private javax.swing.JTextField txtDocCli;
    private javax.swing.JTextField txtNomeCli;
    private javax.swing.JTextField txtObsCli;
    private javax.swing.JTextField txtTelCli;
    // End of variables declaration//GEN-END:variables
}
