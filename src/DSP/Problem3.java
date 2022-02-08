package DSP;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem3 {
	
	public Integer problem3(ArrayList<Integer> l) {
		int maximum = Integer.MIN_VALUE;
		for (int i = 0; i < l.size(); i++) {
			if (l.get(i) >= maximum) {
				maximum = l.get(i);
			}
		}
		return maximum;
	}
	
	public static void main(String[] args) {
		Problem3 obj = new Problem3();
		System.out.println("3.-------------------------");
		System.out.println("enter the arraylist size:");
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		ArrayList<Integer> L3 = new ArrayList<>();
		System.out.println("enter the arraylist integers:");

		for (int i = 0; i < b; i++) {
			L3.add(sc.nextInt());
		}
		System.out.println(obj.problem3(L3));
	}

}
