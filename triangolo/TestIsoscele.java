import java.util.*;
	class TestIsoscele{
		public static void main(String arg[]){
			Scanner input=new Scanner(System.in);
			String vuota;
			int lato1,lato2,lato3,scelta,p;
			double a;
			boolean errore;
			Isoscele i=null;
			
			do{
				System.out.println("premi 0 per uscire");
				System.out.println("premi 1 per creare un triangolo");
				System.out.println("premi 2 per visualizzare i lati");
				System.out.println("premi 3 per dire se e' un triangolo");
				System.out.println("premi 4 per dire se e' un triangolo isoscele");
				System.out.println("premi 5 per calcolare l'altezza");
				System.out.println("premi 6 per calcolare il perimetro");
				System.out.println("premi 7 per calcolare l'area");
				errore=true;
				scelta=0;
				while(errore){
					try{
						scelta=input.nextInt();
						vuota=input.nextLine();
						errore=false;
					}
					catch(InputMismatchException e){
						System.out.println("inserisci un numero 0-7");
						errore=true;
					}
				}
				switch(scelta){
					case 0:
						break;

					case 1:
						do{
							System.out.println("inserisci primo lato");
							lato1=input.nextInt();
							if(lato1<1){
								System.out.println("valore non valido");
							}
						}while(lato1<1);
						do{
							System.out.println("inserisci secondo lato");
							lato2=input.nextInt();
							if(lato2<1){
								System.out.println("valore non valido");
							}
						}while(lato2<1);
						do{
							System.out.println("inserisci terzo lato");
							lato3=input.nextInt();
							if(lato3<1){
								System.out.println("valore non valido");
							}
						}while(lato3<1);
						i=new Isoscele(lato1,lato2,lato3);
					break;

					case 2:
						if(i!=null){
							i.visualizza();
						}
						else{
							System.out.println("prima premi 1");
						}
						break;

					case 3:
						if(i!=null){
							if(i.isTri()){
								System.out.println("i lati formano un triangolo");
							}
							else{
								System.out.println("i lati non formano un triangolo");
							}
						}
						else{
							System.out.println("prima premi 1");
						}
						break;


					case 4:
						if((i!=null)&&(i.isTri()==true)){
							if(i.controllaLati()){
								System.out.println("e' un triangolo isoscele");
							}
							else{
								System.out.println("non e' un triangolo isoscele");
							}
						}
						else{
							System.out.println("prima premi 1");
						}
						break;
					case 5:
						if((i!=null)&&(i.isTri()==true)){
							if(i.controllaLati()){	
								i.calcolaAltezza();
								System.out.println("altezza:"+i.altezza);
							}
							else{
								System.out.println("non e' un triangolo isoscele");
							}
						}
						else{
							System.out.println("prima premi 1");
						}
						break;

					case 6:
						if((i!=null)&&(i.isTri()==true)){
							if(i.controllaLati()){	
								p=i.perimetro();
								System.out.println("perimetro:"+p);
							}
							else{
								System.out.println("non e' un triangolo isoscele");
							}
						}
						else{
							System.out.println("prima premi 1");
						}
						break;

					case 7:
						if((i!=null)&&(i.isTri()==true)){
							if(i.controllaLati()){	
								a=i.area();
								System.out.println("area:"+a);
							}
							else{
								System.out.println("non e' un triangolo isoscele");
							}
						}
						else{
							System.out.println("prima premi 1");
						}
						break;
					default:
						System.out.println("scelta sbagliata");
				}
						
			}while(scelta!=0);
		}
	}