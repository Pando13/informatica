package triangolo;
import java.util.*;

public class TestTriangolo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
		Triangolo t1=null;
		int scelta, lato1, lato2, lato3;
        String vuota;

        do{
            System.out.println("premi 0 per uscire");
            System.out.println("premi 1 per creare un triangolo");
            System.out.println("premi 2 per visualizzare i lati");
            System.out.println("premi 3 per dire se e' un triangolo");
            System.out.println("premi 4 per calcolare il perimetro");
            scelta=input.nextInt();
			vuota=input.nextLine();

            switch (scelta) {
                case 0:
                    break;
                
                case 1:
                    do{
                        System.out.println("dammi lato 1");
                        lato1=input.nextInt();
                        vuota=input.nextLine();
					}while(lato1<1);
                    do{
                        System.out.println("dammi lato 2");
                        lato2=input.nextInt();
                        vuota=input.nextLine();
                    }while(lato2<1);
                    do{
                        System.out.println("dammi lato 3");
                        lato3=input.nextInt();
                        vuota=input.nextLine();
                    }while(lato1<3);
                    t1=new Triangolo(lato1,lato2,lato3);
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