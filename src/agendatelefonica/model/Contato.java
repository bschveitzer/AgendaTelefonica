
package agendatelefonica.model;
import java.io.Serializable;

public class Contato implements Serializable{

    private String nome;
    private String telefone;
    private String comentario;
   
    public String toString(){
        return nome+comentario+telefone;
    }
    
    public Contato(String nome, String telefone, String comentario){  
        this.nome = nome;
        this.telefone = telefone;
        this.comentario = comentario;   
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    
    
}
