package verifica_18_11;
import java.util.*;

class TestProdotto {
    public static void main(String[] args) {
        String codice, vuota;
        int mese, giorno, scelta, i=0, cont;
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
                        System.out.println("dammi codice");
                        codice=input.nextLine();
                        System.out.println("dammi costo");
                        costo=input.nextFloat();
                        vuota=input.nextLine();
                        System.out.println("dammi giorno");
                        giorno=input.nextInt();
                        vuota=input.nextLine();
                        System.out.println("dammi mese");
                        mese=input.nextInt();
                        vuota=input.nextLine();
                        elenco[i]=new Prodotto(codice.toUpperCase(), giorno, mese, costo);
                        i++;
                    }else{
						System.out.println("elenco pieno");
					}	
                    break;
                case 2:
                    for (cont=0;cont<i;cont++) {
                        System.out.println("codice: "+elenco[cont].getCodice()+", costo: "+elenco[cont].getCosto()+", scadenza: "+elenco[cont].getGiorno()+"/"+elenco[cont].getMese());
                    }
                    break;
                default:
                    break;
            }
        }while(scelta!=0);
    }
}
