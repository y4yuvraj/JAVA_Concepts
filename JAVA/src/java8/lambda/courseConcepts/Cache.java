package java8.lambda.courseConcepts;

import java.util.Arrays;
import java.util.Comparator;

//interface
interface CacheIterator {
	boolean hasNext();

	Bookmark next();
}

//abstract class
//abstract class Test {
//	abstract void apply();
//}

//main class
public class Cache {
	private Bookmark[] items;
	private int next = 0;

	public Cache(int size) {
		items = new Bookmark[size];
	}

	public void add(Bookmark item) {
		if (next < items.length)
			items[next++] = item;
	}

	private class MyCacheIterator implements CacheIterator {
		private int i = 0;

		@Override
		public boolean hasNext() {
			return i < items.length;
		}

		@Override
		public Bookmark next() {
			return items[i++];
		}

	}

	public CacheIterator iterator() {
		return new MyCacheIterator();
	}

	public static void main(String[] args) {
		Cache recommendedItems = new Cache(5);

		Bookmark item1 = new Bookmark();
		item1.setId(2000);
		item1.setTitle("Use Final Liberally");
		item1.setRating(1.0);

		Bookmark item2 = new Bookmark();
		item2.setId(2001);
		item2.setTitle("How do I import a pre-existing Java project into Eclipse and get up and running?");
		item2.setRating(2.0);

		Bookmark item3 = new Bookmark();
		item3.setId(2002);
		item3.setTitle("Interface vs Abstract Class");
		item3.setRating(3.0);

		Bookmark item4 = new Bookmark();
		item4.setId(2003);
		item4.setTitle("NIO tutorial by Greg Travis");
		item4.setRating(4.0);

		Bookmark item5 = new Bookmark();
		item5.setId(2004);
		item5.setTitle("Virtual Hosting and Tomcat");
		item5.setRating(5.0);

		recommendedItems.add(item1);
		recommendedItems.add(item2);
		recommendedItems.add(item3);
		recommendedItems.add(item4);
		recommendedItems.add(item5);

		CacheIterator iterator = recommendedItems.iterator();
		// CacheIterator iterator = recommendedItems.new MyCacheIterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next().getTitle());
		}

		Arrays.sort(recommendedItems.items, new Comparator<Bookmark>() {

			@Override
			public int compare(Bookmark o1, Bookmark o2) {
				return o1.getRating() < o2.getRating() ? 1 : -1;
			}

		});

		System.out.println("\nSorted by rating (using Anonymous class) ...");
		iterator = recommendedItems.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next().getTitle());
		}

		// Lambdas
		Arrays.sort(recommendedItems.items,
//				(o1, o2) -> new Integer(o1.getTitle().length()).compareTo(new Integer(o2.getTitle().length()))
				(o1, o2) -> Integer.valueOf(o1.getTitle().length()).compareTo(Integer.valueOf(o2.getTitle().length())));
		System.out.println("\nSorted by length (using Lambda) ...");
		iterator = recommendedItems.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next().getTitle());
		}

		// new Cache(5).go(() -> System.out.println("\nLambda"));

	}

//	public void go(Test test) {
//		test.apply();
//	}
}
