import java.util.*;

public class TreeMap1
{
	public static void main(String[] args)
	{
		TreeMap<String,Integer> treemap=new TreeMap<>();
		
		treemap.put("A",100);
		treemap.put("D",300);
		treemap.put("C",150);
		treemap.put("B",200);
	
		System.out.println(treemap);
	
	}
}