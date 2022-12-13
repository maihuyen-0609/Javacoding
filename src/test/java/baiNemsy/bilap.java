package baiNemsy;

import java.lang.reflect.Array;
import java.util.*;

public class bilap {
    public static void main(String[] args) {
        String chuoi = "jdfgdhjragk";
        String[] arr=chuoi.split("");
        int[][] chuoi1 = new int[0][];
        for (int i=0;i<arr.length;i++){
            if(Arrays.asList(chuoi1).contains(arr[i])){
                chuoi1[i][arr.length] += 1;
            }else {
                System.out.println(chuoi1);
            }
            }
        }

    }


