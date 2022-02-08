package DSP;

import java.util.LinkedList;
import java.util.Scanner;

public class Problem2 {
	
	public LinkedList<LinkedList<Integer>> problem2(LinkedList<Integer> L1, int K) {
		LinkedList<LinkedList<Integer>> objList = new LinkedList<LinkedList<Integer>>();

		for (int i = 0; i < L1.size(); i++) {
			LinkedList<Integer> list = new LinkedList<Integer>();

			if (i < L1.size() - 1) {
				int num1 = L1.get(i);
				int num2 = L1.get(i + 1);
				if ((num1 + num2) == K) {
					list.add(num1);
					list.add(num2);
					objList.add(list);
				}
			}
		}
		return objList;
	}
	public static void main(String[] args) {
		Problem2 obj = new Problem2();
		System.out.println("2.-------------------------");

		System.out.println("enter the size of linked list: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		LinkedList<Integer> L2 = new LinkedList<>();
		System.out.println("enter the  integer data of linked list: ");
		for (int i = 0; i < a; i++) {
			L2.add(sc.nextInt());
		}
		System.out.println("enter the number that array addition must be equal ");
		int x = sc.nextInt();
		System.out.println(obj.problem2(L2, x));
	}

}
