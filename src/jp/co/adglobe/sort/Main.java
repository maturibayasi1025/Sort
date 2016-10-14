package jp.co.adglobe.sort;

import java.math.BigDecimal;

public class Main {
	public static void main(String[] args) {
		// この下は変更しないでください
		Sorter s = new Sorter();
		long startTime = System.currentTimeMillis();
		s.doExec();
		long milliTime = System.currentTimeMillis() - startTime;

		BigDecimal time = new BigDecimal(milliTime);
		BigDecimal thousand = new BigDecimal(1000);

		System.out.println("実行時間は【" + time.divide(thousand) + "秒】です。");
		// ここより上は変更しないでください
	}
}


class Sorter {
	public void doExec() {
		// このメソッド内に処理を記述
	}
}