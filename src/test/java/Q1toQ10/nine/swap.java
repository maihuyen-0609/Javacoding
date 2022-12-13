package Q1toQ10.nine;

import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter numX: ");
        System.out.println("Enter numY: ");
int inputX=scan.nextInt();
int inputY=scan.nextInt();
        System.out.println("Pre-swap:");
        System.out.println("numX value: "+inputX);
        System.out.println("numY value: "+inputY);
        System.out.println("");
        inputX=inputX+inputY;
        inputY=inputX-inputY;
        inputX=inputX-inputY;
        System.out.println("Post-swap: ");
        System.out.println("numX value: "+inputX);
        System.out.println("numY value: "+inputY);
    }
}
