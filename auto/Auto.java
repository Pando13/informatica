class Auto {
    // attributi
        private String targa;
        private float velocita;
    
    // costruttore
        public Auto(String targa, float velocita){
            this.targa=targa;
            this.velocita=velocita;
        }

    // metodi
        public void cambia_vel(float vel){
            if (vel+this.velocita>=0) {
                this.velocita=this.velocita+vel;
                System.out.println("velocita passata da "+(this.velocita-vel)+" a "+this.velocita);
            }else{
                System.out.println("la velocita non puo essere negativa");
            }
        }

    // gets
        public String getTarga(){
            return targa;
        }

        public float getVelocita(){
            return velocita;
        }

        public boolean palindrome(){
            String targa_invertita="";
            for (int cont=targa.length()-1; cont>=0; cont--) {
                targa_invertita=targa_invertita+targa.charAt(cont);
            }
            if (targa.equals(targa_invertita)) {
                return true;
            }else{
                return false;
            }
        }
}
