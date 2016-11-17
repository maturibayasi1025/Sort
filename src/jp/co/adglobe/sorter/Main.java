package jp.co.adglobe.sorter;

import java.io.FileInputStream;
import java.math.BigDecimal;
import java.util.Properties;

import jp.co.adglobe.sorter.implement.SorterCreater;

public class Main {
	public static void main(String[] args) {

		try {
			Properties prop = new Properties();
			String configfile = "config/.properties";
			String[] filenames = new String[3];

			prop.load(new FileInputStream(configfile));
			filenames[0] = prop.getProperty("filename1");
			filenames[1] = prop.getProperty("filename2");
			filenames[2] = prop.getProperty("filename3");
			String classname = prop.getProperty("classname");

			SorterCreater sc = new SorterCreater(classname);
			Sorter s = sc.create();

			long startTime = System.currentTimeMillis();

			for(String filename : filenames) {
				s.doExec(filename);
			}

			long milliTime = System.currentTimeMillis() - startTime;

			BigDecimal time = new BigDecimal(milliTime);
			BigDecimal thousand = new BigDecimal(1000);

			System.out.println("実行時間は【" + time.divide(thousand) + "秒】です。");

		} catch (ClassNotFoundException cnfe) {
			System.out.println("クラス名が不正です。");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}