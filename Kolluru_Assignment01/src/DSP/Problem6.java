package DSP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Problem6 {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter no of elements");
		int size=s.nextInt();
		System.out.println("Enter elements");
		Stack<Integer> sck = new Stack<>();
		for(int i=0;i<size;i++) {
			int elem = s.nextInt();
			sck.push(elem);
		}
		List<Integer> l= getList(sck);
		System.out.println(l);
	}
	
	public static List<Integer> getList(Stack sck){
		List<Integer> list = new ArrayList<>();
		int size = sck.size();
		for(int i=0;i<size/2;i++) {
			list.add((Integer) sck.pop());
		}
		List<Integer> tList = new ArrayList<>();
		for(int i=size/2;i<size;i++) {
			tList.add((Integer) sck.pop());
		}
		Collections.reverse(tList);
		list.addAll(tList);
		return list;
	}
	
	

}
