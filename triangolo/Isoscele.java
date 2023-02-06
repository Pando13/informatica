public class Isoscele extends Triangolo{

    int base, obliquo;

    public Isoscele(int lato1, int lato2, int lato3, double altezza){
        super(lato1, lato2, lato3);      
        this.altezza = altezza;
        this.base = -1;
        this.obliquo = -1;
    }

    public void calcolaBase (){
        if((this.base < 0) || (this.obliquo < 0)){
            if(this.lato1 == this.lato2){
                this.base = lato3;
                this.obliquo = lato2;
            }

            if(this.lato2 == this.lato3){
                this.base = lato1;
                this.obliquo = lato2;
            }

            if(this.lato1 == this.lato3){
                this.base = lato2;
                this.obliquo = lato3;
            }
            
        }             
        
    } 

    public boolean isIsoscele (){
        if((this.lato1 == this.lato2) || (this.lato2 == this.lato3) || (this.lato1 == this.lato3)){
            return true;
        }

        return false;
    }

    public double calcolaArea(){
        if(this.base > -1){
            return this.base * this.altezza / 2;
        }

        return -1;
    }

}
