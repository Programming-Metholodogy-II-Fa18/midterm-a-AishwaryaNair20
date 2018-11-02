import java.util.Arrays;

public class main {

	public static void main(String[] args) {
		
		int[] x = { 15, 9, 60, 44, 12, 1, 4};
		
		x = mergeSort(x, 0, x.length-1);
		
		System.out.println(Arrays.toString(x));

	}
	
	private static int[] mergeSort(int[] arr, int start, int end)
	{
		if(arr.length==1)
			return arr;
		
		if(start >= end)
			return arr;
		
		int midInd = (start + end)/2;
		
		mergeSort(arr, start, midInd);
		mergeSort(arr, midInd+1, end);
		
		int leftInd = start;
		int rightInd = midInd+1;
		
		while(leftInd <= midInd && rightInd <= end)
		{
			if(arr[leftInd] <= arr[rightInd])
				leftInd++;
			
			else
			{
				int temp = arr[rightInd];
				
				System.arraycopy(arr, leftInd, arr, leftInd+1, rightInd-leftInd);
				
				arr[leftInd] = temp;
				
				leftInd++;
				rightInd++;
				midInd++;
				
			}
			
		}
		
		return arr;
		
			
	}
	

}
