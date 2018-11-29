package learn.java.methodref;

@FunctionalInterface
interface MyInterface{
	Hello display(String str);
}

class Hello{
	public Hello(String str) {
		System.out.println(str);
	}
}
public class ConstructorRef {

	public static void main(String[] args) {
		
		MyInterface mi = Hello::new;
		mi.display("Hello Constructor Method Reference...");
	}

}
