package view;

import controller.LogTrack;
import java.awt.event.WindowEvent;
import model.Emprestimo;
import model.Exemplar;
import model.Pessoa;
import model.Usuario;

public class JFrameCrudEmprestimo extends javax.swing.JFrame {
    private Emprestimo data;
    private Usuario usuario;
    private Exemplar exemplar;
    private Pessoa pessoa;
    private boolean disconnectOnClose;

    public JFrameCrudEmprestimo(Emprestimo data, boolean disconnectOnClose) throws Exception {
        initComponents();
        
        if(data == null){
            this.data = new Emprestimo();
        } else {
            this.data = data;
            if(data.getUsuario() != null){
                this.usuario = new Usuario();
                this.usuario.setCodigo(this.data.getUsuario().getCodigo());
                this.usuario.load();
            }
            if(data.getExemplar() != null){
                this.exemplar = new Exemplar();
                this.exemplar.setCodigo(this.data.getExemplar().getCodigo());
                this.exemplar.load();
            }
            if(data.getPessoa() != null){
                this.pessoa = new Pessoa();
                this.pessoa.setCodigo(this.data.getPessoa().getCodigo());
                this.pessoa.load();
            }
            dataUp();
            jTextFieldId.setEnabled(false);
        }
        
        this.disconnectOnClose = disconnectOnClose;
    }
    
    public void setUpAtendimento(Usuario user) throws Exception{
        data.setUsuario(user);
        jTextFieldUsuario.setText(user.getNome());
        jButtonSelecionarUsuario.setEnabled(false);
        jButtonApagarUsuario.setEnabled(false);
    }
    
    private void dataUp() {
        jTextFieldId.setText(String.valueOf(data.getCodigo()));
        jTextFieldDataEmprestimo.setText(data.getDataEmprestimo());
        jTextFieldDataDevolucao.setText(data.getDataDevolucao());
        jTextFieldMulta.setText(String.valueOf(data.getMulta()));
        if(data.getUsuario().getNome() != null) {
            jTextFieldUsuario.setText(data.getUsuario().getNome());
        }
        if(data.getExemplar().getLivro().getTitulo() != null) {
            jTextFieldExemplar.setText(data.getExemplar().getLivro().getTitulo());
        }
        if(data.getPessoa().getNome() != null) {
            jTextFieldPessoa.setText(data.getPessoa().getNome());
        }
    }
    
    private void dataDown() throws Exception {        
        data.setCodigo(Integer.parseInt(jTextFieldId.getText()));
        data.setDataEmprestimo(jTextFieldDataEmprestimo.getText());
        data.setDataDevolucao(jTextFieldDataDevolucao.getText());
        data.setMulta(Double.parseDouble(jTextFieldMulta.getText()));
        data.setUsuario(usuario);
        data.setExemplar(exemplar);
        data.setPessoa(pessoa);
    }
    
    private void checkInput() throws Exception {
        if( jTextFieldId.getText().isEmpty() ) {
            throw new Exception("Informe ID.");
        } else {
            if( !jTextFieldId.getText().matches("\\d+") ) {
                throw new Exception("O campo ID deve ser um número.");
            }
        }
        
        if(jTextFieldDataEmprestimo.getText().isEmpty()) {
            throw new Exception("Informe Data de Emprestimo.");
        } else {
            if(!jTextFieldDataEmprestimo.getText().matches("\\d{4}-\\d{2}-\\d{2}")) {
                throw new Exception("A Data de Emprestimo deve estar no formato AAAA-MM-DD.");
            }
        }
        
        if(jTextFieldDataDevolucao.getText().isEmpty()) {
            throw new Exception("Informe Data de Devolucao.");
        } else {
            if(!jTextFieldDataDevolucao.getText().matches("\\d{4}-\\d{2}-\\d{2}")) {
                throw new Exception("A Data de Devolucao deve estar no formato AAAA-MM-DD.");
            }
        }
        
        if(usuario == null){
            throw new Exception("Informe Usuario");
        }
        
        if(exemplar == null){
            throw new Exception("Informe Exemplar");
        }
        
        if(pessoa == null){
            throw new Exception("Informe Pessoa");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelId = new javax.swing.JLabel();
        jLabelDataEmprestimo = new javax.swing.JLabel();
        jLabelDataDevolucao = new javax.swing.JLabel();
        jLabelMulta = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        jLabelExemplar = new javax.swing.JLabel();
        jLabelPessoa = new javax.swing.JLabel();
        jTextFieldDataEmprestimo = new javax.swing.JTextField();
        jTextFieldDataDevolucao = new javax.swing.JTextField();
        jTextFieldId = new javax.swing.JTextField();
        jTextFieldMulta = new javax.swing.JTextField();
        jTextFieldUsuario = new javax.swing.JTextField();
        jTextFieldExemplar = new javax.swing.JTextField();
        jTextFieldPessoa = new javax.swing.JTextField();
        jButtonSelecionarUsuario = new javax.swing.JButton();
        jButtonApagarUsuario = new javax.swing.JButton();
        jButtonSelecionarExemplar = new javax.swing.JButton();
        jButtonApagarExemplar = new javax.swing.JButton();
        jButtonSelecionarPessoa = new javax.swing.JButton();
        jButtonApagarPessoa = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Emprestimo");

        jLabelId.setText("ID");

        jLabelDataEmprestimo.setText("Dt. Emprestimo");

        jLabelDataDevolucao.setText("Dt. Devolução");

        jLabelMulta.setText("Multa");

        jLabelUsuario.setText("Usuario");

        jLabelExemplar.setText("Exemplar");

        jLabelPessoa.setText("Pessoa");

        jTextFieldUsuario.setEditable(false);

        jTextFieldExemplar.setEditable(false);

        jTextFieldPessoa.setEditable(false);

        jButtonSelecionarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/search-icon.png"))); // NOI18N
        jButtonSelecionarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSelecionarUsuarioActionPerformed(evt);
            }
        });

        jButtonApagarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/eraser-icon.png"))); // NOI18N
        jButtonApagarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonApagarUsuarioActionPerformed(evt);
            }
        });

        jButtonSelecionarExemplar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/search-icon.png"))); // NOI18N
        jButtonSelecionarExemplar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSelecionarExemplarActionPerformed(evt);
            }
        });

        jButtonApagarExemplar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/eraser-icon.png"))); // NOI18N
        jButtonApagarExemplar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonApagarExemplarActionPerformed(evt);
            }
        });

        jButtonSelecionarPessoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/search-icon.png"))); // NOI18N
        jButtonSelecionarPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSelecionarPessoaActionPerformed(evt);
            }
        });

        jButtonApagarPessoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/eraser-icon.png"))); // NOI18N
        jButtonApagarPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonApagarPessoaActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelDataEmprestimo)
                            .addComponent(jLabelDataDevolucao)
                            .addComponent(jLabelId)
                            .addComponent(jLabelMulta)
                            .addComponent(jLabelUsuario)
                            .addComponent(jLabelExemplar)
                            .addComponent(jLabelPessoa))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldExemplar)
                                    .addComponent(jTextFieldPessoa, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                                    .addComponent(jTextFieldUsuario))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButtonSelecionarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonApagarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButtonSelecionarExemplar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonApagarExemplar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButtonSelecionarPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButtonApagarPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jTextFieldId)
                            .addComponent(jTextFieldDataEmprestimo)
                            .addComponent(jTextFieldDataDevolucao)
                            .addComponent(jTextFieldMulta, javax.swing.GroupLayout.Alignment.TRAILING)))
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
                    .addComponent(jLabelId)
                    .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDataEmprestimo)
                    .addComponent(jTextFieldDataEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDataDevolucao)
                    .addComponent(jTextFieldDataDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMulta)
                    .addComponent(jTextFieldMulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelUsuario)
                        .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonSelecionarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButtonApagarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelExemplar)
                        .addComponent(jTextFieldExemplar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonSelecionarExemplar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButtonApagarExemplar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonSelecionarPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonApagarPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelPessoa)
                        .addComponent(jTextFieldPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonExcluir))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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

    private void jButtonSelecionarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSelecionarUsuarioActionPerformed
        try {
            if(usuario == null) {
                usuario = new Usuario();
            }
            
            JFrameConsultaUsuario jFrameConsulta;
            jFrameConsulta = new JFrameConsultaUsuario(true, false, usuario);
            
            jFrameConsulta.addWindowListener(new java.awt.event.WindowAdapter(){
                @Override
                public void windowClosed(java.awt.event.WindowEvent evt) {
                    if(usuario.getNome() != null) {
                       jTextFieldUsuario.setText(usuario.getNome());
                    }
                }
            } );
            jFrameConsulta.setVisible(true);
        } catch(Exception ex) {
            LogTrack.getInstance().addException(ex, true, this);
            usuario = null;
        }
    }//GEN-LAST:event_jButtonSelecionarUsuarioActionPerformed

    private void jButtonApagarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonApagarUsuarioActionPerformed
        usuario = null;
        jTextFieldUsuario.setText(null);
    }//GEN-LAST:event_jButtonApagarUsuarioActionPerformed

    private void jButtonSelecionarExemplarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSelecionarExemplarActionPerformed
        try {
            if(exemplar == null) {
                exemplar = new Exemplar();
            }
            
            JFrameConsultaExemplar jFrameConsulta;
            jFrameConsulta = new JFrameConsultaExemplar(true, false, exemplar);
            
            jFrameConsulta.addWindowListener(new java.awt.event.WindowAdapter(){
                @Override
                public void windowClosed(java.awt.event.WindowEvent evt) {
                    if(exemplar.getLivro().getTitulo() != null) {
                       jTextFieldExemplar.setText(exemplar.getLivro().getTitulo());
                    }
                }
            } );
            jFrameConsulta.setVisible(true);
        } catch(Exception ex) {
            LogTrack.getInstance().addException(ex, true, this);
            exemplar = null;
        }
    }//GEN-LAST:event_jButtonSelecionarExemplarActionPerformed

    private void jButtonApagarExemplarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonApagarExemplarActionPerformed
        exemplar = null;
        jTextFieldExemplar.setText(null);
    }//GEN-LAST:event_jButtonApagarExemplarActionPerformed

    private void jButtonSelecionarPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSelecionarPessoaActionPerformed
        try {
            if(pessoa == null) {
                pessoa = new Pessoa();
            }
            
            JFrameConsultaPessoa jFrameConsulta;
            jFrameConsulta = new JFrameConsultaPessoa(true, false, pessoa);
            
            jFrameConsulta.addWindowListener(new java.awt.event.WindowAdapter(){
                @Override
                public void windowClosed(java.awt.event.WindowEvent evt) {
                    if(pessoa.getNome() != null) {
                       jTextFieldPessoa.setText(pessoa.getNome());
                    }
                }
            } );
            jFrameConsulta.setVisible(true);
        } catch(Exception ex) {
            LogTrack.getInstance().addException(ex, true, this);
            pessoa = null;
        }
    }//GEN-LAST:event_jButtonSelecionarPessoaActionPerformed

    private void jButtonApagarPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonApagarPessoaActionPerformed
        pessoa = null;
        jTextFieldPessoa.setText(null);
    }//GEN-LAST:event_jButtonApagarPessoaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonApagarExemplar;
    private javax.swing.JButton jButtonApagarPessoa;
    private javax.swing.JButton jButtonApagarUsuario;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JButton jButtonSelecionarExemplar;
    private javax.swing.JButton jButtonSelecionarPessoa;
    private javax.swing.JButton jButtonSelecionarUsuario;
    private javax.swing.JLabel jLabelDataDevolucao;
    private javax.swing.JLabel jLabelDataEmprestimo;
    private javax.swing.JLabel jLabelExemplar;
    private javax.swing.JLabel jLabelId;
    private javax.swing.JLabel jLabelMulta;
    private javax.swing.JLabel jLabelPessoa;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JTextField jTextFieldDataDevolucao;
    private javax.swing.JTextField jTextFieldDataEmprestimo;
    private javax.swing.JTextField jTextFieldExemplar;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldMulta;
    private javax.swing.JTextField jTextFieldPessoa;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
