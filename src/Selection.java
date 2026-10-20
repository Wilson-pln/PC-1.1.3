public class Selection {

    public void sort (int[] arreglo){
        int cambios = 0;
        int comparaciones = 0;

        System.out.println("--- Selection Sort ---");
        System.out.println("Original");
        System.out.println( "5 - 6 - 4 - 1 - 2 - 3 -" );
        for (int i = 0; i < arreglo.length; i++){
            int min = i;
            for(int j = i+1;j< arreglo.length; j++){
                comparaciones++;
                if (arreglo[j]<arreglo[min])
                    min = j;
            }
                

            if (min != i){
                int temp = arreglo[min];
                System.out.println("Pasadas= " + i + " | cambio " + arreglo[i] + "<->" + temp);    
                arreglo[min] = arreglo[i];
                arreglo[i]= temp;
                cambios++;
            }          
            
        }
        System.out.println("Cambios: " + cambios);
        System.out.println("Comparaciones: " + comparaciones);
        System.out.println("Ordenado Asc");
    }
    
}
