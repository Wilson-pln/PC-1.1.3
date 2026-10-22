#PC 1.1.2
Metodo de Insercion
![alt text](image-1.png)

Codigo![alt text](image-2.png)

#Explicacion
Se logro hacer el codigo mediante el metodo d insercion que va cambiando la posicion de los numeros mediante comparaciones de que si es mayor el numero i al q se esta comparando j y ese numero se cambia y la j se guarda en key y se mantiene ahi hasta q alcance el limeite maximo osea al final de la comparacion y con el if se ve q no sea igual a la i para q no haya error yu en la app se imprime llamando al metodo e imprimiendo el arreglo original con una copia osea la d..

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
        