
public class Task1 {

	public static void main(String[] args) {
		
		//In the array find the minimum and maximum elements and swap them.
		
		int[] arr = {1, 0, 3, 4, 5, 6, 7, 8};
		
		for (int a: arr) {
			System.out.print(a + " ");
		}
		
		int max = 1;
		int min = 1;
		
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i] > arr[max]) {
				max = i;
			}
			
			if (arr[i] < arr[min]) {
				min = i;
			}
			
		}
			
		int buffer = arr[max];
		arr[max] = arr[min];
		arr[min] = buffer;
		
		for (int a: arr) {
			System.out.print(a + " ");
		}
	}
	
}
