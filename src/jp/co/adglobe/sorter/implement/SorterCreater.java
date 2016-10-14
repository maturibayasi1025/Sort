package jp.co.adglobe.sorter.implement;

import jp.co.adglobe.sorter.Sorter;

public class SorterCreater {

	private String _classname;

	public SorterCreater(String classname) {
		_classname = classname;
	}

	@SuppressWarnings("rawtypes")
	public Sorter create() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Class sorter = Class.forName("jp.co.adglobe.sorter.implement." + _classname);
		return (Sorter)sorter.newInstance();
	}
}
