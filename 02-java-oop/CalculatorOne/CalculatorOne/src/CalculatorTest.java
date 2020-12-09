
public class CalculatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator j = new Calculator();
		
		
		j.setOperandOne(5);
		j.setOperation("=");
		j.setOperandTwo(10);
		
		j.performOperation();
		
		j.getResults();
		
	}

}
