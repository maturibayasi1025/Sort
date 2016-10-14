package jp.co.adglobe.sorter.implement;

import jp.co.adglobe.sorter.Sorter;

class SorterImplements implements Sorter {

	// データの出力先ディレクトリ
	private static final String OUTPUT_DIR = "data/output/";

	/*
	 * ソート実行メソッド
	 *
	 * ソート済みのテキストファイルを出力します。
	 *
	 * @param filepath ソート対象のテキストファイルのパス
	 */
	public void doExec(String filepath) {
		// このメソッド内に処理を記述
		System.out.println(filepath);
	}
}