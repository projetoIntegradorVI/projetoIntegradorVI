/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import controle.Cadastro;
import controle.Views;
import javax.swing.table.DefaultTableModel;
import modelo.CadastroDao;

/**
 *
 * @author Olivercom
 */
public class FrmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FrmPrincipal
     */
    public FrmPrincipal() {
        initComponents();
       panelConsultaOculto();
       preencherTableCliente();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jP_Esquerda = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        PanelConsulta = new javax.swing.JPanel();
        JTScroll = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        JTableVisitante = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTableFornecedor = new javax.swing.JTable();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTablePrestServico = new javax.swing.JTable();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTablePrestServico1 = new javax.swing.JTable();
        jP_Topo = new javax.swing.JPanel();
        jP_Baixo = new javax.swing.JPanel();
        jL_descricao = new javax.swing.JLabel();
        jL_msg_status = new javax.swing.JLabel();
        jL_user_log = new javax.swing.JLabel();
        jP_Direita = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jM_Ajuda = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenu_Sobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);

        jP_Esquerda.setLayout(new javax.swing.BoxLayout(jP_Esquerda, javax.swing.BoxLayout.Y_AXIS));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/visitor-icon-6_64.png"))); // NOI18N
        jButton3.setToolTipText("Cadastro de Visitantes");
        jButton3.setPreferredSize(new java.awt.Dimension(75, 75));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jP_Esquerda.add(jButton3);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/process64.png"))); // NOI18N
        jButton6.setToolTipText("Cadastro de Prestador de Serviços");
        jButton6.setActionCommand("");
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setLabel("<html><center> Cadastro </center> Prestador de Serviço</html>");
        jButton6.setPreferredSize(new java.awt.Dimension(75, 75));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jP_Esquerda.add(jButton6);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/trucking64.png"))); // NOI18N
        jButton5.setToolTipText("Cadastro de Fornecedores");
        jButton5.setActionCommand("");
        jButton5.setPreferredSize(new java.awt.Dimension(75, 75));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jP_Esquerda.add(jButton5);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/budget64.png"))); // NOI18N
        jButton4.setToolTipText("Orçamentos");
        jButton4.setPreferredSize(new java.awt.Dimension(75, 75));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jP_Esquerda.add(jButton4);

        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/consulta64.png"))); // NOI18N
        jButton14.setToolTipText("Consultas");
        jButton14.setPreferredSize(new java.awt.Dimension(75, 75));
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jP_Esquerda.add(jButton14);

        getContentPane().add(jP_Esquerda, java.awt.BorderLayout.LINE_START);

        PanelConsulta.setBackground(new java.awt.Color(204, 204, 204));
        PanelConsulta.setLayout(new java.awt.BorderLayout());

        JTScroll.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));

        JTableVisitante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "codigo", "nome", "documento", "telefone", "endereco", "cidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane8.setViewportView(JTableVisitante);
        if (JTableVisitante.getColumnModel().getColumnCount() > 0) {
            JTableVisitante.getColumnModel().getColumn(0).setResizable(false);
            JTableVisitante.getColumnModel().getColumn(0).setPreferredWidth(5);
            JTableVisitante.getColumnModel().getColumn(1).setResizable(false);
            JTableVisitante.getColumnModel().getColumn(2).setResizable(false);
            JTableVisitante.getColumnModel().getColumn(3).setResizable(false);
            JTableVisitante.getColumnModel().getColumn(4).setResizable(false);
            JTableVisitante.getColumnModel().getColumn(5).setResizable(false);
        }

        jButton1.setText("Editar");

        jButton7.setText("Excluir");

        jButton2.setText("Inserir");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(421, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 906, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(493, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 187, Short.MAX_VALUE)))
        );

        JTScroll.addTab("visitantes", jPanel5);

        jPanel4.setBackground(new java.awt.Color(204, 255, 255));

        jTableFornecedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "codigo", "Empresa", "CNPJ", "Responsavel", "telefone", "endereco", "cidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane7.setViewportView(jTableFornecedor);
        if (jTableFornecedor.getColumnModel().getColumnCount() > 0) {
            jTableFornecedor.getColumnModel().getColumn(0).setResizable(false);
            jTableFornecedor.getColumnModel().getColumn(0).setPreferredWidth(5);
            jTableFornecedor.getColumnModel().getColumn(1).setResizable(false);
            jTableFornecedor.getColumnModel().getColumn(2).setResizable(false);
            jTableFornecedor.getColumnModel().getColumn(3).setResizable(false);
            jTableFornecedor.getColumnModel().getColumn(4).setResizable(false);
            jTableFornecedor.getColumnModel().getColumn(5).setResizable(false);
            jTableFornecedor.getColumnModel().getColumn(6).setResizable(false);
        }

        jButton11.setText("Inserir");

        jButton12.setText("Editar");

        jButton13.setText("Excluir");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(421, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 906, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(493, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 205, Short.MAX_VALUE)))
        );

        JTScroll.addTab("Fornecedores", jPanel4);

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));

        jTablePrestServico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "codigo", "nome", "documento", "Empresa", "Funcao", "telefone", "endereco", "cidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane9.setViewportView(jTablePrestServico);
        if (jTablePrestServico.getColumnModel().getColumnCount() > 0) {
            jTablePrestServico.getColumnModel().getColumn(0).setResizable(false);
            jTablePrestServico.getColumnModel().getColumn(0).setPreferredWidth(5);
            jTablePrestServico.getColumnModel().getColumn(1).setResizable(false);
            jTablePrestServico.getColumnModel().getColumn(2).setResizable(false);
            jTablePrestServico.getColumnModel().getColumn(3).setResizable(false);
            jTablePrestServico.getColumnModel().getColumn(4).setResizable(false);
            jTablePrestServico.getColumnModel().getColumn(5).setResizable(false);
            jTablePrestServico.getColumnModel().getColumn(6).setResizable(false);
            jTablePrestServico.getColumnModel().getColumn(7).setResizable(false);
        }

        jButton8.setText("Inserir");

        jButton9.setText("Editar");

        jButton10.setText("Excluir");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(421, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 906, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(493, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 205, Short.MAX_VALUE)))
        );

        JTScroll.addTab("Prestador Serviço", jPanel3);

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTablePrestServico1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "codigo", "nome", "documento", "Empresa", "Funcao", "telefone", "endereco", "cidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane10.setViewportView(jTablePrestServico1);
        if (jTablePrestServico1.getColumnModel().getColumnCount() > 0) {
            jTablePrestServico1.getColumnModel().getColumn(0).setResizable(false);
            jTablePrestServico1.getColumnModel().getColumn(0).setPreferredWidth(5);
            jTablePrestServico1.getColumnModel().getColumn(1).setResizable(false);
            jTablePrestServico1.getColumnModel().getColumn(2).setResizable(false);
            jTablePrestServico1.getColumnModel().getColumn(3).setResizable(false);
            jTablePrestServico1.getColumnModel().getColumn(4).setResizable(false);
            jTablePrestServico1.getColumnModel().getColumn(5).setResizable(false);
            jTablePrestServico1.getColumnModel().getColumn(6).setResizable(false);
            jTablePrestServico1.getColumnModel().getColumn(7).setResizable(false);
        }

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 835, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 205, Short.MAX_VALUE))
        );

        JTScroll.addTab("Orçamentos", jPanel6);

        PanelConsulta.add(JTScroll, java.awt.BorderLayout.CENTER);

        getContentPane().add(PanelConsulta, java.awt.BorderLayout.CENTER);

        jP_Topo.setPreferredSize(new java.awt.Dimension(1016, 20));

        javax.swing.GroupLayout jP_TopoLayout = new javax.swing.GroupLayout(jP_Topo);
        jP_Topo.setLayout(jP_TopoLayout);
        jP_TopoLayout.setHorizontalGroup(
            jP_TopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1016, Short.MAX_VALUE)
        );
        jP_TopoLayout.setVerticalGroup(
            jP_TopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        getContentPane().add(jP_Topo, java.awt.BorderLayout.PAGE_START);

        jP_Baixo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jP_Baixo.setLayout(new java.awt.BorderLayout());

        jL_descricao.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jL_descricao.setText("Status : ");
        jP_Baixo.add(jL_descricao, java.awt.BorderLayout.WEST);

        jL_msg_status.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jL_msg_status.setText(" mensagens e logs aqui");
        jP_Baixo.add(jL_msg_status, java.awt.BorderLayout.CENTER);

        jL_user_log.setText("Usuário Logado");
        jP_Baixo.add(jL_user_log, java.awt.BorderLayout.EAST);

        getContentPane().add(jP_Baixo, java.awt.BorderLayout.PAGE_END);

        jP_Direita.setPreferredSize(new java.awt.Dimension(30, 570));

        javax.swing.GroupLayout jP_DireitaLayout = new javax.swing.GroupLayout(jP_Direita);
        jP_Direita.setLayout(jP_DireitaLayout);
        jP_DireitaLayout.setHorizontalGroup(
            jP_DireitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jP_DireitaLayout.setVerticalGroup(
            jP_DireitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );

        getContentPane().add(jP_Direita, java.awt.BorderLayout.LINE_END);

        jMenuBar1.setBackground(new java.awt.Color(0, 204, 204));

        jMenu1.setText("Clientes");

        jMenuItem1.setText("Cadastro de Clientes");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Consulta cliente");
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("profissionais");

        jMenuItem6.setText("Cadastro de Profissional");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuItem3.setText("consulta de profissional");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Fornecedor");

        jMenuItem4.setText("cadastro de fornecedor");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem4);

        jMenuItem5.setText("consulta");
        jMenu4.add(jMenuItem5);

        jMenuBar1.add(jMenu4);

        jM_Ajuda.setText("Ajuda");

        jMenuItem7.setText(".....");
        jM_Ajuda.add(jMenuItem7);

        jMenuItem8.setText("...");
        jM_Ajuda.add(jMenuItem8);
        jM_Ajuda.add(jSeparator1);

        jMenu_Sobre.setText("Sobre...");
        jM_Ajuda.add(jMenu_Sobre);

        jMenuBar1.add(jM_Ajuda);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        panelConsultaOculto();
        chamaTelaFornecedor();
       
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        chamaTelaFuncionario();
        panelConsultaOculto();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        panelConsultaOculto();
        chamaTelaFuncionario();
       
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        panelConsultaOculto();
        chamaTelaFornecedor();


    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        panelConsultaOculto();
        chamaTelaCadastro();
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
         panelConsultaAberto();
       preencherTableCliente();
    }//GEN-LAST:event_jButton14ActionPerformed
    public void chamaTelaCadastro() {
        TelaCadastro tc = new TelaCadastro(this, rootPaneCheckingEnabled);
        tc.setVisible(true);
    }

    public void chamaTelaFornecedor() {
        TelaFornecedor tf = new TelaFornecedor(this, rootPaneCheckingEnabled);
        tf.setVisible(true);
    }
    public void chamaTelaOrcamento(){
        TelaOrcamento to = new TelaOrcamento(this,rootPaneCheckingEnabled);
    }

    public void chamaTelaFuncionario() {
        TelaFuncionario tfunc = new TelaFuncionario(this, rootPaneCheckingEnabled);
        tfunc.setVisible(true);
    }
    public void panelConsultaOculto(){
         PanelConsulta.setVisible(false);
    }
     public void panelConsultaAberto(){
         PanelConsulta.setVisible(true);
         preencherTableCliente();
    }
     public void preencherTableCliente(){
        DefaultTableModel modelo = (DefaultTableModel) JTableVisitante.getModel();
        modelo.setNumRows(0);   
         CadastroDao cdao = new CadastroDao();
         for (Cadastro c: cdao.read())
           {
                modelo.addRow(new Object[]{ 
                    c.getCod(),
                    c.getNome(),
                    c.getDocumento(),
                    c.getEndereco(),
                    c.getTelefone(),
                    c.getCidade()
              }); 
            }
        
        
        
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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane JTScroll;
    private javax.swing.JTable JTableVisitante;
    private javax.swing.JPanel PanelConsulta;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jL_descricao;
    private javax.swing.JLabel jL_msg_status;
    private javax.swing.JLabel jL_user_log;
    private javax.swing.JMenu jM_Ajuda;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenu_Sobre;
    private javax.swing.JPanel jP_Baixo;
    private javax.swing.JPanel jP_Direita;
    private javax.swing.JPanel jP_Esquerda;
    private javax.swing.JPanel jP_Topo;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTable jTableFornecedor;
    private javax.swing.JTable jTablePrestServico;
    private javax.swing.JTable jTablePrestServico1;
    // End of variables declaration//GEN-END:variables
}
