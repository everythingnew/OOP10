public class Gegenstand{ 
    String name;
    double gewicht;
    Gegenstand(String name,double gewicht){
        if (gewicht<0){
            gewicht = 0;
        }
        this.name= name;
        this.gewicht= gewicht;
        
    }
    public String getName(){
        return this.name;
    }
    public double getGewicht(){
        return this.gewicht;
    }
    
    @Override
    public String toString(){
        return this.name+" ("+this.gewicht+")";
    }


}

