import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(10);
		nums.add(30);
		nums.add(25);
		nums.add(40);
		nums.add(55);
		nums.add(45);
		nums.add(20);

		int sumIndexBased = 0;
		int sumEnhanced = 0;

		for (int i = 0; i < nums.size(); i++)
			sumIndexBased += nums.get(i);

		for (Integer num : nums)
			sumEnhanced += num;

		System.out.println(sumIndexBased);
		System.out.println(sumEnhanced);

		ArrayList<String> words = new ArrayList<String>();
		words.add("candle");
		words.add("dandelion");
		words.add("eagle");
		words.add("garage");
		words.add("hamburger");
		words.add("imitate");
		words.add("jello");

		for (int i = words.size() - 1; i >= 0; i--)
			System.out.println(words.get(i));

		for (int i = 0; i < words.size() && !words.get(i).startsWith("h"); i++)
			System.out.println(words.get(i));
	}
}
