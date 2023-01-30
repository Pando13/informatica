public class Equilatero extends Triangolo {

    public Equilatero (int lato){
        super(lato, lato, lato);
        this.altezza = -1;
    }

    public double calcolaAltezza (){
        this.altezza =  Math.sqrt((double) 3 / 4) * this.lato1;
        return this.altezza;
    } 
    
    public int getLato (){
        return this.lato1;
    }

    public double calcolaArea(){
        if(this.altezza > -1){
            this.area = this.lato1 * this.altezza / 2;
            return this.area;
        }

        return -1;
    }
    
}
