package Arrays;

public class two_sum {
	
	/* TWO VARIANTS: 
	 * 1. RETURN TRUE/FALSE
	   2. to return the index of both the elements.
	   
	link:https://takeuforward.org/data-structure/two-sum-check-if-a-pair-with-given-sum-exists-in-array/
		
		brute-force approach:
		running 2 for loops --> (n**2, 1) even if the array is not sorted works in N**2.
	
		better approach:
		if the array is not sorted , sort the array and use 2 pointers, (NlogN,1).
		OR
		use hashmap and push the value along with the index (N,N)
	
		**public static String twoSum(int n, int []arr, int target) {
	        HashMap<Integer, Integer> mpp = new HashMap<>();
	        for (int i = 0; i < n; i++) {
	            int num = arr[i];
	            int moreNeeded = target - num;
	            if (mpp.containsKey(moreNeeded)) {
	                return "YES";
	            }
	
	            mpp.put(arr[i], i);
	        }
	        return "NO";
	    }

		**2nd approach:
		
		public static int[] twoSum(int n, int []arr, int target) {
        int[] ans = new int[2];
        ans[0] = ans[1] = -1;
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int num = arr[i];
            int moreNeeded = target - num;
            if (mpp.containsKey(moreNeeded)) {
                ans[0] = mpp.get(moreNeeded);
                ans[1] = i;
                return ans;
            }

            mpp.put(arr[i], i);
        }
        return ans;
    }
		
		**Optimal--approach
		If the array is sorted, use 2 pointers, (N,1)
	*/
	
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
