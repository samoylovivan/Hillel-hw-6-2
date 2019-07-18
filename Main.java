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
        Set<String> SetA = new HashSet<String>();
        Set<String> SetB = new HashSet<String>();

        if(a.length() != b.length()){
          return -1;
        }
        for (int i: a.toCharArray()) {
            SetA.add(String.valueOf(i));
        }
        for (int i: b.toCharArray()) {
            SetB.add(String.valueOf(i));
        }
        if(SetA.equals(SetB)){
            return 0;
        }
        if(SetA.size() >= SetB.size()){
            SetA.removeAll(SetB);
            return SetA.size();
        }
        else {
            SetB.removeAll(SetA);
            return SetB.size();
        }
    }
}
