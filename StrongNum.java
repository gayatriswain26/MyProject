package arraysprograms;

public class PerfectNum {
 public static int[] isPerfectNumber(int[] array) {
	        int sum = 0;
	        for (int i = 0; i < array.length; i++) {
	        	
	        	for(int j= 1; j<array[i];j++) {
	        
	            if (array[i] % j == 0) {
	                sum += j;
	            }
	        }
	        if(sum==array[i])	{
	        	System.out.print(array[i]+" ");
	        }
	        	
	        }
			return array;
	        
	        }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]={28,6};
		isPerfectNumber(array);
	
	}
	

}
