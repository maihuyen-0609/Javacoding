package Q1toQ10.four;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter am int value:");
        int input=scan.nextInt();
        if(checkPrime(input)){
            System.out.println("input value"+input+"is a prime number");
        }else {
            System.out.println("input value"+input+"is not a prime number");
        }
    }
    public static boolean checkPrime(int n){
        if(n<=1){
            return false;
        }
        for (int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
