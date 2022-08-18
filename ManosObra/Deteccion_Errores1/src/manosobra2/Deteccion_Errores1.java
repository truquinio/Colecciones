/*
MANOS A LA OBRA – DETECCIÓN DE ERRORES

HashMap<Integer> personas = new HashMap<>; 

String n1 = “Albus”;
String n2 = “Severus”; 

personas.add(n1);
personas.add(n2);
 */
package manosobra2;

import java.util.HashMap;

public class Deteccion_Errores1 {

    public static void main(String[] args) {

        //ERROR: HashMap<Integer> personas = new HashMap<>; 
        HashMap<Integer, String> personas = new HashMap();
        
        //ERROR: String n1 = “Albus”;
        String n1 = "Albus";
        //ERROR: String n2 = “Severus”; 
        String n2 = "Severus"; 

        //ERROR: personas.add(n1);
        personas.put(1,n1);
        //ERROR: personas.add(n2);
        personas.put(2, n2);
        
        System.out.println("Mapa: " + personas + "\n");
    }
}