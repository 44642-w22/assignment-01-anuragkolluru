package DSP;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Problem8 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter elements size:");
		int size=sc.nextInt();
		Deque<Integer> Q = new ArrayDeque<>();
		System.out.println("Enter elements:");
		for(int i=0;i<size;i++)
		{
			int elem = sc.nextInt();
			Q.add(elem);
		}
		List<Integer> A = getAlternativeSeq(Q);
		System.out.println(A);
	}
	
	public static List<Integer> getAlternativeSeq(Deque<Integer> Q){
		List<Integer> list = new ArrayList<>();
		while(!Q.isEmpty()) {
			list.add(Q.pollLast());
			if(!Q.isEmpty())
				list.add(Q.pollFirst());
		
		}
		return list;
	}
	


}
