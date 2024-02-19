import java.util.*;
public class HashMap1{
public static void main(String[] args)
{
	HashMap<String,Integer> map= new HashMap<>(); // initialising map
	map.put("Person1 ",20); //puting values and keys
	map.put("Person2 ",50);
	map.put("Person3 ",70);
	
	System.out.println(map); //printing keys and values
	
	if(map.containsKey("Person1 ")) //checking wheather the key value is present or not
	{
		Integer data1=map.get("Person1 ");
		System.out.println("Data of person1 is :"+data1);
	}
	
	for(String i:map.keySet()) //iteration
	{
		System.out.println("For key value "+i+" the data is "+map.get(i));
	}
	
}
}