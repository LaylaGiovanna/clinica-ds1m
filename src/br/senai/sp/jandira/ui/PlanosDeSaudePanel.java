package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import br.senai.sp.jandira.model.PlanoDeSaude;
import br.senai.sp.jandira.model.TipoOperacao;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class PlanosDeSaudePanel extends javax.swing.JPanel {

    int linha;

    public PlanosDeSaudePanel() {
        initComponents();
        criarTabelaPlanosDeSaude();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        scrollTablePlanosDeSaude = new javax.swing.JScrollPane();
        tablePlanosDeSaude = new javax.swing.JTable();
        buttonExcluirPlanoDeSaude = new javax.swing.JButton();
        buttonAlterarPlanoDeSaude = new javax.swing.JButton();
        buttonAdicionarPlanoDeSaude = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setPreferredSize(new java.awt.Dimension(945, 370));
        setLayout(null);

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(195, 161, 251));
        jLabel3.setText("Planos de saúde");
        add(jLabel3);
        jLabel3.setBounds(20, 10, 180, 20);

        tablePlanosDeSaude.setModel(new javax.swing.table.DefaultTableModel(
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
        scrollTablePlanosDeSaude.setViewportView(tablePlanosDeSaude);

        add(scrollTablePlanosDeSaude);
        scrollTablePlanosDeSaude.setBounds(20, 40, 905, 240);

        buttonExcluirPlanoDeSaude.setBackground(new java.awt.Color(254, 254, 254));
        buttonExcluirPlanoDeSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/delete.png"))); // NOI18N
        buttonExcluirPlanoDeSaude.setToolTipText("Excluir plano de saúde selecionado");
        buttonExcluirPlanoDeSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirPlanoDeSaudeActionPerformed(evt);
            }
        });
        add(buttonExcluirPlanoDeSaude);
        buttonExcluirPlanoDeSaude.setBounds(700, 294, 70, 60);

        buttonAlterarPlanoDeSaude.setBackground(new java.awt.Color(254, 254, 254));
        buttonAlterarPlanoDeSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/edit32.png"))); // NOI18N
        buttonAlterarPlanoDeSaude.setToolTipText("Editar plano de saúde selecionado");
        buttonAlterarPlanoDeSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAlterarPlanoDeSaudeActionPerformed(evt);
            }
        });
        add(buttonAlterarPlanoDeSaude);
        buttonAlterarPlanoDeSaude.setBounds(780, 294, 70, 60);

        buttonAdicionarPlanoDeSaude.setBackground(new java.awt.Color(254, 254, 254));
        buttonAdicionarPlanoDeSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/menu.png"))); // NOI18N
        buttonAdicionarPlanoDeSaude.setToolTipText("Adicionar plano de saúde");
        buttonAdicionarPlanoDeSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarPlanoDeSaudeActionPerformed(evt);
            }
        });
        add(buttonAdicionarPlanoDeSaude);
        buttonAdicionarPlanoDeSaude.setBounds(860, 294, 70, 60);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAdicionarPlanoDeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarPlanoDeSaudeActionPerformed

        PlanoDeSaudeDialog planosDeSaudeDialog = new PlanoDeSaudeDialog(
                null,
                true,
                TipoOperacao.ADICIONAR,
                null);
        planosDeSaudeDialog.setVisible(true);

        criarTabelaPlanosDeSaude();

    }//GEN-LAST:event_buttonAdicionarPlanoDeSaudeActionPerformed

    private void buttonExcluirPlanoDeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirPlanoDeSaudeActionPerformed
        //obtemos o índice da linha selecionada na tabela
        int linha = tablePlanosDeSaude.getSelectedRow();

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

    }//GEN-LAST:event_buttonExcluirPlanoDeSaudeActionPerformed

    private void buttonAlterarPlanoDeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAlterarPlanoDeSaudeActionPerformed

        linha = tablePlanosDeSaude.getSelectedRow();

        if (linha != -1) {
            editar();
        } else {
            JOptionPane.showMessageDialog(
                    this,
                    "Por favor, selecione um plano de saúde para alterar",
                    "Plano de saúde",
                    JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_buttonAlterarPlanoDeSaudeActionPerformed

    private void editar() {
        
        PlanoDeSaude planoDeSaude = PlanoDeSaudeDAO.getPlanoDeSaude(getCodigo());
        
        PlanoDeSaudeDialog planoDeSaudeDialog = new PlanoDeSaudeDialog(
                null,
                true,
                TipoOperacao.ALTERAR,
                planoDeSaude);
        planoDeSaudeDialog.setVisible(true);
        
        criarTabelaPlanosDeSaude();
    }

    
    
    private void excluir() {
        int resposta = JOptionPane.showConfirmDialog(
                this,
                "Você confirma exclusão do plano de saúde selecionado?",
                "Plano de saúde",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);

        if (resposta == 0) {
            PlanoDeSaudeDAO.excluir(getCodigo());
            criarTabelaPlanosDeSaude();
        }
    }

    private Integer getCodigo() {
        String codigoStr = tablePlanosDeSaude.getValueAt(linha, 0).toString();
        return Integer.valueOf(codigoStr);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdicionarPlanoDeSaude;
    private javax.swing.JButton buttonAlterarPlanoDeSaude;
    private javax.swing.JButton buttonExcluirPlanoDeSaude;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane scrollTablePlanosDeSaude;
    private javax.swing.JTable tablePlanosDeSaude;
    // End of variables declaration//GEN-END:variables
private void criarTabelaPlanosDeSaude() {
        tablePlanosDeSaude.setModel(PlanoDeSaudeDAO.getTableModel());

        //desativar o redimensionamento da JTable
        tablePlanosDeSaude.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        tablePlanosDeSaude.getColumnModel().getColumn(0).setPreferredWidth(102);
        tablePlanosDeSaude.getColumnModel().getColumn(1).setPreferredWidth(400);
        tablePlanosDeSaude.getColumnModel().getColumn(2).setPreferredWidth(400);

        //Impedir/bloquear a movimentação das colunas
        tablePlanosDeSaude.getTableHeader().setReorderingAllowed(false);

        //bloquear edição das cedulas
        tablePlanosDeSaude.setDefaultEditor(Object.class, null);
    }

}
