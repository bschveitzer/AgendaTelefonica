
package agendatelefonica.view;

import agendatelefonica.model.Contato;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumnModel;

public class AgendaTableModel extends AbstractTableModel {

    private ArrayList<Contato> lista;
    private String[] nomes;

    public AgendaTableModel(ArrayList<Contato> l) {
        lista = l;
        nomes = new String[]{"Nome", "Telefone", "Comentario"};
    }



    public int getColumnCount() {
        return 3;
    }

    @Override
    public int getRowCount() {
        return getLista().size();
    }

    @SuppressWarnings("static-access")
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Contato p = (Contato) getLista().get(rowIndex);

        if (columnIndex == 0) {
            return p.getNome();
        }
        if (columnIndex == 1) {
            return p.getTelefone();
        }
        if (columnIndex == 2) {
            return p.getComentario();
        }

        return p.getNome();
    }

    @Override
    public String getColumnName(int column) {
        return nomes[column];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        if (columnIndex == 0) {
            return Integer.class;
        }
        if (columnIndex == 3) {
            return Double.class;
        }
        return String.class;
    }

    public Contato getContato(int indice) {
        return (Contato) getLista().get(indice);
    }

    public ArrayList<Contato> getLista() {
        return lista;
    }

    public void inserir(Contato p) {
        getLista().add(p);
        fireTableDataChanged();
    }

    public void atualizar(Contato atualiza, int index) {
        getLista().set(index, atualiza);
        fireTableDataChanged();
    }

    public void excluir(int pos) {
        lista.remove(pos);

        fireTableDataChanged();
    }

    public void excluir(Contato p) {
        lista.remove(p);
        fireTableDataChanged();
    }

    public void excluirTudo() {
        lista.removeAll(lista);
        fireTableDataChanged();
    }

    public void getPosicionamento(JTable tabela) {
        DefaultTableCellRenderer rendererCentro = new DefaultTableCellRenderer();
        DefaultTableCellRenderer rendererDireita = new DefaultTableCellRenderer();
        DefaultTableCellRenderer rendererEsquerda = new DefaultTableCellRenderer();

        rendererCentro.setHorizontalAlignment(SwingConstants.CENTER);
        rendererDireita.setHorizontalAlignment(SwingConstants.RIGHT);
        rendererEsquerda.setHorizontalAlignment(SwingConstants.LEFT);

        TableColumnModel modeloDaColuna = tabela.getColumnModel();

        modeloDaColuna.getColumn(0).setCellRenderer(rendererEsquerda);
        modeloDaColuna.getColumn(1).setCellRenderer(rendererEsquerda);
        modeloDaColuna.getColumn(2).setCellRenderer(rendererEsquerda);
       
    }
        public void acaoAdicionar(){
        AgendaTableModel tela = new AgendaTableModel(lista);
        tela.setVisible(true);
    }
    
    public void acaoSair(){
         System.exit(0);
    }
    
    public void atualizarLista(ArrayList<Contato> contatos){
        this.lista = contatos;
        fireTableDataChanged();
    }

       public void setVisible(boolean bln) {
        // compiled code
    }


    public void editar(String nomeAntigo, String nomeValue, String telefoneValue, String comentarioValue) {
        for(Contato i: getLista()){
            if(i.getNome().equals(nomeAntigo)){
                excluir(i);
                inserir(new Contato(nomeValue, telefoneValue, comentarioValue));
            }
        }
        
        fireTableDataChanged();
    }
    
}

