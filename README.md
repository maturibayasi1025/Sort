## Sort

プログラミング研修用プロジェクトです。

SouterImplements.javaのdoexec()内に以下の処理を記述してください。

引数で渡されたファイルパスには7桁の重複のない

かつ、ランダムな数字列が10万個記述されたテキストファイルが配置されている。

(※区切り文字はCRLF)

ファイルに記述された10万個の数字列をソートし、

出力先ディレクトリにテキストファイルをで出力してください。

入力ファイルと同様区切り文字はCRLFとします。

ただし、Javaの組み込みのソート関数は使用してはいけません。

ex) java.util.Arraysのsort()等

Sourterクラス内にはタスクに必要なプライベートメソッドを自由に定義して構いません。

実行時はMainクラスのmain()関数を実行してください。

ソートにかかった時間がコンソールに出力されます。

Main.javaファイル内は編集しないようにお願いします。



## 時間内に終わった人

SourterImplements以外とは違うアルゴリズムでソートしてみよう。

Ⅰ．package jp.co.adglobe.sorter.implement内部にクラスを作る

ex) OtherMethodSorter.java

Ⅱ. 新しく作ったクラスにSorterインターフェースを実装する

```java
class OtherMethodSourter implements Sorter {
    // 省略
}
```

Ⅲ. doexecメソッドを記述
```java
class OtherMethodSourter implements Sorter {
    
    public void doexec(String filepath) {
    // 処理を記述
    }
}
```

Ⅳ. config/.propertiesの下記のように編集

~~classname=SorterImplements~~

↓

classname=OtherMethodSorter

クラス名が一致していないとエラーになるので注意

Ⅴ．Mainクラスを実行


アルゴリズム間のタイムの違いを計測してみよう。
