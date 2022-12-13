package Q1toQ10.five;

public class twomaxvalue {
    public void GetTwoMaxValue(int[] nums){
        int maxOne=0;
        int maxTwo=0;
        for(int n:nums){
            if(maxOne<n){
                maxTwo=maxOne;
                maxOne=n;
            }else if (maxTwo<n){
                maxTwo=n;
            }
        }
        System.out.println("Max1"+maxOne);
        System.out.println("Max2"+maxTwo);
    }

    public static void main(String[] args) {
        int list[]={15,78,89,90,30,45,22};
        twomaxvalue max=new twomaxvalue();
        max.GetTwoMaxValue(list);
    }
}
