
public class Task6 {

	public static void main(String[] args) {
		
		// In a two-dimensional array of integers, 
		//determine how many times an element with an X value occurs in it.
		
		
		//Create massive
	
		int[] [] array = {
				{1, 2, 3},
					{4, 5, 6},
						{7, 8, 9},
							{10, 11 , 12},
								{7, 7, 7}
				 
		};
		
		// Find how many times the element X repeating
		
		int x = array[2][0];
		int count = 0;
		
		for(int i = 0; i < array.length; i++) {
			
			for(int j = 0; j < array[i].length; j++) {
				
				if(x == array[i][j])
					count++;
			}
			
		}
		
		System.out.println("Amount the element X repetition: " + count);
		
		
	}

}
