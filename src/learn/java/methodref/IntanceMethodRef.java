package learn.java.methodref;

@FunctionalInterface
interface MethodRefInterface{
	public void display();
}
@FunctionalInterface
interface TwoParameterMethodInt{
	public int sumNumber(int i, int j);
}
public class IntanceMethodRef {

	public void displayMsg() {
		System.out.println("Calling method using instance method reference.");
	}
	public int sum(int a, int b) {
		return a + b;
	}
	public static void main(String[] args) {
		IntanceMethodRef irf = new IntanceMethodRef();
		MethodRefInterface mrf = irf::displayMsg;
		mrf.display();
		
		TwoParameterMethodInt tpm = irf::sum;
		System.out.println(tpm.sumNumber(10, 45));
	}

}
