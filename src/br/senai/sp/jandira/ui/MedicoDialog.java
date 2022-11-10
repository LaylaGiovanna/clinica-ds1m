package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.TipoOperacao;

public class MedicoDialog extends javax.swing.JDialog {

    private TipoOperacao tipoOperacao;
    private Medico medico;
    
    public MedicoDialog(
            java.awt.Frame parent,
            boolean modal,
            TipoOperacao tipoOperacao,
            Medico medico) {

        super(parent, modal);
        initComponents();
        this.tipoOperacao = tipoOperacao;
        this.medico = medico;

        //Preencher os campos caso o tipo de operação for ALTERAR
        if (tipoOperacao == TipoOperacao.ALTERAR) {
            preencherFormulario();
        }

    }
    
//    private void preencherFormulario() {
//        labelTitulo.setText("Especialidade - " + tipoOperacao);
//        labelIcone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/edit32.png")));
//        textCodigo.setText(medico.getCodigo().toString());
//        textNomeDaEspecialidade.setText(medico.getNome());
//        textDescricao.setText(medico.getDescricao());
//    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelSuperior = new javax.swing.JPanel();
        labelIcone = new javax.swing.JLabel();
        labelTitulo = new javax.swing.JLabel();
        panelPrincipal = new javax.swing.JPanel();
        labelDetalhesDoMedico = new javax.swing.JLabel();
        labelNomeDoMedico = new javax.swing.JLabel();
        labelCodigo = new javax.swing.JLabel();
        textDescricao = new javax.swing.JTextField();
        labelNomeDaEspecialidade = new javax.swing.JLabel();
        buttonSalvar = new javax.swing.JButton();
        buttonCancelar = new javax.swing.JButton();
        textCodigo = new javax.swing.JTextField();
        textNomeDaEspecialidade = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        panelSuperior.setBackground(new java.awt.Color(204, 204, 255));
        panelSuperior.setLayout(null);

        labelIcone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/menu.png"))); // NOI18N
        panelSuperior.add(labelIcone);
        labelIcone.setBounds(25, 12, 40, 40);

        labelTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        labelTitulo.setText("Médico - Adicionar");
        panelSuperior.add(labelTitulo);
        labelTitulo.setBounds(70, 12, 360, 40);

        getContentPane().add(panelSuperior);
        panelSuperior.setBounds(0, 0, 710, 70);

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        panelPrincipal.setLayout(null);

        labelDetalhesDoMedico.setBackground(new java.awt.Color(195, 161, 251));
        labelDetalhesDoMedico.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelDetalhesDoMedico.setForeground(new java.awt.Color(195, 161, 251));
        labelDetalhesDoMedico.setText("Detalhes da médico:");
        panelPrincipal.add(labelDetalhesDoMedico);
        labelDetalhesDoMedico.setBounds(20, 20, 240, 20);

        labelNomeDoMedico.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelNomeDoMedico.setText("Nome da médico:");
        panelPrincipal.add(labelNomeDoMedico);
        labelNomeDoMedico.setBounds(20, 218, 140, 20);

        labelCodigo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelCodigo.setText("Código:");
        panelPrincipal.add(labelCodigo);
        labelCodigo.setBounds(20, 68, 60, 20);

        textDescricao.setBackground(new java.awt.Color(204, 204, 255));
        textDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textDescricaoActionPerformed(evt);
            }
        });
        panelPrincipal.add(textDescricao);
        textDescricao.setBounds(20, 250, 390, 30);

        labelNomeDaEspecialidade.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelNomeDaEspecialidade.setText("CRM:");
        panelPrincipal.add(labelNomeDaEspecialidade);
        labelNomeDaEspecialidade.setBounds(20, 143, 37, 20);

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

        textNomeDaEspecialidade.setBackground(new java.awt.Color(204, 204, 255));
        textNomeDaEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNomeDaEspecialidadeActionPerformed(evt);
            }
        });
        panelPrincipal.add(textNomeDaEspecialidade);
        textNomeDaEspecialidade.setBounds(20, 175, 390, 30);

        getContentPane().add(panelPrincipal);
        panelPrincipal.setBounds(30, 90, 640, 370);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textDescricaoActionPerformed

    }//GEN-LAST:event_textDescricaoActionPerformed

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
        if (tipoOperacao == TipoOperacao.ADICIONAR) {
            gravar();
        } else {
            atualizar();
        }
    }//GEN-LAST:event_buttonSalvarActionPerformed

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed

    }//GEN-LAST:event_buttonCancelarActionPerformed

    private void textCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCodigoActionPerformed

    private void textNomeDaEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNomeDaEspecialidadeActionPerformed

    }//GEN-LAST:event_textNomeDaEspecialidadeActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelDetalhesDoMedico;
    private javax.swing.JLabel labelIcone;
    private javax.swing.JLabel labelNomeDaEspecialidade;
    private javax.swing.JLabel labelNomeDoMedico;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelSuperior;
    private javax.swing.JTextField textCodigo;
    private javax.swing.JTextField textDescricao;
    private javax.swing.JTextField textNomeDaEspecialidade;
    // End of variables declaration//GEN-END:variables
}
