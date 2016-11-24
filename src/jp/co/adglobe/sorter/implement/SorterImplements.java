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

		for(int i = 0;i < test.length; ++i)
		{
			str = br.readLine();
			test[i] = Integer.parseInt(str);
		}

		// クイックソートの処理
		quick_sort(test, 0, test.length - 1);

		//バブルソートの処理
		//bubble_sort(test);

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

	/*
	 * バブルソート
	 *
	 * 横隣りにある二つの数字を比較し、大きければ位置を変える
	 *
	 */
	static void bubble_sort(int []data)
	{
		for(int s = 0; s < data.length - 1; ++s)
		{
			for(int t = 0; t < data.length - 1; ++t)
			{
				if(data[t] > data[s])
				{
					int temp = data[t];
					data[t] = data[s];
					data[s] = temp;
				}
			}
		}
	}


	/*
	 *
	 * クイックソート
	 *
	 * 最低値と最大値探す半分を基準に振り分け検索し、そのあとにすべて合わせる
	 */
	static void quick_sort(int []d, int left, int right){

		if (left >= right) {
            return;
        }

        int p = d[(left + right)/2];
        int l = left;
        int r = right;
        int tmp;

        while(l <= r) {
            while(d[l] < p) { ++l; }
            while(d[r] > p) { --r; }
            if (l <= r) {
                tmp = d[l];
                d[l] = d[r];
                d[r] = tmp;
                ++l;
                --r;
            }
        }

        quick_sort(d, left, r);  // ピボットより左側をクイックソート
        quick_sort(d, l, right); // ピボットより右側をクイックソート

	}

}