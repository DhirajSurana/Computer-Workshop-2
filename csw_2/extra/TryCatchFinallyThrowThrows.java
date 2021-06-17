package extra;

public class TryCatchFinallyThrowThrows extends RuntimeException {

	private static final long serialVersionUID = -3616353978417439864L;

	public TryCatchFinallyThrowThrows(String s) {
		super(s);
	}

	public static void main(String[] args) {

		try {
			doStuff();
		} catch (ArithmeticException e) {
			throw new TryCatchFinallyThrowThrows("this exception is thrown by the programmer");
		}
	}

	public static void doStuff() throws ArithmeticException {

		doMoreStuff();
	}

	public static void doMoreStuff() throws ArithmeticException {
		System.out.println(10 / 0);

	}

}
