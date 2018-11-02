
public class binarySearch {

	public static void main(String[] args) {
		
		Data d = new Data();
		
		d.add(1);
		d.add(5);
		d.add(8);
		d.add(10);
		d.add(12);	
		d.add(14);
		d.add(18);
		d.add(20);
		d.add(33);
		d.add(41);
		
		ProblemThree(d, 8);
		ProblemThree(d, 33);
		
	}
	
	public static int ProblemThree(Data d, int val)
	{
		int start = 0;
		int end = 0;
		
		while(d.getValue(end) != -1)
		{
			end++;
		}
	
		int numCompares = 0;
		
		while(start <= end)
		{
			int mid = (start+end)/2;
			
			if(d.getValue(mid) == val)
			{	
				numCompares++;
				System.out.println("Numer of compares: " + numCompares);
				return mid;
			
			}
			
			if(d.getValue(mid) > val)
			{
				end = mid -1;
			}
			
			if(d.getValue(mid) < val)
			{
				start = mid + 1;
			}
			
			}
		
		return -1;
	}

}
