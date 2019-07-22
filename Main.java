package ivan.samoylov;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println(stringDifference("asdf", "qwerty"));
        System.out.println(stringDifference("abb", "bba"));
        System.out.println(stringDifference("abc", "dca"));
        System.out.println(stringDifference("aaa", "fga"));
        System.out.println(stringDifference("abc", "dfg"));
    }

    public  static int stringDifference(String a, String b){
        Set<String> setA = new HashSet<String>();
        Set<String> setB = new HashSet<String>();

        if(a.length() != b.length()){
          return -1;
        }
        for (int i: a.toCharArray()) {
            setA.add(String.valueOf(i));
        }
        for (int i: b.toCharArray()) {
            setB.add(String.valueOf(i));
        }
        if(setA.equals(setB)){
            return 0;
        }
        if(setA.size() >= setB.size()){
            setA.removeAll(setB);
            return setA.size();
        }
        else {
            setB.removeAll(setA);
            return setB.size();
        }
    }
}
