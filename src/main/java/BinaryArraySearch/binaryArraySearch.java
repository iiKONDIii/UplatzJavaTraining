// program using binary search
package BinaryArraySearch;
import java.util.*;
public class binaryArraySearch {
    public static void main(String[] args) {
        int[] arr = {23,54,645,435,663,254,22,14,632,64,30,50};

        int search_num = 23;

        Arrays.sort(arr);
        // this function sorts the array that has been initialised above

        for (int j : arr) {
            System.out.println(j);
            /*
            this works as it iterates through the array by using the array length to
            establish the amount of times it needs to count through the array
            */

        }

        int first = 0 ;
        int last = arr.length -1;
        int middle = (first + last)/2;

        while (first <= last){

            if (arr[middle] < search_num)
                first = middle +1;

            else if (arr[middle] == search_num)
            {
                System.out.println("Element has been found at location "+middle+" ("+search_num+")");
                System.exit(0);
            }
            else {

                last = middle -1 ;
            }

            middle =(first+last)/2;

        }
        System.out.println(" not found");


    }
}
/*
This is a project that shows me how to conduct a binary search,
this is something I want to do a bit more practise with as im not
sure if I fully understand the process
 */