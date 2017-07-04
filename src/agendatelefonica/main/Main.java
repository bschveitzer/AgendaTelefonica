package agendatelefonica.main;

import agendatelefonica.model.Agenda;
import agendatelefonica.view.CadastroAgenda;
import agendatelefonica.view.TelaInicial;

public class Main {

 
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        TelaInicial telaInicial = new TelaInicial(agenda);
        telaInicial.setVisible(true);
    }
    
}