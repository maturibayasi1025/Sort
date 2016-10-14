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
			String[] filepaths = new String[3];

			prop.load(new FileInputStream(configfile));
			filepaths[0] = prop.getProperty("filename1");
			filepaths[1] = prop.getProperty("filename2");
			filepaths[2] = prop.getProperty("filename3");
			String classname = prop.getProperty("classname");

			SorterCreater sc = new SorterCreater(classname);
			Sorter s = sc.create();

			long startTime = System.currentTimeMillis();

			for(String filepath: filepaths) {
				s.doExec(filepath);
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