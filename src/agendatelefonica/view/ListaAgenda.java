
package agendatelefonica.view;

import agendatelefonica.carga.Carga;
import java.awt.Component;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import agendatelefonica.model.Agenda;
import agendatelefonica.model.Contato;


public class ListaAgenda extends javax.swing.JFrame {

    TelaInicial tela;
    private Agenda agenda;
    private AgendaTableModel agendaTableModel;
    private EditarAgenda editarAgenda;
       
    public ListaAgenda(Agenda agenda) {
        this.agenda = agenda;
        agendaTableModel = new AgendaTableModel(agenda.getContatos());
        initComponents();
        agendaTableModel.getPosicionamento(ContatosTabela);
        Component JTable = null;
        this.setLocationRelativeTo(JTable);
        this.setResizable(false);
    }

    ListaAgenda() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ContatosTabela = new javax.swing.JTable();
        DeletarButton = new javax.swing.JButton();
        VoltarButton = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        DeletarTudoButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        ContatosTabela.setModel(agendaTableModel);
        jScrollPane1.setViewportView(ContatosTabela);

        DeletarButton.setText("Deletar");
        DeletarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletarButtonActionPerformed(evt);
            }
        });

        VoltarButton.setText("Voltar");
        VoltarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarButtonActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Filtro:");

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcaoFiltro(evt);
            }
        });

        jButton2.setText("Editar");
        jButton2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                AcaoEditar(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        DeletarTudoButton.setText("Deletar Tudo");
        DeletarTudoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletarTudoButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(22, 22, 22))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addGap(146, 146, 146)
                        .addComponent(VoltarButton)
                        .addContainerGap(22, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(DeletarButton)
                        .addGap(18, 18, 18)
                        .addComponent(DeletarTudoButton)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(DeletarButton)
                    .addComponent(DeletarTudoButton))
                .addGap(5, 5, 5)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(VoltarButton))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 3, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DeletarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletarButtonActionPerformed
        if(ContatosTabela.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(rootPane, "Selecione um contato para deletar", "Erro", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                agendaTableModel.excluir(ContatosTabela.getSelectedRow());
                Carga carga = new Carga(agenda);
                carga.persist();
            } catch (IOException ex) {
            }
        }
    }//GEN-LAST:event_DeletarButtonActionPerformed

    
    private void VoltarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarButtonActionPerformed
        this.dispose();    
    }//GEN-LAST:event_VoltarButtonActionPerformed

    private void AcaoFiltro(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcaoFiltro
        ArrayList<Contato> filtro = new ArrayList<>();
        for(Contato i : agenda.getContatos()){
            if(i.toString().toLowerCase().contains(jTextField1.getText().toLowerCase())){
                filtro.add(i);
            }
        }
        agendaTableModel.atualizarLista(filtro);
    }//GEN-LAST:event_AcaoFiltro

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         if(ContatosTabela.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(rootPane, "Selecione um contato para deletar", "Erro", JOptionPane.ERROR_MESSAGE);
        } else {
            editarAgenda = new EditarAgenda(this.agenda,agendaTableModel.getContato(ContatosTabela.getSelectedRow()), agendaTableModel);
            editarAgenda.setVisible(true);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void AcaoEditar(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_AcaoEditar
       
    }//GEN-LAST:event_AcaoEditar

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void DeletarTudoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletarTudoButtonActionPerformed
        if(ContatosTabela.equals(null)){
            JOptionPane.showMessageDialog(rootPane, "Você não tem nenhum contato para deletar", "Erro", JOptionPane.ERROR_MESSAGE);
        } else{
            try {
                agendaTableModel.excluirTudo();
                Carga carga = new Carga(agenda);
                carga.persist();
            } catch (IOException ex){
            }
        }
    }//GEN-LAST:event_DeletarTudoButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ContatosTabela;
    private javax.swing.JButton DeletarButton;
    private javax.swing.JButton DeletarTudoButton;
    private javax.swing.JButton VoltarButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

}
