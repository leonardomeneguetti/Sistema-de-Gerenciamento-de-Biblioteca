package view;

import controller.LogTrack;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import controller.ResultSetTableModel;
import java.awt.event.WindowEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.RowFilter;
import model.Emprestimo;
import model.Usuario;

public class JFrameConsultaEmprestimo extends javax.swing.JFrame {
    private Usuario bibliotecario;
    private Usuario cliente;
    private boolean select;
    private boolean disconnectOnClose;
    private boolean paraAtendimento;
    
    private String query;
//    private String query = "SELECT codigo_emprestimo AS ID, data_emprestimo AS Emprestimo, data_devolucao AS Devolução, multa AS Multa, usuario.nome_completo AS Usuário, codigo_exemplar AS Exemplar, pessoa.nome_completo AS Pessoa FROM emprestimo INNER JOIN usuario ON emprestimo.codigo_usuario = usuario.codigo_usuario INNER JOIN pessoa ON emprestimo.codigo_pessoa = pessoa.codigo_pessoa";
    
    private ResultSetTableModel result;
    private final TableRowSorter< TableModel > filter;

    public JFrameConsultaEmprestimo(boolean select, boolean disconnectOnClose, Usuario bibliotecario, Usuario cliente) throws Exception {
        initComponents();
        
        this.select = select;
        jButtonSelecionar.setEnabled(this.select);
        this.disconnectOnClose = disconnectOnClose;
        
        this.bibliotecario = bibliotecario;
        if(this.bibliotecario != null){
            this.paraAtendimento = true;
        } else {
            this.paraAtendimento = false;
        }
        
        this.cliente = cliente;
        if(this.cliente != null){
            jButtonAdicionar.setEnabled(false);
            jButtonAlterar.setEnabled(false);
        }
        
        setQuery();
        
        result = new ResultSetTableModel(query);
        jTableConsulta.setModel(result);
        filter = new TableRowSorter< TableModel >(result);
        jTableConsulta.setRowSorter(filter);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableConsulta = new javax.swing.JTable();
        jLabelFiltro = new javax.swing.JLabel();
        jTextFieldFiltro = new javax.swing.JTextField();
        jButtonFiltrar = new javax.swing.JButton();
        jButtonSelecionar = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonAdicionar = new javax.swing.JButton();

        jScrollPane2.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta de Emprestimo");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jTableConsulta.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableConsulta);

        jLabelFiltro.setText("Filtro:");

        jButtonFiltrar.setText("Filtrar");
        jButtonFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFiltrarActionPerformed(evt);
            }
        });

        jButtonSelecionar.setText("Selecionar");
        jButtonSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSelecionarActionPerformed(evt);
            }
        });

        jButtonAlterar.setText("Alterar");
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        jButtonAdicionar.setText("Adicionar");
        jButtonAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 886, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelFiltro)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSelecionar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFiltro)
                    .addComponent(jTextFieldFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonFiltrar)
                    .addComponent(jButtonSelecionar)
                    .addComponent(jButtonAlterar)
                    .addComponent(jButtonAdicionar))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void setQuery(){
        this.query = "SELECT codigo_emprestimo AS ID, data_emprestimo AS Emprestimo, data_devolucao AS Devolução, multa AS Multa, usuario.nome_completo AS Usuário, codigo_exemplar AS Exemplar, pessoa.nome_completo AS Pessoa FROM emprestimo INNER JOIN usuario ON emprestimo.codigo_usuario = usuario.codigo_usuario INNER JOIN pessoa ON emprestimo.codigo_pessoa = pessoa.codigo_pessoa";
        
        if(this.cliente != null){
            this.query += " WHERE emprestimo.codigo_usuario = " + this.cliente.getCodigo();
        }
        
        this.query += " ORDER BY Emprestimo";
    }
    
    private void jButtonFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFiltrarActionPerformed
        String filtro = jTextFieldFiltro.getText();
        if (filtro.isEmpty()) {
            filter.setRowFilter(null);
        } else {
            filter.setRowFilter(RowFilter.regexFilter(filtro));
        }
    }//GEN-LAST:event_jButtonFiltrarActionPerformed

    private void jButtonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarActionPerformed
        try {
            JFrameCrudEmprestimo jFrameCRUD;
            jFrameCRUD = new JFrameCrudEmprestimo(null, false);
            
            if(paraAtendimento){
                jFrameCRUD.setUpAtendimento(this.bibliotecario);
            }
            
            jFrameCRUD.addWindowListener(new java.awt.event.WindowAdapter(){
                @Override
                public void windowClosed(java.awt.event.WindowEvent evt) {
                    try {
                        result.setQuery(query);
                    } catch (Exception ex) {
                        LogTrack.getInstance().addException(ex, true, null);
                    }
                }
            } );
            jFrameCRUD.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(JFrameConsultaEmprestimo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonAdicionarActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        int row = jTableConsulta.getSelectedRow();
        if(row != -1) {
            int codigo = (int) result.getValueAt(row, 0);
            Emprestimo emprestimo = new Emprestimo();
            emprestimo.setCodigo(codigo);
            try {
                emprestimo.load();
                
                JFrameCrudEmprestimo jFrameCRUD;
                jFrameCRUD = new JFrameCrudEmprestimo(emprestimo, false);
                
                if(paraAtendimento){
                jFrameCRUD.setUpAtendimento(this.bibliotecario);
                }                

                jFrameCRUD.addWindowListener(new java.awt.event.WindowAdapter(){
                    @Override
                    public void windowClosed(java.awt.event.WindowEvent evt) {
                        try {
                            result.setQuery(query);
                        } catch (Exception ex) {
                            LogTrack.getInstance().addException(ex, true, null);
                        }
                    }
                } );
                jFrameCRUD.setVisible(true);
            } catch(Exception ex) {
                LogTrack.getInstance().addException(ex, true, this);
            }
        }
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if(this.disconnectOnClose) {
            result.disconnectFromDatabase();
        }
    }//GEN-LAST:event_formWindowClosing

    private void setUpAtendimento(){
        jButtonAdicionar.setEnabled(false);
        jButtonAlterar.setEnabled(false);
    }
    
    private void jButtonSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSelecionarActionPerformed
    }//GEN-LAST:event_jButtonSelecionarActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameConsultaEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameConsultaEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameConsultaEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameConsultaEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new JFrameConsultaEmprestimo(false, true, null, null).setVisible(true);
                } catch (Exception ex) {
                    LogTrack.getInstance().addException(ex, true, null);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdicionar;
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonFiltrar;
    private javax.swing.JButton jButtonSelecionar;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabelFiltro;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableConsulta;
    private javax.swing.JTextField jTextFieldFiltro;
    // End of variables declaration//GEN-END:variables
}
