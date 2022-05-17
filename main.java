/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
// 		public static void reverseArray(int arr[]){
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            for(int k=0; k<tc; k++){
                
                int size = sc.nextInt();
            int arr[] = new int[size];
            
            for(int i=0; i<size; i++){
                arr[i] = sc.nextInt();
            }
            for(int i=size-1; i>=0; i--){
		        System.out.print(arr[i] + " ");
		    }
		    System.out.println(" ");
            }
            
		  //  int start = 0;
		  //  int end = size-1;
		  //  int temp = 0;
		    
		  //  for(int i=start; i<end; i++){
		  //      temp = arr[start];
		  //      arr[start] = arr[end];
		  //      arr[end] = temp;
		        
		  //      start++;
		  //      end--;
		  //  }
		    
// 		}
	}
}