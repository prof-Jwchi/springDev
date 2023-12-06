package ch02_pjt_01;

public class MainClass {
	public static void main(String[] args) {

		MyCalcurator calcurator = new MyCalcurator();
		calcurator.claculate(10, 5, new CalAdd());
		calcurator.claculate(10, 5, new CalSub());
		calcurator.claculate(10, 5, new CalMul());
		calcurator.claculate(10, 5, new CalDiv());
	}
}
