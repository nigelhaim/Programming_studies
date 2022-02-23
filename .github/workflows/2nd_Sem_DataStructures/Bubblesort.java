public class Bubblesort
{
    public static void main(String[] args) 
    {
        int count = 0;
        int[] uns_arr = {5, 2, 8, 1, 3 ,6, 4 ,7};
        printer(uns_arr,count);
        Bubblesort(uns_arr, count);
        System.out.println();
    }

    public static int[] Bubblesort(int[] arr, int count)
    {
        for(int i = 0; i < arr.length - 1; i++)
        {
            for(int c = 0; c < arr.length - 1; c++)
            {
                int a = arr[c];
                int b = arr[c+1];
    
                if (a > b)
                {
                    arr[c] = b;
                    arr[c+1] = a;
                    count++;
                    printer(arr, count);//Sort tracker
                }
            }
        }
        return arr; 
    }

    public static void printer(int[] arr, int count)
    {
        if (count < 10)
        {
            System.out.print(count + " ");
        }
        else
        {
            System.out.print(count);
        }
        
        for(int i = 0; i < arr.length; i++)
        {
            int p = arr[i];
            System.out.print(" |" + p + "| ");
        }
        System.out.println();
    }
}