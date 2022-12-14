# project

## 1）魔塔小案例

### 设计思路：

​	1. 模拟这个小游戏时, 我首先想到的是关卡、怪物、英雄、钥匙、上下楼梯以及查看怪物属性，

	2. 于是我将这个魔塔小案例的关卡设计为27层，每一层都先预定为13*13大小的地图
	3. 因为魔塔游戏一开始，地图就会初始化一些数据，于是我就利用静态代码块的特性，在加载类的时候就初始化数据，

​	4. 但是我又想到初始化地图数据，那么这些数据有什么呢？

​	5. 经过魔塔的参考我先将所有层地图的数据预先规定好(地图数据模型Maps)

​			1）x代表墙、h代表勇士、数字代表怪物

​			2）i、j、k 分别代表黄钥匙、蓝钥匙、红钥匙

​			3）空格代表空地

​			 4）I、J、K分别代表黄色的门、蓝色的门、红色的门

​			5）n、p分别代表上下楼梯，

​			6）r、b分别代表红血瓶、蓝血瓶

​			7）a、d分别代表攻击力（红宝石）、防御力（蓝宝石）

​	6. 地图初始化数据规定好了，此时我需要英雄和怪物和怪物级别三个数据模型，我就采用标准JavaBean写法

​			1）定义英雄类(Hero)，英雄有以下相关属性

​					等级：level 

​					生命值：blood

​					攻击力：att 

​					防御力：def 

​					金币：gold 

​					经验：exp 

​					三种钥匙：yk（黄钥匙） bk（蓝钥匙） rk（红钥匙）

​			2）定义怪物类(Monster)，怪物有以下属性

​					名字：name 

​					生命值：blood 

​					等级：level 

​					攻击力：att 

​					防御力：def 

​					金币：gold 

​					经验：exp

​			3）怪物种类/级别(Monsters)

​					存储9种种类/级别怪物

​					这里就是游戏开始时, 这些数据就需要预加载好, 所以采用静态数组存储怪物种类/级别数据！

​					这里就满足到了静态修饰的成员在加载类的时候就已经加载完毕

  7. 现在数据已经准备完毕，我就需要操作游戏，我就需要一个游戏类(Game),这个类就是用来进行一些游戏操作

     比如，开始游戏、英雄上下左右移动，英雄与怪物打架等功能		

8. 这些操作该如何实现呢？

 9. 首先我想到的是，游戏一开始应该需要具备什么技术，因为只有知道用什么技术，我才能知道用什么样的思路编写，

    由于这里并没有涉及什么高级技术，我就简单说，我们就涉及了OOP面向对象编程技术吧

10. 现在我就考虑到游戏从一开始的时候，就先规定好 w、s、a、d分别代表上下左右移动

11. 既然我门需要输入w、s、a、d进行上下左右移动，那么我们就需要采用键盘录入技术，

    于是我就想到用Scanner这个键盘录入API帮助我完成这项操作，并且对输入的内容进行判断来操作英雄移动

12. 这一操作逻辑思考完后，我又想到我们当前英雄初始化时，英雄正在哪一层哪个位置

13. 接着我先规定英雄目前坐标点所在层为第一层的位置136

14. 但是我又想到了游戏应该要结束还是未结束吧

15. 我又定义了一个isGameOver属性代表游戏是否结束

16. 游戏默认是结束还是未结束呢？

17. 我想到Java虚拟机默认初始化布尔值false，那我就想着统一规范，都是默认false，所以规定游戏默认未结束

18. 游戏相关数据结构以及游戏操作基本思维逻辑理清，我现在正式需要实现英雄具体移动功能（Move）和怪物打架功能（flight）

19. 但是除了移动和打架功能外，我又想到每次都需要显示地图数据，重写展示地图，我就又需要一个展示地图功能（showMap）

20. 现在游戏开始，首先展示地图数据

21. 地图数据功能如何实现思路？

22. 首先我要明确英雄当前所在关卡，就是当前英雄在魔塔第几层

23. 确定魔塔层数之后，利用双层for循环遍历获取这一层已经准备好的数据，进行展示界面，规定13*13规格的地图数据

24. 因为我没有开始游戏界面，又不知道哪个英雄在通关，因为技术限制，我需要先输出开始游戏以及英雄名称，再进行展示地图数据

25. 地图数据展示完毕，我们需要通过w、a、s、d移动，因为我们不知道移动多少次，游戏才结束，利用循环次数不确定采用while循环

    从而相当于技术选型，我不采用for循环，就采用while循环，让我们玩家操作英雄移动，因为简单练习，并没有考虑很多安全性，操作不当会直接报错，自己避免即可

26. 移动操作，我就需要对移动操作进行一些判断

    1）碰到墙就英雄不动

    2）碰到红宝石，增加攻击力

    3）碰到钥匙，捡起

    4）碰到门钥匙开门，英雄消耗一把钥匙

    5）碰到空地直接过去

    6）碰到怪物，与怪物相互击打，击打结果，英雄被怪物杀死或者怪物被英雄杀死

    27.  实现怪物与英雄击打功能（我想到三种方案先进行简单实现）

        1）第一种方案：

        ​	如果英雄攻击力连怪物的防御力都攻不破，直接被怪物杀死，游戏结束

        2）第二种方案：

        ​	怪物的攻击力连英雄的防御力都破不了，怪物直接被英雄杀死，且英雄不丢失一滴血量

        3）第三种方案：

        ​	英雄可破怪物防，怪物可破英雄防

        ​	那么就需要循环一直打架，直到一方血量为零

        如果英雄打败怪物，金币和经验都增加，战斗胜利，获得多少金币，多少经验

        否则英雄被怪物打败，砍不动怪物，被怪物乱刀砍死，游戏结束



### 案例实现细节：

​	1. w上移动，即当前位置13，s下移动，即当前位置-13，左移动，即当前位置-1，右移动，即当前位置+1，

​		为什么这样设计？

​				因为我前面已经规定我这个魔塔小案例的关卡设计为27层，每一层都先预定为13*13大小的地图，

​				-1就相当于利用二维数组里面的一维数组索引下标减去1，即得到左边位置

​				1就相当于利用二维数组里面的一维数组索引下标加上1，即得到右边位置

​				13就相当于利用二维数组里面的一维数组索引下标加上13，即得到上边位置

​				-13就相当于利用二维数组里面的一维数组索引下标减去13，即得到下边位置

2. 当前勇士就是与该级别怪物进行搏斗，为什么要创建一个新的怪物对象，保存该级别属性呢？

​			我是为了防止游戏已经预定好的怪物数据被污染，后续还需从预定好的怪物级别获取该级别数据，

​			所以固定好的怪物级别是不能更改数据的，所以要创建一个新的怪物对象，克隆当前与勇士战斗的怪物的属性进行操作！

3. 本次小案例并没有写完，就是这样简单练习了

4. 我发现我还需要完善

    1. 商店     花钱加属性    不会消失 
      
       商店我考虑的是，如果楼层在当前层，则进入商店花钱加属性，但是并不会将英雄位置与商店位置进行交换，如果英雄移动位置
      
       碰到的是s，就英雄位置原地不动，只需购买物品即可！

​		2. 上下楼梯

​			只实现上楼逻辑，下楼逻辑暂不考虑了，

​			上楼逻辑就是记录是否第一次移动，第一次移动就是换n，否则，情况不变！

​		3. 查看怪物属性

​				首先我从地图数据中获取所有数字，因为是字符串数组，获取出来的数据全部为字符串，因为我存储的字符串都是ASCII码对应				的字符，所以我只需要将字符串转换为字符数组并且选择字符数组中的第一个数据，即我所获取的字符串，此时字符串已经

​				转换为字符，我需要借助字符类型的包装类来进行判断当前字符是否为数字字符，如果是数字字符，即存储我对应的数组中，

​				因为数字代表怪物，数字取值范围 0 ~ 9，怪物种类就位为10种，所以我用容量为10的怪物数组来存储这一层所有种类怪物数据

​				并通过遍历该怪物数组，从而得到这一层所有怪物数据

​				由于我采取的是每个数字代表一种怪物，当前勇士所在层，有些种类怪物可能没有，怪物数组映射位置的怪物就没有，即为空

​				此时，我就需要一个判断，如果遍历到该怪物数组不为空的情况下，就遍历出该数组映射位置所映射的怪物！
