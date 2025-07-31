package DAY10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparableProgram {
	public static void main(String[] args) {
		Comparator<Integer> c = new Comparator<Integer>() {

			@Override
			public int compare(Integer i, Integer j) {
				// TODO Auto-generated method stub
				if (i > j)
					return 1;
				else
					return -1;
			}
		};
		ArrayList<Integer> num = new ArrayList();
		num.add(23);
		num.add(43);
		num.add(56);
		num.add(46);
		num.add(89);

		Collections.sort(num, c);
		System.out.println(num);
	}
}