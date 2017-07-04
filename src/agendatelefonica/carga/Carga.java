package agendatelefonica.carga;

import java.util.ArrayList;
import agendatelefonica.model.Agenda;
import agendatelefonica.model.Contato;
import java.io.*;
import java.util.Scanner;

public class Carga {
    Agenda agenda;
    ArrayList<Contato> contato;
    private static final String CAMINHO = "Contatos.txt";
    public Carga(Agenda agenda){
        this.agenda = agenda;
        this.contato = new ArrayList<>();
    }

    public Carga() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void persist() throws IOException, FileNotFoundException{
        this.contato = agenda.getContatos();
        try(OutputStream os = new FileOutputStream(CAMINHO);
                OutputStreamWriter osw = new OutputStreamWriter(os);
                BufferedWriter bw = new BufferedWriter(osw)){
            for(Contato i:contato){
                bw.write(i.getNome()+";"+i.getTelefone()+";"+i.getComentario());
                bw.newLine();
            }
        }
    }
    public void persistTxt(File caminho) throws IOException, FileNotFoundException{
        this.contato = agenda.getContatos();
        try(OutputStream os = new FileOutputStream(caminho+"/Contatos.txt");
                OutputStreamWriter osw = new OutputStreamWriter(os);
                BufferedWriter bw = new BufferedWriter(osw)){
            for(Contato i:contato){
                bw.write(i.getNome()+";"+i.getTelefone()+";"+i.getComentario());
                bw.newLine();
            }
        }
    }
    public void persistHtml(File caminho) throws IOException, FileNotFoundException{
        this.contato = agenda.getContatos();
        try(OutputStream os = new FileOutputStream(caminho+"/Contatos.html");
                OutputStreamWriter osw = new OutputStreamWriter(os);
                BufferedWriter bw = new BufferedWriter(osw)){
            bw.write("<head>");
            bw.write("<title>Contatos</title>");
            bw.write("</head>");
            bw.write("<body>");
            bw.write("<table style="+"width:100%"+ "border: "+"1px solid black"+">");
            bw.write("<tr>");
            bw.write("<th>Nome</th>");
            bw.write("<th>Telefone</th>");
            bw.write("<th>Email</th>");
            bw.write("</tr>");
            
            for(Contato i:contato){
                bw.write("<tr>");
                bw.write("<td>"+i.getNome()+"</td>");
                bw.write("<td>"+i.getTelefone()+"</td>");
                bw.write("<td>"+i.getComentario()+"</td>");
                bw.write("</tr>");
            }
        }
    }
    public void load() throws FileNotFoundException, IOException, ClassNotFoundException{
        try(InputStream is = new FileInputStream(CAMINHO);
                InputStreamReader isr = new InputStreamReader(is);
                BufferedReader br = new BufferedReader(isr)){
            ArrayList<Contato> carregarContatos = new ArrayList<>();
            do{
                String novoContatoLido = br.readLine();
                if(novoContatoLido!=null){
                    Scanner sc = new Scanner(novoContatoLido).useDelimiter(";");
                    Contato novoContato = new Contato(sc.next(),sc.next(), sc.next());
                    contato.add(novoContato);
                }
            } while(br.ready());
        }
        agenda.setContatos(contato);
        
    }
    public void load(File caminhoArquivo) throws FileNotFoundException, IOException, ClassNotFoundException{
        System.out.println(caminhoArquivo.getAbsolutePath());
        try(InputStream is = new FileInputStream(caminhoArquivo);
                InputStreamReader isr = new InputStreamReader(is);
                BufferedReader br = new BufferedReader(isr)){
            ArrayList<Contato> carregarContatos = new ArrayList<>();
            do{
                String novoContatoLido = br.readLine();
                if(novoContatoLido!=null){
                    Scanner sc = new Scanner(novoContatoLido).useDelimiter(";");
                    Contato novoContato = new Contato(sc.next(),sc.next(), sc.next());
                    contato.add(novoContato);
                }
            } while(br.ready());
        }
        agenda.setContatos(contato);
        
    }
}
