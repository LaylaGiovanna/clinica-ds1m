package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadeDAO;
import br.senai.sp.jandira.model.Especialidade;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class EspecialidadePanel extends javax.swing.JPanel {

    int linha;

    public EspecialidadePanel() {
        initComponents();
        criarTabelaEspecialidade();
    }
    private final int ALTURA = 20;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelEspecialidades = new javax.swing.JPanel();
        labelEspecialidades = new javax.swing.JLabel();
        scrollTableEspecialidades = new javax.swing.JScrollPane();
        tableEspecialidade = new javax.swing.JTable();
        buttonExcluirEspecialidade = new javax.swing.JButton();
        buttonAlterarEspecialidade = new javax.swing.JButton();
        buttonAdicionarEspecialidade = new javax.swing.JButton();

        setLayout(null);

        panelEspecialidades.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelEspecialidades.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelEspecialidades.setPreferredSize(new java.awt.Dimension(945, 370));
        panelEspecialidades.setLayout(null);

        labelEspecialidades.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        labelEspecialidades.setForeground(new java.awt.Color(195, 161, 251));
        labelEspecialidades.setText("Especialidades");
        panelEspecialidades.add(labelEspecialidades);
        labelEspecialidades.setBounds(20, 10, 180, 20);

        tableEspecialidade.setModel(new javax.swing.table.DefaultTableModel(
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
        scrollTableEspecialidades.setViewportView(tableEspecialidade);

        panelEspecialidades.add(scrollTableEspecialidades);
        scrollTableEspecialidades.setBounds(20, 40, 905, 240);

        buttonExcluirEspecialidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/delete.png"))); // NOI18N
        buttonExcluirEspecialidade.setToolTipText("Excluir plano de saúde selecionado");
        buttonExcluirEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirEspecialidadeActionPerformed(evt);
            }
        });
        panelEspecialidades.add(buttonExcluirEspecialidade);
        buttonExcluirEspecialidade.setBounds(700, 294, 70, 60);

        buttonAlterarEspecialidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/edit32.png"))); // NOI18N
        buttonAlterarEspecialidade.setToolTipText("Editar plano de saúde selecionado");
        buttonAlterarEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAlterarEspecialidadeActionPerformed(evt);
            }
        });
        panelEspecialidades.add(buttonAlterarEspecialidade);
        buttonAlterarEspecialidade.setBounds(780, 294, 70, 60);

        buttonAdicionarEspecialidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/menu.png"))); // NOI18N
        buttonAdicionarEspecialidade.setToolTipText("Adicionar plano de saúde");
        buttonAdicionarEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarEspecialidadeActionPerformed(evt);
            }
        });
        panelEspecialidades.add(buttonAdicionarEspecialidade);
        buttonAdicionarEspecialidade.setBounds(860, 294, 70, 60);

        add(panelEspecialidades);
        panelEspecialidades.setBounds(0, 0, 945, 370);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonExcluirEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirEspecialidadeActionPerformed
         //obtemos o índice da linha selecionada na tabela
        int linha = tableEspecialidade.getSelectedRow();

        //verificamos se a linha selecionada na tabela
        //-1 siginifica que o usuário não selecionou nada
        if (linha != -1) {
            excluir();
        } else {
            JOptionPane.showMessageDialog(
                    this,
                    "Por favor, selecione o plano que vc deseja excluir!",
                    "Plano de saúde",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buttonExcluirEspecialidadeActionPerformed

    private void buttonAlterarEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAlterarEspecialidadeActionPerformed
        linha = tableEspecialidade.getSelectedRow();

        if (linha != -1) {
            editar();
        } else {
            JOptionPane.showMessageDialog(
                    this,
                    "Por favor, selecione um plano de saúde para alterar",
                    "Plano de saúde",
                    JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_buttonAlterarEspecialidadeActionPerformed

    private void buttonAdicionarEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarEspecialidadeActionPerformed

    }//GEN-LAST:event_buttonAdicionarEspecialidadeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdicionarEspecialidade;
    private javax.swing.JButton buttonAlterarEspecialidade;
    private javax.swing.JButton buttonExcluirEspecialidade;
    private javax.swing.JLabel labelEspecialidades;
    private javax.swing.JPanel panelEspecialidades;
    private javax.swing.JScrollPane scrollTableEspecialidades;
    private javax.swing.JTable tableEspecialidade;
    // End of variables declaration//GEN-END:variables

    private void criarTabelaEspecialidade() {
        tableEspecialidade.setModel(EspecialidadeDAO.getTableModel());

        //desativar o redimensionamento da JTable
        tableEspecialidade.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        tableEspecialidade.getColumnModel().getColumn(0).setPreferredWidth(100);
        tableEspecialidade.getColumnModel().getColumn(1).setPreferredWidth(250);
        tableEspecialidade.getColumnModel().getColumn(2).setPreferredWidth(480);
        tableEspecialidade.setRowHeight(ALTURA);
        
        //Impedir/bloquear a movimentação das colunas
        tableEspecialidade.getTableHeader().setReorderingAllowed(false);

        //bloquear edição das cedulas
        tableEspecialidade.setDefaultEditor(Object.class, null);
    }
}
