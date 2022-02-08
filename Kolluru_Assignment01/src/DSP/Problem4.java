package DSP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Problem4 {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter no of elements");
		int size=s.nextInt();
		List<String> L1= new ArrayList<>();
		System.out.println("Enter elements");
		for(int i=0;i<size;i++) 
		{
			String st = s.next();
			L1.add(st);
		}
		List<String> L2 = getSortedStrings(L1);
		System.out.println(L2);
	}
	public static List<String> getSortedStrings(List<String> L1){
		List<String> L2 = new ArrayList<>();
		for(int i=0;i<L1.size();i++) {
			L2.add(L1.get(i));
		}
		Collections.sort(L2,(a,b)->a.length()-b.length());
		return L2;
	}
	
	
}