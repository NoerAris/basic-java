package main;

import java.util.ArrayList;
import java.util.List;

public class Recursion {

	public static void main(String[] args) {
		//Looping hingga value b = 0 dengan melakukan operasi a modulus b
		
		loop(1071, 1029);
	}

	static void loop(int a, int b) {
		int x = 0;

		List<Integer> y = new ArrayList<Integer>();
		y.add(a);
		while(b != 0) {
			y.add(b);
			b = y.get(x) % b;
			x++;
		}
		System.out.println(y.get(y.size() - 1));
	}
	
}
