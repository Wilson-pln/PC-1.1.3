
public class App {
    public static void main(String[] args) throws Exception {
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

    
    
}
