package Q1toQ10.one;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class duplicate {
    public static void main(String[] args) {
    ArrayList<String> list =new ArrayList<>();
    //from a list of number from 0-9
    for(int i=0;i<10;i++){
        list.add(String.valueOf(i));
    }
    //insert a new set of number from 0-5
    for(int i=0;i<5;i++){
        list.add(String.valueOf(i));
    }
    System.out.println("Input list: " +list);
    System.out.println("\nFilter duplicate:"+processList(list));
}
    public static Set<String> processList(List<String> listContainingDuplicates){
        final Set<String> result =new HashSet<String>();
        final Set<String> temSet=new HashSet<String>();
        for (String yourInt:listContainingDuplicates){
            if(!temSet.add(yourInt)){
                result.add(yourInt);
            }
        }
        return result;
    }

}
