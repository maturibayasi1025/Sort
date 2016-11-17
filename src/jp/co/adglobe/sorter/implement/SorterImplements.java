package jp.co.adglobe.sorter.implement;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import jp.co.adglobe.sorter.Sorter;

class SorterImplements implements Sorter {

	// データの出力先ディレクトリ
	private static final String OUTPUT_DIR = "data/output/";
	// 入力データの格納ディレクトリ
	private static final String INPUT_DIR = "data/input/";

	/*
	 * ソート実行メソッド
	 *
	 * ソート済みのテキストファイルを出力します。
	 *
	 * @param filepath ソート対象のテキストファイルのパス
	 */
	public void doExec(String filename)  {
		// このメソッド内に処理を記述
		try{
		BufferedReader br = new BufferedReader(new FileReader(INPUT_DIR + filename));

		int[] test = new int[100000];
		String str;

		for(int i = 0;i < test.length;i++)
		{
			str = br.readLine();
			test[i] = Integer.parseInt(str);
		}

		for(int s = 0; s < test.length - 1; s++){
			for(int t = 0; t < test.length; t++){
				if(test[t] > test[s]){
					 int temp = test[t];
					 test[t] = test[s];
					 test[s] = temp;
				}
			}
		}

		br.close();

		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(OUTPUT_DIR + filename)));

		for(int n : test)
		{
			pw.print(n);
			pw.print("\n");
		}

		pw.close();

		}
		catch(FileNotFoundException e)
		{
			System.out.println(e);
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}

}