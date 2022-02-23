import java.util.concurrent.CountDownLatch;

public class Merge_sort 
{
    public static void main(String[] args) 
    {
        int count = 0;
        int[] numbers = {5, 2, 8, 1, 3 ,6, 4 ,7};
    
        System.out.println("Before:");
        printer(numbers, count);
    
        mergeSort(numbers, count); 
       
    }  

    private static void mergeSort(int[] inputArray, int count) {
        int inputLength = inputArray.length;
        
        if (inputLength < 2) {
          return;
        }
        
        int midIndex = inputLength / 2;
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[inputLength - midIndex];
        
        for (int i = 0; i < midIndex; i++) {
          leftHalf[i] = inputArray[i];
        }
        for (int i = midIndex; i < inputLength; i++) {
          rightHalf[i - midIndex] = inputArray[i];
        }

        
        mergeSort(leftHalf, count);
        mergeSort(rightHalf, count);

        merge(inputArray, leftHalf, rightHalf, count);
      }
    
      private static void merge (int[] inputArray, int[] leftHalf, int[] rightHalf, int count) {
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;
        
        int i = 0, j = 0, k = 0;
        while (i < leftSize && j < rightSize) {
          if (leftHalf[i] <= rightHalf[j]) {
            inputArray[k] = leftHalf[i];
            i++;
          }
          else {
            inputArray[k] = rightHalf[j];
            j++;
          }
          k++;
        }
        
        while (i < leftSize) {
          inputArray[k] = leftHalf[i];
          i++;
          k++;
        }
        
        while (j < rightSize) {
          inputArray[k] = rightHalf[j];
          j++;
          k++;
        }
        
      }
    

    public static void printer(int[] arr, int count)
    {
        /*if (count < 10)
        {
            System.out.print(count + " ");
        }
        else
        {
            System.out.print(count);
        }*/
        
        for(int i = 0; i < arr.length; i++)
        {
            int p = arr[i];
            System.out.print(" |" + p + "| ");
        }
        System.out.println();
    }
}
