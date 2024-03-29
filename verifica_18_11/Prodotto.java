package verifica_18_11;
import java.util.*;

class Prodotto {
    private String codice;
    private int mese, giorno;
    private float costo;

    public Prodotto(String codice, int giorno, int mese, float costo){
        this.codice=codice;
        this.giorno=giorno;
        this.mese=mese;
        this.costo=costo;
    }

    public String getCodice(){
        return this.codice;
    }
    public int getGiorno(){
        return this.giorno;
    }
    public int getMese(){
        return this.mese;
    }
    public float getCosto(){
        return this.costo;
    }

    boolean VerificaScadenza(int giorno, int mese){
        if(mese>this.mese){
            return true;
        }else{
            if((giorno>this.giorno)&&(mese==this.mese)){
                return true;
            }
        }
        return false;
    }
}



