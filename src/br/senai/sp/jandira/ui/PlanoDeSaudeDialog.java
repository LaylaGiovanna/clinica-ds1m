package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import br.senai.sp.jandira.model.PlanoDeSaude;
import br.senai.sp.jandira.model.TipoOperacao;
import javax.swing.JOptionPane;

public class PlanoDeSaudeDialog extends javax.swing.JDialog {

    private TipoOperacao tipoOperacao;
    private PlanoDeSaude planoDeSaude;

    public PlanoDeSaudeDialog(
            java.awt.Frame parent,
            boolean modal,
            TipoOperacao tipoOperacao,
            PlanoDeSaude planoDeSaude) {

        super(parent, modal);
        initComponents();
        this.tipoOperacao = tipoOperacao;
        this.planoDeSaude = planoDeSaude;

        //Preencher os campos caso o tipo de operação for ALTERAR
        if (tipoOperacao == TipoOperacao.ALTERAR) {
            preencherFormulario();
        }

    }

    private void preencherFormulario() {
        labelTitulo.setText("Plano de saúde - " + tipoOperacao);
        labelIcone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/edit32.png")));
        textCodigo.setText(planoDeSaude.getCodigo().toString());
        textNomeDaOperadora.setText(planoDeSaude.getOperadora());
        textTipoDoPlano.setText(planoDeSaude.getTipoDoPlano());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelSuperior = new javax.swing.JPanel();
        labelIcone = new javax.swing.JLabel();
        labelTitulo = new javax.swing.JLabel();
        panelPrincipal = new javax.swing.JPanel();
        labelDetalhesDoPlano = new javax.swing.JLabel();
        labelTipoDoPlano = new javax.swing.JLabel();
        labelCodigo = new javax.swing.JLabel();
        textTipoDoPlano = new javax.swing.JTextField();
        labelNomeDaOperadora = new javax.swing.JLabel();
        buttonSalvar = new javax.swing.JButton();
        buttonCancelar = new javax.swing.JButton();
        textCodigo = new javax.swing.JTextField();
        textNomeDaOperadora = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        panelSuperior.setBackground(new java.awt.Color(204, 204, 255));
        panelSuperior.setLayout(null);

        labelIcone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/menu.png"))); // NOI18N
        panelSuperior.add(labelIcone);
        labelIcone.setBounds(25, 12, 40, 40);

        labelTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        labelTitulo.setText("Planos de Saúde - Adicionar");
        panelSuperior.add(labelTitulo);
        labelTitulo.setBounds(70, 12, 360, 40);

        getContentPane().add(panelSuperior);
        panelSuperior.setBounds(0, 0, 710, 70);

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        panelPrincipal.setLayout(null);

        labelDetalhesDoPlano.setBackground(new java.awt.Color(195, 161, 251));
        labelDetalhesDoPlano.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelDetalhesDoPlano.setForeground(new java.awt.Color(195, 161, 251));
        labelDetalhesDoPlano.setText("Detalhes do plano de saúde:");
        panelPrincipal.add(labelDetalhesDoPlano);
        labelDetalhesDoPlano.setBounds(20, 20, 240, 20);

        labelTipoDoPlano.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelTipoDoPlano.setText("Tipo do plano:");
        panelPrincipal.add(labelTipoDoPlano);
        labelTipoDoPlano.setBounds(20, 218, 99, 20);

        labelCodigo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelCodigo.setText("Código:");
        panelPrincipal.add(labelCodigo);
        labelCodigo.setBounds(20, 68, 60, 20);

        textTipoDoPlano.setBackground(new java.awt.Color(204, 204, 255));
        textTipoDoPlano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textTipoDoPlanoActionPerformed(evt);
            }
        });
        panelPrincipal.add(textTipoDoPlano);
        textTipoDoPlano.setBounds(20, 250, 390, 30);

        labelNomeDaOperadora.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelNomeDaOperadora.setText("Nome da operadora:");
        panelPrincipal.add(labelNomeDaOperadora);
        labelNomeDaOperadora.setBounds(20, 143, 143, 20);

        buttonSalvar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttonSalvar.setForeground(new java.awt.Color(255, 255, 255));
        buttonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/floppy-disk.png"))); // NOI18N
        buttonSalvar.setToolTipText("Salvar alterações");
        buttonSalvar.setPreferredSize(new java.awt.Dimension(38, 38));
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });
        panelPrincipal.add(buttonSalvar);
        buttonSalvar.setBounds(530, 290, 90, 60);

        buttonCancelar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttonCancelar.setForeground(new java.awt.Color(255, 255, 255));
        buttonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/cancelar.png"))); // NOI18N
        buttonCancelar.setToolTipText(" Cancelar alterações");
        buttonCancelar.setPreferredSize(new java.awt.Dimension(38, 38));
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });
        panelPrincipal.add(buttonCancelar);
        buttonCancelar.setBounds(420, 290, 90, 60);

        textCodigo.setEditable(false);
        textCodigo.setBackground(new java.awt.Color(204, 204, 255));
        textCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCodigoActionPerformed(evt);
            }
        });
        panelPrincipal.add(textCodigo);
        textCodigo.setBounds(20, 100, 140, 30);

        textNomeDaOperadora.setBackground(new java.awt.Color(204, 204, 255));
        textNomeDaOperadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNomeDaOperadoraActionPerformed(evt);
            }
        });
        panelPrincipal.add(textNomeDaOperadora);
        textNomeDaOperadora.setBounds(20, 175, 390, 30);

        getContentPane().add(panelPrincipal);
        panelPrincipal.setBounds(30, 90, 640, 370);

        setBounds(0, 0, 721, 502);
    }// </editor-fold>//GEN-END:initComponents

    private void textTipoDoPlanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textTipoDoPlanoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textTipoDoPlanoActionPerformed

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed

        if (tipoOperacao == TipoOperacao.ADICIONAR) {
            gravar();
        } else {
            atualizar();
        }


    }//GEN-LAST:event_buttonSalvarActionPerformed

    private void atualizar() {
        planoDeSaude.setOperadora(textNomeDaOperadora.getText());
        planoDeSaude.setTipoDoPlano(textTipoDoPlano.getText());

        if (validarCadastro()) {
            PlanoDeSaudeDAO.atualizar(planoDeSaude);
            
            JOptionPane.showMessageDialog(
                    null,
                    "Plano de saúde atualizado com sucesso!",
                    "Plano de saúde",
                    JOptionPane.INFORMATION_MESSAGE);
            dispose();
        }

    }

    private void gravar() {
        //criar um objeto plano de saude
        PlanoDeSaude planoDeSaude = new PlanoDeSaude();
        planoDeSaude.setOperadora(textNomeDaOperadora.getText());
        planoDeSaude.setTipoDoPlano(textTipoDoPlano.getText());

        if (validarCadastro()) {
            PlanoDeSaudeDAO.gravar(planoDeSaude);
            JOptionPane.showMessageDialog(
                    this,
                    "Plano de saúde gravado com sucesso",
                    "Plano de saúde",
                    JOptionPane.INFORMATION_MESSAGE);
            dispose();
        }
    }

    private boolean validarCadastro() {
        if (textNomeDaOperadora.getText().isEmpty()) {
            JOptionPane.showMessageDialog(
                    this,
                    "Por favor, preencha o nome da operadora!!",
                    "Plano de saúde",
                    JOptionPane.ERROR_MESSAGE);

            textNomeDaOperadora.requestFocus();

            return false;
        }
        if (textTipoDoPlano.getText().isEmpty()) {
            JOptionPane.showMessageDialog(
                    this,
                    "Por favor, preencha o tipo do plano!!",
                    "Plano de saúde",
                    JOptionPane.ERROR_MESSAGE);

            textTipoDoPlano.requestFocus();

            return false;
        }
        return true;
    }

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed

    }//GEN-LAST:event_buttonCancelarActionPerformed

    private void textCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCodigoActionPerformed

    private void textNomeDaOperadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNomeDaOperadoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNomeDaOperadoraActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelDetalhesDoPlano;
    private javax.swing.JLabel labelIcone;
    private javax.swing.JLabel labelNomeDaOperadora;
    private javax.swing.JLabel labelTipoDoPlano;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelSuperior;
    private javax.swing.JTextField textCodigo;
    private javax.swing.JTextField textNomeDaOperadora;
    private javax.swing.JTextField textTipoDoPlano;
    // End of variables declaration//GEN-END:variables
}
