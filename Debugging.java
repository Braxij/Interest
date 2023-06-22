package debug;

import java.util.Scanner;

public class Debugging {
    String name = "Debugging";

    public static void main(String[] args){
        int array[] = new int[4];
        Debugging bug = new Debugging();
        System.out.println("--------" + bug);
        System.out.println("Hello everyone!");
        System.out.println("welcome to my program!");

        bug.readValues(array);
        bug.printMax(array);
        System.out.println("array[0]: " + array[0]);
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        System.out.println("5");
        System.out.println("6");
    }

    public void readValues(int array[]) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++){
            System.out.println("please enter number: " + (i+1) + "/" + array.length);
            array[i] = sc.nextInt();
        }
        sc.close();
    }
   
    public void printMax(int array[]) {
        int max = array[0];
        for (int i = 0; i < array.length; i++){
            if (max < array[i]){
                max = array[i];
            }
        }
        System.out.println("The largest number is: " + max);
    }
}
