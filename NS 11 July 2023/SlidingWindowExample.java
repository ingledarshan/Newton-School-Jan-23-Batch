// Suppose you have an array of integers and you want to find the maximum sum of 
// subarray of a fixed size 'k'.

class SlidingWindowExample
{
	static int findMaxSum(int []nums, int k)
	{
		int maxSum = 0;
		int currentSum = 0;

		// Calculate sum of first window of size 'k'
		for(int i=0; i<k; i++)
			currentSum += nums[i];
		maxSum = Math.max(maxSum, currentSum);
		// Slide the window and update the maximum sum
		for(int i=k; i<nums.length; i++)
		{
				currentSum += nums[i] - nums[i-k]; // Add the next element and subtract the first element of the previous window
				maxSum = Math.max(maxSum, currentSum);
		}
		return maxSum;
	}

	public static void main(String[] args) 
	{
		// int []nums = {1,3,2,4,5,7,6};
		int []nums = {9,8,7,6,5,4,3,2,1};
		int k = 3;
		int maxSum = findMaxSum(nums, k);
		System.out.println("Maximum sum of a subœarray of size " + k +" is: "+maxSum);
	}
}