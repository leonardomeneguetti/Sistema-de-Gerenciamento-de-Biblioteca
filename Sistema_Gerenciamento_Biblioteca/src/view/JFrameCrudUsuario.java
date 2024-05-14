package view;

import controller.LogTrack;
import java.awt.event.WindowEvent;
import model.TipoUsuario;
import model.Usuario;

public class JFrameCrudUsuario extends javax.swing.JFrame {
    private Usuario data;
    private TipoUsuario tipoUsuario;
    private boolean disconnectOnClose;

    public JFrameCrudUsuario(Usuario data, boolean disconnectOnClose) throws Exception {
        initComponents();
        
        if(data == null) {
            this.data  = new Usuario();
        } else {
            this.data = data;
            if( this.data.getTipoUsuario() != null ) {
                this.tipoUsuario = new TipoUsuario();
                this.tipoUsuario.setCodigo(this.data.getTipoUsuario().getCodigo());
                this.tipoUsuario.load();
            }
            
            dataUp();
            jTextFieldId.setEnabled(false);
        }
        
        this.disconnectOnClose = disconnectOnClose;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelID = new javax.swing.JLabel();
        jLabelNome = new javax.swing.JLabel();
        jLabelDataNascimento = new javax.swing.JLabel();
        jLabelCpf = new javax.swing.JLabel();
        jLabelRg = new javax.swing.JLabel();
        jLabelOrgaoEmissor = new javax.swing.JLabel();
        jLabelCidade = new javax.swing.JLabel();
        jLabelEstado = new javax.swing.JLabel();
        jLabelTelefone = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jLabelSenha = new javax.swing.JLabel();
        jTextFieldId = new javax.swing.JTextField();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldDataNascimento = new javax.swing.JTextField();
        jTextFieldCpf = new javax.swing.JTextField();
        jTextFieldRg = new javax.swing.JTextField();
        jTextFieldOrgaoEmissor = new javax.swing.JTextField();
        jTextFieldCidade = new javax.swing.JTextField();
        jTextFieldEstado = new javax.swing.JTextField();
        jTextFieldTelefone = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jPasswordField = new javax.swing.JPasswordField();
        jButtonSalvar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jLabelTipo = new javax.swing.JLabel();
        jTextFieldTipo = new javax.swing.JTextField();
        jButtonExcluirTipo = new javax.swing.JButton();
        jButtonSelecionarTipo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Usuario");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabelID.setText("ID");

        jLabelNome.setText("Nome");

        jLabelDataNascimento.setText("Dt. nascimento");

        jLabelCpf.setText("Cpf");

        jLabelRg.setText("Rg");

        jLabelOrgaoEmissor.setText("Orgão emissor");

        jLabelCidade.setText("Cidade");

        jLabelEstado.setText("Estado");

        jLabelTelefone.setText("Telefone");

        jLabelEmail.setText("E-mail");

        jLabelSenha.setText("Senha");

        jTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeActionPerformed(evt);
            }
        });

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jLabelTipo.setText("Tipo Usuario");

        jTextFieldTipo.setEditable(false);

        jButtonExcluirTipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/eraser-icon.png"))); // NOI18N
        jButtonExcluirTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirTipoActionPerformed(evt);
            }
        });

        jButtonSelecionarTipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/search-icon.png"))); // NOI18N
        jButtonSelecionarTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSelecionarTipoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelDataNascimento)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelOrgaoEmissor)
                                    .addComponent(jLabelCidade)
                                    .addComponent(jLabelEstado)
                                    .addComponent(jLabelTelefone)
                                    .addComponent(jLabelEmail)
                                    .addComponent(jLabelSenha)
                                    .addComponent(jLabelRg)
                                    .addComponent(jLabelCpf)
                                    .addComponent(jLabelNome)
                                    .addComponent(jLabelID)
                                    .addComponent(jLabelTipo))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextFieldDataNascimento, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jPasswordField)
                                    .addComponent(jTextFieldTelefone)
                                    .addComponent(jTextFieldEstado)
                                    .addComponent(jTextFieldCidade)
                                    .addComponent(jTextFieldOrgaoEmissor)
                                    .addComponent(jTextFieldRg)
                                    .addComponent(jTextFieldCpf)
                                    .addComponent(jTextFieldNome)
                                    .addComponent(jTextFieldId)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextFieldTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonSelecionarTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButtonExcluirTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSalvar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelID)
                    .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNome)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDataNascimento)
                    .addComponent(jTextFieldDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCpf)
                    .addComponent(jTextFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelRg)
                    .addComponent(jTextFieldRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelOrgaoEmissor)
                    .addComponent(jTextFieldOrgaoEmissor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCidade)
                    .addComponent(jTextFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEstado)
                    .addComponent(jTextFieldEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTelefone)
                    .addComponent(jTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEmail)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSenha)
                    .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButtonSelecionarTipo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelTipo)
                        .addComponent(jTextFieldTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonExcluirTipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonExcluir))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void checkInput() throws Exception {
        if(jTextFieldId.getText().isEmpty()) {
            throw new Exception("Informe ID.");
        } else {
            if(!jTextFieldId.getText().matches("\\d+")) {
                throw new Exception("O campo ID deve ser um número.");
            }
        }
        
        if(jTextFieldNome.getText().isEmpty()) {
            throw new Exception("Informe Nome.");
        }
        
        if(jTextFieldDataNascimento.getText().isEmpty()) {
            throw new Exception("Informe Data de Nascimento.");
        } else {
            if(!jTextFieldDataNascimento.getText().matches("\\d{4}-\\d{2}-\\d{2}")) {
                throw new Exception("A Data de Nascimento deve estar no formato AAAA-MM-DD.");
            }
        }
        
        if(jPasswordField.getText().isEmpty()) {
            throw new Exception("Informe Senha.");
        }
        
        if(tipoUsuario == null) {
            throw new Exception("Informe Tipo Usuário.");
        }
    }
    
    private void dataUp() {
        jTextFieldId.setText(String.valueOf(data.getCodigo()));
        jTextFieldNome.setText(data.getNome());
        jTextFieldDataNascimento.setText(data.getDataNascimento());
        jTextFieldCpf.setText(data.getCpf());
        jTextFieldRg.setText(data.getRg());
        jTextFieldOrgaoEmissor.setText(data.getOrgaoEmissor());
        jTextFieldCidade.setText(data.getCidade());
        jTextFieldEstado.setText(data.getEstado());
        jTextFieldTelefone.setText(data.getTelefone());
        jTextFieldEmail.setText(data.getEmail());
        jPasswordField.setText(data.getSenha());
        if(data.getTipoUsuario().getNome() != null) {
            jTextFieldTipo.setText(data.getTipoUsuario().getNome());
        }
    }
    
    private void dataDown() throws Exception {
        data.setCodigo(Integer.parseInt(jTextFieldId.getText()));
        data.setNome(jTextFieldNome.getText());
        data.setDataNascimento(jTextFieldDataNascimento.getText());
        data.setCpf(jTextFieldCpf.getText());
        data.setRg(jTextFieldRg.getText());
        data.setOrgaoEmissor(jTextFieldOrgaoEmissor.getText());
        data.setCidade(jTextFieldCidade.getText());
        data.setEstado(jTextFieldEstado.getText());
        data.setTelefone(jTextFieldTelefone.getText());
        data.setEmail(jTextFieldEmail.getText());
        data.setSenha(jPasswordField.getText());
        data.setTipoUsuario(tipoUsuario);
    }
    
    private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed
    }//GEN-LAST:event_jTextFieldNomeActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        try {
            checkInput();
            dataDown();
            data.save();
            this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
        } catch(Exception ex) {
            LogTrack.getInstance().addException(ex, true, this);
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        try {
            checkInput();
            dataDown();
            data.delete();
            this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
        } catch(Exception ex) {
            LogTrack.getInstance().addException(ex, true, this);
        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if(this.disconnectOnClose) {
            try {
                data.disconnectFromDatabase();
            } catch (Exception ex) {
                LogTrack.getInstance().addException(ex, true, this);
            }
        }
    }//GEN-LAST:event_formWindowClosing

    private void jButtonSelecionarTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSelecionarTipoActionPerformed
        try {
            if(tipoUsuario == null) {
                tipoUsuario = new TipoUsuario();
            }
            JFrameConsultaTipoUsuario jFrameConsulta;
            jFrameConsulta = new JFrameConsultaTipoUsuario(true, false, tipoUsuario);
            
            jFrameConsulta.addWindowListener(new java.awt.event.WindowAdapter(){
                @Override
                public void windowClosed(java.awt.event.WindowEvent evt) {
                    if(tipoUsuario.getNome() != null) {
                        jTextFieldTipo.setText( tipoUsuario.getNome() );
                    }
                }
            } );
            jFrameConsulta.setVisible(true);
        } catch( Exception ex ) {
            LogTrack.getInstance().addException(ex, true, this);
            tipoUsuario = null;
        }
    }//GEN-LAST:event_jButtonSelecionarTipoActionPerformed

    private void jButtonExcluirTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirTipoActionPerformed
        tipoUsuario = null;
        jTextFieldTipo.setText(null);
    }//GEN-LAST:event_jButtonExcluirTipoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonExcluirTipo;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JButton jButtonSelecionarTipo;
    private javax.swing.JLabel jLabelCidade;
    private javax.swing.JLabel jLabelCpf;
    private javax.swing.JLabel jLabelDataNascimento;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelEstado;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelOrgaoEmissor;
    private javax.swing.JLabel jLabelRg;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JLabel jLabelTelefone;
    private javax.swing.JLabel jLabelTipo;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JTextField jTextFieldCidade;
    private javax.swing.JTextField jTextFieldCpf;
    private javax.swing.JTextField jTextFieldDataNascimento;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldEstado;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldOrgaoEmissor;
    private javax.swing.JTextField jTextFieldRg;
    private javax.swing.JTextField jTextFieldTelefone;
    private javax.swing.JTextField jTextFieldTipo;
    // End of variables declaration//GEN-END:variables
}
