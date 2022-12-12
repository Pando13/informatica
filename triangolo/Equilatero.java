package triangolo;
class Equilatero extends Triangolo{
	double altezza;

	public Equilatero(int lato){
		super(lato);
	}

	void visualizza(){
		super.visualizza();
		System.out.println("altezza:"+altezza);
	}

	void calcolaAltezza(){
		altezza=Math.sqrt(Math.pow(lato,2)-Math.pow((double)lato/2,2));
	}

	double area(){
		double a;
		a=lato*altezza/2;
		return a;
	}
}