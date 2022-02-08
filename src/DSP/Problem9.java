package DSP;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.List;

public class Problem9 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of elements");
		int size=s.nextInt();
		Queue<Integer> Q = new ArrayDeque<>();
		System.out.println("Enter elements");
		for(int i=0;i<size;i++) {
			int elem = s.nextInt();
			Q.add(elem);
		}
		List<Integer> l = getEvenOdd(Q);
		System.out.println(l);
	}
	
	public static List<Integer> getEvenOdd(Queue<Integer> Q){
		Queue<Integer> eList = new LinkedList<>();
		Queue<Integer> oList = new LinkedList<>();
		while(!Q.isEmpty()) {
			int elem = Q.poll();
			if(elem%2==0) {
				eList.add(elem);
			}else {
				oList.add(elem);
			}
		
		}
	    List<Integer> list = new ArrayList<>();
	    while(!eList.isEmpty() || !oList.isEmpty()) {
	    	if(!eList.isEmpty()) {
	    		list.add(eList.poll());
	    	}
	    	if(!oList.isEmpty()) {
	    		list.add(oList.poll());
	    	}
	    }
		return list;
	}
}
