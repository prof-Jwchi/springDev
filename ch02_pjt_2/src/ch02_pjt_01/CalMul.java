package ch02_pjt_01;

public class CalMul implements ICalcurator {
	@Override
	public int doOperation(int firstNum, int secondNum) {
		return firstNum * secondNum;
	}
}
