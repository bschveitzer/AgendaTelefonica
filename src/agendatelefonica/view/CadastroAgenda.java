
package agendatelefonica.view;

import agendatelefonica.carga.Carga;
import java.io.IOException;
import javax.swing.JOptionPane;
import agendatelefonica.model.Agenda;
import agendatelefonica.model.Contato;

public class CadastroAgenda extends javax.swing.JFrame {
    
    private Agenda agenda;
    private AgendaTableModel agendaTableModel;
    private CadastroAgenda cadastroAgenda2View;
    private Carga carga;
    
    public CadastroAgenda(Agenda agenda) {
        this.agenda = agenda;
        agendaTableModel = new AgendaTableModel(agenda.getContatos());
        this.carga = new Carga(agenda);
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        NomeLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ColocarNome = new javax.swing.JTextField();
        ColocarTelefone = new javax.swing.JTextField();
        ColocarComentario = new javax.swing.JTextField();
        AdicionarButton = new javax.swing.JButton();
        VoltarButton2 = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        NomeLabel.setText("Nome:");

        jLabel2.setText("Telefone:");

        jLabel3.setText("Comentario:");

        AdicionarButton.setText("Adicionar");
        AdicionarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdicionarButtonActionPerformed(evt);
            }
        });

        VoltarButton2.setText("Pronto");
        VoltarButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ColocarComentario))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(NomeLabel)
                        .addGap(33, 33, 33)
                        .addComponent(ColocarNome, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(ColocarTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AdicionarButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(VoltarButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ColocarNome, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(ColocarTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ColocarComentario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AdicionarButton)
                    .addComponent(VoltarButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AdicionarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdicionarButtonActionPerformed
      if(getNomeValue().isEmpty()){
          JOptionPane.showMessageDialog(rootPane, "É necessário um nome para cadastro", "Nome inválido", JOptionPane.ERROR_MESSAGE);
      }if(getTelefoneValue().isEmpty()) {
          JOptionPane.showMessageDialog(rootPane, "É necessário um telefone para cadastro", "Telefone inválido", JOptionPane.ERROR_MESSAGE);
      }if(getComentarioValue().isEmpty()) {
          JOptionPane.showMessageDialog(rootPane, "É necessário um comentario para cadastro", "Comentario inválido", JOptionPane.ERROR_MESSAGE);
      } else {
            //agenda.adicionaContato();
            agendaTableModel.inserir(new Contato(getNomeValue(), getTelefoneValue(), getComentarioValue()));
            ColocarNome.setText("");
            ColocarTelefone.setText("");
            ColocarComentario.setText("");
            try {
                carga.persist();
            } catch (IOException ex){
            }
            
            //agendaTableModel.getPosicionamento(jTable1);
            JOptionPane.showMessageDialog(rootPane, "Contato Cadastrado com Sucesso!");
      }
      // TODO add your handling code here:
    }//GEN-LAST:event_AdicionarButtonActionPerformed

    private void VoltarButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarButton2ActionPerformed
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_VoltarButton2ActionPerformed

    
    public String getNomeValue() {
        return ColocarNome.getText();
    }
    
     public String getTelefoneValue() {
        return ColocarTelefone.getText();
    }
    
    public String getComentarioValue() {
        return ColocarComentario.getText();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdicionarButton;
    private javax.swing.JTextField ColocarComentario;
    private javax.swing.JTextField ColocarNome;
    private javax.swing.JTextField ColocarTelefone;
    private javax.swing.JLabel NomeLabel;
    private javax.swing.JButton VoltarButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

}
