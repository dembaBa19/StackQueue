package AlgoEff;
import java.util.*;

public class Substring {

	public static void main(String[] args) {
		// O(n)
		Scanner sc = new Scanner(System.in);
		
		System.out.println("String1 = ? ");
		String str1 = sc.nextLine();
		System.out.println("String2 = ? ");
		String str2 = sc.nextLine();
		
		sc.close();
		
		int index = -1;
		int count = 1;
		
		for (int i = 0; i < str1.length(); i ++) {
			if (str1.charAt(i) == str2.charAt(0) && count == 0) {
				index = i;
				count++;
			} else if (str1.charAt(i) == str2.charAt(count)) {
				count++;
			} else if (count != 0) {
				count = 0;
				index = -1;
				i--;
			}
			if (str2.length() == count) {
				break;
			}
		}
		
		if (count != str2.length()) {
			index = -1;
			count = 0;
		}
		
		if (index > -1) {
			System.out.println("YES; Index : " + index);
		} else {
			System.out.println("NO");
		}
		
	}

}