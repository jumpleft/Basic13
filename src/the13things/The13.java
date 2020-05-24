package the13things;

public class The13 {
	
	//print all the integers from 1 to 255
	public static void printIntegers() {
		for(long i = 1 ; i <= 255 ; i++) {
			System.out.print(i + ", ");
		}
	}
	
	//print all the integers from 1 to 255
	public static void printSumIntegers() {
		long sum = 0;
		for(long i = 1 ; i <= 255 ; i++) {
			
			System.out.println(sum + " + " + i + " = " + (sum + i));
			sum = sum + i;
		}
	}
	
	
	//find max assuming ints will be positive
	public static void max(int[] arry) {    
		int temp = 0;
			for(int i : arry) {
				if(i > temp) {
					temp = i;
				}
			}
			
		System.out.println(temp);	
	}
	
	public static int[] oddArray() {
		int[] array = new int[128];
		int count = 0;
		for(int i = 1 ; i <= 255 ; i++) {
			if(i%2 != 0) {
				array[count] = i;
				count++;
			}
		}
		return array;
	}
	
	
	public static void countPrintGreater(int y , int[] arry) {
		int count = 0;
		for(int i : arry) {
			if(i > y) {
				count++;
				System.out.println(i + " is greater than " + y);
			}			
		}
		System.out.println("Their are " + count + " numbers greater than " + y);
	}
	
	
	
	

}
