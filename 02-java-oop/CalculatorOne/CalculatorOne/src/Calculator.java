
public class Calculator implements CalculatorFuncsInterface{

	public int num1;
	public int num2;
	public int answerPlus;
	public int answerMinus;
	public String operator;
	
	@Override
	public void setOperandOne(int num) {
		// TODO Auto-generated method stub
		num1 = num;
	}

	@Override
	public void setOperandTwo(int num) {
		// TODO Auto-generated method stub
		num2 = num;
	}

	@Override
	public void setOperation(String operator) {
		// TODO Auto-generated method stub
		this.operator = operator;
	}

	@Override
	public void performOperation() {
		int answerOne;
		int answerTwo;
		
		// TODO Auto-generated method stub
		if (this.operator == "+") {
			answerOne = num1 + num2;
			this.answerPlus = answerOne;
			//System.out.println(this.num1 + this.num2);
		} else if (this.operator == "-") {
			answerTwo = num1 - num2;
			this.answerMinus = answerTwo;
			//System.out.println(this.num1 - this.num2);
		} else {
			System.out.println("Unknown input");
		}
		
	}

	@Override
	public void getResults() {
		// TODO Auto-generated method stub
		if (this.operator == "+") {
			System.out.println(this.answerPlus);
		} else if (this.operator == "-") {
			System.out.println(this.answerMinus);
		}
	}

}
