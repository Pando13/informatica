package rubrica;
import java.util.*;

public class TestRubrica {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
		Vector<contatto> rubrica=new Vector<contatto>(1,1);
        contatto contatto=null;
        int scelta, scelta2, numero, i;
        String cognome,nome,indirizzo,mail;
        do {
            System.out.println("premi 0-4");
            scelta=input.nextInt();
            switch(scelta){

                case 0:
                    break;

                case 1:
                    System.out.println("dammi cognome");
                    cognome=input.nextLine();
                    System.out.println("dammi nome");
                    nome=input.nextLine();
                    System.out.println("dammi indirizzo");
                    indirizzo=input.nextLine();
                    System.out.println("dammi mail");
                    mail=input.nextLine();
                    System.out.println("dammi numero");
                    numero=input.nextInt();
                    contatto = new contatto(cognome,nome,indirizzo,mail,numero);
                    rubrica.add(contatto);
                    break;

                case 2:
                    for(i=0;i<rubrica.size();i++){
                        System.out.println("indice="+i);
                        contatto.visualizza();
                    }
                    break;

                case 3:
                    do {
                        
                    } while ((i<0)||(i>=rubrica.size()));

                default:
                    break;
            }
        } while (scelta==0);
    }
}
