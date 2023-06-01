package Arrays;

public class two_sum {
	public static boolean checksum(int arr[], int target)
	{
		int first_ptr=0;
		int second_ptr=arr.length-1;
		while(first_ptr<second_ptr)
		{
			if(arr[first_ptr]+arr[second_ptr]==target)
			{
				return true;
			}
			else if(arr[first_ptr]+arr[second_ptr]>target)
			{
				second_ptr--;
				
			}
			else
			{
				first_ptr++;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int target=19;
		if(checksum(arr, target))
		{
			System.out.println("present");
		}
		else
		{
			System.out.println("not present");
		}
		
		// TODO Auto-generated method stub

	}

}
