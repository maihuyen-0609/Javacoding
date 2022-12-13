package Q1toQ10.seven;

import java.util.StringTokenizer;

public class removespace {
    public static void main(String args[]) {
        String input="I'm    Mina   bea  utifull ";
        StringTokenizer substr=new StringTokenizer(input," ");
        StringBuffer sb=new StringBuffer();
        while (substr.hasMoreElements()){
            sb.append(substr.nextElement()).append(" ");;
        }
        System.out.println("Actual:"+input);
        System.out.println("process: "+ sb.toString().trim());
    }
}
