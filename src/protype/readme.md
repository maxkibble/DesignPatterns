原型（protype）模式：
该模式，是利用clone方式，还替换声明变量时需要的new方式，当然clone函数里应该尽可能地使用深度拷贝。

我在主函数主函数里做了一个小实验，分类利用new和clone方式创建变量10000次，但是发现new要更快。

所以protype模式需要在特定场景下才能体现该模式的优势：
我个人猜想，比如在声明一个变量时，需要经过多个非常耗时的步骤，并且这些步骤的结果是不变的，
那么在这种情况就能够凸显出该模式的优势。