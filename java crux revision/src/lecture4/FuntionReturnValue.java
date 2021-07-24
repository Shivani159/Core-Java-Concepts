package lecture4;

public class FuntionReturnValue {

	public static void main(String[] args) {
		int sum =  AdditionReturn(30,50);
		System.out.println(sum);
	}
	public static int AdditionReturn(int a,int b) {
		int sum= a+b;
		return sum;
	}

}
