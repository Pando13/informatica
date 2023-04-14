package rubrica;
import java.util.*;

public class contatto {
    String cognome,nome,indirizzo,mail;
    int numero;

    public contatto(String cognome, String nome, String mail, int numero) {
        this.cognome=cognome;
        this.nome=nome;
        this.mail=mail;
        this.numero=numero;
    }

    public void visualizza(){
        System.out.println("cognome: "+cognome);
        System.out.println("nome: "+nome);
        System.out.println("mail: "+mail);
        System.out.println("numero: "+numero);
        System.out.println();
    }
}
