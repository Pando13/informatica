package orario;
import java.util.*;

public class Orario {
    String nome;
    int ore, minuti, secondi;
    boolean solare;

    public Orario(String nome, int ore, int minuti, int secondi, boolean solare){
        this.nome=nome;
        this.ore=ore;
        this.minuti=minuti;
        this.secondi=secondi;
        this.solare=solare;
    }

    public void visualizza(){
        System.out.println("citta': "+nome);
        System.out.println("orario: "+ore+":"+minuti+":"+secondi);
        if(solare){
            System.out.println("e' solare");
        }else{
            System.out.println("e' legale");
        }
    }

    public void mettiSolare(){
        if (!this.solare) {
            if (this.ore==0) {
                this.ore=23;
            } else {
                this.ore-=1;
            }
            this.solare=true;
            System.out.println("ora solare impostata");
        }else{
            System.out.println("l'orario e' gia' solare");
        }
    }

    public void mettiLegale(){
        if(this.solare){
            if(this.ore==23){
                this.ore=0;
            }else{
                this.ore+=1;
            }
            this.solare=false;
            System.out.println("ora legale impostata");
        }else{
            System.out.println("l'orario e' gia' legale");
        }
    }
}
