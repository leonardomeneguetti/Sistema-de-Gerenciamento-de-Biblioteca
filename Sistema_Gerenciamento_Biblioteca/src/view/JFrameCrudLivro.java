package view;

import controller.LogTrack;
import java.awt.event.WindowEvent;
import model.Livro;

public class JFrameCrudLivro extends javax.swing.JFrame {
    private Livro data;
    private boolean disconnectOnClose;

    public JFrameCrudLivro(Livro data, boolean disconnectOnClose) {
        initComponents();
        
        if(data == null) {
            this.data  = new Livro();
        } else {
            this.data = data;
            dataUp();
            jTextFieldId.setEnabled(false);
        }
        
        this.disconnectOnClose = disconnectOnClose;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelId = new javax.swing.JLabel();
        jLabelIsbn = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelAutor = new javax.swing.JLabel();
        jLabelEditora = new javax.swing.JLabel();
        jLabelQtdPaginas = new javax.swing.JLabel();
        jTextFieldId = new javax.swing.JTextField();
        jTextFieldIsbn = new javax.swing.JTextField();
        jTextFieldTitulo = new javax.swing.JTextField();
        jTextFieldAutor = new javax.swing.JTextField();
        jTextFieldEditora = new javax.swing.JTextField();
        jTextFieldQtdPaginas = new javax.swing.JTextField();
        jButtonSalvar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Livro");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabelId.setText("ID");

        jLabelIsbn.setText("ISBN");

        jLabelTitulo.setText("Título");

        jLabelAutor.setText("Autor");

        jLabelEditora.setText("Editora");

        jLabelQtdPaginas.setText("Qtd. paginas");

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
                            .addComponent(jLabelQtdPaginas)
                            .addComponent(jLabelEditora)
                            .addComponent(jLabelAutor)
                            .addComponent(jLabelTitulo)
                            .addComponent(jLabelIsbn)
                            .addComponent(jLabelId))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldId)
                            .addComponent(jTextFieldIsbn)
                            .addComponent(jTextFieldTitulo)
                            .addComponent(jTextFieldAutor)
                            .addComponent(jTextFieldEditora)
                            .addComponent(jTextFieldQtdPaginas)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 238, Short.MAX_VALUE)
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
                    .addComponent(jLabelIsbn)
                    .addComponent(jTextFieldIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTitulo)
                    .addComponent(jTextFieldTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAutor)
                    .addComponent(jTextFieldAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEditora)
                    .addComponent(jTextFieldEditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelQtdPaginas)
                    .addComponent(jTextFieldQtdPaginas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
    }
    
    private void dataUp() {
        jTextFieldId.setText(String.valueOf(data.getCodigo()));
        jTextFieldIsbn.setText(data.getIsbn());
        jTextFieldTitulo.setText(data.getTitulo());
        jTextFieldAutor.setText(data.getAutor());
        jTextFieldEditora.setText(data.getEditora());
        jTextFieldQtdPaginas.setText(data.getQtdPaginas());
    }
    
    private void dataDown() {
        data.setCodigo(Integer.parseInt(jTextFieldId.getText()));
        data.setIsbn(jTextFieldIsbn.getText());
        data.setTitulo(jTextFieldTitulo.getText());
        data.setAutor(jTextFieldAutor.getText());
        data.setEditora(jTextFieldEditora.getText());
        data.setQtdPaginas(jTextFieldQtdPaginas.getText());
    }
    
    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        try {
            checkInput();
            dataDown();
            data.save();
            this.dispatchEvent(new WindowEvent( this, WindowEvent.WINDOW_CLOSING));
        } catch(Exception ex) {
            LogTrack.getInstance().addException(ex, true, this);
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        try {
            checkInput();
            dataDown();
            data.delete();
            this.dispatchEvent(new WindowEvent( this, WindowEvent.WINDOW_CLOSING));
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabelAutor;
    private javax.swing.JLabel jLabelEditora;
    private javax.swing.JLabel jLabelId;
    private javax.swing.JLabel jLabelIsbn;
    private javax.swing.JLabel jLabelQtdPaginas;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JTextField jTextFieldAutor;
    private javax.swing.JTextField jTextFieldEditora;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldIsbn;
    private javax.swing.JTextField jTextFieldQtdPaginas;
    private javax.swing.JTextField jTextFieldTitulo;
    // End of variables declaration//GEN-END:variables
}
