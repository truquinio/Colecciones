/*
Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos 
productos que venderemos y el precio que tendrán. Además, se necesita que la 
aplicación cuente con las funciones básicas. 

Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio, 
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar 
Hashmap). 

El HashMap tendrá de llave el nombre del producto y de valor el precio. 
Realizar un menú para lograr todas las acciones previamente mencionadas. 
 */
package Servicio;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author FT
 */
public class ServicioTienda {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    //Mapa que contendrá a los productos:
    HashMap<String, Double> mapaProducto = new HashMap();

///CREAR PRODUCTOS:   
    public void creaProductos() {

        String opcionSiNo;

        do {

            System.out.println("Cargar producto:");
            String nombreProducto = leer.next().toLowerCase().toLowerCase();

            System.out.println("\nCargar precio:");
            Double precioProducto = leer.nextDouble();

            mapaProducto.put(nombreProducto, precioProducto);

            do {

                System.out.println("\n¿Desea ingresar otro producto? s/n");
                opcionSiNo = leer.next().toLowerCase().toLowerCase();

            } while (!opcionSiNo.equals("n") && !opcionSiNo.equals("s"));

            System.out.println("");

        } while (!opcionSiNo.equals("n"));
    }
    
///MOSTRAR PRODUCTOS:
    public void mostrarProductos() {

        for (Map.Entry<String, Double> entry : mapaProducto.entrySet()) {

            System.out.println("Producto: " + entry.getKey() + ", Precio: $" + entry.getValue());
        }
        System.out.println("");
    }

///MODIFICAR UN PRODUCTO:    
    public void modificarProductos() {

        System.out.println("Ingrese producto a modificar:");
        String modificaProducto = leer.next().toLowerCase();

        if (!mapaProducto.containsKey(modificaProducto)) {
            
            System.out.println("\nProducto no encontrado.\n");
            
            return;
        }
        System.out.println("\nIngrese nuevo precio:");
        double nuevoPrecio = leer.nextInt();
        
        System.out.println("");
        
        mapaProducto.replace(modificaProducto, nuevoPrecio);

        mostrarProductos();
    }

///ELIMINAR PRODUCTO:
    public void eliminarProducto() {

        System.out.println("Ingrese producto a eliminar:");
        mapaProducto.remove(leer.next().toLowerCase());
        
        System.out.println("");
        
        mostrarProductos();
    }

///MENÚ DE OPCIONES:
    public void menuOpciones() {

        int opcionMenu;

        do {
            System.out.println("1. Ingresar producto.");
            System.out.println("2. Mostrar producto.");
            System.out.println("3. Modificar producto.");
            System.out.println("4. Eliminar producto.");
            System.out.println("0. Salir.");
            
             opcionMenu = leer.nextInt();
             System.out.println("");

            switch (opcionMenu) {

                case 1:
                    creaProductos();
                    break;

                case 2:
                    mostrarProductos();
                    break;

                case 3:
                    modificarProductos();
                    break;

                case 4:
                    eliminarProducto();
                    break;
            }
        } while (opcionMenu != 0);
    }
}