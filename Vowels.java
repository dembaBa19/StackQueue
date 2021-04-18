package StackQueue;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Vowels {

	public static void main(String[] args) throws IOException {
		int vowels = 0;
		int consonants = 0;
		
		Character[] a = { 'a', 'o', 'e', 'u', 'i' };
		Set<Character> set = new HashSet<Character>(Arrays.asList(a));
		File file = new File("textText.txt");
		file.createNewFile();
		FileReader reader = new FileReader(file);

		int len = (int) file.length();
		char[] arr = new char[len];
		reader.read(arr);
		reader.close();
		
		String str = String.valueOf(arr);
		str = str.toLowerCase();
		arr = str.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 'a' && arr[i] <= 'z') {
				if (set.contains(arr[i])) {
					vowels++;
				} else {
					consonants++;
				}
			}
		}
		System.out.println(vowels + " vowels");
		System.out.println(consonants + " consonants");
		}

}
