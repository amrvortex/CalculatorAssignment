package calculator;

public class calculator implements ICalculator {
 public int add(int x,int y) {
 int z;
 z = x + y;
 return z;
 }
 public float divide(int x,int y) throws RuntimeException {
	 float z;
	 if(y == 0) {
		 throw new RuntimeException("Error can't divide by zero");
	 }
	 z = x / y ;
	 return z;
 }
}
