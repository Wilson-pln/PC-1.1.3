
public class App {
    public static void main(String[] args) throws Exception {
        int[] original = { 5, 3, 4, 1, 2};
        int[] b = original.clone();
        int[] c = original;

        //INSTANCIAR el archivo BUBBLE
        //Instancio la clase Bubble
        Bubble buuble = new Bubble();
        // EJECUTAR CODE DEL ARCHIVO BUBBLE USO LA INSTANCIA
        printArreglo(b);
        buuble.sort(b);
        printArreglo(b);

        

    }

    public static void printArreglo(int[] arr){
        for (int i = 0; i<arr.length; i++)
            System.out.print(arr[i] + " - ");
        System.out.println();
        

    }
}
