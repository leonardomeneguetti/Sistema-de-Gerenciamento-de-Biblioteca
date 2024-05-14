package view;

import controller.LogTrack;
import java.awt.event.WindowEvent;
import model.Exemplar;
import model.Livro;

public class JFrameCrudExemplar extends javax.swing.JFrame {
    private Exemplar data;
    private Livro livro;
    private boolean disconnectOnClose;

    public JFrameCrudExemplar(Exemplar data, boolean disconnectOnClose) throws Exception {
        initComponents();
        
        if(data == null){
            this.data = new Exemplar();
        } else {
            this.data = data;
            if(data.getLivro() != null){
                this.livro = new Livro();
                this.livro.setCodigo(this.data.getLivro().getCodigo());
                this.livro.load();
            }
            dataUp();
            jTextFieldId.setEnabled(false);
        }
        
        this.disconnectOnClose = disconnectOnClose;
    }
    
    private void dataUp() {
        jTextFieldId.setText(String.valueOf(data.getCodigo()));
        jTextFieldQtdCopias.setText(String.valueOf(data.getQtdCopias()));
        if(data.getLivro().getTitulo() != null) {
            jTextFieldLivro.setText(data.getLivro().getTitulo());
        }
    }
    
    private void dataDown() throws Exception {        
        data.setCodigo(Integer.parseInt(jTextFieldId.getText()));
        data.setQtdCopias(Integer.parseInt(jTextFieldQtdCopias.getText()));
        data.setLivro(livro);
    }
    
    private void checkInput() throws Exception {
        if( jTextFieldId.getText().isEmpty() ) {
            throw new Exception("Informe ID.");
        } else {
            if( !jTextFieldId.getText().matches("\\d+") ) {
                throw new Exception("O campo ID deve ser um número.");
            }
        }
        
        if(livro == null){
            throw new Exception("Informe Livro");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelId = new javax.swing.JLabel();
        jLabelQtdCopias = new javax.swing.JLabel();
        jLabelLivro = new javax.swing.JLabel();
        jTextFieldQtdCopias = new javax.swing.JTextField();
        jTextFieldId = new javax.swing.JTextField();
        jTextFieldLivro = new javax.swing.JTextField();
        jButtonSalvar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonSelecionar = new javax.swing.JButton();
        jButtonApagar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de exemplar");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabelId.setText("ID");

        jLabelQtdCopias.setText("Qtd. Copias");

        jLabelLivro.setText("Livro");

        jTextFieldLivro.setEditable(false);

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

        jButtonSelecionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/search-icon.png"))); // NOI18N
        jButtonSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSelecionarActionPerformed(evt);
            }
        });

        jButtonApagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/eraser-icon.png"))); // NOI18N
        jButtonApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonApagarActionPerformed(evt);
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
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSalvar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelQtdCopias)
                            .addComponent(jLabelId)
                            .addComponent(jLabelLivro))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jTextFieldLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonSelecionar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextFieldQtdCopias)
                            .addComponent(jTextFieldId))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelId)
                    .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelQtdCopias)
                    .addComponent(jTextFieldQtdCopias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelLivro)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButtonApagar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldLivro)
                        .addComponent(jButtonSelecionar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonExcluir))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
    }//GEN-LAST:event_formWindowClosing

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

    private void jButtonSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSelecionarActionPerformed
        try {
            if(livro == null) {
                livro = new Livro();
            }
            
            JFrameConsultaLivro jFrameConsulta;
            jFrameConsulta = new JFrameConsultaLivro(true, false, livro);
            
            jFrameConsulta.addWindowListener(new java.awt.event.WindowAdapter(){
                @Override
                public void windowClosed(java.awt.event.WindowEvent evt) {
                    if(livro.getTitulo() != null) {
                       jTextFieldLivro.setText(livro.getTitulo());
                    }
                }
            } );
            jFrameConsulta.setVisible(true);
        } catch(Exception ex) {
            LogTrack.getInstance().addException(ex, true, this);
            livro = null;
        }
    }//GEN-LAST:event_jButtonSelecionarActionPerformed

    private void jButtonApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonApagarActionPerformed
        livro = null;
        jTextFieldLivro.setText(null);
    }//GEN-LAST:event_jButtonApagarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonApagar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JButton jButtonSelecionar;
    private javax.swing.JLabel jLabelId;
    private javax.swing.JLabel jLabelLivro;
    private javax.swing.JLabel jLabelQtdCopias;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldLivro;
    private javax.swing.JTextField jTextFieldQtdCopias;
    // End of variables declaration//GEN-END:variables
}
