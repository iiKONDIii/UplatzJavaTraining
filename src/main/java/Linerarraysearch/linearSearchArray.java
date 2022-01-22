//Program using linear search on arrays. This is a 2d array. 2D arrays are used to store information in one place and the
//retrieve it from another
package Linerarraysearch;
import java.util.Scanner;
public class linearSearchArray {

    public static void main(String[] args) {
        System.out.println("Please enter in the size of the array");
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int [] arr = new int[size];

        System.out.println("Enter in the values of which you want to store within the array");

        for ( int i = 0 ; i < size; i++){

            //System.out.println(i); //this then prints out the size of the array
            arr[i] = sc.nextInt(); // this allows the users to store the integers they wish within the array which can be viewed at a later time
        }
        System.out.println("Enter element to be searched");

        int search_num = sc.nextInt();

        for (int j = 0; j < size; j++){

            if (arr[j] == search_num){
                j=j+1;
                System.out.println("Element "+ search_num +" has been found at "+j+" st/nd/rd/th position");
                System.exit(0);
            }

        }
        System.out.println("Number not found");


    }
}
