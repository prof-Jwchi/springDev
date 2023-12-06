package ch02_pjt_01;

public class MyCalcurator {

	public void calAdd(int fNum, int SNum) {
		ICalcurator calculator = new CalAdd();
		int value = calculator.doOperation(fNum, SNum);
		System.out.println("result : " + value);
	}
	public void calSub(int fNum, int SNum) {
		ICalcurator calculator = new CalSub();
		int value = calculator.doOperation(fNum, SNum);
		System.out.println("result : " + value);
	}
	public void calMul(int fNum, int SNum) {
		ICalcurator calculator = new CalMul();
		int value = calculator.doOperation(fNum, SNum);
		System.out.println("result : " + value);
	}
	public void calDiv(int fNum, int SNum) {
		ICalcurator calculator = new CalDiv();
		int value = calculator.doOperation(fNum, SNum);
		System.out.println("result : " + value);
	}
}
