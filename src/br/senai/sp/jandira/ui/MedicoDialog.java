package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.MedicoDAO;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.TipoOperacao;
import javax.swing.JOptionPane;

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

    private void preencherFormulario() {
        labelTitulo.setText("Médico - " + tipoOperacao);
        labelIcone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/edit32.png")));
        textCodigo.setText(medico.getCodigo().toString());
        textCrm.setText(medico.getCrm());
        textNomeDoMedico.setText(medico.getNome());
        textTelefone.setText(medico.getTelefone());
        textEmail.setText(medico.getEmail());
        textDataDeNascimento.setText(medico.getDataDeNascimento().toString());
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelSuperior = new javax.swing.JPanel();
        labelIcone = new javax.swing.JLabel();
        labelTitulo = new javax.swing.JLabel();
        panelPrincipal = new javax.swing.JPanel();
        labelDetalhesDoMedico = new javax.swing.JLabel();
        labelCodigo = new javax.swing.JLabel();
        labelNumeroDoCrm = new javax.swing.JLabel();
        labelNomeDoMedico = new javax.swing.JLabel();
        labelTelefone = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        labelDataNascimento = new javax.swing.JLabel();
        labelListaDeEspecialidades = new javax.swing.JLabel();
        labelEspecialidadeDoMedico = new javax.swing.JLabel();
        textCodigo = new javax.swing.JTextField();
        textCrm = new javax.swing.JTextField();
        textNomeDoMedico = new javax.swing.JTextField();
        textTelefone = new javax.swing.JTextField();
        textEmail = new javax.swing.JTextField();
        textDataDeNascimento = new javax.swing.JTextField();
        scrollPaneListaDeEspecialidades = new javax.swing.JScrollPane();
        listListaDeEspecialidades = new javax.swing.JList<>();
        buttonDireita = new javax.swing.JButton();
        buttonEsquerda = new javax.swing.JButton();
        scrollPaneEspecialidadeDoMedico = new javax.swing.JScrollPane();
        listEspecialidadeDoMedico = new javax.swing.JList<>();
        buttonCancelar = new javax.swing.JButton();
        buttonSalvar = new javax.swing.JButton();

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
        panelSuperior.setBounds(0, 0, 1030, 70);

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        panelPrincipal.setLayout(null);

        labelDetalhesDoMedico.setBackground(new java.awt.Color(195, 161, 251));
        labelDetalhesDoMedico.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelDetalhesDoMedico.setForeground(new java.awt.Color(195, 161, 251));
        labelDetalhesDoMedico.setText("Detalhes da médico:");
        panelPrincipal.add(labelDetalhesDoMedico);
        labelDetalhesDoMedico.setBounds(20, 20, 240, 20);

        labelCodigo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelCodigo.setText("Código:");
        panelPrincipal.add(labelCodigo);
        labelCodigo.setBounds(20, 68, 60, 20);

        labelNumeroDoCrm.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelNumeroDoCrm.setText("CRM:");
        panelPrincipal.add(labelNumeroDoCrm);
        labelNumeroDoCrm.setBounds(180, 70, 37, 20);

        labelNomeDoMedico.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelNomeDoMedico.setText("Nome do médico:");
        panelPrincipal.add(labelNomeDoMedico);
        labelNomeDoMedico.setBounds(430, 70, 140, 20);

        labelTelefone.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelTelefone.setText("Telefone:");
        panelPrincipal.add(labelTelefone);
        labelTelefone.setBounds(20, 160, 100, 20);

        labelEmail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelEmail.setText("Email:");
        panelPrincipal.add(labelEmail);
        labelEmail.setBounds(220, 160, 100, 20);

        labelDataNascimento.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelDataNascimento.setText("Data Nascimento:");
        panelPrincipal.add(labelDataNascimento);
        labelDataNascimento.setBounds(620, 160, 160, 20);

        labelListaDeEspecialidades.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelListaDeEspecialidades.setText("Lista de Especialidades:");
        panelPrincipal.add(labelListaDeEspecialidades);
        labelListaDeEspecialidades.setBounds(150, 260, 190, 20);

        labelEspecialidadeDoMedico.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelEspecialidadeDoMedico.setText("Especialidade do Médico:");
        panelPrincipal.add(labelEspecialidadeDoMedico);
        labelEspecialidadeDoMedico.setBounds(520, 260, 190, 20);

        textCodigo.setEditable(false);
        textCodigo.setBackground(new java.awt.Color(204, 204, 255));
        textCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCodigoActionPerformed(evt);
            }
        });
        panelPrincipal.add(textCodigo);
        textCodigo.setBounds(20, 100, 140, 30);

        textCrm.setBackground(new java.awt.Color(204, 204, 255));
        textCrm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCrmActionPerformed(evt);
            }
        });
        panelPrincipal.add(textCrm);
        textCrm.setBounds(180, 100, 230, 30);

        textNomeDoMedico.setBackground(new java.awt.Color(204, 204, 255));
        textNomeDoMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNomeDoMedicoActionPerformed(evt);
            }
        });
        panelPrincipal.add(textNomeDoMedico);
        textNomeDoMedico.setBounds(430, 100, 440, 30);

        textTelefone.setEditable(false);
        textTelefone.setBackground(new java.awt.Color(204, 204, 255));
        textTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textTelefoneActionPerformed(evt);
            }
        });
        panelPrincipal.add(textTelefone);
        textTelefone.setBounds(20, 190, 180, 30);

        textEmail.setEditable(false);
        textEmail.setBackground(new java.awt.Color(204, 204, 255));
        textEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textEmailActionPerformed(evt);
            }
        });
        panelPrincipal.add(textEmail);
        textEmail.setBounds(220, 190, 380, 30);

        textDataDeNascimento.setEditable(false);
        textDataDeNascimento.setBackground(new java.awt.Color(204, 204, 255));
        textDataDeNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textDataDeNascimentoActionPerformed(evt);
            }
        });
        panelPrincipal.add(textDataDeNascimento);
        textDataDeNascimento.setBounds(620, 190, 250, 30);

        listListaDeEspecialidades.setBackground(new java.awt.Color(204, 204, 255));
        listListaDeEspecialidades.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        scrollPaneListaDeEspecialidades.setViewportView(listListaDeEspecialidades);

        panelPrincipal.add(scrollPaneListaDeEspecialidades);
        scrollPaneListaDeEspecialidades.setBounds(150, 290, 190, 200);

        buttonDireita.setBackground(new java.awt.Color(204, 204, 255));
        buttonDireita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/seta-direita.png"))); // NOI18N
        buttonDireita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDireitaActionPerformed(evt);
            }
        });
        panelPrincipal.add(buttonDireita);
        buttonDireita.setBounds(410, 340, 40, 40);

        buttonEsquerda.setBackground(new java.awt.Color(204, 204, 255));
        buttonEsquerda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/seta-esquerda.png"))); // NOI18N
        buttonEsquerda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEsquerdaActionPerformed(evt);
            }
        });
        panelPrincipal.add(buttonEsquerda);
        buttonEsquerda.setBounds(410, 390, 40, 40);

        listEspecialidadeDoMedico.setBackground(new java.awt.Color(204, 204, 255));
        listEspecialidadeDoMedico.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        scrollPaneEspecialidadeDoMedico.setViewportView(listEspecialidadeDoMedico);

        panelPrincipal.add(scrollPaneEspecialidadeDoMedico);
        scrollPaneEspecialidadeDoMedico.setBounds(520, 290, 190, 200);

        getContentPane().add(panelPrincipal);
        panelPrincipal.setBounds(30, 90, 920, 530);

        buttonCancelar.setBackground(new java.awt.Color(254, 254, 254));
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
        getContentPane().add(buttonCancelar);
        buttonCancelar.setBounds(750, 630, 90, 60);

        buttonSalvar.setBackground(new java.awt.Color(254, 254, 254));
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
        getContentPane().add(buttonSalvar);
        buttonSalvar.setBounds(860, 630, 90, 60);

        setBounds(0, 0, 1009, 760);
    }// </editor-fold>//GEN-END:initComponents

    private void textCrmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCrmActionPerformed

    }//GEN-LAST:event_textCrmActionPerformed

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
        if (tipoOperacao == TipoOperacao.ADICIONAR) {
            gravar();
        } else {
            atualizar();
        }
    }//GEN-LAST:event_buttonSalvarActionPerformed

    private void atualizar() {
        medico.setNome(textCrm.getText());
        medico.setCrm(textNomeDoMedico.getText());

        if (validarCadastro()) {
            MedicoDAO.atualizar(medico);

            JOptionPane.showMessageDialog(
                    null,
                    "Médico atualizado com sucesso!",
                    "Médico",
                    JOptionPane.INFORMATION_MESSAGE);
            dispose();
        }

    }

    private void gravar() {
        //criar um objeto plano de saude
        Medico medico = new Medico();
        medico.setCrm(textNomeDoMedico.getText());
        medico.setNome(textCrm.getText());

        if (validarCadastro()) {
            MedicoDAO.gravar(medico);
            JOptionPane.showMessageDialog(
                    this,
                    "Médico gravado com sucesso",
                    "Médico",
                    JOptionPane.INFORMATION_MESSAGE);
            dispose();
        }
    }

    private boolean validarCadastro() {
        if (textCrm.getText().isEmpty()) {
            JOptionPane.showMessageDialog(
                    this,
                    "Por favor, preencha o CRM do médico!!",
                    "Médico",
                    JOptionPane.ERROR_MESSAGE);

            textCrm.requestFocus();
            return false;
        }
         if (textNomeDoMedico.getText().isEmpty()) {
            JOptionPane.showMessageDialog(
                    this,
                    "Por favor, preencha o nome do médico!!",
                    "Médico",
                    JOptionPane.ERROR_MESSAGE);

            textNomeDoMedico.requestFocus();
            return false;
        }
         
        if(textTelefone.getText().isEmpty()){
            JOptionPane.showMessageDialog(
                    this,
                    "Por favor, preencha o número de telefone!!",
                    "Médico",
                    JOptionPane.ERROR_MESSAGE);

            textTelefone.requestFocus();
            return false;
        }
        if(textEmail.getText().isEmpty()){
            JOptionPane.showMessageDialog(
                    this,
                    "Por favor, preencha o email!!",
                    "Médico",
                    JOptionPane.ERROR_MESSAGE);

            textEmail.requestFocus();
            return false;
        }
        if(textDataDeNascimento.getText().isEmpty()){
            JOptionPane.showMessageDialog(
                    this,
                    "Por favor, preencha a data de nascimento!!",
                    "Médico",
                    JOptionPane.ERROR_MESSAGE);

            textDataDeNascimento.requestFocus();
            return false;
        }
        return true;
    }


    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed

    }//GEN-LAST:event_buttonCancelarActionPerformed

    private void textDataDeNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textDataDeNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textDataDeNascimentoActionPerformed

    private void textNomeDoMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNomeDoMedicoActionPerformed

    }//GEN-LAST:event_textNomeDoMedicoActionPerformed

    private void textCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCodigoActionPerformed

    private void textTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textTelefoneActionPerformed

    private void textEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textEmailActionPerformed

    private void buttonEsquerdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEsquerdaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonEsquerdaActionPerformed

    private void buttonDireitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDireitaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonDireitaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonDireita;
    private javax.swing.JButton buttonEsquerda;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelDataNascimento;
    private javax.swing.JLabel labelDetalhesDoMedico;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelEspecialidadeDoMedico;
    private javax.swing.JLabel labelIcone;
    private javax.swing.JLabel labelListaDeEspecialidades;
    private javax.swing.JLabel labelNomeDoMedico;
    private javax.swing.JLabel labelNumeroDoCrm;
    private javax.swing.JLabel labelTelefone;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JList<String> listEspecialidadeDoMedico;
    private javax.swing.JList<String> listListaDeEspecialidades;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelSuperior;
    private javax.swing.JScrollPane scrollPaneEspecialidadeDoMedico;
    private javax.swing.JScrollPane scrollPaneListaDeEspecialidades;
    private javax.swing.JTextField textCodigo;
    private javax.swing.JTextField textCrm;
    private javax.swing.JTextField textDataDeNascimento;
    private javax.swing.JTextField textEmail;
    private javax.swing.JTextField textNomeDoMedico;
    private javax.swing.JTextField textTelefone;
    // End of variables declaration//GEN-END:variables
}
