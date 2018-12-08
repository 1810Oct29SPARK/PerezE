package work;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Problems {

	public static void main(String[] args) {
		int[] set = { 4, 6 };
		System.out.println(getSumOfMultiples(15,set));
	}

	public static int getSumOfMultiples(int i, int[] set) {
		List<Integer> vals = new ArrayList<Integer>();
		List<Integer> newVals = new ArrayList<Integer>();
		int[] arr = set;
		int num = arr.length;
		int ans = 0;
		for (int j=0; j<i; j++) {
			System.out.println("in for loop"+j);
			for (int k=0; k<num; k++) {
				System.out.println("in second for loop" +k);
				if (j%arr[k] == 0) {
					System.out.println(j+"and"+arr[k]);
					System.out.println("in if loop: div is"+j/arr[k]);
					vals.add(j);
				}
			}
		}
		System.out.println(vals);
		newVals = vals.stream().distinct().collect(Collectors.toList());
		for (int n=0; n<newVals.size(); n++) {
			ans += newVals.get(n);
		}
		return ans;
	}
}
