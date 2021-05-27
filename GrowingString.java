package AlgoEff;
import java.util.*;

public class GrowingString {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		sc.close();
		LinkedList <Character> max = new LinkedList<>();
		//O(n^2)
		for (int i = 0; i < str.length(); i++) {
			LinkedList <Character> list = new LinkedList<>();
			list.add(str.charAt(i));
			
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(j) > list.getLast()) {
					list.add(str.charAt(j));
				}
			}
			
			if (list.size() > max.size()) {
				max.clear();
				max.addAll(list);
			}
			list.clear();
		}
		
		System.out.println(max.toString());
	}
}