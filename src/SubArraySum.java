package stringsQuestions;

public class SubArraySum {
	
	
		    public static void main(String[] args) {
		    	
		        int[] array = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		        System.out.println("Maximum subarray sum: " + maxSubarraySum(array));
		        
		    }
		    

		    public static int maxSubarraySum(int[] array) {
		    	
		        int maxSum = Integer.MIN_VALUE, currentSum = 0;
		        
		        for (int num : array) {
		            currentSum = Math.max(num, currentSum + num);
		            maxSum = Math.max(maxSum, currentSum);
		        }
		        return maxSum;
	  }
		

}

