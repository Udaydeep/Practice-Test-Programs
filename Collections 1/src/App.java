import java.util.ArrayList;
import java.util.List;


public class App {
	public static void main(String args[])
	{
		ArrayList<Integer> numbers = new ArrayList<Integer>(50);
		numbers.add(10);
		numbers.add(100);
		numbers.add(40);
		//List<Integer>list=new ArrayList<Integer>();
		
		
		
		System.out.println(numbers.get(0));
		
		for(int i=0; i<numbers.size();i++)
		{
			System.out.println(numbers.get(i));
		}
		
	}

}
