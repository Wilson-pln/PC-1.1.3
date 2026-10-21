public class InsertionSort {
    public void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++){
            int key = arr[i];
            int j = i - 1;
            while (j>=0 && arr[j] < key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
            if (j + 1 != i){
                System.out.println("El aux= " + key + " se inserta en pos  " + (j + 1));
            }

        }
    }
    
}
