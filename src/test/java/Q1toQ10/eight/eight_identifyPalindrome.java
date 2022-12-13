package Q1toQ10.eight;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class eight_identifyPalindrome {
    public static void main(String[] args) {
        try{
            BufferedReader object=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input number");
            int inputValue=Integer.parseInt(object.readLine());
            int n = inputValue;
            int rev=0;
            System.out.println("input value is");
            System.out.println(""+inputValue);
            if(n<10){
                if(checkPrime(n)){
                    System.out.println("input value "+n+" is a palindrome");
                }else {
                    System.out.println("input value "+n+" is not a palindrome");
                }
            }else {
                for (int i = 0; i <= inputValue; i++) {
                    int r = inputValue % 10;
                    inputValue = inputValue / 10;
                    rev = rev * 10 + r;
                    i = 0;
                }
                System.out.println("Post reversal" + "");
                System.out.println(rev);
                if (n == rev) {
                    System.out.println("input value is a palindrome");
                } else {
                    System.out.println("input value is not a palindrome");
                }
            }
        }catch (Exception e){
            System.out.println("out of range");
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
}}
