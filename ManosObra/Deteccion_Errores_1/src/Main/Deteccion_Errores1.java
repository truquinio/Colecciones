/*
DETECCIÓN DE ERRORES #1:
 */
package Main;

import java.util.HashMap;

public class Deteccion_Errores1 {

    public static void main(String[] args) {
        /*
        ERROR: 
        HashMap<Integer> personas = new HashMap<>; 

        String n1 = “Albus”;
        String n2 = “Severus”; 

        personas.add(n1);
        personas.add(n2);
        */
        
        HashMap<Integer, String> personas = new HashMap();

        String n1 = "Albus";
        String n2 = "Severus";

        personas.put(1, n1);
        personas.put(2, n2);

        System.out.println("Mapa: " + personas + "\n");
    }
}