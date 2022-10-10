class Visita{

	// attributi: nome animale, data della visita, costo della visita
	
		private String nome_animale;
		private int giorno,mese,anno;
		private float costo;
	
	// costruttore
		
		public Visita(String nome_animale, int giorno, int mese, int anno, float costo){
			this.nome_animale=nome_animale;			// attributo=parametro
			this.giorno=giorno;
			this.mese=mese;
			this.anno=anno;
			this.costo=costo;
		}
	
	/*	public Visita(String nome, int gg, int mm, int aa, float c){
			nome_animale=nome;
			giorno=gg;
			mese=mm;
			anno=aa;
			costo=c;
	*/
	
		String getNome(){
			return nome_animale;
		}
	
		int getGiorno(){
			return giorno;
		}
	
		int getMese(){
			return mese;
		}
	
		int getAnno(){
			return anno;
		}
	
		float getCosto(){
			return costo;
		}
	
		void setNome(String nome_animale){
			this.nome_animale=nome_animale;
		}
	
		void setGiorno(int giorno){
			this.giorno=giorno;
		}
	
		void setMese(int mese){
			this.mese=mese;
		}
		
		void setAnno(int anno){
			this.anno=anno;
		}
	
		void setCosto(float costo){
			this.costo=costo;
		}
	}