package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadeDAO;
import br.senai.sp.jandira.dao.MedicoDAO;
import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;

public class HomeFrame extends javax.swing.JFrame {

    private PlanosDeSaudePanel planosDeSaudePanel;
    private EspecialidadePanel especialidadePanel;
    private MedicoPanel medicoPanel;

    private final int POSICAO_X = 10;
    private final int POSICAO_Y = 180;
    private final int LARGURA = 945;
    private final int ALTURA = 370;

    public HomeFrame() {

        initComponents();
        PlanoDeSaudeDAO.getListaPlanosDeSaude();
        EspecialidadeDAO.getListaEspecialidade();
        MedicoDAO.getListaMedico();
        initPanels();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        buttonSair = new javax.swing.JButton();
        buttonAgenda = new javax.swing.JButton();
        buttonPlanosDeSaude = new javax.swing.JButton();
        buttonEspecialidades = new javax.swing.JButton();
        buttonPacientes = new javax.swing.JButton();
        buttonMedicos = new javax.swing.JButton();
        panelHome = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        buttonHome = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 102, 255));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sistema para Agendamento de Consultas");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(90, 20, 740, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/schedule.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 10, 70, 64);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 970, 80);

        buttonSair.setBackground(new java.awt.Color(254, 254, 254));
        buttonSair.setForeground(new java.awt.Color(51, 0, 255));
        buttonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/exit_1.png"))); // NOI18N
        buttonSair.setToolTipText("Sair do sistema");
        buttonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSairActionPerformed(evt);
            }
        });
        getContentPane().add(buttonSair);
        buttonSair.setBounds(875, 100, 80, 60);

        buttonAgenda.setBackground(new java.awt.Color(254, 254, 254));
        buttonAgenda.setForeground(new java.awt.Color(51, 0, 255));
        buttonAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/calendar_1.png"))); // NOI18N
        buttonAgenda.setToolTipText("Agenda");
        buttonAgenda.setPreferredSize(new java.awt.Dimension(38, 38));
        buttonAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAgendaActionPerformed(evt);
            }
        });
        getContentPane().add(buttonAgenda);
        buttonAgenda.setBounds(100, 100, 80, 60);

        buttonPlanosDeSaude.setBackground(new java.awt.Color(254, 254, 254));
        buttonPlanosDeSaude.setForeground(new java.awt.Color(51, 0, 255));
        buttonPlanosDeSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/health-card.png"))); // NOI18N
        buttonPlanosDeSaude.setToolTipText("Planos de saúde");
        buttonPlanosDeSaude.setPreferredSize(new java.awt.Dimension(38, 38));
        buttonPlanosDeSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPlanosDeSaudeActionPerformed(evt);
            }
        });
        getContentPane().add(buttonPlanosDeSaude);
        buttonPlanosDeSaude.setBounds(460, 100, 80, 60);

        buttonEspecialidades.setBackground(new java.awt.Color(254, 254, 254));
        buttonEspecialidades.setForeground(new java.awt.Color(51, 0, 255));
        buttonEspecialidades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/lista.png"))); // NOI18N
        buttonEspecialidades.setToolTipText("Especialidades");
        buttonEspecialidades.setPreferredSize(new java.awt.Dimension(38, 38));
        buttonEspecialidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEspecialidadesActionPerformed(evt);
            }
        });
        getContentPane().add(buttonEspecialidades);
        buttonEspecialidades.setBounds(370, 100, 80, 60);

        buttonPacientes.setBackground(new java.awt.Color(254, 254, 254));
        buttonPacientes.setForeground(new java.awt.Color(51, 0, 255));
        buttonPacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/sick.png"))); // NOI18N
        buttonPacientes.setToolTipText("Pacientes");
        buttonPacientes.setPreferredSize(new java.awt.Dimension(38, 38));
        buttonPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPacientesActionPerformed(evt);
            }
        });
        getContentPane().add(buttonPacientes);
        buttonPacientes.setBounds(190, 100, 80, 60);

        buttonMedicos.setBackground(new java.awt.Color(254, 254, 254));
        buttonMedicos.setForeground(new java.awt.Color(51, 0, 255));
        buttonMedicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/medical-team_1.png"))); // NOI18N
        buttonMedicos.setToolTipText("Médicos");
        buttonMedicos.setPreferredSize(new java.awt.Dimension(38, 38));
        buttonMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMedicosActionPerformed(evt);
            }
        });
        getContentPane().add(buttonMedicos);
        buttonMedicos.setBounds(280, 100, 80, 60);

        panelHome.setBackground(new java.awt.Color(255, 255, 255));
        panelHome.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelHome.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(195, 161, 251));
        jLabel3.setText("SISACON");
        panelHome.add(jLabel3);
        jLabel3.setBounds(20, 40, 230, 70);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Sistema para Agendamento de Consultas");
        panelHome.add(jLabel4);
        jLabel4.setBounds(20, 100, 260, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Dados para contato:");
        panelHome.add(jLabel5);
        jLabel5.setBounds(710, 150, 200, 17);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("www.siacon.com.br");
        panelHome.add(jLabel6);
        jLabel6.setBounds(710, 220, 200, 15);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("E-mail: suporte@sisacon.com.br");
        panelHome.add(jLabel7);
        jLabel7.setBounds(710, 180, 200, 15);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Telefone: (11) 95555-5555");
        panelHome.add(jLabel8);
        jLabel8.setBounds(710, 200, 200, 15);

        jPanel2.setBackground(new java.awt.Color(195, 161, 251));
        panelHome.add(jPanel2);
        jPanel2.setBounds(20, 130, 890, 4);

        getContentPane().add(panelHome);
        panelHome.setBounds(10, 180, 945, 370);

        buttonHome.setBackground(new java.awt.Color(195, 161, 251));
        buttonHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/house.png"))); // NOI18N
        buttonHome.setToolTipText("Voltar para a página principal");
        buttonHome.setPreferredSize(new java.awt.Dimension(38, 38));
        buttonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHomeActionPerformed(evt);
            }
        });
        getContentPane().add(buttonHome);
        buttonHome.setBounds(10, 100, 80, 60);

        setBounds(0, 0, 983, 610);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHomeActionPerformed

        buttonPlanosDeSaude.setBackground(new java.awt.Color(255, 255, 255));
        buttonEspecialidades.setBackground(new java.awt.Color(255, 255, 255));
        buttonHome.setBackground(new java.awt.Color(195, 161, 251));
        buttonMedicos.setBackground(new java.awt.Color(255, 255, 255));

        panelHome.setVisible(true);
        planosDeSaudePanel.setVisible(false);
        especialidadePanel.setVisible(false);
        medicoPanel.setVisible(false);

    }//GEN-LAST:event_buttonHomeActionPerformed

    private void buttonPlanosDeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPlanosDeSaudeActionPerformed

        buttonPlanosDeSaude.setBackground(new java.awt.Color(195, 161, 251));
        buttonHome.setBackground(new java.awt.Color(255, 255, 255));
        buttonEspecialidades.setBackground(new java.awt.Color(255, 255, 255));
        buttonMedicos.setBackground(new java.awt.Color(255, 255, 255));

        planosDeSaudePanel.setVisible(true);
        panelHome.setVisible(false);
        especialidadePanel.setVisible(false);
        medicoPanel.setVisible(false);
    }//GEN-LAST:event_buttonPlanosDeSaudeActionPerformed

    private void buttonEspecialidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEspecialidadesActionPerformed

        buttonEspecialidades.setBackground(new java.awt.Color(195, 161, 251));
        buttonHome.setBackground(new java.awt.Color(255, 255, 255));
        buttonPlanosDeSaude.setBackground(new java.awt.Color(255, 255, 255));
        buttonMedicos.setBackground(new java.awt.Color(255, 255, 255));

        especialidadePanel.setVisible(true);
        panelHome.setVisible(false);
        planosDeSaudePanel.setVisible(false);
        medicoPanel.setVisible(false);

    }//GEN-LAST:event_buttonEspecialidadesActionPerformed

    private void buttonMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMedicosActionPerformed

        buttonMedicos.setBackground(new java.awt.Color(195, 161, 251));
        buttonHome.setBackground(new java.awt.Color(255, 255, 255));
        buttonPlanosDeSaude.setBackground(new java.awt.Color(255, 255, 255));
        buttonEspecialidades.setBackground(new java.awt.Color(255, 255, 255));

        medicoPanel.setVisible(true);
        panelHome.setVisible(false);
        especialidadePanel.setVisible(false);
        planosDeSaudePanel.setVisible(false);


    }//GEN-LAST:event_buttonMedicosActionPerformed

    private void buttonPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPacientesActionPerformed
        //buttonPacientes.setBackground(new java.awt.Color(195, 161, 251));
    }//GEN-LAST:event_buttonPacientesActionPerformed

    private void buttonAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAgendaActionPerformed
        //buttonAgenda.setBackground(new java.awt.Color(195, 161, 251));
    }//GEN-LAST:event_buttonAgendaActionPerformed

    private void buttonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSairActionPerformed
        //buttonSair.setBackground(new java.awt.Color(195, 161, 251));
    }//GEN-LAST:event_buttonSairActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAgenda;
    private javax.swing.JButton buttonEspecialidades;
    private javax.swing.JButton buttonHome;
    private javax.swing.JButton buttonMedicos;
    private javax.swing.JButton buttonPacientes;
    private javax.swing.JButton buttonPlanosDeSaude;
    private javax.swing.JButton buttonSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel panelHome;
    // End of variables declaration//GEN-END:variables

    private void initPanels() {
        //Plano de saúde
        planosDeSaudePanel = new PlanosDeSaudePanel();

        planosDeSaudePanel.setBounds(
                POSICAO_X, POSICAO_Y,
                LARGURA, ALTURA);

        getContentPane().add(planosDeSaudePanel);
        planosDeSaudePanel.setVisible(false);

        //Especialidade
        especialidadePanel = new EspecialidadePanel();

        especialidadePanel.setBounds(
                POSICAO_X, POSICAO_Y,
                LARGURA, ALTURA);
        getContentPane().add(especialidadePanel);
        especialidadePanel.setVisible(false);

        medicoPanel = new MedicoPanel();

        medicoPanel.setBounds(
                POSICAO_X, POSICAO_Y,
                LARGURA, ALTURA);
        getContentPane().add(medicoPanel);
        medicoPanel.setVisible(false);
    }

}
