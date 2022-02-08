package DSP;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Problem7 {
	
	public int problem7(Queue<String> Q) {
		String decNmbr = "";
		for (String bin : Q) {
			decNmbr += bin;
		}

		return Integer.parseInt(decNmbr, 2);
	}
	public static void main(String[] args) {
		System.out.println("7.------------------------");
		Problem7 obj = new Problem7();
		System.out.println("enter the Linked List size: ");
		Scanner sc = new Scanner(System.in);

		int e = sc.nextInt();

		Queue<String> Q1 = new LinkedList<>();
		System.out.println("enter the Linked List elements: ");

		for (int i = 0; i <= e; i++) {
			Q1.add(sc.nextLine());
		}

		System.out.println(obj.problem7(Q1));
	}

}
