public class Triangolo {

    int lato1, lato2, lato3;
    double altezza;

    public Triangolo (int lato1, int lato2, int lato3){
        this.lato1 = lato1;
        this.lato2 = lato2;
        this.lato3 = lato3;
        this.altezza = -1;
    }

    public void visualizza(){
        System.out.println("Lato1 = " + this.lato1);
        System.out.println("Lato2 = " + this.lato2);
        System.out.println("Lato3 = " + this.lato3);
    }

    public boolean isTri(){
        if((this.lato1 + this.lato2 > this.lato3) && (this.lato2 + this.lato3 > this.lato1) && 
        (this.lato1 + this.lato3 > this.lato2)){
            return true;
        }

        return false;
    }

    public boolean isEquilatero(){
        if((this.lato1 == this.lato2) && (this.lato2 == this.lato3)){
            return true;
        }
        return false;
    }

    /*public boolean isIsoscele(){
        if((this.lato1 == this.lato2) || (this.lato2 == this.lato3) || (this.lato1 == this.lato3)){
            return true;
        }

        return false;
    }*/

    public int calcolaPerimetro(){
        return this.lato1 + this.lato2 + this.lato3;
    }

    

}
