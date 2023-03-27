package rubrica;
import java.util.*;

public class contatto {
    String cognome,nome,indirizzo,mail;
    int numero;

    public contatto(String cognome, String nome, String indirizzo, String mail, int numero) {
        this.cognome=cognome;
        this.nome=nome;
        this.indirizzo=indirizzo;
        this.mail=mail;
        this.numero=numero;
    }

    public void visualizza(){
        System.out.println("cognome: "+cognome);
        System.out.println("nome: "+nome);
        System.out.println("indirizzo: "+indirizzo);
        System.out.println("mail: "+mail);
        System.out.println("numero: "+numero);
    }
    
}
