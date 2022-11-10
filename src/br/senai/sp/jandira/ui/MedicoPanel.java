package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.MedicoDAO;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.TipoOperacao;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class MedicoPanel extends javax.swing.JPanel {

    int linha;
    
    public MedicoPanel() {
        initComponents();
        criarTabelaMedico();
    }
    
    private final int ALTURA = 20;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        labelMedico = new javax.swing.JLabel();
        buttonExcluirMedico = new javax.swing.JButton();
        buttonAlterarMedico = new javax.swing.JButton();
        buttonAdicionarMedico = new javax.swing.JButton();
        scrollTableMedico = new javax.swing.JScrollPane();
        tableMedico = new javax.swing.JTable();

        jPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel.setPreferredSize(new java.awt.Dimension(945, 370));
        jPanel.setLayout(null);

        labelMedico.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        labelMedico.setForeground(new java.awt.Color(195, 161, 251));
        labelMedico.setText("Medico:");
        jPanel.add(labelMedico);
        labelMedico.setBounds(20, 10, 180, 20);

        buttonExcluirMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/delete.png"))); // NOI18N
        buttonExcluirMedico.setToolTipText("Excluir plano de saúde selecionado");
        buttonExcluirMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirMedicoActionPerformed(evt);
            }
        });
        jPanel.add(buttonExcluirMedico);
        buttonExcluirMedico.setBounds(700, 294, 70, 60);

        buttonAlterarMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/edit32.png"))); // NOI18N
        buttonAlterarMedico.setToolTipText("Editar plano de saúde selecionado");
        buttonAlterarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAlterarMedicoActionPerformed(evt);
            }
        });
        jPanel.add(buttonAlterarMedico);
        buttonAlterarMedico.setBounds(780, 294, 70, 60);

        buttonAdicionarMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/menu.png"))); // NOI18N
        buttonAdicionarMedico.setToolTipText("Adicionar plano de saúde");
        buttonAdicionarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarMedicoActionPerformed(evt);
            }
        });
        jPanel.add(buttonAdicionarMedico);
        buttonAdicionarMedico.setBounds(860, 294, 70, 60);

        tableMedico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        scrollTableMedico.setViewportView(tableMedico);

        jPanel.add(scrollTableMedico);
        scrollTableMedico.setBounds(12, 40, 910, 240);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonExcluirMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirMedicoActionPerformed
        //obtemos o índice da linha selecionada na tabela
        int linha = tableMedico.getSelectedRow();

        //verificamos se a linha selecionada na tabela
        //-1 siginifica que o usuário não selecionou nada
        if (linha != -1) {
            excluir();
        } else {
            JOptionPane.showMessageDialog(
                    this,
                    "Por favor, selecione a especialidade que vc deseja excluir!",
                    "Especialidade",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buttonExcluirMedicoActionPerformed

    private void buttonAlterarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAlterarMedicoActionPerformed
      linha = tableMedico.getSelectedRow();

        if (linha != -1) {
            editar();
        } else {
            JOptionPane.showMessageDialog(
                    this,
                    "Por favor, selecione uma especialidade para alterar",
                    "Especialidade",
                    JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_buttonAlterarMedicoActionPerformed

    private void buttonAdicionarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarMedicoActionPerformed
       MedicoDialog medicoDialog = new MedicoDialog(
               null, 
                true, 
                TipoOperacao.ADICIONAR, 
                null);
                
                
        medicoDialog.setVisible(true);

        criarTabelaMedico();
    }//GEN-LAST:event_buttonAdicionarMedicoActionPerformed

    
    private void editar() {

        Medico medico = MedicoDAO.getMedico(getCodigo());

        MedicoDialog medicoDialog = new medicoDialog(
                null,
                true,
                TipoOperacao.ALTERAR,
                medico);
        medicoDialog.setVisible(true);

        criarTabelaMedico();
    }

    private void excluir() {
        int resposta = JOptionPane.showConfirmDialog(
                this,
                "Você confirma exclusão do médico selecionado?",
                "Médico",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);

        if (resposta == 0) {
            MedicoDAO.excluir(getCodigo());
            criarTabelaMedico();
        }
    }
    
    private Integer getCodigo() {
        String codigoStr = tableMedico.getValueAt(linha, 0).toString();
        return Integer.valueOf(codigoStr);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdicionarMedico;
    private javax.swing.JButton buttonAlterarMedico;
    private javax.swing.JButton buttonExcluirMedico;
    private javax.swing.JPanel jPanel;
    private javax.swing.JLabel labelMedico;
    private javax.swing.JScrollPane scrollTableMedico;
    private javax.swing.JTable tableMedico;
    // End of variables declaration//GEN-END:variables

    private void criarTabelaMedico() {
        tableMedico.setModel(MedicoDAO.getTableModel());
        
        //desativar o redimensionamento da JTable
        tableMedico.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        
        tableMedico.getColumnModel().getColumn(0).setPreferredWidth(100);
        tableMedico.getColumnModel().getColumn(1).setPreferredWidth(250);
        tableMedico.getColumnModel().getColumn(2).setPreferredWidth(480);
        tableMedico.setRowHeight(ALTURA);
        
        //Impedir/bloquear a movimentação das colunas
        tableMedico.getTableHeader().setReorderingAllowed(false);

        //bloquear edição das cedulas
        tableMedico.setDefaultEditor(Object.class, null);

    }
}
