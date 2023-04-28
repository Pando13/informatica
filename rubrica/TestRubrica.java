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

                case 4:
                    do{
                        System.out.println("inserisci indice contatto da modificare");
                        i=input.nextInt();
                        vuota=input.nextLine();
                        if((i<0)||(i>=rubrica.size())){
                            System.out.println("indice non esistente");
                        }
                    }while((i<0)||(i>=rubrica.size()));
                    contatto=rubrica.get(i);
                    contatto.visualizza();
                    System.out.println("premi 0 per uscire, 1 per modificare cognome, 2 per modificare nome, 3 per modificare telefono, premi 4 per email");
                    scelta2=input.nextInt();
                    vuota=input.nextLine();
                    switch(scelta2){
                        case 0:
                            break;

                        case 1:
                            System.out.println("nuovo valore di cognome");
                            contatto.cognome=input.nextLine();
                            rubrica.set(i,contatto);
                            break;

                        case 2:
                            System.out.println("nuovo valore di nome");
                            contatto.nome=input.nextLine();
                            rubrica.set(i,contatto);
                            break;

                        case 3:
                            System.out.println("nuovo valore di telefono");
                            contatto.numero=input.nextInt();
                            vuota=input.nextLine();
                            rubrica.set(i,contatto);
                            break;

                        case 4:
                            System.out.println("nuovo valore di email");
                            contatto.mail=input.nextLine();
                            rubrica.set(i,contatto);
                            break;						
                        default:
                            System.out.println("scelta non prevista");
                    }
                    break;

                default:
                    break;
            }
        } while (scelta!=0);
    }
}
