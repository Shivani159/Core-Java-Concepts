package lecture4;

public class ScopeOfVariables {
	public static int val = 20;

	public static void main(String[] args) {
		int one = 10;
		int two = 20;

		int res = DemoScopes(one, two);
		System.out.println(res);
		System.out.println("part 5 : Global Scope");
		System.out.println(val);
		System.out.println(ScopeOfVariables.val);
		int sum = DemoGlobalScope(one);
		System.out.println(sum);
		// PART 6:BLOCK SCOPE
		System.out.println("part 6: block scope");

		if (one < two) {
			int three = 30;
			System.out.println(three);

		}
		// part 7 :PASS BY VALUE
		System.out.println("part 7 : pass by value ");
		System.out.println(one + "," + two);
		Swap(one, two);

		System.out.println(one + "," + two);

	}

	public static void Swap(int one, int two) {
		System.out.println(one + "," + two);
		int temp = one;
		one = two;
		two = temp;
		System.out.println(one + "," + two);
	}

	// PART 5:GLOBAL SCOPE
	public static int DemoGlobalScope(int one) {
		int val = 200;
		int sum = one + val;
		return sum;

	}

	public static int DemoScopes(int one, int another) {
		int sum = one + another;
		return sum;

	}

}
