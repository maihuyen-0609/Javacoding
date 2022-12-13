package Q1toQ10.ten;

public class invertString {
    public String invertwithStringBuffer(String str){
        StringBuffer buffer=new StringBuffer(str);
        buffer.reverse();
        return buffer.toString();
    }
    public  String invertwithoutStringBuffer(String str){
        int length=str.length();
        String original=str;
        String invert="";
        for(int i=length-1;i>=0;i--){
            invert=invert+original.charAt(i);
        }
        return invert;
    }

    public static void main(String[] args) {
        invertString invertStr=new invertString();
        System.out.println("Inverted String with StringBuffer class: "
                + invertStr.invertwithStringBuffer("987654321"));

        System.out.println("");

        System.out.println("Inverted String without StringBuffer class: "
                + invertStr.invertwithoutStringBuffer("kjihgfedcba"));
    }
}
