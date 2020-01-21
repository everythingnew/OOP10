public class Schrank{ 
    Gegenstand[] array ;
    private double max_gewicht;
    private int counter=0;
    private double aktuelle_gewicht=0;
    
    public Schrank(int max_stuck,double max_gewicht){
        array= new Gegenstand[max_stuck];
        this.max_gewicht= max_gewicht;
    }
    public char packeEtwasRein(Gegenstand g){
        
        if (counter>=max_gewicht){
            return "v";
        }
        else if(aktuelle_gewicht+g.getGewicht>max_gewicht){
            return "m";
        }
        else{
            array[counter]= g;
            this.counter++;
            this.aktuelle_gewicht= this.aktuelle_gewicht+g.getGewicht; 
            return "e"
        }
        
    }
    public void print(){
        for (int i;i<array.length;i++){
            array[i].toString();
        }
    }
    public void print(double max_g){
        for (int i;i<array.length;i++){
            if(array[i].getGewicht()>max_g){
            array[i].toString();
            }
        }
    }
    public boolean istGegenstandVorhanden(String g_name){
        for (int i;i<array.length;i++){
            if(array[i].getName().equals(g_name)){
            return true;
            }
        }
        return false;
    }
    
    
    
    
}
