package verifica_18_11;
import java.util.*;

import javax.sql.rowset.CachedRowSet;

class TestProdotto {
    public static void main(String[] args) {
        String codice, vuota;
        int mese, giorno, scelta, i=0, cont, numero;
        float costo;
        boolean trovato, ordinato;
        Prodotto elenco[]=new Prodotto[500], temp;
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
                case 3:
                    System.out.println("dammi codice da controllare");
                    codice=input.nextLine().toUpperCase();
                    trovato = false;
                    for (cont=0;cont<i;cont++) {
                        if (codice.compareTo(elenco[cont].getCodice())=='0') {
                            trovato = true;
                            System.out.println("dammi giorno corrente");
                            giorno=input.nextInt();
                            vuota=input.nextLine();
                            System.out.println("dammi mese corrente");
                            mese=input.nextInt();
                            vuota=input.nextLine();
                            if (elenco[cont].VerificaScadenza(mese, giorno)) {
                                System.out.println("scaduto");
                            }else{
                                System.out.println("non scaduto");
                            }
                        }
                    }
                    if (!trovato) {
                        System.out.println("codice non trovato");
                    }
                    break;
                case 4:
                    for(cont=0;cont<i;cont++){
                        numero=0;
                        for(int j = 0; j<elenco[cont].getCodice().length(); j++){
                            if(elenco[cont].getCodice().charAt(j) == '0'){
                                numero++;
                            }
                        }
                        System.out.println("codice: "+elenco[cont].getCodice()+", numero di 0: "+numero);
                    }
                    break;
                case 5:
                    do{
                        ordinato=true;
                        for(cont=i-1;cont>0;cont--){
                            if(elenco[cont].getCodice().compareTo(elenco[cont-1].getCodice())<0){
                                temp=elenco[cont-1];
                                elenco[cont-1]=elenco[cont];
                                elenco[cont]=temp;
                                ordinato=false;
                            }
                        }
            
                        if(ordinato==false){
                            ordinato=true;
                            for(cont=0;cont<i-1;cont++){
                                if(elenco[cont].getCodice().compareTo(elenco[cont+1].getCodice())>0){
                                    temp=elenco[cont+1];
                                    elenco[cont+1]=elenco[cont];
                                    elenco[cont]=temp;
                                    ordinato=false;
                                }
                            }
                        }
                    }while(ordinato==false);					
                    break;
                default:
                    break;
            }
        }while(scelta!=0);
    }
}