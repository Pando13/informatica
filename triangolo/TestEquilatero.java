package triangolo;
import java.util.*;

public class TestEquilatero {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
		Triangolo t1=null;
		int scelta, lato;
        String vuota;

        do{
            System.out.println("premi 0 per uscire");
            System.out.println("premi 1 per creare un triangolo equilatero");
            System.out.println("premi 2 per visualizzare il lato");
            System.out.println("premi 3 per dire se e' un triangolo");
            System.out.println("premi 4 per calcolare l'altezza");
            System.out.println("premi 5 per calcolare il perimetro");
            System.out.println("premi 6 per calcolare l'area");
            scelta=input.nextInt();
			vuota=input.nextLine();

            switch (scelta) {
                case 0:
                    break;
                
                case 1:
                    do{
                        System.out.println("dammi il lato");
                        lato=input.nextInt();
                        vuota=input.nextLine();
					}while(lato<1);
                    t1=new Triangolo(lato);
                    break;
                
                case 2:
                    if (t1!=null) {
                        t1.visualizza();
                    }else{
                        System.out.println("errore");
                    }
                    break;

                case 3:
                    if (t1!=null && t1.isTri()) {
                        System.out.println("e' un triangolo");
                    }else{
                        System.out.println("errore");
                    }
                    break;
                
                case 4:
                    if (t1!=null) {
                        System.out.println("perimetro: "+t1.perimetro());
                    }else{
                        System.out.println("errore");
                    }
                    break;
                
                default:
                    break;
            }
        }while(scelta!=0);
    }
}
