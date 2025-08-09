package PositiveAndNegative;

public class Fiboncciseries {
	public static void main(String[] args) {
		int n=7;
		int first=0,second=1;
		System.out.println("FiboniccSeries:");
		for(int i=1;i<=n;i++) {
			System.out.println(first+"");
			int next =first + second;
			first=second;
			second=next;
		}
			
			
		
	}

}
