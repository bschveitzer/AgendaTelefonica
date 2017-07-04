
package agendatelefonica.view;

import agendatelefonica.carga.Carga;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import agendatelefonica.model.Agenda;
import agendatelefonica.model.Contato;

public class EditarAgenda extends javax.swing.JFrame {
    private Contato contato;
    private Agenda agenda;
    private AgendaTableModel agendaTableModel;
    private CadastroAgenda cadastroAgenda2View;
    
    public EditarAgenda(Agenda agenda,Contato contato, AgendaTableModel agendaTableModel) {  
        this.agendaTableModel = agendaTableModel;
        this.contato = contato;
        this.agenda = agenda;
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ColocarNome.setText(contato.getNome());
        ColocarComentario.setText(contato.getComentario());
        ColocarTelefone.setText(contato.getTelefone());
        
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        NomeLabel.setText("Nome:");

        jLabel2.setText("Telefone:");

        jLabel3.setText("Comentario:");

        AdicionarButton.setText("Editar");
        AdicionarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdicionarButtonActionPerformed(evt);
            }
        });

        VoltarButton2.setText("Voltar");
        VoltarButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AdicionarButton)
                .addGap(116, 116, 116))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(VoltarButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(NomeLabel)
                                .addGap(33, 33, 33)
                                .addComponent(ColocarNome, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(13, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ColocarTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ColocarComentario, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AdicionarButton)
                    .addComponent(VoltarButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ColocarNome, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ColocarTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ColocarComentario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
    }// </editor-fold>                        

    private void AdicionarButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                
      if(ColocarNome.getText().isEmpty()){
          JOptionPane.showMessageDialog(rootPane, "É necessário um nome para cadastro", "Nome inválido", JOptionPane.ERROR_MESSAGE);
      }if(ColocarTelefone.getText().isEmpty()) {
          JOptionPane.showMessageDialog(rootPane, "É necessário um telefone para cadastro", "Telefone inválido", JOptionPane.ERROR_MESSAGE);
      }if(ColocarComentario.getText().isEmpty()) {
          JOptionPane.showMessageDialog(rootPane, "É necessário um comentario para cadastro", "Comentario inválido", JOptionPane.ERROR_MESSAGE);
      } else {
          agendaTableModel.editar(contato.getNome(), ColocarNome.getText(), ColocarTelefone.getText(), ColocarComentario.getText());
           JOptionPane.showMessageDialog(rootPane, "Contato Editado com Sucesso!");
           Carga carga = new Carga(agenda);
          try {
              carga.persist();
          } catch (IOException ex) {
          }
           dispose();
      }
    }                                               

    private void VoltarButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                              
        this.dispose();// TODO add your handling code here:
    }      


    // Variables declaration - do not modify                     
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
    // End of variables declaration                   

}
