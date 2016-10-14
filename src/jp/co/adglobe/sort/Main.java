package jp.co.adglobe.sort;

import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Properties;

public class Main {
	public static void main(String[] args) {
		Sorter s = new Sorter();

		Properties prop = new Properties();
		String configfile = "config/.properties";
		String[] filepaths = new String[3];
		try {
			prop.load(new FileInputStream(configfile));
			filepaths[0] = prop.getProperty("filepath1");
			filepaths[1] = prop.getProperty("filepath2");
			filepaths[2] = prop.getProperty("filepath3");
		} catch (IOException ioe) {
			ioe.printStackTrace();
			return;
		}

		long startTime = System.currentTimeMillis();

		for(String filepath: filepaths) {
			s.doExec(filepath);
		}

		long milliTime = System.currentTimeMillis() - startTime;

		BigDecimal time = new BigDecimal(milliTime);
		BigDecimal thousand = new BigDecimal(1000);

		System.out.println("実行時間は【" + time.divide(thousand) + "秒】です。");
	}
}