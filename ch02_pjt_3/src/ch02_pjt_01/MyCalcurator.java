package ch02_pjt_01;

public class MyCalcurator {

	public void claculate(int fNum, int SNum, ICalcurator  calculator) {
		int value = calculator.doOperation(fNum, SNum);
		System.out.println("result : " + value);
	}
}
