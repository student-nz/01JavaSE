# 四、gahter

## 1）什么是集合？

​				集合和数组一样都是容器, 只不过数组定义完成并启动后, 类型确定、长度固定

​				而且集合是java中存储对象数据的一种容器，因为集合只支持引用类型, 不支持基本数据类型,

​				如果需要存储基本数据类型, 需要存储基本数据类型对应包装类

## 2）集合和数组有什么区别？

​				1.  数组定义后类型确定, 长度固定

​				2. 集合类型可以不固定, 大小可变

​				3. 数组可以存储基本类型和引用类型的数据, 但是集合只能存储引用类型的数据

## 3）数组和集合应用场景

​				1. 数组适合做数据个数和类型确定的场景

​				2. 集合适合做数据个数不确定，且要做增删元素的场景

## 4）集合类体系结构

​				在Java中, 集合包含单列集合和双列集合两类

​				单列集合的顶级父类容器为Collection, 且每个元素（数据）只包含一个值

​				双列集合的顶级父类容器为Map,  且每个元素包含两个值（键值对形式）



​				  ![image-20221012084756602](D:\yjxz\Review_outline\yjxz\background\_01JavaSE\04gather\document\assets\集合体系结构.png)

​	

## 5）Collection集合体系

​				Collection是单列集合的祖宗接口，它的功能是全部单列集合都可以继承使用的			![image-20221012085224808](D:\yjxz\Review_outline\yjxz\background\_01JavaSE\04gather\document\assets\Collection集合体系.png)

### 	1. Collection集合特点

#### 				1）List系列集合：

​					看到List系列集合，首先我们就要想到知道List系列集合下的ArrayList（动态数组）、LinekdList（链表）

​					添加的元素是有序、可重复、有索引

​					有序：存储和取出的元素顺序一致

​					有索引：可以通过索引操作元素

​					可重复：存储的元素可以重复

​					例如：

​						ArrayList（动态数组）：有序，可重复，有索引（ 在OOP章节已经介绍了ArrayList基本使用）						 

​						LinekdList（链表）：有序，可重复，有索引

#### 				2）Set系列集合：

​					添加的元素是无序、不重复、无索引

​					例如：

​						HashSet: 无序、不重复、无索引；（实现类直接默认特性）

​						LinkedHashSet: 有序、不重复、无索引（有序是因为实现类更改默认无序特性为有序）

​						TreeSet：按照大小默认升序排序、不重复、无索引（升序是因为实现类更改默认无序特性为升序）

### 		2. Collection系列集合的常用API

​						 public boolean add(E e)：把给定的对象添加到当前集合中

​						public void clear() ：清空集合中所有的元素

​						public boolean remove(E e)：把给定的对象在当前集合中删除

​						public boolean contains(Object obj)：判断当前集合中是否包含给定的对象

​						public boolean isEmpty()：判断当前集合是否为空

​						public int size()：返回集合中元素的个数

​						public Object[] toArray()：把集合中的元素，存储到数组中

### 		3. Collection系列集合的遍历方式

​					Collection集合为什么不提供for循环遍历方式？

​						因为Collection集合下有有索引系列集合List以及无索引系列集合Set, 

​						所以采用for循环遍历无法满足无索引的系列集合Set

#### 								1）方式一：迭代器

​					迭代器遍历就是将容器中的元素一个一个的访问一遍

​					迭代器在Java中的代表是Iterator, 迭代器是集合的专用遍历方式

##### 				1. 相关API：

###### 					1）Collection集合获取迭代器

​							Iterator<E> iterator()：返回集合中的迭代器对象，该迭代器对象默认指向当前集合的0索引

###### 					2）Iterator中的常用API

​							boolean hasNext()：询问当前位置是否有元素存在, 存在返回true ,不存在返回false

​							E next()：获取当前位置的元素, 并同时将迭代器对象移向下一个位置, 注意防止取出越界

​				迭代器的默认位置在哪里？

​							Iterator<E> iterator()：得到迭代器对象，默认指向当前集合的索引0

​				迭代器如果取元素越界会出现什么问题？

​							会出现NoSuchElementException异常				

#### 								2）方式二：foreach/增强for循环

###### 					1. 增强for循环：

​						增强for循环既可以遍历集合也可以遍历数组

###### 					2. 格式：

​							for(元素数据类型 变量名 : 数组或者Collection集合) {         

​									//在此处使用变量即可，该变量就是元素

​							}

​					增强for修改变量：

​							增强for修改变量修改第三方变量的值不会影响到集合中的元素

​							![image-20221012092210314](D:\yjxz\Review_outline\yjxz\background\_01JavaSE\04gather\document\assets\增强for修改变量.png)

​						

#### 							3）方式三：lambda表达式

​			JDK 8开始的新技术Lambda表达式, 提供了一种更简单、更直接的遍历集合的方式

​			labmda表达式（回顾请看02OOP回顾知识点）

###### 			1. Collection结合Lambda遍历的API

​				default void forEach(Consumer<? super T> action): 结合lambda遍历集合

​				Consumer<? super T> action：

​						这个接口是一个消费型函数式接口，因此可以使用lambda表达式,

​				accept(T s)：

​						这个方法表示接收集合中的元素目前不知道什么数据类型

​						如果是String集合容器，那么就接收String集合容器中的字符串元素, 并且进行消费, 

​						依次类推, 直至消费完String集合容器中的所有字符串元素，其余类型容器类似操作

​				实例如下：![image-20221012092454615](D:\yjxz\Review_outline\yjxz\background\_01JavaSE\04gather\document\assets\Collection结合Lambda遍历的API.png)

### 	4. Collection集合存储自定义类型的对象

​			不做解释, 只供思考!

​			提示：自定义类型就是引用类型				 

### 	5. Collection系列集合之List系列集合

#### 					1）List集合特有功能

​			为什么说List集合的特有功能？

​			因为List（接口）集合继承Collection集合（接口），除了拥有Collection统一功能外, 还在自己基础上扩展了

​			Collection集合没有的功能，形成自己独特的功能，就如儿子继承老爸所有技术外，还具备老爸不会的技术，

​			同时这些特有API又为下一代List系列集合拥有，即一代比一代强，程序来说，就是实现了代码的复用性

#### 					2）List集合除Collection API的特有功能

​			void add(int index,E element)：在此集合中的指定位置插入指定的元素

​			E remove(int index)：删除指定索引处的元素，返回被删除的元素

​			E set(int index,E element)：修改指定索引处的元素，返回被修改的元素

​			E get(int index)：返回指定索引处的元素

#### 					3）List集合的遍历方式

##### 									1. 迭代器 

​			同Collection操作（回顾遍历语法）

##### 									2. 增强for循环

​			同Collection操作（回顾遍历语法）

##### 									3. Lambda表达式

​			同Collection操作（回顾遍历语法）

##### 									4. for循环（因为List集合存在索引）

​			翻阅01enter.document回顾遍历语法

#### 						4）List系列集合之实现原理

##### 									1. ArrayList底层原理

​				API

​				ArrayList底层是基于数组实现的：根据索引定位, 查询元素快，增删需要做元素的移位操作

​				第一次创建集合并添加第一个元素的时候, 在底层创建一个默认长度为10的数组

##### 									2. LinkedList底层原理	

​				LinkedList底层基于双链表实现的, 查询元素慢, 增删首尾元素非常快

###### 											1）LinkedList集合的特有功能：

​				public void addFirst(E e)：在该列表开头插入指定的元素

​				public void addLast(E e)：将指定的元素追加到此列表的末尾

​				public E getFirst()：返回此列表中的第一个元素

​				public E getLast()：返回此列表中的最后一个元素

​				public E removeFirst()：从此列表中删除并返回第一个元素

​				public E removeLast()：从此列表中删除并返回最后一个元素	

#### 					5）List集合存储的元素要超过容量怎么办？

​					List集合提供了自动扩容机制，当容量超过List集合容量时，List集合容量会自动扩充原来的1.5倍

#### 					6）模拟手写ArrayList和LinkedList

​					（模拟手写ArrayList和LinkedList请看我的Github之struct_algorithm篇有code+document）

#### 7）遍历集合时的并发修改异常问题

​			从集合中的一批元素中找出某些数据并删除, 如何操作？是否存在问题呢 ？

​				据我所知, 当我们从集合中找出某个元素并删除的时候可能会出现一种并发修改异常问题

##### 			1. 迭代器遍历删除

​						当采用迭代器遍历时, 采用集合删除当前遍历元素会出问题, 采用迭代器删除所在位置元素就不会出现这种问题

##### 			2. foreach遍历删除 

​						当采用foreach遍历删除时, 会出现这种问题, 且无法解决, foreach不能边遍历边删除, 会出bug

##### 			3. lamba表达式遍历删除

​						当采用lambda表达式遍历删除时, 会出现这种问题, 且无法解决, Lambda遍历不能边遍历边删除，会出bug

##### 			4. for循环

​						当采用for循环遍历删除时,边遍历边删除集合可行, 但是必须从后面开始遍历删除才不会出现漏掉应该删除的元素

## 6）泛型

​				泛型是JDK5中引入的特性, 可以在编译阶段约束操作的数据类型, 并进行检查

​				同时, 集合体系的全部接口和实现类都是支持泛型的使用的

#### 			1. 格式：

​						<数据类型>; （这里的数据类型只能是引用数据类型, 因为泛型只能支持引用数据类型）

#### 			2. 泛型的好处：

​						1. 统一数据类型

​						2. 把运行时期的问题提前到了编译期间, 避免了强制类型转换可能出现的异常, 因为编译阶段类型就能确定下来

​						为什么说运行时期的问题提前到了编译期间呢？

​							通俗来说我们在定义方法的时候会定义一个形参, 等待用户传过来一个实参, 

​							我们通常使用确定的类型当作形参, 这样就可能出现一种类型转换异常问题

​							就会出现运行时期异常ClassCastException异常（类型转换异常）

​							例如如下, 一个集合接收字符串又接收整型类型,获取取来我们都以为是字符串,从而导致报错

​							![image-20221012134516868](D:\yjxz\Review_outline\yjxz\background\_01JavaSE\04gather\document\assets\泛型运行期才报问题.png)

​							![image-20221012134756374](D:\yjxz\Review_outline\yjxz\background\_01JavaSE\04gather\document\assets\泛型编译报错异常.png)							

​							但是现在我们也可以让用户在使用的时候才去定义到底应该传什么类型的参数，

​							所以泛型就是在接收参数的时候定义该参数的类型，即传入过来的那个参数的类型,

​							这样我们就将运行时期异常提到了编译时期

​							例如如下，既然我规定了该集合存储元素为字符串类型, 那么该集合就只能存储字符串类型元素,

​							否则存储其他类型元素就编译期间报错，如下用字符串集合添加整型元素报错

​							![image-20221012134821522](D:\yjxz\Review_outline\yjxz\background\_01JavaSE\04gather\document\assets\泛型报错提到编译期.png)

#### 		3. 泛型定义

##### 					1）类后面(泛型类)

​	定义类时同时定义了泛型的类就是泛型类

###### 							1. 格式：

​	修饰符 class 类名<泛型变量>{  }

​	例如：public class MyArrayList<T> {  }

​	泛型变量T可以随便写为任意标识, 常见的如E、T、K、V等

###### 							2. 作用：

​	泛型类的作用就是编译阶段可以指定数据类型, 类似于集合的作用

###### 							3. 泛型类的原理

​	泛型类的原理就是把出现泛型变量的地方全部替换成传输的真实数据类型

##### 					2）方法申明上(泛型方法)

​	定义方法时同时定义了泛型的方法就是泛型方法

###### 							1. 格式：

​	修饰符 <泛型变量> 方法返回值 方法名称(形参列表){}

​	例如： public <T> void show(T t) {  }

###### 							2. 作用：

​	泛型方法作用就是方法中可以使用泛型接收一切实际类型的参数，让方法更具备通用性

###### 							3. 泛型方法的原理：

​	泛型方法的原理就是把出现泛型变量的地方全部替换成传输的真实数据类型

##### 					3）接口后面(泛型接口)

​	使用了泛型定义的接口就是泛型接口

###### 					1. 格式：

​	修饰符 interface 接口名称<泛型变量>{}

​	例如：public interface Data<E>{}

###### 					2. 作用：

​	泛型接口的作用就是可以让实现类选择当前功能需要操作的数据类型

###### 					3. 泛型接口的原理：

​	泛型接口的原理就是实现类可以在实现接口的时候传入自己操作的数据类型，这样重写的方法都将是针对于该类型的操作

#### 			4. 泛型通配符、上下限

###### 						1. 泛型通配符

​	? 可以在“使用泛型”的时候代表一切类型

​	E T K V 是在定义泛型的时候使用的

###### 						2. 泛型的上下限

​	? extends Car: ?必须是Car或者其子类   泛型上限

​	? super Car ： ?必须是Car或者其父类   泛型下限

# 加强：常见数据结构-理论常识-必须理解

​		（模拟手写如下数据结构与算法，请看我的Github之struct_algorithm篇的struct的code+document）

### 		数据结构

​	数据结构是计算机底层存储、组织数据的方式, 是指数据相互之间是以什么方式排列在一起的

​	精心选择的数据结构实现业务, 可以带来更高的运行或者存储效率

#### 				1）栈

##### 										特点：

​	后进先出，先进后出

##### 								术语：

​	压/进栈、弹/出栈、栈顶元素/栈低元素

#### 				2）队列

##### 								特点：

​	先进先出，后进后出

##### 								术语：

​	入队、出队

#### 					3）数组

##### 										特点：

​	查询速度快：查询数据通过地址值和索引定位, 查询任意数据耗时相同（元素在内存中是连续存储的）

​	删除效率低：要将原始数据删除, 同时后面每个数据前移

​	添加效率极低：添加位置后的每个数据后移, 再添加元素

#### 					4） 链表

##### 								特点：

​	链表中的元素是在内存中不连续存储的，每个元素节点包含数据值和下一个元素的地址

​	链表查询慢：无论查询哪个数据都要从头开始找（这里链表指的单链表）

​	链表增删相对快：因为直接修改结点地址引用

#### 					5）二叉树								

##### 								特点：

​	二叉树只能有一个根节点, 且每个节点最多支持2个直接子节点

##### 								节点的度：

​	节点的度即节点拥有的子树的个数,二叉树的度不大于2, 叶子节点 度为0的节点，也称之为终端结点

##### 								高度：

​	叶子结点的高度为1, 叶子结点的父节点高度为2, 以此类推, 根节点的高度最高										

##### 								层：

​	根节点在第一层, 以此类推

##### 								兄弟节点 ：

​	拥有共同父节点的节点互称为兄弟节点

#### 					6）二叉查找树

​	二叉查找树又称二叉排序树或者二叉搜索树

![image-20221012102511852](D:\yjxz\Review_outline\yjxz\background\_01JavaSE\04gather\document\assets\二叉查找树.png)

##### 								特点：

​	1. 每一个节点上最多有两个子节点

​	2. 左子树上所有节点的值都小于根节点的值

​	3. 右子树上所有节点的值都大于根节点的值

##### 								目的：

​	提高检索数据的性能

##### 								二叉树查找树添节点规则：

​		小的存左边

​		大的存右边

​		一样的不存

##### 								二叉树查找存在的问题：

​	出现瘸子现象, 导致查询的性能与单链表一样, 查询速度变慢

​									 ![image-20221012102803107](D:\yjxz\Review_outline\yjxz\background\_01JavaSE\04gather\document\assets\二叉树查找存在的问题：.png)

#### 			7）平衡二叉树

​		平衡二叉树是在满足查找二叉树的大小规则下, 让树尽可能矮小, 以此提高查数据的性能

##### 						特点：

​		任意节点的左右两个子树的高度差不超过1，任意节点的左右两个子树都是一颗平衡二叉树

​							![image-20221012103020978](D:\yjxz\Review_outline\yjxz\background\_01JavaSE\04gather\document\assets\平衡二叉树.png)

##### 						平衡二叉树在添加元素后可能导致不平衡：

​	基本策略是进行左旋，或者右旋保证平衡

##### 						平衡二叉树-旋转的四种情况

###### 							左左

​	当根节点左子树的左子树有节点插入，导致二叉树不平衡

###### 							左右

​	当根节点左子树的右子树有节点插入，导致二叉树不平衡

###### 							右右

​	当根节点右子树的右子树有节点插入，导致二叉树不平衡

###### 							右左

​	当根节点右子树的左子树有节点插入，导致二叉树不平衡

#### 			8）红黑树

​	红黑树是一种自平衡的二叉查找树

​	每一个节点可以是红或者黑, 但是根结点必须是黑色的

​	红黑树不是通过高度平衡的, 它的平衡是通过“红黑规则”进行实现的

###### 						红黑树规则：

​	1. 节点分为红色或者黑色。

​	2. 根节点必为黑色。

​	3. 叶子节点都为黑色，且为 null。

​	4. 连接红色节点的两个子节点都为黑色（红黑树不会出现红色结点的子节点还是红色结点）

​	5. 从任意节点出发，到其每个叶子节点的路径中包含相同数量的黑色节点

###### 						红黑树数据结构性能：

​	红黑树增删改查的性能都比较好

![image-20221012103759078](D:\yjxz\Review_outline\yjxz\background\_01JavaSE\04gather\document\assets\红黑树.png)

###### 						添加节点

​	添加节点的颜色, 可以是红色, 也可以是黑色,默认用红色, 当添加的节点为根节点时, 直接变成黑色,

​	其余根据红黑规则进行旋转变色调整

###### 						添加节点详细说明：		

​	现在已知插入根节点涂为黑色, 其他节点都是涂红色

​	如果插入结点的父节点为黑色, 就不需要进行旋转变色调整

​	其他情况都需要根据实际选择合适的处理策略进行调整, 使其符合红黑树规则					

###### 						默认用红色结点插入效率高原因：

​	插入红色节点，树的性质可能不会改变, 而插入黑色节点每次都会违反性质如下一个性质

​	从任意节点出发，到其每个叶子节点的路径中包含相同数量的黑色节点）

#### 			9）8种常见数据结构的特点和作用如何解答？

​	队列：先进先出，后进后出

​	栈：后进先出，先进后出

​	数组：内存连续区域，查询快，增删慢

​	链表：元素是游离的，查询慢，首尾操作极快

​	二叉树：永远只有一个根节点, 每个结点不超过2个子节点的树

​	查找二叉树：小的左边，大的右边，但是可能树很高，查询性能变差

​	平衡查找二叉树：让树的高度差不大于1, 增删改查都提高

​	红黑树：就是基于红黑规则实现了自平衡的排序二叉树, 增删改查效率再次提高