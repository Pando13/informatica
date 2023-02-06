import java.util.Scanner;

public class TestIsoscele {   
    public static void main (String arg[]){
        int scelta, ob, base, perimetro, altezza;
        double area;
        Scanner scanner = new Scanner(System.in);
        Isoscele i=null;
        
        do{
            System.out.println("0. esci");
            System.out.println("1. Crea un triangolo isoscele");
            System.out.println("2. Visualizza i lati");
            System.out.println("3. Controlla se è un triangolo");
            System.out.println("4. Calcola altezza");
            System.out.println("5. Calcola perimetro");
            System.out.println("6. calcola area");

            scelta = scanner.nextInt();
            scanner.nextLine();

            switch(scelta){
                case 0:
                    break;
                case 1:
                    do{
                        System.out.println("Inserisci il lato obliquo del triangolo isoscele");
                        ob = scanner.nextInt();
                        scanner.nextLine();
                        if(ob < 1){
                            System.out.println("errore");
                        }
                    }while(ob < 1);
                    do{
                        System.out.println("Inserisci la base del triangolo isoscele");
                        base = scanner.nextInt();
                        scanner.nextLine();
                        if(base<1){
                            System.out.println("errore");
                        }
                    }while(base<1);
                    do{
                        System.out.println("Inserisci l'altezza del triangolo isoscele");
                        altezza = scanner.nextInt();
                        scanner.nextLine();
                        if(base<1){
                            System.out.println("errore");
                        }
                    }while(altezza<1);
                    i=new Isoscele(ob,ob,base,altezza);
                    break;
                case 2:
                    i.visualizza();
                    break;
                case 3:
                    
                    break;
                default:
                    System.out.println("Scelta non prevista");
                    break;
            }
        }while(scelta != 0);
    }
}
