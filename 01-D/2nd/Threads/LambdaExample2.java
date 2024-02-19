import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaExample2 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Uday");
        stringList.add("Mithilesh");
        stringList.add("Aniketh");
        stringList.add("Pallavi");
        stringList.add("Pooja");

        Collections.sort(stringList, (str1, str2) -> str1.compareTo(str2));
        
        System.out.println("Sorted List:");
        for (String str : stringList) {
            System.out.println(str);
        }
    }
}

