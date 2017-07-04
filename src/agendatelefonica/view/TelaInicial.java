
package agendatelefonica.view;

import agendatelefonica.carga.Carga;
import java.io.File;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import agendatelefonica.model.Agenda;
import agendatelefonica.model.Contato;

public class TelaInicial extends javax.swing.JFrame {

    private final Agenda agenda;
    private Carga carga;

  
    public TelaInicial(Agenda agenda) {
        this.agenda = agenda;
        this.carga = new Carga(this.agenda);
        try {
            carga.load();
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println("Erro "+ex.getMessage());
        }
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        PesquisarButton = new javax.swing.JButton();
        ListarButton = new javax.swing.JButton();
        FecharButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        AdicionarButton = new javax.swing.JButton();
        ListarButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agenda Telefônica Simples");

        jPanel1.setToolTipText("Agênda Telefônica Eletronica");
        jPanel1.setEnabled(false);

        PesquisarButton.setText("Pesquisar");
        PesquisarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesquisarButtonActionPerformed(evt);
            }
        });

        ListarButton.setText("Salvar Como");
        ListarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListarButtonActionPerformed(evt);
            }
        });

        FecharButton.setText("Fechar");
        FecharButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FecharButtonActionPerformed(evt);
            }
        });

        AdicionarButton.setText("Adicionar");
        AdicionarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdicionarButtonActionPerformed(evt);
            }
        });

        ListarButton1.setText("Carregar");
        ListarButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcaoImportar(evt);
            }
        });

        jLabel2.setText("AGENDA TELEFONICA ELETRONICA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PesquisarButton, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                            .addComponent(AdicionarButton, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                            .addComponent(ListarButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ListarButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FecharButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(84, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(79, 79, 79)))
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AdicionarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ListarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PesquisarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ListarButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(FecharButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PesquisarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesquisarButtonActionPerformed
        acaoPesquisar();    // TODO add your handling code here:
    }//GEN-LAST:event_PesquisarButtonActionPerformed

    private void ListarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListarButtonActionPerformed
        acaoListar(); // TODO add your handling code here:
    }//GEN-LAST:event_ListarButtonActionPerformed

    private void FecharButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FecharButtonActionPerformed
        acaoSair();             // TODO add your handling code here:
    }//GEN-LAST:event_FecharButtonActionPerformed

    private void AdicionarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdicionarButtonActionPerformed
        acaoAdicionar();        // TODO add your handling code here:
    }//GEN-LAST:event_AdicionarButtonActionPerformed

    private void AcaoImportar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcaoImportar
        JFileChooser jFCPasta = new JFileChooser();
        jFCPasta.setFileFilter(new javax.swing.filechooser.FileFilter() {

            @Override
            public boolean accept(File f) {
                return f.getName().toLowerCase().endsWith(".txt") || f.isDirectory();
            }

            @Override
            public String getDescription() {
                return "Arquivos de Texto (.txt)";
            }
        });
        int aprovado = jFCPasta.showOpenDialog(TelaInicial.this);
        if(aprovado==JFileChooser.APPROVE_OPTION){
            try {
                carga.load(jFCPasta.getSelectedFile());
            } catch (IOException | ClassNotFoundException | NoSuchElementException ex) {
                JOptionPane.showMessageDialog(TelaInicial.this, "Erro ao Importar, Verificar se arquivo segue padrões");
            }
        }
    }//GEN-LAST:event_AcaoImportar

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdicionarButton;
    private javax.swing.JButton FecharButton;
    private javax.swing.JButton ListarButton;
    private javax.swing.JButton ListarButton1;
    private javax.swing.JButton PesquisarButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private void acaoAdicionar() {
        CadastroAgenda tela = new CadastroAgenda(agenda);
        tela.setVisible(true);
    }
    
    public void acaoSair(){
        System.exit(0);
    }
    
    public void acaoPesquisar(){
        if (agenda.getContatos().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Nenhum contato adicionado.", "Banco vazio", JOptionPane.ERROR_MESSAGE);
        } else {
            AgendaTableModel model = new AgendaTableModel(agenda.getContatos());
            ListaAgenda lista = new ListaAgenda(agenda);
            lista.setVisible(true);
        }
    }
    public void acaoListar(){
        SaveAs salvarComo = new SaveAs(this);
        salvarComo.setVisible(true);
    }
     public void acaoSalvar(){
        carga = new Carga(this.agenda);
        JOptionPane.showMessageDialog(rootPane, "Contatos salvos", null, JOptionPane.INFORMATION_MESSAGE);
    }
    public Agenda getAgenda(){
        return agenda;
    }
}
