
import java.io.*;
import java.util.Scanner;
//import java.util.Arrays;
class Array {
    public static void main(String[] args) {
        //take input from user
        Scanner a = new Scanner(System.in);
        System.out.println("enter the size of the array:");
        int s, i;
        //read input
        s = a.nextInt();
        //array to hold elements
        int arr[] = new int[s];
        System.out.println("Enter the element of the array:");
        //it will check array elements
       for (i = 0; i < s; i++) {
          arr[i] = a.nextInt();
        }
        int c = 0;

        for (i = 0; i < c; i++) {
            if (arr[i] == 0) {
                c++;
            }
        }
        for (i = 0; i < c; i++) {
            arr[i] = 1;
        }
        System.out.println("After segregate array: ");
        for (i = 0; i < s; i++) {
            System.out.print(arr[i] + "");
        }
        a.close();
    }
}




   // static void printArr(int arr[], int n)
    //{
      //  System.out.println("Array After segregation :");
        //for (int i = 0; i < n; ++i)
          //  System.out.print(arr[i] + " ");
   // }

    //public static void main(String[] args)
    //{
      //  int arr[]  = new int[] { 1,1,0,1,0,0,1 };
        //int n = arr.length;
      //  Arrays.sort(arr);
      //  printArr(arr,n);
   // }
//}


