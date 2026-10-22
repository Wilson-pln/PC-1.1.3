import models.Estudiante;

public class Bubble {
    int cambios = 0;
    int comparaciones = 0;

    public void sort(int[] arreglo){
        
        
        for(int i = 0; i<arreglo.length; i++){
            System.out.println("Pasada " + i);
            boolean combinaciones = false;

            for(int j = 1; j<arreglo.length - i; j++){
                
                //COMPARACION
                comparaciones++;
                if(arreglo[j - 1] > arreglo[j]){
                    //INTERCAMBIO
                    combinaciones = true;

                    int aux = arreglo[j-1];
                    arreglo[j-1] = arreglo[j];
                    arreglo[j] = aux;
                    cambios++;

                }

            } 
            if (!combinaciones) {
                break;
            }
            System.out.println("cambios: " +cambios);
            System.out.println("Comparaciones: " +comparaciones);

            
        }
        System.out.println("cambios: " +cambios);
        System.out.println("Comparaciones: " +comparaciones);

        
        

    }

    public void sortEstudiantes(Estudiante[] estudiantes){
        for (int i = 0; i< estudiantes.length; i ++){
            boolean cambio = false;
            for (int j = 0; j< estudiantes.length-i-1;j++){
                if(estudiantes [j].getNota() > estudiantes[j+1].getNota()){
                    cambio = true;
                    Estudiante aux = estudiantes[j];
                    estudiantes[j]= estudiantes[j+1];
                    estudiantes[j+1] = aux;
                    cambio = true;

                }
            }
            if (!cambio)
                break;
        }

    }
}
