# これは検証用として作成したプロジェクトである

Springのサービスをわかりやすくまとめることを目的とする

## デザインパターンの考え方を活かして検証を行うものとする

候補

- Facode

- ChainOfResponsibility
誰が処理を行うべきかは明確に決まっているため、たらい回しのパターンでは遅くなると考えられる。

- bridge
引数の型を判断する機能と、保存の実装を分けるという意味では、望みを叶えるものに見える。
ただし、やることはFacodeと一緒に見える
今回の場合、サービスクラスはすでにインターフェースと実装に分かれており、これに対して要求を投げる段階で、ルーティングを行う必要がある
つまり追加するべきは、ルーティングを行うクラスのみである。
結果としてはFacodeではなく、Bridgeとなっているのだろうか。

- Strategy
アルゴリズムの切り替え
これを実現するクラスを作る
やることは同じに見える・・・
P.144 を見る限りでは、同じインターフェースを実装したものを使い分ける際に、使う側のインスタンスを引数として渡すことで区別しているが、それを判定するのがアルゴリズムの切り替えを行うクラスの役割ではないのか・・？


### 検証結果

Facoderパターン
理想とするルート制御クラスを作成することは出来た
引数と返り値がどうなるかは処理によって変わるため、Objectもしくは、ModelやDTOのスーパークラスで指定し、これらが存在しない処理であればNullを返す仕様とする。
同じ型のオブジェクトを引数としても、処理内容が変化する場合が存在するため、さらに承認者などフィールドを参照し、どのような処理が必要か判定する必要がある。