import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ShoeMaker
{
	static HashMap<Integer, Double> shoes = new HashMap<Integer, Double>();

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
				
		int cases = input.nextInt();
		for (int i = 0; i < cases; i++)
		{
		
			int numShoes = input.nextInt();
			int count=0;
			for (int j = 0; j < numShoes; j++)
			{
				int days = input.nextInt();
				int fine = input.nextInt();
				shoes.put(++count, (((double) fine) / days));
			}

			List<Map.Entry<Integer, Double>> list_Data = new ArrayList<Map.Entry<Integer, Double>>(shoes.entrySet());

			Collections.sort(list_Data, new Comparator<Map.Entry<Integer, Double>>()
			{
				public int compare(Map.Entry<Integer, Double> entry1, Map.Entry<Integer, Double> entry2)
				{
					if (Double.compare(entry1.getValue(), entry2.getValue())!=0)
					{
						if (entry2.getValue() - entry1.getValue() > 0)
							return 1;
						else
							return -1;
					}
					else
					{
						if (entry1.getKey() - entry2.getKey() > 0)
							return 1;
						else
							return -1;
					}
				}
			});
			Map.Entry<Integer, Double> entry = list_Data.get(0);
			System.out.print(entry.getKey());

			for (int k=1;k<list_Data.size();k++)
			{
				entry = list_Data.get(k);
				System.out.print(" "+entry.getKey());
			}
			System.out.println();
			if(i!=(cases-1))
				System.out.println();
		}
		
		

	}

	

}
