# ScalaTutorial

# hello-world
Scalaのソースを実行する方法です。実行方法はjavaとよく似ています。
```
scalac HelloScala.scala
```
でコンパイル
```
scala -classpath . HelloWorld
```
で実行します。\\

Unit型はjavaのvoid型と同様の意味です。
# intract-to-java
Scalaの強みの一つはjavaのコードと相互作用するのがとても簡単なことです。\\
Scalaのインポート文はJavaととても良く似ているが、ずっと強力です。- {}で囲むことで同じパッケージから複数のクラスをインポートできます。
- パッケージやクラスのすべての名前をインポートするときは、*ではなく_を使います。

# timer
Scalaはすべてのものがオブジェクトであるという意味で、純粋なオブジェクト志向言語です。(たとえば数値もオブジェクト)\\
Scalaでは関数もオブジェクトです。それゆえ関数プログラミングが可能になっています。OncePerSecondは引数として、`() => Unit`型の関数をうけとり、1秒ごとにそれを実行する関数です。

# timer-anonymous
匿名関数（ラムダ関数）を作ることもできます。\\
匿名関数は`(引数リスト) => 本体`という形で書きます。\\

# complex
クラス定義ができます。scalaでは、`re()`のような0引数のメソッドは、`re`とフィールドのように書くことができます。また型推論が聞く場合は、戻り値を省略することができます。（いつでも省略できるわけではない。）

# 参考にしたサイト
- JAVAプログラマーのためのSCALAチュートリアル
https://docs.scala-lang.org/ja/tutorials/scala-for-java-programmers.html