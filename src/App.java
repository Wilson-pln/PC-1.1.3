import java.util.Arrays;
import java.util.Comparator;

import models.Estudiante;

public class App {
    public static void main(String[] args) throws Exception {
       // runEjemplosPrimitivos();
       runEjemplosObjetos();
       runComparators();

    }
    private static void runComparators() {
        Integer[]  original = {5, 6, 4, 1, 2, 3};
        // Arrays.sort -> ordena arreglos por su orden natural ( solo para arreglos)
        // los staticos no necesitan ser instanciados
        Arrays.sort(original);
        for (int i = 0; i < original.length; i++){
            System.out.println(original[i]);;
        }
        System.out.println("----------------");

        Arrays.sort(original, Comparator.reverseOrder());
        for (int i = 0; i < original.length; i++){
            System.out.println(original[i]);;
        }

        }
    
    public static void runEjemplosObjetos(){
        Estudiante e1 = new Estudiante("Juan", 10);

        Estudiante[] estudiantes = {e1,
                                    new Estudiante("Maria", 7), 
                                    new Estudiante("Diego", 3.5),
                                    new Estudiante("Pedro", 6.8),
        };

        Bubble bubble = new Bubble();
        printArregloEstudiantes(estudiantes);
        

        bubble.sortEstudiantes(estudiantes);

        printArregloEstudiantes(estudiantes);

        

    }
    public static void runEjemplosPrimitivos(){
        int[] original = { 5, 6, 4, 1, 2, 3};
        int[] b = original.clone();
        int[] c = original.clone();
        int[] d = original.clone();

        //INSTANCIAR el archivo BUBBLE
        //Instancio la clase Bubble
        Bubble buuble = new Bubble();
        // EJECUTAR CODE DEL ARCHIVO BUBBLE USO LA INSTANCIA

        printArreglo(b);
        buuble.sort(b);
        printArreglo(b);


        System.out.println("Selection");
        Selection selection = new Selection();
        printArreglo(c);
        selection.sort(c);
        printArreglo(c);

        InsertionSort insertion = new InsertionSort();
        System.out.println("--- Selection Insertion ---");
        System.out.println("Original");
        printArreglo(d);
        insertion.sort(d);

        System.out.println("Orden des");
        printArreglo(d);

    }
    


    public static void printArreglo(int[] arr){
        for (int i = 0; i<arr.length; i++)
            System.out.print(arr[i] + " - ");
        System.out.println();
        

    }
    public void printSelection(int[] arr){
        for (int i : arr){
            System.out.print(i + " - ");
        }
        System.out.println();
    }
    public static void printArregloEstudiantes(Estudiante[] arr){
        for (int i = 0; i<arr.length; i++)
            System.out.print(arr[i] + " - ");
        System.out.println();
        

    }
    
    

    
    
}
