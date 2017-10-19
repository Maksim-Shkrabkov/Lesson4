
public class Task2 {

	public static void main(String[] args) {
		
		//All elements of the array divide by the value of the largest element of this array.
		
		int[] array = {567, 1205, 122, 123, 124, 128};
		
		int max = array[0];
		
		for (int i = 0; i < array.length; i++) {
			
			if(max < array[i]) {
				max = array[i];
			}
		}
			
		System.out.println("Максимальный элемент в массиве: " + max);
		
		for (int i = 0; i < array.length; i++) {
			
			double divideEachElement = (double) array[i] / max;
			
			System.out.print(divideEachElement + " ");
			
		}
		

	}

}
