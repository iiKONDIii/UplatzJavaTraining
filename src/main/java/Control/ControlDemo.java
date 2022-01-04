package Control;

import java.util.Scanner;

public class ControlDemo {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How old are you?");
        int age = sc.nextInt();
        if (age < 18){
            System.out.println("You cannot vote");
        }
        else {
            System.out.println("Vote!");
        }

    }


}