public class Punto {
    int numero;
    String stringa;
    public Punto(int numero, String stringa){
        this.numero=numero;
        this.stringa=stringa;
    }
    public void visualizza(){
        System.out.println(numero+stringa);
    }
}

//------------------------------

class SuperPunto extends Punto{
	double z;

	public SuperPunto(int numero, String stringa){
		super(numero,stringa);
	}

	public double area(){
		double a;
		a=numero*z;
		return a;
	}

    public void SuperVisualizza(){
        super.visualizza();
        System.out.println(z);
    }
}