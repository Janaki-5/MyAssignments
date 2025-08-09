package PositiveAndNegative;

public class MissingElement {
	  public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 7}; // Missing: 3, 5
        int n = 7; // range 1 to n

        System.out.print("Missing elements: ");
        for (int i = 1; i <= n; i++) {
            boolean found = false;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.print(i + " ");
            }
        }
    }
}
	    }
	}



