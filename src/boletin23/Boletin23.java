
package boletin23;

import Utilidades.pedirDatos;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Queue;
import javax.swing.JOptionPane;

/**
 * @author raguiarperez
 */
public class Boletin23 {

    public static void main(String[] args) throws foraDoRangoException{
       Queue<Persoas> Cola = new ArrayDeque<>();
       Cine cin = new Cine();
       try{
       cin.generarCola(Cola);
       }catch (foraDoRangoException ex){
           JOptionPane.showMessageDialog(null, ex.getMessage());
       }finally{
           cin.generarCola(Cola);
       }
       System.out.println(Cola);
       System.out.println("\nRecaudado:" + cin.precioEntradas(Cola) +"€");
        System.out.println(Cola);
    }
    
}
