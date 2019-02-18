/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin23;

import Utilidades.pedirDatos;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Queue;
import javax.swing.JOptionPane;

/**
 *
 * @author raguiarperez
 */
public class Cine {
    public static int Ncola = 1;
    public void agregar(Queue<Persoas>Cola,int nel){
        for (int i = 0; i < nel; i++) {
            Cola.add(new Persoas());
                       
        }
    }
    public void generarCola(Queue<Persoas>Cola) throws foraDoRangoException{
        int tamañoCola = pedirDatos.enteiro("Tamaño cola");
        if (tamañoCola<0|| tamañoCola>50){
            throw new foraDoRangoException("fora do rango");
        } else {
            for (int i = 0; i < tamañoCola; i++) {
                Cola.add(new Persoas());
            }
        }
    }
    public float precioEntradas(Queue<Persoas>Cola){
        Persoas per=Cola.poll();
        float total=0;
        while(per !=null){
            if(per.getEdade()>=5 & per.getEdade()<=10)
                total=total+1;
            else if(per.getEdade()>=11 & per.getEdade()<=17)
                total=total+2.50f;
            else
                total=total+3.50f;
        }
         per = Cola.poll();
         return total;
    }
}