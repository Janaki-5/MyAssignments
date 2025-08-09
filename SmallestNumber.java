package PositiveAndNegative;

public class SmallestNumber {

	    public static void main(String[] args) {
	        int[] arr = {5, 8, 1, 4, 2};

	        // sort array
	        for (int i = 0; i < arr.length; i++) {
	            for (int j = i + 1; j < arr.length; j++) {
	                if (arr[i] > arr[j]) {
	                    int temp = arr[i];
	                    arr[i] = arr[j];
	                    arr[j] = temp;
	                }
	            }
	        }

	        System.out.println("Second smallest number: " + arr[1]);
	    }
	}


