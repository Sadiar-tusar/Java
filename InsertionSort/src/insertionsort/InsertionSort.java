package insertionsort;

import java.util.Arrays;

public class InsertionSort {
    
    public static void main(String[] args) {
        
        int[] list = {2, 9, 5, 4, 8, 1, 6};
//      InsertionSort.insertionSort(list);
//        System.out.println(Arrays.toString(list));

        bubbleSort(list);
        System.out.println(Arrays.toString(list));
        
    }
    
    public static void insertionSort(int[] list) {
        
        for (int i = 1; i < list.length; i++) {
            
            int currentElement = list[i];
            int k;
            
            for (k = i - 1; k >= 0 && list[k] > currentElement; k--) {
                
                list[k + 1] = list[k];
            }
            list[k + 1] = currentElement;
            
        }
        
    }
    
    public static void bubbleSort(int[] list) {
        
//        boolean needNextPass = true;
        for (int i = 1; i < list.length ; i++) {
            
//            needNextPass = false;
            
            for (int k = 0; k < list.length - i; k++) {
                if (list[k] > list[k + 1]) {
                    
                    int temp = list[k];
                    list[k] = list[k + 1];
                    list[k + 1] = temp;
                    
//                    needNextPass = true;
                }
                
            }
            
        }
        
    }
    
    public static void heapSort(int[] lost){
    
        for(int i=0; i< lost.length; i++){
        
           
        }
    }
    
}
