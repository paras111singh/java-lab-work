import static java.lang.System.*;
import java.util.ArrayList;
import java.util.stream.Collectors;

import static java.lang.System.*;
import java.util.*;

public class SumOfEven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		ArrayList<Integer> al = new ArrayList<Integer>(); 
		out.println("Enter the number.");
		int num = sc.nextInt();
		for (int i = 0; i <= num; i++)
			al.add(i); 

		al.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		int res = al.stream().filter(i -> i % 2 == 0).reduce(0, (j, i) -> j + i);
		out.println("After adding even number upto " + num + " is " + res);
		sc.close();
	}
}