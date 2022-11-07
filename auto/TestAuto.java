/*
c:
cd Users/5Bs-inf-g03/Desktop/informatica/auto/
javac TestAuto.java
java TestAuto
*/

import java.util.*;

class TestAuto {
    public static void main(String arg[]) {
        Scanner input=new Scanner(System.in);
        int vel, i=0, scelta;
        String targa, vuota, prima, ultima;
        char c;
        Auto elenco[] = new Auto[500];

        do {
            System.out.println("premi 0 per uscire");
            System.out.println("premi 1 per creare una classe auto");
            System.out.println("premi 2 per visualizzare le auto create");
            System.out.println("premi 3 per accelerare o decelerare la velocita");
            System.out.println("premi 4 per verificare che nelle targhe ci sia 000");
            System.out.println("premi 5 per verificare se le targhe sono palindrome");
            System.out.println("premi 6 per verificare che sia nel formato giusto");
            System.out.println("premi 7 per trovare la prima e l'ultima targa in ordine alfabetico");
            scelta=input.nextInt();
			vuota=input.nextLine();

            switch (scelta) {
                case 0:
                    break;

                case 1:
                    if (i<500) {
                        System.out.println("dammi la targa");
                        targa=input.nextLine().toUpperCase();
                        System.out.println("dammi la velocita");
                        vel=input.nextInt();
                        vuota=input.nextLine();
                        elenco[i]=new Auto(targa, vel);
                        i++;
                    }else{
                        System.out.println("elenco pieno");
                    }
                    break;

                case 2:
                    for (int cont=0; cont<i; cont++) {
                        System.out.println(cont+1+") targa: "+elenco[cont].getTarga()+" | velocita: "+elenco[cont].getVelocita());
                    }
                    break;

                case 3:
                    System.out.println("dammi la targa");
                    targa=input.nextLine().toUpperCase();
                    System.out.println("dammi la velocita");
                    vel=input.nextInt();
                    vuota=input.nextLine();
                    for (int cont=0; cont<i; cont++) {
                        if (targa.equals(elenco[cont].getTarga())) {
                            elenco[cont].cambia_vel(vel);
                        }
                    }
                    break;

                case 4:
                    for (int cont=0; cont<i; cont++) {
                        if (elenco[cont].getTarga().indexOf("000")!=-1) {
                            System.out.println("targa: "+elenco[cont].getTarga()+" conteiene 000");
                        }else{
                            System.out.println("targa: "+elenco[cont].getTarga()+" non contiene 000");
                        }
                    }
                    break;   
                
                case 5:
                    for (int cont=0; cont<i; cont++) {
                        if (elenco[cont].palindrome()) {
                            System.out.println("targa: "+elenco[cont].getTarga()+" e' palindrome");
                        }else{
                            System.out.println("targa: "+elenco[cont].getTarga()+" non e' palindrome");
                        }
                    }
                    break;
                
                case 6:
                    for (int cont=0; cont<i; cont++) {
                        boolean valida = true;
                        if (elenco[cont].getTarga().length()!=7){
                            System.out.println("lunghezza");
                            valida = false;
                        }
                        for (int j=0; j<elenco[cont].getTarga().length(); j++){
                            c = elenco[cont].getTarga().charAt(j);
                            int ascii = c;
                            System.out.println("lettere");
                            if (j<2||j>4){
                                if (ascii<65||ascii>90){
                                    valida = false;
                                }
                            }else{
                                if (ascii<48||ascii>57){
                                    valida = false;
                                }
                            }
                        }
                        if (valida){
                            System.out.println("la targa "+elenco[cont].getTarga()+" e' valida");
                        }else{
                            System.out.println("la targa "+elenco[cont].getTarga()+" non e' valida");
                        }
                    }
                    break;
                
                case 7:
                    
                    break;

                default:
                    break;
            }
        } while (scelta!=0);
    }
}
