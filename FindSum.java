package AlgoEff;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindSum {

	public static void main(String[] args) {
	   int[] list = { -8, 1, 2, 3, 5, 7};
       int sum = 12;
       System.out.println( hasPair_BruteForce(list, sum));
	}
    public static boolean hasPair_BruteForce(int[] list, int sum) {
    	//O(n^2)
    	for(int i =0; i<list.length; i++) {
    		for(int j = i+1; j<list.length; j++) {
    			if (list[i] + list[j] == sum) {
    				return true;
    			}
    		}
    	}
    	return false;
    }
    
    public static boolean hasPair_BinarySearch(int[] list, int sum) {
    	//O(n*log(n))
     	for(int i =0; i<list.length; i++) {
    		if (BinarySearch.binarySearch(list, sum-list[i])>0) {
    			return true;
    		}
     	}
    	return false;
    }
    
    public boolean hasPair_FromBothEnds(int[] list, int sum) {
    	//O(n)
    	int lastIndex = list.length -1;
    	int firstIndex = 0;
    	while(lastIndex>firstIndex) {
    		int currSum = list[lastIndex] + list[firstIndex];
    		if(currSum> sum) {
    			lastIndex --;
    		} else if(currSum < sum) {
    			firstIndex ++;
    		}else {
    			return true;
    		}
    		
    	}
    	
    	return false;
    }
     
    public boolean hasPair_HashSet(int[] list, int sum) {
    	//O(n)
    	Set<Integer> rests = new HashSet<Integer>();
    	for(int i=0; i<list.length; i++) {
    		if(rests.contains(list[i])) {
    			return true;
    		}
    		rests.add(sum - list[i]);
    	}
    	return false;
    }
    
    
}