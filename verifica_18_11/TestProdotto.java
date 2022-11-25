package verifica_18_11;
import java.util.*;

class TestProdotto {
    public static void main(String[] args) {
        String codice, vuota;
        int mese, giorno, scelta, i=0;
        float costo;
        Prodotto elenco[]=new Prodotto[500];
		Scanner input=new Scanner(System.in);

        do{
            System.out.println("premi 0 per uscire");
            scelta=input.nextInt();
			vuota=input.nextLine();
			switch(scelta){
                case 0:
                    break;
                case 1:
                    if(i<500){
                        
                    }else{
						System.out.println("elenco pieno");
					}	
                    break;
                default:
                    break;
            }
        }while(scelta!=0);
    }
}
