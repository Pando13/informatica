package rubrica;
import java.util.*;

public class TestRubrica {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
		Vector<contatto> rubrica=new Vector<contatto>(1,1);
        contatto contatto=null;
        int scelta, scelta2, numero, i;
        String cognome,nome,mail,vuota;
        boolean trovato;
        do {
            System.out.println("premi 0-4");
            scelta=input.nextInt();
            vuota=input.nextLine();
            switch(scelta){

                case 0:
                    break;

                case 1:
                    System.out.println("dammi cognome");
                    cognome=input.nextLine();
                    System.out.println("dammi nome");
                    nome=input.nextLine();
                    System.out.println("dammi mail");
                    mail=input.nextLine();
                    System.out.println("dammi numero");
                    numero=input.nextInt();
                    vuota=input.nextLine();
                    contatto = new contatto(cognome,nome,mail,numero);
                    rubrica.add(contatto);
                    break;

                case 2:
                    for(i=0;i<rubrica.size();i++){
                        System.out.println("CONTATTO INDICE "+(i));
                        contatto.visualizza();
                    }
                    break;

                case 3:
                    System.out.println("inserisci cognome del contatto da rimuovere");
                    cognome=input.nextLine();
                    System.out.println("inserisci nome del contatto da rimuovere");
                    nome=input.nextLine();
                    trovato=false;
                    for(i=0;i<rubrica.size();i++){
                        if((cognome.compareTo(rubrica.get(i).cognome)==0) && (nome.compareTo(rubrica.get(i).nome)==0)){
                            trovato=true;
                            rubrica.remove(i);
                            System.out.println("contatto rimosso");
                        }
                    }
                    if(!trovato){
                        System.out.println("non sono stati trovati contatti");
                    }
                    break;

                default:
                    break;
            }
        } while (scelta!=0);
    }
}
