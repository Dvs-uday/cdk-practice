import java.util.*;

public class TreeSet1
{
	public static void main(String[] args)
	{
		TreeSet<String> treeset=new TreeSet<>();
		
		treeset.add("B");
		treeset.add("A");
		treeset.add("D");
		treeset.add("C");
		treeset.add("C");
		System.out.println(treeset);
		
		//We can check wheather the value is present in set or not by .contains("")
		System.out.println("Does set contain B or not ?"+treeset.contains("B"));
		
		System.out.println("Removing D from set:");
		treeset.remove("D");
		System.out.println("hashset after removing D "+treeset);
		
	}
}	