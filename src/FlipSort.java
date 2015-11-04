
import java.util.Scanner;

public class FlipSort
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		while (input.hasNext())
		{
			int size = input.nextInt();

			int[] numbers = new int[size];
			for (int i = 0; i < size; i++)
			{
				numbers[i]=input.nextInt();
			}
			
			flipSort(numbers);
			
		}
	}

	public static void flipSort(int[] numbers)
	{
		int flipNum = 0;
		int size = numbers.length;
		for (int i = 0; i < size; i++)
		{
			for (int j = 0; j < (size - i -1); j++)
			{
				if (numbers[j] > numbers[j + 1])
				{
					int tmp = numbers[j+1];
					numbers[j+1]=numbers[j];
					numbers[j]=tmp;
					flipNum++;
				}
			}
		}
		System.out.printf("Minimum exchange operations : %d\n",flipNum);
	}

}
