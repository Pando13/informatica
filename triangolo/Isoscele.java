class Isoscele extends Triangolo{
	double altezza;
	int base,lato_obliquo;

	public Isoscele(int lato1,int lato2,int lato3){
		super(lato1,lato2,lato3);
	}

	boolean controllaLati(){
		if(lato1==lato2){
			base=lato3;
			lato_obliquo=lato1;
			return true;
		}
		else{
			if(lato1==lato3){
				base=lato2;
				lato_obliquo=lato1;
				return true;
			}
			else{
				if(lato2==lato3){
					base=lato1;
					lato_obliquo=lato2;
					return true;
				}
				else{
					return false;
				}
			}
		}
	}

	void calcolaAltezza(){
		altezza=Math.sqrt(Math.pow((double)lato_obliquo,2)-Math.pow((double)base/2,2));
	}

	double area(){
		double a;
		a=base*altezza/2;
		return a;
	}
}