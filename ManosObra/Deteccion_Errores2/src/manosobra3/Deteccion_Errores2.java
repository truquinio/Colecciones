/*
MANOS A LA OBRA - DETECCIÓN DE ERRORES

ArrayList<String> = new ArrayList() 

bebidas.put(“café);
bebidas.add(“té”);
Iterator<String> it =bebidas.iterator(); 

whale (it.next()){

if (it.next().equals(“café”)){ 
it.remove();
}
 */
package manosobra3;

import java.util.ArrayList;
import java.util.Iterator;

public class Deteccion_Errores2 {

    public static void main(String[] args) {

        ArrayList<String> bebidas = new ArrayList();

        bebidas.add("café");
        bebidas.add("té");

        Iterator<String> it = bebidas.iterator();

        while (it.hasNext()) {

            if (it.next().equals("café")) {
                it.remove();
            }
        }
    }
}