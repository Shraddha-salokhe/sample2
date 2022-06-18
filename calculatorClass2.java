
public class calculatorClass2 {

	public static void main(String[] args) {
          Calculator obj =  new Calculator();
          int result= obj.sum(20,10);
          int result2=obj.multiply(4,5);
          System.out.println(result);
          System.out.println(result2);
	}

}
    class Calculator{
    	
    	int sum(int num1, int num2) {
    		int num3 =num1 + num2;
    	return num3 = num1+num2;
    }
    	int multiply(int num1,int num2) {
    		return num1*num2;
    	}
    }
