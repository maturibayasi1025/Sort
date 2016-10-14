package jp.co.adglobe.sorter.implement;

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
	public void doExec(String filename) {
		// このメソッド内に処理を記述
		System.out.println(filename);
	}
}