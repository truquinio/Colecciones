/*
Crear una clase llamada Alumno que mantenga información sobre las notas de distintos 
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer 
con sus 3 notas.

En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide 
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le 
pregunta al usuario si quiere crear otro Alumno o no.

Después de ese bucle tendremos el siguiente método en el servicio de Alumno: 
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota 
final y se lo busca en la lista de Alumnos.  

Si está en la lista, se llama al método. Dentro del método se usará la lista notas para 
calcular el promedio final de alumno. Siendo este promedio final, devuelto por el método 
y mostrado en el main.
 */
package Servicio;

import Entidad.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

public class ServicioAlumno {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    //Lista que contendrá a los alumnos:
    ArrayList<Alumno> arrayAlumnos = new ArrayList();

///MÉTODO CREAR ALUMNO:
    public void crearAlumno() {

        String opcionSiNo;

        do {

            System.out.println("Ingrese nombre de alumno:");
            String nombre = leer.next().toLowerCase();

            System.out.println("\nIngrese 3 notas:");
            int nota1 = leer.nextInt();
            int nota2 = leer.nextInt();
            int nota3 = leer.nextInt();

            arrayAlumnos.add(new Alumno(nombre, nota1, nota2, nota3));

            do {

                System.out.println("\n¿Desea ingresar otro alumno? s/n");
                opcionSiNo = leer.next().toLowerCase();

            } while (!opcionSiNo.equals("n") && !opcionSiNo.equals("s"));

            System.out.println("");

        } while (!opcionSiNo.equals("n"));
    }

    /*
    Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
    final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
    del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
    promedio final, devuelto por el método y mostrado en el main....
     */
    public void notaFinal() {

        String opcionSiNo;

        do {
            System.out.println("Ingrese alumno para saber su nota final: ");
            String nombre2 = leer.next().toLowerCase();

            boolean alumnoEncontrado = false;

            //Busca en la lista el alumno ingresado por teclado:
            for (Alumno listaAlumnoForEach : arrayAlumnos) {

                //Comparo si el nombre a buscar es igual a alguno de la lista
                if (listaAlumnoForEach.getNombre().equals(nombre2)) {

                    alumnoEncontrado = true;

//Llamo al método calcularPromedio que hice más abajo:
                    System.out.println("\nPromedio del alumno: " + calcularPromedio(listaAlumnoForEach));
                }
            }
            if (alumnoEncontrado == false) {

                System.out.println("Alumno no encontrado.");
            }

            do {

                System.out.println("\n¿Desea calcular promedio de otro alumno? s/n");
                opcionSiNo = leer.next();

            } while (!opcionSiNo.equals("n") && !opcionSiNo.equals("s"));

        } while (!opcionSiNo.equals("n"));

        System.out.println("");
    }

///MÉTODO CALCULAR PROMEDIO:
    public float calcularPromedio(Alumno arrayAlumnoAuxiliar) {

        float promedio = 0;

        for (Integer notaForEach : arrayAlumnoAuxiliar.getArrayNotas()) {

            promedio += notaForEach;
        }
        return promedio / 3;
    }
}