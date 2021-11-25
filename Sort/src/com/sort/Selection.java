package com.sort;

public class Selection {

	
       
    public static void main(String a[])
    
    { 
    	
    	SortAlgo b = new SortAlgo();
        int[] arr1 = {9,14,3,2,43,11,58,22};  
        System.out.println("Before Selection Sort");  
        for(int i:arr1){  
            System.out.print(i+" ");  
        }  
        System.out.println(); 
       
          
        b.selectionSort(arr1);
         
        System.out.println("After Selection Sort");  
        for(int i:arr1){  
            System.out.print(i+" ");  
        }  
    }  
}  
