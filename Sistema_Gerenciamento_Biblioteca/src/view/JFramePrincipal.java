package view;

import controller.LogTrack;
import model.Usuario;

public class JFramePrincipal extends javax.swing.JFrame {
     private Usuario usuario;

    public JFramePrincipal() {
        initComponents();
        logout();
    }

    private void logout() {
        usuario = new Usuario();
        
        jMenuAdm.setEnabled(false);
        jMenuAtendimento.setEnabled(false);
        jMenuUsuario.setVisible(false);
        jPanelLogin.setVisible(true);
    }
    
    private void login() {
        jMenuUsuario.setText(usuario.getNome());
        jMenuUsuario.setVisible(true);
        jTextFieldUsuario.setText("");
        jPasswordField.setText("");
        jPanelLogin.setVisible(false);
        if(usuario.getTipoUsuario().getAdministrativo().equals("S")) {
            jMenuAdm.setEnabled(true);
        }
        if(usuario.getTipoUsuario().getAtendimento().equals("S")) {
            jMenuAtendimento.setEnabled(true);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelLogin = new javax.swing.JPanel();
        jLabelUsuario = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jLabelSenha = new javax.swing.JLabel();
        jPasswordField = new javax.swing.JPasswordField();
        jButtonLogin = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuAdm = new javax.swing.JMenu();
        jMenuItemAdmConsultaEmprestimo = new javax.swing.JMenuItem();
        jMenuItemAdmConsultaLivro = new javax.swing.JMenuItem();
        jMenuItemAdmConsultaTipoUsuaario = new javax.swing.JMenuItem();
        jMenuItemAdmConsultaUsuario = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItemAdmCadastroExemplar = new javax.swing.JMenuItem();
        jMenuItemAdmCadastroLivro = new javax.swing.JMenuItem();
        jMenuItemAdmCadastroPessoa = new javax.swing.JMenuItem();
        jMenuItemAdmCadastroTipoUsuario = new javax.swing.JMenuItem();
        jMenuItemAdmCadastroUsuario = new javax.swing.JMenuItem();
        jMenuAtendimento = new javax.swing.JMenu();
        jMenuItemAtdmCadastroEmprestimo = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItemAtdmConsultaEmprestimo = new javax.swing.JMenuItem();
        jMenuItemAtdmConsultaExemplar = new javax.swing.JMenuItem();
        jMenuItemAtdmConsultaPessoa = new javax.swing.JMenuItem();
        jMenuUsuario = new javax.swing.JMenu();
        jMenuItemUserMeusEmprestimos = new javax.swing.JMenuItem();
        jMenuItemUserSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Painel Principal");

        jPanelLogin.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelUsuario.setText("Usuário");

        jLabelSenha.setText("Senha");

        jButtonLogin.setText("Login");
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelLoginLayout = new javax.swing.GroupLayout(jPanelLogin);
        jPanelLogin.setLayout(jPanelLoginLayout);
        jPanelLoginLayout.setHorizontalGroup(
            jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldUsuario)
                    .addGroup(jPanelLoginLayout.createSequentialGroup()
                        .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelUsuario)
                            .addComponent(jLabelSenha))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPasswordField))
                .addContainerGap())
            .addGroup(jPanelLoginLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jButtonLogin)
                .addContainerGap(94, Short.MAX_VALUE))
        );
        jPanelLoginLayout.setVerticalGroup(
            jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jButtonLogin)
                .addContainerGap())
        );

        jMenuAdm.setText("Administrativo");

        jMenuItemAdmConsultaEmprestimo.setText("Consulta emprestimo");
        jMenuItemAdmConsultaEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAdmConsultaEmprestimoActionPerformed(evt);
            }
        });
        jMenuAdm.add(jMenuItemAdmConsultaEmprestimo);

        jMenuItemAdmConsultaLivro.setText("Consulta livro");
        jMenuItemAdmConsultaLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAdmConsultaLivroActionPerformed(evt);
            }
        });
        jMenuAdm.add(jMenuItemAdmConsultaLivro);

        jMenuItemAdmConsultaTipoUsuaario.setText("Consulta tipo usuario");
        jMenuItemAdmConsultaTipoUsuaario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAdmConsultaTipoUsuaarioActionPerformed(evt);
            }
        });
        jMenuAdm.add(jMenuItemAdmConsultaTipoUsuaario);

        jMenuItemAdmConsultaUsuario.setText("Consulta usuario");
        jMenuItemAdmConsultaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAdmConsultaUsuarioActionPerformed(evt);
            }
        });
        jMenuAdm.add(jMenuItemAdmConsultaUsuario);
        jMenuAdm.add(jSeparator2);

        jMenuItemAdmCadastroExemplar.setText("Cadastro exemplar");
        jMenuItemAdmCadastroExemplar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAdmCadastroExemplarActionPerformed(evt);
            }
        });
        jMenuAdm.add(jMenuItemAdmCadastroExemplar);

        jMenuItemAdmCadastroLivro.setText("Cadastro livro");
        jMenuItemAdmCadastroLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAdmCadastroLivroActionPerformed(evt);
            }
        });
        jMenuAdm.add(jMenuItemAdmCadastroLivro);

        jMenuItemAdmCadastroPessoa.setText("Cadastro pessoa");
        jMenuItemAdmCadastroPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAdmCadastroPessoaActionPerformed(evt);
            }
        });
        jMenuAdm.add(jMenuItemAdmCadastroPessoa);

        jMenuItemAdmCadastroTipoUsuario.setText("Cadastro tipo usuario");
        jMenuItemAdmCadastroTipoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAdmCadastroTipoUsuarioActionPerformed(evt);
            }
        });
        jMenuAdm.add(jMenuItemAdmCadastroTipoUsuario);

        jMenuItemAdmCadastroUsuario.setText("Cadastro usuario");
        jMenuItemAdmCadastroUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAdmCadastroUsuarioActionPerformed(evt);
            }
        });
        jMenuAdm.add(jMenuItemAdmCadastroUsuario);

        jMenuBar1.add(jMenuAdm);

        jMenuAtendimento.setText("Atendimento");

        jMenuItemAtdmCadastroEmprestimo.setText("Cadastro emprestimo");
        jMenuItemAtdmCadastroEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAtdmCadastroEmprestimoActionPerformed(evt);
            }
        });
        jMenuAtendimento.add(jMenuItemAtdmCadastroEmprestimo);
        jMenuAtendimento.add(jSeparator1);

        jMenuItemAtdmConsultaEmprestimo.setText("Consulta emprestimo");
        jMenuItemAtdmConsultaEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAtdmConsultaEmprestimoActionPerformed(evt);
            }
        });
        jMenuAtendimento.add(jMenuItemAtdmConsultaEmprestimo);

        jMenuItemAtdmConsultaExemplar.setText("Consulta exemplar");
        jMenuItemAtdmConsultaExemplar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAtdmConsultaExemplarActionPerformed(evt);
            }
        });
        jMenuAtendimento.add(jMenuItemAtdmConsultaExemplar);

        jMenuItemAtdmConsultaPessoa.setText("Consulta pessoa");
        jMenuItemAtdmConsultaPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAtdmConsultaPessoaActionPerformed(evt);
            }
        });
        jMenuAtendimento.add(jMenuItemAtdmConsultaPessoa);

        jMenuBar1.add(jMenuAtendimento);

        jMenuUsuario.setText("Usuario");

        jMenuItemUserMeusEmprestimos.setText("Meus emprestimos");
        jMenuItemUserMeusEmprestimos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemUserMeusEmprestimosActionPerformed(evt);
            }
        });
        jMenuUsuario.add(jMenuItemUserMeusEmprestimos);

        jMenuItemUserSair.setText("Logout");
        jMenuItemUserSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemUserSairActionPerformed(evt);
            }
        });
        jMenuUsuario.add(jMenuItemUserSair);

        jMenuBar1.add(jMenuUsuario);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jPanelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(115, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jPanelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemAdmCadastroUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAdmCadastroUsuarioActionPerformed
        try {
            JFrameCrudUsuario cadastro;
            cadastro = new JFrameCrudUsuario(null, true);
            cadastro.setVisible(true);
        } catch(Exception ex){
            LogTrack.getInstance().addException(ex, true, this);
        }
    }//GEN-LAST:event_jMenuItemAdmCadastroUsuarioActionPerformed

    private void jMenuItemAdmConsultaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAdmConsultaUsuarioActionPerformed
        try {
            JFrameConsultaUsuario consulta;
            consulta = new JFrameConsultaUsuario(false, true, null);
            consulta.setVisible(true);
        } catch(Exception ex){
            LogTrack.getInstance().addException(ex, true, this);
        }
    }//GEN-LAST:event_jMenuItemAdmConsultaUsuarioActionPerformed

    private void jMenuItemAdmConsultaLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAdmConsultaLivroActionPerformed
        try {
            JFrameConsultaLivro consulta;
            consulta = new JFrameConsultaLivro(false, true, null);
            consulta.setVisible(true);
        } catch(Exception ex){
            LogTrack.getInstance().addException(ex, true, this);
        }
    }//GEN-LAST:event_jMenuItemAdmConsultaLivroActionPerformed

    private void jMenuItemAdmCadastroLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAdmCadastroLivroActionPerformed
        try {
            JFrameCrudLivro cadastro;
            cadastro = new JFrameCrudLivro(null, true);
            cadastro.setVisible(true);
        } catch(Exception ex){
            LogTrack.getInstance().addException(ex, true, this);
        }
    }//GEN-LAST:event_jMenuItemAdmCadastroLivroActionPerformed

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed
        try {
            usuario.setCodigo(Integer.parseInt(jTextFieldUsuario.getText()));
            usuario.load();
            
            Usuario usLogin = new Usuario();
            
            usLogin.setCodigo(Integer.parseInt(jTextFieldUsuario.getText()));
            usLogin.setSenha(jPasswordField.getText());
            
            if(usuario.getSenha().equals(usLogin.getSenha())) {
                login();
                usuario.disconnectFromDatabase();
            } else {
                throw new Exception("Senha Inválida!");
            }
        } catch(Exception ex) {
            LogTrack.getInstance().addException(ex, true, this);
        }
    }//GEN-LAST:event_jButtonLoginActionPerformed

    private void jMenuItemUserSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemUserSairActionPerformed
        logout();
    }//GEN-LAST:event_jMenuItemUserSairActionPerformed

    private void jMenuItemAdmConsultaTipoUsuaarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAdmConsultaTipoUsuaarioActionPerformed
        try {
            JFrameConsultaTipoUsuario consulta;
            consulta = new JFrameConsultaTipoUsuario(false, true, null);
            consulta.setVisible(true);
        } catch(Exception ex){
            LogTrack.getInstance().addException(ex, true, this);
        }
    }//GEN-LAST:event_jMenuItemAdmConsultaTipoUsuaarioActionPerformed

    private void jMenuItemAdmCadastroExemplarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAdmCadastroExemplarActionPerformed
        try {
            JFrameCrudExemplar cadastro;
            cadastro = new JFrameCrudExemplar(null, true);
            cadastro.setVisible(true);
        } catch(Exception ex){
            LogTrack.getInstance().addException(ex, true, this);
        }
    }//GEN-LAST:event_jMenuItemAdmCadastroExemplarActionPerformed

    private void jMenuItemAdmCadastroPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAdmCadastroPessoaActionPerformed
        try {
            JFrameCrudPessoa cadastro;
            cadastro = new JFrameCrudPessoa(null, true);
            cadastro.setVisible(true);
        } catch(Exception ex){
            LogTrack.getInstance().addException(ex, true, this);
        }
    }//GEN-LAST:event_jMenuItemAdmCadastroPessoaActionPerformed

    private void jMenuItemAdmCadastroTipoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAdmCadastroTipoUsuarioActionPerformed
        try {
            JFrameCrudTipoUsuario cadastro;
            cadastro = new JFrameCrudTipoUsuario(null, true);
            cadastro.setVisible(true);
        } catch(Exception ex){
            LogTrack.getInstance().addException(ex, true, this);
        }
    }//GEN-LAST:event_jMenuItemAdmCadastroTipoUsuarioActionPerformed

    private void jMenuItemAtdmCadastroEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAtdmCadastroEmprestimoActionPerformed
        try {
            JFrameCrudEmprestimo cadastro;
            cadastro = new JFrameCrudEmprestimo(null, true);
            cadastro.setVisible(true);
        } catch(Exception ex){
            LogTrack.getInstance().addException(ex, true, this);
        }
    }//GEN-LAST:event_jMenuItemAtdmCadastroEmprestimoActionPerformed

    private void jMenuItemAtdmConsultaEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAtdmConsultaEmprestimoActionPerformed
        try {
            JFrameConsultaEmprestimo consulta;
            consulta = new JFrameConsultaEmprestimo(false, true, this.usuario, null);
            consulta.setVisible(true);
        } catch(Exception ex){
            LogTrack.getInstance().addException(ex, true, this);
        }
    }//GEN-LAST:event_jMenuItemAtdmConsultaEmprestimoActionPerformed

    private void jMenuItemAtdmConsultaExemplarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAtdmConsultaExemplarActionPerformed
        try {
            JFrameConsultaExemplar consulta;
            consulta = new JFrameConsultaExemplar(false, true, null);
            consulta.setVisible(true);
        } catch(Exception ex){
            LogTrack.getInstance().addException(ex, true, this);
        }
    }//GEN-LAST:event_jMenuItemAtdmConsultaExemplarActionPerformed

    private void jMenuItemAtdmConsultaPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAtdmConsultaPessoaActionPerformed
        try {
            JFrameConsultaPessoa consulta;
            consulta = new JFrameConsultaPessoa(false, true, null);
            consulta.setVisible(true);
        } catch(Exception ex){
            LogTrack.getInstance().addException(ex, true, this);
        }
    }//GEN-LAST:event_jMenuItemAtdmConsultaPessoaActionPerformed

    private void jMenuItemUserMeusEmprestimosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemUserMeusEmprestimosActionPerformed
        try {
            JFrameConsultaEmprestimo consulta;
            consulta = new JFrameConsultaEmprestimo(false, true, null, this.usuario);
            consulta.setVisible(true);
        } catch(Exception ex){
            LogTrack.getInstance().addException(ex, true, this);
        }
    }//GEN-LAST:event_jMenuItemUserMeusEmprestimosActionPerformed

    private void jMenuItemAdmConsultaEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAdmConsultaEmprestimoActionPerformed
        try {
            JFrameConsultaEmprestimo consulta;
            consulta = new JFrameConsultaEmprestimo(false, true, null, null);
            consulta.setVisible(true);
        } catch(Exception ex){
            LogTrack.getInstance().addException(ex, true, this);
        }
    }//GEN-LAST:event_jMenuItemAdmConsultaEmprestimoActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFramePrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JMenu jMenuAdm;
    private javax.swing.JMenu jMenuAtendimento;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemAdmCadastroExemplar;
    private javax.swing.JMenuItem jMenuItemAdmCadastroLivro;
    private javax.swing.JMenuItem jMenuItemAdmCadastroPessoa;
    private javax.swing.JMenuItem jMenuItemAdmCadastroTipoUsuario;
    private javax.swing.JMenuItem jMenuItemAdmCadastroUsuario;
    private javax.swing.JMenuItem jMenuItemAdmConsultaEmprestimo;
    private javax.swing.JMenuItem jMenuItemAdmConsultaLivro;
    private javax.swing.JMenuItem jMenuItemAdmConsultaTipoUsuaario;
    private javax.swing.JMenuItem jMenuItemAdmConsultaUsuario;
    private javax.swing.JMenuItem jMenuItemAtdmCadastroEmprestimo;
    private javax.swing.JMenuItem jMenuItemAtdmConsultaEmprestimo;
    private javax.swing.JMenuItem jMenuItemAtdmConsultaExemplar;
    private javax.swing.JMenuItem jMenuItemAtdmConsultaPessoa;
    private javax.swing.JMenuItem jMenuItemUserMeusEmprestimos;
    private javax.swing.JMenuItem jMenuItemUserSair;
    private javax.swing.JMenu jMenuUsuario;
    private javax.swing.JPanel jPanelLogin;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
