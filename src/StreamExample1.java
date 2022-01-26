import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(5);
		l.add(10);
		l.add(15);
		l.add(20);
		l.add(25);
		l.add(30);
		System.out.println(l);
		List<Integer> l2= l.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(l2);
		
		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(5);
		marks.add(10);
		marks.add(15);
		marks.add(20);
		marks.add(25);
		marks.add(30);
		
		System.out.println(marks);
		List<Integer> updatedmarks= marks.stream().map(i->i+5).collect(Collectors.toList());
		System.out.println(updatedmarks);
		
		long noofstudent = marks.stream().filter(m->m>35).count();
		System.out.println(noofstudent);
		
		List<Integer> ll = marks.stream().sorted().collect(Collectors.toList());
		System.out.println(ll);
		
		List<Integer> ll2 = marks.stream().sorted((i1,i2)->(i1<i2)?1:(i1>i2)?-1:0).collect(Collectors.toList());
		System.out.println(ll2);
		
		List<Integer> ll3 = marks.stream().sorted((i1,i2)->(i1>i2)?-1:(i1<i2)?1:0).collect(Collectors.toList());
		System.out.println(ll3);
		
		Integer min = l.stream().min((i1,i2)->i1.compareTo(i2)).get();
		System.out.println("minimum value :");
		System.out.println(min);
		Integer max = l.stream().max((i1,i2)->i1.compareTo(i2)).get();
		System.out.println("maximum value");
		System.out.println(max);
		l.stream().forEach(System.out::println);
		Function<Integer, Void> f = i-> {
			System.out.println((i*i));
			return null;
		};
		Consumer<Integer> c =i->{
			System.out.println(i*i);
		};
		l.stream().forEach(c);
		
		ArrayList<String> str = new ArrayList<String>();
		str.add("akshay");
		str.add("aki");
		str.add("xyz");
		str.add("prakesh");
		str.add("fruti");
		System.out.println(str);
		
//		Comparator<String> c = (s11,s22)->{
//			
//			int l1 = s11.length();
//			int l2 = s22.length();
//			if(l1<l2) return -1;
//			else if(l1>l2) return +1;
//			else return s11.compareTo(s22);
//		};
//		
//		List<String> ll22 = str.stream().sorted(c).collect(Collectors.toList());
//		System.out.println(ll22);
		
		List<String> ll223 = str.stream().sorted().collect(Collectors.toList());
		System.out.println(ll223);
		
		long strcount = str.stream().count();
		System.out.println(strcount);
		
		str.stream().forEach(System.out::println);
		
		Integer[] i = l.stream().toArray(Integer[]::new);
		for(Integer i1 : i) {
			System.out.println(i1);
		}
		
		Stream.of(i).forEach(System.out::println);
		
		Stream s = Stream.of(1,11,111,1111,11111);
		s.forEach(System.out::println);
		
		Stream ss = Stream.of(1,11,111,1111,11111);
		ss.forEach(System.out::println);
		
		Integer[] ii = {10,20,30,40,50};
		Stream.of(ii).forEach(System.out::println);
	}

}
