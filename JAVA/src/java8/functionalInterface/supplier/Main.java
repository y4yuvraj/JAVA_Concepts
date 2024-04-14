package java8.functionalInterface.supplier;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

	static String doc1 = "One of the most common uses of streams is to represent queries over data in collections";
	static String doc2 = "Information integration systems provide valuable services to users by integrating information from a number of autonomous, heterogeneous and distributed Web sources";
	static String doc3 = "Solr is the popular, blazing fast open source enterprise search platform from the Apache Lucene";
	static String doc4 = "Java 8 goes one more step ahead and has developed a streams API which lets us think about parallelism";

	static List<String> document = new ArrayList<>(Arrays.asList(doc1, doc2, doc3, doc4));
	static List<String> targetDoc = new ArrayList<>();

	private static boolean flag = true;

	public static void print(Supplier<String> sup) {
		if (flag) {
			System.out.println(sup.get());
		}
	}

	public static void main(String[] args) {

		for (String doc : document) {
			Predicate<String> p1 = d -> (d.contains("stream"));
			if (p1.test(doc)) {
				targetDoc.add(doc);
			}
		}
		for (String doc : targetDoc) {
			System.out.println(doc);
		}
		// now we want to throw exception when length of document is greater than 90

		for (String doc : targetDoc) {
			try {
				if (doc.length() > 90) {
					throw new Exception("oversized doc! ");
				}
			} catch (Exception e) {
				print(() -> e.getMessage() + " ~ " + doc);
			}
		}

	}

}
