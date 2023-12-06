package ch02_pjt_01;

public class CalAssembler {
	MyCalcurator calculator;
	CalAdd calAdd;
	CalSub calSub;
	CalMul calMul;
	CalDiv calDiv;

	public CalAssembler() {
		calculator = new MyCalcurator();
		calAdd = new CalAdd();
		calSub = new CalSub();
		calMul = new CalMul();
		calDiv = new CalDiv();

		assemble();
	}

	public void assemble() {
		calculator.claculate(10, 5, calAdd);
		calculator.claculate(10, 5, calSub);
		calculator.claculate(10, 5, calMul);
		calculator.claculate(10, 5, calDiv);
	}
}
