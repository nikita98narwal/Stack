//bruteforce approach
package stack;

import java.util.Scanner;

public class StockSpanProblem {

	static void calculateSpan(int price[], int n, int span[]) {
		span[0] = 1;
		for(int i = 1; i < n; i++) {
			span[i] = 1;
			for(int j = i-1; j >= 0; j--) {
				if(price[i] >= price[j])
					span[i]++;
				else
					break;
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int priceLength = sc.nextInt();
		int price[] = new int[priceLength];
		int n = price.length;
		int span[] = new int[n];
		for(int i = 0; i < n; i++) {
			price[i] = sc.nextInt();
		}
		calculateSpan(price, n, span);
		for(int i = 0; i < n; i++) {
			System.out.print(span[i]+" ");
		}
		sc.close();
	}


}
