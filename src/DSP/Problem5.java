package DSP;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.Stack;

public class Problem5 {
	
	public boolean problem5(String s) {
		Deque<Character> obj = new ArrayDeque<Character>();

		for (int i = 0; i < s.length(); i++) {
			char x = s.charAt(i);

			if (x == '(' || x == '[' || x == '{') {
				obj.push(x);
				continue;
			}

			if (obj.isEmpty())
				return false;
			char y;
			switch (x) {
			case ')':
				y = obj.pop();
				if (y == '{' || y == '[')
					return false;
				break;

			case '}':
				y = obj.pop();
				if (y == '(' || y == '[')
					return false;
				break;

			case ']':
				y = obj.pop();
				if (y == '(' || y == '{')
					return false;
				break;
			}
		}

		// Check Empty Stack
		return (obj.isEmpty());
	}
	
	public static void main(String[] args) {
		Problem5 obj = new Problem5();
		System.out.println("5.--------------------------");
		System.out.println("enter the pattern: ");
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		

		System.out.println(obj.problem5(str));

		Stack<Integer> S1 = new Stack<>();
	}

}
