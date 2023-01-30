import java.util.Scanner;

public class TestEquilatero {    
    public static void main (String arg[]){
        int scelta, lato, perimetro;
        double altezza, area;
        Equilatero t = null;
        Scanner scanner = new Scanner(System.in);
        boolean c1f = false;

        do{
            System.out.println("0. esci");
            System.out.println("1. Crea un triangolo");
            System.out.println("2. Visualizza i lati");
            System.out.println("3. è un triangolo??");
            System.out.println("4. calcola altezza");
            System.out.println("5. Calcola perimetro");
            System.out.println("6. Calcola area");

            scelta = scanner.nextInt();
            scanner.nextLine();

            switch(scelta){
                case 0:
                    break;
                case 1:
                    do{
                        System.out.println("Inserisci il lato del triangolo equilatero");
                        lato = scanner.nextInt();
                        scanner.nextLine();

                        if(lato < 1){
                            System.out.println("Valore inserito non valido");
                        }
                    }while(lato < 1);
                    t = new Equilatero(lato);
                    c1f = true;
                    break;
                case 2:
                    if(c1f){
                        t.visualizza();
                    }else{
                        System.out.println("Prima creare un triangolo");
                    }
                    break;
                case 3:
                    if(c1f){
                        if(t.isTri()){
                            System.out.println("Si tratta di un triangolo");
                        }else{
                            System.out.println("Non e' un triangolo");
                        }
                    }else{
                        System.out.println("Prima creare un triangolo");
                    }
                    break;
                case 4:
                    if(c1f){
                        altezza = t.calcolaAltezza();
                        System.out.println("Altezza = " + altezza);
                    }else{
                        System.out.println("Prima creare un triangolo");
                    }
                    break;
                case 5:
                    if(c1f){
                        perimetro = t.calcolaPerimetro();
                        System.out.println("Perimetro = " + perimetro);
                    }else{
                        System.out.println("Prima creare un triangolo");
                    }
                    break;
                case 6:
                    if(c1f){
                        area = t.calcolaArea();
                        System.out.println("Area = " + area);
                    }else{
                        System.out.println("Prima creare un triangolo");
                    }
                    break;
                default:
                    System.out.println("Scelta non prevista");
                    break;
            }
        }while(scelta != 0);
    }
}
