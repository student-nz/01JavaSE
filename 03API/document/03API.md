​							

# 常用API

```
API (Application Programming Interface,应用程序编程接口)就是Java写好的技术(功能代码),我们可以直接调用

Oracle 也为Java提供的这些功能代码提供了相应的API文档(技术使用说明书)

下载API文档：http://www.oracle.com/technetwork/java/javase/downloads/index.html 
```

# 	1. Random

```
Random可以用来产生随机数

使用步骤：
	1. import java.util.Random;（导包）
	
	2. Random r = new Random();（创建对象）
	
	3. int number = r.nextInt(n);(生成 [0,n) 的随机数,包左不包右)
```

# 	2. Scanner

```
Scanner可以用来进行键盘录入

使用步骤：
	1. impot java.util.Scanner;（导包）
	
	2. Scanner sc = new Scanner(System.in);（创建对象）

	3. int i = sc.nextInt();（接收数据）
```

# 3. String

```
java.lang.String类代表字符串

java.lang.String类被称为不可变字符串类型,

java.lang.String类的对象在创建后不能被更改

java.lang.String类实际上是一个用final修饰的字符数组, 更底层实际就是final修饰的字节数组

以“”方式给出的字符串对象，在堆内存中的字符串常量池中存储
```

## 			1. 创建字符串对象的2种方式

### 						1. 直接使用“”定义

```
String name = "政哥";
```

### 						2. 构造器创建对象

```
public String()：创建一个空白字符串对象，不含有任何内容

public String(String original)：根据传入的字符串内容，来创建字符串对象

public String(char[] chs)：根据字符数组的内容，来创建字符串对象

public String(byte[] chs)：根据字节数组的内容，来创建字符串对象
```

### 						3. 两者创建区别

```
以“”方式给出的字符串对象,在字符串常量池中存储,而且相同内容只会在内存中存储一份

通过构造器new对象,每new一次都会产生一个新对象存放在堆内存中
```

## 	2. 常用API	

### 					1. 字符串内容比较

```
字符串的内容比较不适合用“==”比较，因为 == 比较的是地址

public boolean equals(Objectan Object)：
	将此字符串与指定对象进行比较, 只关心字符内容是否一致！
			
public boolean equalsIgnoreCase(String anotherString)：
	将此字符串与指定对象进行比较, 忽略大小写比较字符, 只关心字符内容是否一致！			
```

### 			2. 字符与字符串操作

```
public char charAt(int index)：
	根据下标找到指定的字符

public char[] toCharArray()：
	以字符数组的形式返回全部的字符串内容

public String(char[] value)：
	将全部的字符数组变为字符串

public String(char[] value,int offset,int count)：
	将指定范围的字符数组变为字符串
```

### 		3. 字节与字符串操作

```
public byte[] getBytes()：
	将字符串变为字节数组

public String(byte[] bytes)：
	将字节数组转换为字符串

public String(byte[] bytes,int offset,int length)：
	将指定范围的字节数组变为字符串

public String(byte[] bytes, String charsetName)：
	通过使用指定的 charset 解码指定的 byte 数组，构造一个新的 String
```

### 		4. 是否指定内容开头/结尾

```
public boolean startsWith(String prefix)：
	从第一个位置开始判断是否以指定的内容开头

public boolean startsWith(String prefix,int toffset)：
	从指定的位置开始判断是否以指定的内容开头

public boolean endsWith(String suffix)：
	判断是否以指定的内容结尾
```

### 		5. 替换

```
public String replace(char oldChar,char newChar)：
	替换指定字符

public String replace(CharSequence target, CharSequence replacement)：
	替换指定字符串

public String replaceAll(String regex,String replacement)：
	替换指定的字符串

public String replaceFirst(String regex,String replacement)：
	替换第一个满足条件的字符串
```

### 		6. 拆分

```
public String[] split(String regex)：
	按照指定的字符串拆分

public String[] split(String regex,int limit)：
	拆分字符串，并指定拆分的个数
```

### 		7. 查找			

```
public boolean contains(String s)：
	返回一个字符串是否存在

public int indexOf(int ch)：
	从头查找指定的字符是否存在, char -> int, 如果存在则返回位置, 如果不存在则返回“-1”

public int indexOf(int ch,int fromIndex)：
	从指定位置查找指定的字符是否存在，char > int，如果存在则返回位置，如果不存在则返回“-1”

public int indexOf(String str)：
	从头查找指定的字符串是否存在, 如果存在则返回位置, 如果不存在则返回“-1”

public int indexOf(String str,int fromIndex)：
	从指定位置查找字符串是否存在, 如果存在则返回位置, 如果不存在则返回“-1”

public int lastIndexOf(int ch)：public int lastIndexOf(int ch,int fromIndex)：
	类似

public int lastIndexOf(String str)：
	类似

public int lastIndexOf(String str,int fromIndex)：
	类似
```

### 		8. 其它操作

```
public boolean isEmpty()：
	字符串是否为空

public int length()：
	字符串长度

public String toLowerCase()：
	转小写

public String toUpperCase()：
	转大写

public String trim()：
	字符串两边去空白

public String concat(String str)：
	字符串拼接操作
```

### 9. 源码分析：

```
java.lang.String类是一个final类, 意味着该类不能再有子类

String类底层是一个字符数组final char value[] 该数组是final修饰的,意味着字符串一旦创建,就不能再修改, 
那么我们实际上修改字符串其实是产生了新字符串对象

String也叫做不可修改的字符串常量类

判断字符串文本是否相同 不能选择 == 因为不确定两个字符串对象是否是直接指向常量池还是指向堆内存
```

### 10. 关于常量池：			

![image-20221011123600119](assets\String源码分析.png)

![image-20221011123854098](assets\关于常量池1.png)

![image-20221011123917568](assets\关于常量池2.png)



### 11. String类的equals()源码分析：

​	![image-20221011124452695](assets\#### String类的equals()源码分析.png)

### 12. String类concat方法源码分析：

​	![image-20221011124601475](assets\String类concat方法源码分析.png)

### 13. String类length()源码分析

![image-20221011124638616](assets\String类length()源码分析.png)  

# 4. StringBuilder

```
StringBuilder是一个可变的字符串类, 是一个对象容器, 简称字符串缓冲区

StringBuilder存在目的就是为了提高字符串的操作效率, 如：拼接、修改等
```

## 					1. 创建StringBuilder

```
public StringBuilder()：
	创建一个空白的可变的字符串对象，不包含任何内容

public StringBuilder(String str)：
	创建一个指定字符串内容的可变字符串对象
```

## 				2. 拼接-反转-长度-转换		

```
public StringBuilder append(任意类型)：
	添加数据并返回StringBuilder对象本身

public StringBuilder reverse()：
	将对象的内容反转

public int length()：
	返回对象内容长度

public String toString()：
	通过toString()就可以实现把StringBuilder转换为String
```

## 				3. String类拼接字符串原理图

## ![image-20221010170148174](assets\String类拼接字符串原理图.png)	4. StringBuilder提高效率原理图

![image-20221010170449665](assets\StringBuilder提高效率原理图.png)

## 		5. 三者区别区别	

```
String类：内容是不可变的

StringBuffer与StringBuilderr类：内容是可变的

StringBuffer与StringBuilder的API类似,且都是带缓冲区的可变长度字符串

String因为是不可修改的字符串,在处理文字时StringAPI面临效率不高问题,

所以及StringBuffer和StringBuilder就是为了解决这一问题而存在的类

StringBuffer线程安全, 同步, 运行速度慢,不建议采用

StringBuilder线程不安全,不同步,运行速度快于StringBuffer,工作中采用该方法,安全问题自己避免即可
```

# 5. ArrayList

```
集合是一种容器,与数组类似,不同的是集合集合大小不固定,可以动态变化,类型也可以选择不固定,而数组类型确定、长度固定

java.util.ArrayList是集合类,同时ArrayList是属于集合中的一种且支持索引
```

## 				1. 数组与集合应用场景

```
元素个数不确定,且要进行增删操作的业务场景,选择集合而不是数组,

元素个数确定且大小固定不变的业务场景选择数组而不是集合,例如：连连看、扫雷、魔塔设计关卡图
```

## 				2. ArrayList对于泛型的支持

```
ArrayList<E>其实就是一个泛型类,可以在编译阶段约束集合对象只能操作某种数据类型
集合中只能存储引用类型，不支持基本数据类型，且集合中存储的元素并不是对象本身，而是对象的地址，

例如：
	ArrayList<String> ：此集合只能操作字符串类型的元素
	ArrayList<int>（错误写法，因为集合中只能存储引用类型，不支持基本数据类型）
	ArrayList<Integer>：此集合只能操作整数类型的元素
	（正确写法,因为集合中只能存储引用类型,不支持基本数据类型,所以要想存储基本数据类型元素，
		就要利用基本数据类型对应包装类存储相应元素）
```

## 				3. 常用API

### 							1. 创建集合容器

```
public ArrayList()：创建一个空的集合对象
```

### 							2. 增删改查+大小	

```
public boolean add(E e)：将指定的元素追加到此集合的末尾

public void add(int index,E element)：在此集合中的指定位置插入指定的元素

public E remove(int index)：删除指定索引处的元素，返回被删除的元素

public boolean remove(Object o)：删除指定的元素，返回删除是否成功

public E set(int index,E element)：修改指定索引处的元素，返回被修改的元素

public E get(int index)：返回指定索引处的元素

public int size()：返回集合中的元素的个数
```

### 		3.  集合遍历

![image-20221010112434825](assets\集合遍历.png)

# 6. Object

```
Object类的方法是一切子类对象都可以直接使用的

Object类是Java中的祖宗类,一个类要么默认继承了Object类, 要么间接继承了Object类
```

## 			 1. 常用API			

```
public String toString()：
	默认是返回当前对象在堆内存中的地址信息:类的全限名@内存地址
	直接打印对象就是调用该方法, 默认是输出对象在堆内存的地址
	要想输出对象内容, 就需要重写toString方法
	所以父类toString()方法存在的意义就是为了被子类重写, 以便返回对象的内容信息, 而不是地址信息


public boolean equals(Object o)：
	默认是与另一个对象比较地址是否一样, 相同返回true, 不同返回false
	让子类重写，以便比较2个子类对象的内容是否相同
	由于直接比较两个对象的地址是否相同完全可以用“==”替代equals
	所以父类equals方法存在的意义就是为了被子类重写, 以便子类自己来定制比较规则			
```

![image-20221108084801517](assets\image-20221108084801517.png)

# 	7. Objects（对象工具类）

```
Objects是一个工具类, 提供了一些方法去完成一些功能

官方在进行字符串比较时, 没有用字符串对象的的equals方法而是选择了Objects的equals方法来比较

因为使用Objects的equals方法在进行对象的比较会更安全
```

## 				1. 相关API

```
public static boolean equals(Object a, Object b)：
	比较两个对象, 底层会先进行非空判断,从而可以避免空指针异常, 再进行equals比较

public static boolean isNull(Object obj)
	判断变量是否为null ,为null返回true ,否则, 返回false
```

## 2. Objects的equals源码分析：

​	![image-20221010160508162](assets\源码分析.png)

# 8. Arrays类(数组工具类)

```
数组操作工具类, 专门用于操作数组元素的
```

| public static String toString(类型[] a)                      | 返回数组的内容（字符串形式）                     |
| ------------------------------------------------------------ | ------------------------------------------------ |
| public static void sort(类型[] a)                            | 对数组进行默认升序排序                           |
| public static <T> void sort(类型[] a, Comparator<? super T> c) | 使用比较器对象自定义排序                         |
| public static int binarySearch(int[] a, int key)             | 二分搜索数组中的数据，存在返回索引，不存在返回-1 |

# 9. Math(数学工具类)

| public static int abs(int a)                | 返回参数的绝对值                               |
| ------------------------------------------- | ---------------------------------------------- |
| public static double ceil(double a)         | 返回大于或等于参数的最小double值，等于一个整数 |
| public static double floor(double a)        | 返回小于或等于参数的最大double值，等于一个整数 |
| public static int round(float a)            | 按照四舍五入返回最接近参数的int                |
| public static int max(int a,int b)          | 返回两个int值中的较大值                        |
| public static int min(int a,int b)          | 返回两个int值中的较小值                        |
| public static double pow(double a,double b) | 返回a的b次幂的值                               |
| public static double random()               | 返回值为double的正值，[0.0,1.0)                |

# 10. System(系统工具类)

```
public static void exit(int status)：终止当前运行的 Java 虚拟机，非零表示异常终止

public static long currentTimeMillis()：返回当前系统的时间毫秒值形式

public static void arraycopy(数据源数组, 起始索引, 目的地数组, 起始索引, 拷贝个数)：数组拷贝
```

# 11. BigDecimal（大数字类）

## 				1. 作用

```
用于解决浮点型运算精度失真的问题
例如：浮点型运算的时候直接 + - * / 可能会出现数据失真问题（精度丢失问题）
```

![image-20221010170940575](assets\image-20221010170940575.png)

## 			2. 如何使用

```
BigDecimal对象通过调用方法valueOf(double val)获取：BigDecimal b1 = BigDecimal.valueOf(0.1);

public static BigDecimal valueOf(double val): 包装浮点数成为BigDecimal对象
```

## 		3. Bigecima常用API

```
public BigDecimal add(BigDecimal b)：加法

public BigDecimal subtract(BigDecimal b)：减法

public BigDecimal multiply(BigDecimal b)：乘法

public BigDecimal divide(BigDecimal b)：除法

public BigDecimal divide (另一个BigDecimal对象，精确几位，舍入模式)：除法
	参数1：表示参与运算的BigDecimal 对象
	参数2 ：表示小数点后面精确到多少位
	参数3： 
		BigDecimal.ROUND_UP：进一法  
		BigDecimal.ROUND_FLOOR：去尾法  
		BigDecimal.ROUND_HALF_UP：四舍五入
```

# 12. Date

```
Date类代表当前所在系统的日期时间信息
```

## 					1. 创建日期对象

| public Date()          | 分配一个 Date对象，并初始化，以便它代表它被分配的时间，精确到毫秒 |
| ---------------------- | ------------------------------------------------------------ |
| public Date(long date) | 分配一个 Date对象，并将其初始化为表示从标准基准时间起指定的毫秒数 |

## 					2. 获取和设置时间

| public long getTime()          | 获取的是日期对象从1970年1月1日 00:00:00到现在的毫秒值 |
| ------------------------------ | ----------------------------------------------------- |
| public void setTime(long time) | 设置时间，给的是毫秒值                                |

# 	13. SimpleDateFormat

```
完成日期时间的格式化操作的类
```

## 						1. 格式化

```
Date对象 -> 2099年11月11日 11:11

时间毫秒值 -> 2099年11月11日 11:11
```

## 2. 格式化时间常用模式

```
y	年  

M	月  

d	日  

H	时  

m	分  

s	秒

2020-11-11 13:27:06  -> yyyy-MM-dd HH:mm:ss  

2020年11月11日 13:27:06  -> yyyy年MM月dd日 HH:mm:ss  
```

## 						3. 构造方法

```
public SimpleDateFormat()：
	构造一个SimpleDateFormat，使用默认模式和日期格式

public SimpleDateFormat(String pattern)：
	构造一个SimpleDateFormat使用给定的模式和默认的日期格式
```

## 						4. 格式化和解析日期

```
public final String format(Date date)：
	将日期格式化成日期/时间字符串

public final String format(Object time)：
	将时间毫秒值式化成日期/时间字符串

public Date parse(String source)：
	从给定字符串的开始解析文本以生成日期
```

# 	14. Calendar

```
Calendar代表了系统此刻日期对应的日历对象

Calendar是一个抽象类, 不能直接创建对象
```

## 				1. 创建日历对象(单例模式)

```
public static Calendar getInstance()：获取当前日历对象	
```

## 				2. 相关API

```
calendar是可变日期对象, 一旦修改后其对象本身表示的时间将产生变化

public int get(int field)：取日期中的某个字段信息

public void set(int field,int value)：修改日历的某个字段信息

public void add(int field,int amount)：  为某个字段增加/减少指定的值

public final Date getTime()：拿到此刻日期对象

public long getTimeInMillis()：拿到此刻时间毫秒值
```

# 15. JDK8新增日期类

```
Java 8开始, java.time包提供了新的日期和时间API, 主要涉及的类型如下：
```

​		![image-20221010173532411](assets\JDK8新增日期类.png)

​		

```
新增的API严格区分了时刻、本地日期、本地时间，并且，对日期和时间进行运算更加方便，
其次, 新API的类型几乎全部是不可变类型（与String的使用类似）,可放心使用而不必担心被修改
```

## 	1. LocalDate/LocalTime/LocalDateTime

```
LocalDate和LocalTime和LocalDateTime分别表示日期、时间、日期时间对象, 他们的类的实例是不可变的对象

LocalDate和LocalTime和LocalDateTime三者构建对象和API是通用的
```

### 		1. 三者构建对象的API

```
public static Xxxx now();：静态方法, 根据当前时间创建对象
	LocaDate localDate = LocalDate.now();
	LocalTime localTime = LocalTime.now();
	LocalDateTime localDateTime = LocalDateTime.now();

public static Xxxx of(…);：静态方法, 指定日期/时间创建对象
	LocalDate localDate1 = LocalDate.of(2099 , 11,11);
	LocalTime localTime1 = LocalTime.of(11, 11, 11);
	LocalDateTime localDateTime1 = LocalDateTime.of(2020, 10, 6, 13, 23, 43);
```

### 		2.  三者获取信息的API

```
public int geYear()：  获取年

public int getMonthValue()：  获取月份（1-12）

Public int getDayOfMonth()：  获取月中第几天乘法

Public int getDayOfYear()：  获取年中第几天

Public DayOfWeek getDayOfWeek()：获取星期			
```

### 	3. 转换相关的API

```
public LocalDate toLocalDate()：转换成一个LocalDate对象

public LocalTime toLocalTime()：转换成一个LocalTime对象
```

### 	4.  修改相关的API

```
LocalDateTime 综合了 LocalDate 和 LocalTime 里面的方法

这些方法返回的是一个新的实例引用, 因为LocalDateTime 、LocalDate 、LocalTime 都是不可变的
```

| plusDays, plusWeeks, plusMonths, plusYears         | 向当前 LocalDate 对象添加几天、 几周、几个月、几年           |
| -------------------------------------------------- | ------------------------------------------------------------ |
| minusDays, minusWeeks, minusMonths, minusYears     | 从当前 LocalDate 对象减去几天、 几周、几个月、几年           |
| withDayOfMonth, withDayOfYear, withMonth, withYear | 将月份天数、年份天数、月份、年 份 修 改 为 指 定 的 值 并 返 回 新 的 LocalDate 对象 |
| isBefore, isAfter                                  | 比较两个 LocalDate                                           |

## 	2. Instant时间戳

```
JDK8获取时间戳特别简单, 且功能更丰富, Instant类由一个静态工厂方法now()可以返回当前时间戳

时间戳是包含日期和时间的, 与java.util.Date很类似,事实上Instant就是类似JDK8 以前的Date

Instant和Date这两个类可以进行转换
```

​				![image-20221010174816928](assets\Instant.png)

## 	3. 日期与时间格式化器

```
在JDK8中, 引入了一个全新的日期与时间格式器DateTimeFormatter，正反都能调用format方法
```

​			![image-20221010174928579](assets\日期与时间格式化器.png)

## 	4. Duration/Period

​				

```
在Java8中, 我们可以使用以下类来计算日期间隔差异：
	java.time.Period（用于计算两个“日期”间隔）
	java.time.Duration（用于计算两个“时间”间隔）
```

### 						1. Period

```
Period 类方法 getYears(), getMonths(), getDays() 用来计算,只能精确到年月日

应用场景：
	用于 LocalDate 之间的比较
```

​					![image-20221010175221477](assets\Period0.png)

### 					2.Duration			

```
提供了使用基于时间的值测量时间量的方法

应用场景：
	用于 LocalDateTime 之间的比较, 也可用于 Instant 之间的比较
```

​					![image-20221010175342080](assets\Duration.png)

## 	5. ChronoUnit

```
java.time.temporal.ChronoUnit工具类可用于在单个时间单位内测量一段时间, 可以用于比较所有的时间单位
```

​			![image-20221010175548510](assets\ChronoUnit.png)

#   16. 包装类

```
包装类其实就是8种基本数据类型对应的引用类型
```

| 基本数据类型 | 引用数据类型 |
| ------------ | ------------ |
| byte         | Byte         |
| short        | Short        |
| int          | Integer      |
| long         | Long         |
| char         | Character    |
| float        | Float        |
| double       | Double       |
| boolean      | Boolean      |

## 1. 为什么提供包装类？

```
目的就是Java为了实现一切皆对象, 为8种基本类型提供了对应的引用类型,

同时, 集合和泛型也只能支持包装类型, 不支持基本数据类型, 所以需要包装类进行替换基本数据类型

包装类变量的默认值可以是null, 容错率更高
```

## 2. 包装类装箱和拆箱

```
JDK5之后出现的自动装箱与拆箱

自动装箱：基本类型的数据和变量可以直接赋值给包装类型的变量

自动拆箱：包装类型的变量可以直接赋值给基本数据类型的变量
```

## 3. 包装类的特有功能

```
1. int 转换为 String
	public static String valueOf(int i)：返回 int 参数的字符串表示形式, 该方法是 String 类中的方法
	类推

2. String 转换为 int
		public static int parseInt(String s)：将字符串解析为 int 类型, 该方法是 Integer 类中的方法
				类推
```

## 	4. 包装一个对象中的原始类型 int 的值

| public Integer(int value)               | 根据 int 值创建 Integer 对象(过时）      |
| --------------------------------------- | ---------------------------------------- |
| public Integer(String s)                | 根据 String 值创建 Integer 对象(过时)    |
| public static Integer valueOf(int i)    | 返回表示指定的 int 值的 Integer 实例     |
| public static Integer valueOf(String s) | 返回一个保存指定值的 Integer 对象 String |

## 5. 包装类的缓存技术

```
包装类在使用时,某些特殊的包装类会预先在内存上创建一些包装类对象作为缓存

当我们使用的包装类对象数字范围在指定的范围之内时,就会使用缓存中的对象

以Integer为例  
	low -128 
	high 127
	Integer cache[]：Integer对象数组
	Integer是一个final修饰的最终类
```

### 	1. 源码分析：

![image-20221011123351786](D:\yjxz\Review_outline\yjxz\background\_01JavaSE\03API\document\assets\Integer.png)

​		![image-20221011100819337](assets\包装类缓存技术1.png)

### 			2. valueOf方法：

![image-20221011100857592](assets\包装类缓存技术2.png)

![image-20221011101124262](assets\包装类缓存技术3.png)

​		

```
包装类作为方法形参,采用按值传递还是按引用传递?
	
	当参数是基本数据类型时 按值传递 实参和形参在内存上是两个独立的变量 修改形参不会对实参产生影响
	
	当参数是引用数据类型时 按引用传递 实参和形参执行堆内存上同一个地址 修改形参会对实参产生影响
	
	但是包装类不是！
		如下代码 结果是什么? 如何解释? 
		
		包装类作为方法参数仍然是按引用传递, 但是包装类的特点是内部存储的值是不可以修改的 
		内部维护了一个  final修饰的 对应的基本数据类型的常量 
		自动装箱技术在给包装类赋值时 调用valueOf方法 valueOf方法会给我们返回一个新对象 
		在方法中修改包装类其实是让形参指向了内存上另一个包装类对象 并没有也不可能影响实参
```

​		![image-20221011121705070](assets\Integer缓存技术.png)

# 17. 正则表达式

```
正则表达式就是用来一些规定的字符来制定规则, 并用来校验数据格式的合法性（其实学习JS那块有正则表达式介绍）
```

## 	1. 字符串相关API：

```
public boolean matches(String regex)：判断是否匹配正则表达式，匹配返回true，不匹配返回false
```

![image-20221010180840295](assets\正则表达式.png)

## 2. 正则表达式在字符串API中的使用

```
public String replaceAll(String regex,String newStr)：按照正则表达式匹配的内容进行替换

public String[] split(String regex)：按照正则表达式匹配的内容进行分割字符串, 反回一个字符串数组
```

# 18. IDEA生成API接口文档

```
	点击上方Tools中的Generate JavaDoc…
	. . .

	提供一个思路, 具体用到, 知道这样解决即可

	使用Javadoc生成的API接口文档是html格式
```

