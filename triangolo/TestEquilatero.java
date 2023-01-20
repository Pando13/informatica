package triangolo;
import java.util.*;
	class TestEquilatero{
		public static void main(String arg[]){
			Scanner input=new Scanner(System.in);
			String vuota;
			int lato,scelta,p;
			double a;
			Equilatero e=null;
			
			do{
				System.out.println("premi 0 per uscire");
				System.out.println("premi 1 per creare un triangolo");
				System.out.println("premi 2 per visualizzare i lati");
				System.out.println("premi 3 per dire se e' un triangolo");
				System.out.println("premi 4 per calcolare l'altezza");
				System.out.println("premi 5 per calcolare il perimetro");
				System.out.println("premi 6 per calcolare l'area");
				scelta=input.nextInt();
				vuota=input.nextLine();
				switch(scelta){
					case 0:
						break;

					case 1:
						do{
							System.out.println("dammi il lato");
							lato=input.nextInt();
							vuota=input.nextLine();
							if(lato<1){
								System.out.println("valore impossibile");
							}
						}while(lato<1);
						e=new Equilatero(lato);
						break;

					case 2:
						e.visualizza();
						break;

					case 3:
						if(e.isTri()){
							System.out.println("i lati formano un triangolo");
						}
						else{
							System.out.println("i lati non formano un triangolo");
						}
						break;

					case 4:
						e.calcolaAltezza();
						System.out.println("altezza:"+e.altezza);
						break;

					case 5:
						p=e.perimetro();
						System.out.println("perimetro:"+p);
						break;

					case 6:
						a=e.area();
						System.out.println("area:"+a);
						break;
					default:
						System.out.println("scelta sbagliata");
				}
						
			}while(scelta!=0);
		}
	}