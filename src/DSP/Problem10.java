package DSP;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Problem10 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter no of characters:");
		int size=s.nextInt();
		Deque<Character> D = new ArrayDeque<>();
		System.out.println("Enter elements:");
		for(int i=0;i<size;i++) {
			char c = s.next().charAt(0);
			D.add(c);
		}
		System.out.println("Enter array size:");
		int arsize=s.nextInt();
		List<Integer> A = new ArrayList<>();
		System.out.println("Enter array elements:");
		for(int i=0;i<arsize;i++) {
			int elem = s.nextInt();
			A.add(elem);
		}
		
		String res = getDeque(D,A);
		System.out.println(res);
	}
	
	public static String getDeque(Deque<Character> D,List<Integer> A){
		char elem = '$';
		for(int i=0;i<A.size();i++) {
			if(A.get(i)==0) {;
				
				if(elem!='$')
				D.addFirst(elem);
			}
			if(A.get(i)==1 && !D.isEmpty())
			elem = D.pollFirst();
		}
		StringBuilder sb = new StringBuilder();
		while(!D.isEmpty()) {
			sb.append(D.poll());
		}
		return sb.toString();
	}

	}


