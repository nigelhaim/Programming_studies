import java.util.*;
public class Arraycompare
{
	public static void main(String[] args) {
		int[] arr_1 = {5, 2, 8, 1, 3 ,6, 4 ,7};
		//int[] arr_2 = {1, 2, 3, 4, 5, 6, 7, 8};
		int[] arr_2 = {5, 2, 8, 1, 3 ,6, 4 ,7};

		if (Arrays.equals(arr_1, arr_2))
		{
			System.out.println("True");
		}

		else
		{
			System.out.println("false");
		}
	}
}