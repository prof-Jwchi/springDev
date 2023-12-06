package ch02_pjt_01;

public class CalDiv implements ICalcurator {
	@Override
	public int doOperation(int firstNum, int secondNum) {
		return firstNum / secondNum;
	}
}