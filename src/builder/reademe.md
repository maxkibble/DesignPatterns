我个人觉得builder模式和factory模式，有一些类似的地方。

相同点在于：两者都用于对象的生成

不同点在于：两者所要解决的问题有所不同

1. factory模式，要解决的问题，是抽象的item可以有不同的类型，
例如在英雄联盟中“英雄”这个抽象类，可以有不同的实体英雄，例如：德莱文、提莫
为了避免在增加新英雄时，过多地改动已存在的代码，可以抽象出一个抽象类Champion，
然后在增加新类的时候，只需要新增在Champion的初始化时，用新增的工厂函数即可，
而之后所有对Champion的引用代码，都不用发生大变化。
2. builder模式，所要解决的问题是（看了一些帖子之后的观点），更倾向于一个类从设计之后，
到后续的使用过程中，会经历较多的修改，例如增加、删除域，必然导致在构造函数的增、删、改（用于域的初始化）
这就非常蛋疼了，自己写代码也经常遇到这样的问题。
所以builder模式，更加侧重于解决一个类初始化过程中，不同域值的初始化存在的逻辑问题。

所以，在builder模式中：
1. 必然会包含一个产品基类：抽象类也可，实体类也可。
2. Builder虚类，用于描述一个基类的生成过程，该类应该包含两部分函数：
    1. 基类不同的部分的构件函数，可以认为是基类中不同的域值的初始化方法。
    2. build函数，用于返回一个创造的基类。
3. 具体的builder类，Builder类的具体实现。
4. 标准的builder模式中，还包含一个Director类，该类接受一个Builder类，并指导builder类的各种方法的初始化过程。
    但我个人觉得不是特别有必要。