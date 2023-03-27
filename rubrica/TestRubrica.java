package rubrica;
import java.util.*;

public class TestRubrica {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
		Vector<contatto> rubrica=new Vector<contatto>(1,1);
        contatto contatto=null;
        int scelta, scelta2, numero;
        String cognome,nome,indirizzo,mail;
        do {
            System.out.println("premi 0-4");
            scelta=input.nextInt();
        } while (scelta==0);
    }
}
