
public class Task5 {

	public static void main(String[] args) {
		// Find the maximum element for each column of matrices
		// Create massive
		
		int[] [] arr = {
				{1, 2, 3},
					{4, 5, 6},
						{7, 8, 9},
							{10, 11 , 12}
				 
		};
		
		// Find max element
		
		int max;
		
		for(int i = 0; i < arr[i].length; i++) {
			
			max = arr[0][i];
			
			for(int j = 0; j < arr.length; j++) {
				
				if(max < arr[j][i]) {
					max = arr[j][i];
				}
					
			}
			
			System.out.println(max + " max element in column");
		}

	}

}
