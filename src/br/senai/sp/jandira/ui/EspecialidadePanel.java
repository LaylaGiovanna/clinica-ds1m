package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadeDAO;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.TipoOperacao;
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

        jPanel = new javax.swing.JPanel();
        labelEspecialidade = new javax.swing.JLabel();
        buttonExcluirEspecialidade = new javax.swing.JButton();
        buttonAlterarEspecialidade = new javax.swing.JButton();
        buttonAdicionarEspecialidade = new javax.swing.JButton();
        scrollTableEspecialidade = new javax.swing.JScrollPane();
        tableEspecialidade = new javax.swing.JTable();

        jPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel.setPreferredSize(new java.awt.Dimension(945, 370));
        jPanel.setLayout(null);

        labelEspecialidade.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        labelEspecialidade.setForeground(new java.awt.Color(195, 161, 251));
        labelEspecialidade.setText("Especialidade:");
        jPanel.add(labelEspecialidade);
        labelEspecialidade.setBounds(20, 10, 180, 20);

        buttonExcluirEspecialidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/delete.png"))); // NOI18N
        buttonExcluirEspecialidade.setToolTipText("Excluir plano de saúde selecionado");
        buttonExcluirEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirEspecialidadeActionPerformed(evt);
            }
        });
        jPanel.add(buttonExcluirEspecialidade);
        buttonExcluirEspecialidade.setBounds(700, 294, 70, 60);

        buttonAlterarEspecialidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/edit32.png"))); // NOI18N
        buttonAlterarEspecialidade.setToolTipText("Editar plano de saúde selecionado");
        buttonAlterarEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAlterarEspecialidadeActionPerformed(evt);
            }
        });
        jPanel.add(buttonAlterarEspecialidade);
        buttonAlterarEspecialidade.setBounds(780, 294, 70, 60);

        buttonAdicionarEspecialidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/menu.png"))); // NOI18N
        buttonAdicionarEspecialidade.setToolTipText("Adicionar plano de saúde");
        buttonAdicionarEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarEspecialidadeActionPerformed(evt);
            }
        });
        jPanel.add(buttonAdicionarEspecialidade);
        buttonAdicionarEspecialidade.setBounds(860, 294, 70, 60);

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
        scrollTableEspecialidade.setViewportView(tableEspecialidade);

        jPanel.add(scrollTableEspecialidade);
        scrollTableEspecialidade.setBounds(12, 40, 910, 240);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 945, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 370, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
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
                    "Por favor, selecione a especialidade que vc deseja excluir!",
                    "Especialidade",
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
                    "Por favor, selecione uma especialidade para alterar",
                    "Especialidade",
                    JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_buttonAlterarEspecialidadeActionPerformed

    private void buttonAdicionarEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarEspecialidadeActionPerformed
        EspecialidadeDialog especialidadeDialog = new EspecialidadeDialog(
                null, 
                true, 
                TipoOperacao.ADICIONAR, 
                null);
                
        especialidadeDialog.setVisible(true);

        criarTabelaEspecialidade();
    }//GEN-LAST:event_buttonAdicionarEspecialidadeActionPerformed

    private void editar() {

        Especialidade especialidade = EspecialidadeDAO.getEspecialidade(getCodigo());

        EspecialidadeDialog especialidadeDialog = new EspecialidadeDialog(
                null,
                true,
                TipoOperacao.ALTERAR,
                especialidade);
        especialidadeDialog.setVisible(true);

        criarTabelaEspecialidade();
    }

    private void excluir() {
        int resposta = JOptionPane.showConfirmDialog(
                this,
                "Você confirma exclusão da especialidade selecionada?",
                "Especialidade",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);

        if (resposta == 0) {
            EspecialidadeDAO.excluir(getCodigo());
            criarTabelaEspecialidade();
        }
    }

    private Integer getCodigo() {
        String codigoStr = tableEspecialidade.getValueAt(linha, 0).toString();
        return Integer.valueOf(codigoStr);
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdicionarEspecialidade;
    private javax.swing.JButton buttonAlterarEspecialidade;
    private javax.swing.JButton buttonExcluirEspecialidade;
    private javax.swing.JPanel jPanel;
    private javax.swing.JLabel labelEspecialidade;
    private javax.swing.JScrollPane scrollTableEspecialidade;
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
