
package agendatelefonica.model;

import java.util.ArrayList;

public class Agenda {
    ArrayList<Contato> contatos;

    public Agenda() {
        contatos = new ArrayList<>();
        
    }
    public void adicionaContato(Contato contato){
        contatos.add(contato);
        
    }

    public ArrayList<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(ArrayList<Contato> contatos) {
        this.contatos = contatos;
    }
           
}
