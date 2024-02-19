import java.util.*;

public class HashSet1
{
	public static void main(String[] args)
	{
		HashSet<String> hashset=new HashSet<>();
		
		hashset.add("A");
		hashset.add("B");
		hashset.add("C");
		hashset.add("C");// This element is not added because no duplicates are allowed
		
		System.out.println(hashset);
		
		//We can check wheather the value is present in set or not by .contains("")
		System.out.println("Does set contain B or not ?"+hashset.contains("B"));
		
		System.out.println("Removing A from set:");
		hashset.remove("A");
		System.out.println("hashset after removing A "+hashset);
		
	}
}	