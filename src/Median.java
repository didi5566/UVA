import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Median
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> numList = new ArrayList<Integer>();
		while(input.hasNext())
		{
			
			numList.add(input.nextInt());
			Collections.sort(numList);
			if((numList.size()%2)==1)
			{
				int meanIndex = (numList.size()/2);
				System.out.println(numList.get(meanIndex));
			}
			else
			{
				int meanIndex1 = (numList.size()/2)-1;
				int meanIndex2 = (numList.size()/2);
				System.out.println((numList.get(meanIndex1)
						+numList.get(meanIndex2))/2);
			}
			
		}
	}

}
