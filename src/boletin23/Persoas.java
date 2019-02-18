
package boletin23;

import java.util.Random;

public class Persoas {
    private int edade;
    private int cola;


    public Persoas() {
        Random rand = new Random();
        this.edade = 5+rand.nextInt(56);
        this.cola = Cine.Ncola;
        Cine.Ncola++;
        
    }


    public int getEdade() {
        return edade;
    }

    public void setEdade(int edade) {
        this.edade = edade;
    }

    @Override
    public String toString() {
        return "\nEdade: " + edade + " Cola: " + cola;
    }
    
    
}