package DSP;

import java.util.LinkedList;
import java.util.Scanner;

public class Problem1 {
	public LinkedList<Integer> problem1(LinkedList<Integer> L1) {
		LinkedList<Integer> objList = new LinkedList<Integer>();
		int l = L1.size();
		for (int i = 0; i < l; i++) {
			int a = perfect(L1.get(i));
			if (a > 1) {
				objList.add(a);
			}
		}

		return objList;
	}

	static int perfect(int b) {
		if (b == 1)
			return 1;

		int count = 1;

		for (int i = 2; i < b; i++) {

			if (b % i == 0) {
				count += i;
			}

		}

		if (count == b)
			return b;

		return 0;
	}
public static void main(String[] args) {
	LinkedList<Integer> L1 = new LinkedList<>();
	System.out.println("1.-----------------------------");
	System.out.println("enter the integer inputs size: ");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	
	System.out.print("enter the number of integer inputs for perfect numbers: ");
	for (int i = 0; i < n; i++) {
		L1.add(sc.nextInt());
	}
	
	Problem1 obj = new Problem1();
	L1 = obj.problem1(L1);
	System.out.println(L1);
	System.out.println("");
	
}
}
