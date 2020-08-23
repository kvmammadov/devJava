package com.mycompany.arrays;

public class arrays {

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9,10,11,12};
        
        System.out.println("Array before: ");

       for(int num : arr)
        {
            System.out.print(num + " ");
        }

        for (int i = 0, j = arr.length - 1; i < arr.length / 2; i++, j--) {
            int temp; 
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        
        System.out.println();
        System.out.println("Array after: ");
        
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }

        for(int num : arr)
        {
            System.out.print(num + " ");
        }
            
    }

}
