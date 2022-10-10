import java.util.*;

class TestAuto {
    public static void main(String arg[]) {
        Scanner input=new Scanner(System.in);
        int vel, i=0, scelta;
        String targa, vuota;
        Auto elenco[] = new Auto[500];

        do {
            System.out.println("premi 0 per uscire");
            System.out.println("premi 1 per creare una classe auto");
            System.out.println("premi 2 per visualizzare le auto create");
            System.out.println("premi 3 per accelerare o decelerare la velocità");
            System.out.println("premi 4 per verificare che nelle targhe ci sia 000");
            System.out.println("premi 5 per verificare se le targhe sono palindrome");
            scelta=input.nextInt();
			vuota=input.nextLine();

            switch (scelta) {
                case 0:
                    break;

                case 1:
                    if (i<500) {
                        System.out.println("dammi la targa");
                        targa=input.nextLine();
                        System.out.println("dammi la velocità");
                        vel=input.nextInt();
                        vuota=input.nextLine();
                        elenco[i]=new Auto(targa, vel);
                        i++;
                    }else{
                        System.out.println("elenco pieno");
                    }
                    break;

                default:
                    break;
            }
        } while (scelta!=0);
    }
}
