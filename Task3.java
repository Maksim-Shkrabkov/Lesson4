
public class Task3 {

	public static void main(String[] args) {
		
		// Create first array
		
		int[] arr = {-2, 3, -7, 5, 4, 5, 6, 7, -3, -3, -6};
		
		int count = 0;
			
		// Find the size of the second array
		
		for(int i = 2; i < arr.length; i+=2) {
			
			if(arr[i] > 0) {
				count++;
			}
			
		}
		
		// Create second array and fill elements from first array
		
		int[] arr2 = new int[count];
		
		int count2 = 0;
		
		for(int i = 2; i < arr.length; i+=2) {
			
			if(arr[i] > 0) {
				arr2[count2] = arr[i];
				count2++;
			}
			
		}
		
		System.out.println("Amount of positive elements in the array at even places: " + count);
		
		for (int a: arr2) {
			System.out.print(a + " ");
		}
		
		//Sum of squares of elements arr2 massive
		
		int sum = 0;
		
		for(int i = 0; i < arr2.length; i++) {
			
			  sum += Math.pow(arr2[i], 2);
			
		}
		
		System.out.println("Sum of squares of elements " + sum);
		
	}

}
