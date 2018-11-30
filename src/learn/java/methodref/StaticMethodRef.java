package learn.java.methodref;

import java.util.function.BiFunction;

class Multiplication{
	public static int multiply(int a, int b){  
		return a*b;  
	   }  
}

public class StaticMethodRef {

	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> product = Multiplication::multiply;
		int prod = product.apply(4,  35);
		System.out.println("Multiplication : "+prod);
	}

}
