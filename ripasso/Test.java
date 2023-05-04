package ripasso;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
		Vector<Punto> poligono=new Vector<Punto>(1,1);
        Punto p=null;
        String vuota;
        int scelta;
        do {
            System.out.println("input:");
            scelta=input.nextInt();
            vuota=input.nextLine();
            switch(scelta){
                case 0:
                    break;
                    
                case 1:
                    System.out.println("intero");
                    numero=input.nextInt();
                    vuota=input.nextLine();
                    p = new Punto(numero, stringa)
                    break;

                case 2:
                    for (i=0;i<poligono.size();i++) {
                        p=poligono.get(i);
                        p.visualizza();
                    }
                    break;

                case 3:
                //  ArithmeticException
                //  ArrayIndexOutOfBoundsException 
                //  InputMismatchException 
                    boolean input_ok=false;
                    while(input_ok==false){
                        try{
                            System.out.println("dammi un numero");
                            num=input.nextInt();
                            input_ok=true;
                        }
                        catch(InputMismatchException e){
                            vuota=input.nextLine();
                            System.out.println("errore, non hai digitato un intero");
                            input_ok=false;
                        }
                    }
                    break;

                default:
                    break;
            }
        } while (scelta!=0);
    }
}
