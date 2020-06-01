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
	public static void findMax(int[] arry) {    
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
	
	public static void odd() {
		int[] odd = oddArray();
		for(int i : odd) {
			System.out.print(i + ", ");
		}
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
	
	//for sorting
	public static int[] sort(int[] array) {
		int temp;
		for(int i = 1 ; i < array.length; i++) {
			for(int j = i ; j < array.length ; j++) {
				if(array[i-1] >  array[j]) {
				temp = array[i-1] ;
				array[i-1] = array[j];
				array[j] = temp;
				}
			
			}
		
		}
		return array;
	}
	
	public static int min(int[] array) {
		int[] sorted = sort(array);
		return sorted[0];		
	}
	
	public static int max(int[] array) {
		int[] sorted = sort(array);
		return sorted[sorted.length - 1];		
	}
	
	public static int average(int[] array) {
		int avg = 0;
		for(int num : array) {
			avg += num;
		}
		avg = avg/array.length;
		return avg;
	}
	
	public static void minMaxAverage(int[] array) {
		System.out.println("the min is " + min(array));
		System.out.println("the max is " + max(array));
		System.out.println("the average is " + average(array));
		
	}
	
	

}
