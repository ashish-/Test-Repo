package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparators {

	public static void main(String[] args) {
		
		List<String> l = new ArrayList<String>();
		l.add("54");
		l.add("546");
		l.add("548");
		l.add("60");
		
		System.out.println(l);
		
		Collections.sort(l, new Comparator<String>() {

			@Override
			public int compare(String x, String y) {
				// TODO Auto-generated method stub
				String xy = x.concat(y);
				String yx =y.concat(x);
				
				return xy.compareTo(yx) > 0 ?1:0;
			}
			
		});
		System.out.println(l);
	}
}
