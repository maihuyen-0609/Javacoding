package Q1toQ10.two;

import java.util.Arrays;

public class sort {
    public static void main(String[] args) {
        String[] inputList={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        //dipslay input un-sort list
        System.out.println(inputList);
        showlist(inputList);
        //call to sort the input list
        Arrays.sort(inputList);
        //display sort list
        System.out.println(inputList);
        showlist(inputList);
        Arrays.sort(inputList,String.CASE_INSENSITIVE_ORDER);
        showlist(inputList);
    }
    public static void showlist(String[] array){
        for (String str:array){
            System.out.println(str);
        }
        System.out.println();
    }
}
