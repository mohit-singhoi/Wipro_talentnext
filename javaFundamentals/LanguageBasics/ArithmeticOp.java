
public class ArithmeticOp {
	public void arithmetic_op(int a, int b) {

		int sum = a+b;
		int sub = a-b;
		int mul = a*b;
		int div= a/b;
		int mod =a%b;
		
		
		System.out.println("Sum :"+sum);
		System.out.println("Difference :"+sub);
		System.out.println("Mul :"+mul);
		System.out.println("Div :"+div);
		System.out.println("Mod :"+mod);


	}

	public static void main(String[] args) {
		ArithmeticOp ao = new ArithmeticOp();
		ao.arithmetic_op(10, 5);
	}
		

}
