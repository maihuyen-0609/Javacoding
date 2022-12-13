package Q1toQ10.three;

public class invert {
   public long diInvert(long number){
       long invert =0;
       while (number!=0){
           invert=(invert*10)+(number%10);
           number=number/10;
       }
       return invert;
   }

    public static void main(String[] args) {
        long lnum=654321;
        invert input=new invert();
        System.out.println("input value"+lnum);
        System.out.println("invert value"+input.diInvert(lnum));
    }


}
