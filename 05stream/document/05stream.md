# stream流

## 1. 不可变集合	

​	不可变集合就是不可被修改的集合

​	集合的数据项在创建的时候提供，并且在整个生命周期中都不可改变，否则报错

### 1. 为什么要创建不可变集合？

​	如果某个数据不能被修改，把它防御性地拷贝到不可变集合中是个很好的实践

​	或者当集合对象被不可信的库调用时，不可变形式是安全的

### 2. 如何创建不可变集合？

​	在List、Set、Map接口中，都存在of方法，可以创建一个不可变的集合

​	即该集合创建后不能添加，不能删除，不能修改

 	1. static <E>  List<E>  of(E…elements)：创建一个具有指定元素的List集合对象
 	2. static <E>  Set<E>  of(E…elements)：创建一个具有指定元素的Set集合对象
 	3. static <K , V>   Map<K，V>  of(E…elements)：创建一个具有指定元素的Map集合对象

## 2. Stream流

### 1. 目的

​	Stream流目的是用于简化集合和数组操作的API

### 2. Stream流式思想的核心

1. 先得到集合或者数组的Stream流

​	2. 把元素放上去

​	3. 然后就用这个Stream流简化的API来方便的操作元素

## 3. Stream流的常用操作

### 	1. 获取Stream流

​			创建一条流水线，并把数据放到流水线上准备进行操作

#### 			1. 集合获取Stream流的方式

​					使用Collection接口中的默认方法stream()生成流

​					default Stream<E> stream()：获取当前集合对象的Stream流

#### 		2. 数组获取Stream流的方式

​				public static <T> Stream<T> stream(T[] array)：获取当前数组的Stream流

​				public static<T> Stream<T> of(T... values)：获取当前数组/可变数据的Stream流

### 	2. 中间方法

​		流水线上的操作，一次操作完毕之后，还可以继续进行其他操作

​		中间方法也称为非终结方法，调用完成后返回新的Stream流可以继续使用，支持链式编程

​		在Stream流中无法直接修改集合、数组中的数据

​				Stream<T> filter(Predicate<? super T> predicate)：用于对流中的数据进行过滤

​				Stream<T> limit(long maxSize)：获取前几个元素

​				Stream<T> skip(long n)：跳过前几个元素

​				Stream<T> distinct()：去除流中重复的元素。依赖(hashCode和equals方法)

​				static <T> Stream<T> concat(Stream a, Stream b)：合并a和b两个流为一个流

### 	3. 终结方法

​		一个Stream流只能有一个终结方法，是流水线上的最后一个操作

​		终结操作方法，调用完成后流就无法继续使用了，原因是不会返回Stream了

​				void forEach(Consumer action)：对此流的每个元素执行遍历操作

​				long count()：返回此流中的元素数

## 4. Stream流的收集操作

​		收集Stream流的含义就是把Stream流操作后的结果数据转回到集合或者数组中去

​		Stream流：方便操作集合/数组的手段

​		集合/数组：才是开发中的目的

### 	1. Stream流的收集方法

​			R collect(Collector collector)：开始收集Stream流，指定收集器

​			Collectors工具类提供了具体的收集方式

​			public static <T> Collector toList()：把元素收集到List集合中

​			public static <T> Collector toSet()：把元素收集到Set集合中

​			public static  Collector toMap(Function keyMapper , Function valueMapper)：把元素收集到Map集合中

# 二、函数式接口

## 1. 函数式编程思想与面向对象思想对比

​		面向对象思想强调“必须通过对象的形式来做事情”

​		函数式思想则尽量忽略面向对象的复杂语法：“强调做什么，而不是以什么形式去做”

​		我们前面学习过的Lambda表达式就是函数式思想的体现

## 2. 深入学习Lambda表达式前了解：

​		1. 使用Lambda必须要有接口，并且要求接口中有且仅有一个抽象方法

​		2. 使用Lambda必须有上下文环境，才能推导出Lambda对应的接口

​				根据局部变量的赋值得知Lambda对应的接口：Runnable r = () -> System.out.println("Lambda表达式");

​				根据调用方法的参数得知Lambda对应的接口：new Thread(() -> System.out.println("Lambda表达式")).start();

## 3. 温故Lambda表达式

​			()：方法形式参数为空

​			->：后面要做的事情

​			{ }：方法体中的内容

### 	1. 格式：

​				(形式参数) -> {代码块}

### 	2. 形式参数：

​				1. 如果有多个参数，参数之间用逗号隔开；

​				2. 如果没有参数，留空即可

### 	3. 使用前提:

​				1. 有一个接口

​				2. 接口中有且仅有一个抽象方法

### 	4. 省略规则：

​				1. 参数类型可以省略，但是有多个参数的情况下，不能只省略一个

​				2. 如果参数有且仅有一个，那么小括号可以省略

​				3. 如果代码块的语句只有一条，可以省略大括号和分号，甚至是return

## 4. Lambda表达式和匿名内部类的区别

### 1. 所需类型不同

​	匿名内部类：可以是接口，也可以是抽象类，还可以是具体类

​	Lambda表达式：只能是接口

### 2. 使用限制不同

​	如果接口中有且仅有一个抽象方法，可以使用Lambda表达式，也可以使用匿名内部类

​	如果接口中多于一个抽象方法，只能使用匿名内部类，而不能使用Lambda表达式

### 3. 实现原理不同

​	匿名内部类：编译之后，产生一个单独的.class字节码文件

​	Lambda表达式：编译之后，没有一个单独的.class字节码文件，对应的字节码会在运行的时候动态生成



# 三、接口组成

​		接口的组成常量：

​				接口中组成常量

​				public static final

​		抽象方法：

​				接口中抽象方法

​				public abstract

​		默认方法(Java 8)

​				接口中默认方法

​				默认方法不是抽象方法，所以不强制被重写。但是可以被重写，重写的时候去掉default关键字

​				public可以省略，default不能省略

​				格式：public default 返回值类型 方法名(参数列表) {   }

​				范例： public default void show3() {   }

​		静态方法(Java 8)

​				接口中静态方法

​				静态方法只能通过接口名调用，不能通过实现类名或者对象名调用

​				public可以省略，static不能省略

​				格式：public static 返回值类型 方法名(参数列表) {   }

​				范例： public static void show() {   }

​		私有方法(Java 9)

​				默认方法可以调用私有的静态方法和非静态方法

​				静态方法只能调用私有的静态方法

​				格式1：private 返回值类型 方法名(参数列表) {   }

​				范例1：private void show() {   }

​				格式2：private static 返回值类型 方法名(参数列表) {   }

​				范例2：private static void method() {   }

# 四、方法引用

在使用Lambda表达式的时候，实际上传递进去的代码就是一种解决方案：拿参数做操作

考虑一种情况：

​	如果我们在Lambda中所指定的操作方案，已经有地方存在相同方案，那是否还有必要再写重复逻辑呢？答案肯定是没有必要

那我们又是如何使用已经存在的方案的呢？

​	那么我们就可以用方法引用来使用已经存在的方案自动拿参数直接操作

## 1. 方法引用符

​	:: 该符号为引用运算符，而它所在的表达式被称为方法引用

## 2. Lambda表达式与方法引用比较

### 	1. Lambda表达式

​			usePrintable(s -> System.out.println(s));	

​			分析：拿到参数 s 之后通过Lambda表达式，传递给 System.out.println 方法去处理

### 	2. 方法引用

​			usePrintable(System.out::println);

​			分析：直接使用 System.out 中的 println 方法来取代Lambda，代码更加的简洁

### 	3. 推导与省略

​			1. 如果使用Lambda，那么根据“可推导就是可省略”的原则，无需指定参数类型，也无需指定的重载形式，它们都将被自动推导

​			2. 如果使用方法引用，也是同样可以根据上下文进行推导

​			3. 方法引用是Lambda的孪生兄弟

## 2.  Lambda表达式支持的方法引用

### 	常见引用方式：

#### 		1. 引用类方法

​				引用类方法，其实就是引用类的静态方法

​				格式：类名::静态方法

​				范例：Integer::parseInt

​					Integer类的方法：public static int parseInt(String s) 将此String转换为int类型数据

#### 		2. 方法引用对象的实例方法

​				引用对象的实例方法，其实就引用类中的成员方法

​				格式：对象::成员方法

​				范例： "HelloWorld"::toUpperCase

​					String类中的方法：public String toUpperCase() 将此String所有字符转换为大写

#### 		3. 引用类的实例方法

​				引用类的实例方法，其实就是引用类中的成员方法

​				格式：类名::成员方法

​				范例：String::substring

​				String类中的方法： public String substring(int beginIndex,int endIndex) 

​				从beginIndex开始到endIndex结束，截取字符串。返回一个子串，子串的长度为endIndex-beginIndex

#### 		4. 引用构造器

​				引用构造器，其实就是引用构造方法

​				格式：类名::new

​				范例：Student::new
