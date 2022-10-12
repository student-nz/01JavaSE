# 一、Java入门

# 1）什么是Java

​	一种纯面向对象的编程语言

​	一种与平台无关（跨平台）的语言（它提供了在不同平台下运行的解释环境）

​	一种健壮的语言，吸收了C/C++语言的优点

​	有较高的安全性。(自动回收垃圾，强制类型检查，取消指针)

# 2）安装JDK

​		要想运行Java程序，第一件事就是安装JDK(Java Development Kit)即Java开发工具

​		且JDK放在一个不包含中文的目录下，避免后续出现各种问题

​	JDK16直接下载地址：https://www.oracle.com/java/technologies/javase-jdk16-downloads.html

## 1. 配置环境变量

​	JDK安装之后，第一件事情即配置JDK环境变量

​		1. JAVA_HOME：D:\development\Java\jdk-16.0.2

​		2. Path

​				%JAVA_HOME%\bin（JDK提供的javac编译命令，java执行命令）

​				%JAVA_HOME%\jre\bin

## 2. 检测JDK是否安装完毕

​		java -version或javac -version

## 3. JDK的安装目录

​		bin：存放JDK的各种工具命令,javac和java命令就在该目录下

​		conf：存放JDK相关配置文件

​		include：存放一些平台特定的头文件

​		jmods：存放JDK的各种模块

​		legal：存放JDK各模块的授权文档

​		lib：存放JDK工具的一些补充JAR包

## 3. 编写代码步骤

​	1. 编写HelloWorld.java

​	2. 编译HelloWorld（javac HellWorld.java）

 	3. 执行HelloWorld（java HelloWorld）

## 4. 记事本编写代码常见问题

​	1. 扩展名被隐藏

​	2. 文件名和类名不一致

​	3. 大小写错误，单词拼写错误，存在中文符号，找不到main方法

​	4. 括号不配对

​	5. 编译或者执行命令使用不当

## 5. cmd相关命令

​	1. 盘符切换：D:

​	2. 查看当前路径下的内容：dir

	3. 进入单级目录：cd 目录
	3. 回退到上一级目录：cd ..
	3. 进入多级目录：cd 目录1\目录2\...
	3. 回退到盘符目录：cd \
	3. 清屏：cls
	3. 退出命令提示符窗口：exit

## 6. JDK、JRE、JVM关系

JVM(Java Virtual Machine): Java虚拟机, 真正运行Java程序的地方

JDK(Java Development Kit): Java开发工具,包含java编译器、java虚似机以及java帮我们写好的程序...等所有java的开发、运行需要的东西

JRE(Java Runtime Environment): Java运行时环境,只包含java虚似机、以及java帮我们写好的程序等java运行所需的东西

![image-20221009122806896](D:\yjxz\Review_outline\yjxz\background\document\assets\JDK、JRE、JVM关系.png)

## 7. Java程序跨平台工作原理

​		Java跨平台是通过Java虚拟机JVM实现的，Java 编译程序将 Java 源程序翻译为 JVM 可执行代码（字节码）

​		对于不同的运行平台，有不同的JVM，JVM 屏蔽了底层运行平台的差别，实现了”一次编译，随处运行”

# 3）开发Java程序

### 	1. 文本编辑器开发

​		 记事本、NotePad++、sublime . . .

### 	2. 集成开发环境

​		1. 什么是集成开发环境？

​				集成开发环境(IDE, Integrated Development Environment)就是把代码编写，编译，执行等多种功能综合到一起的开发工具

​				可以进行代码智能提示，错误提醒，项目管理等等

### 	3. 常见Java IDE工具

​			Eclipse、MyEclipse、IntelliJ IDEA、Jbuilder、NetBeans

### 	4. IntelliJ IDEA开发工具

​			IntelliJ IDEA 一般简称IDEA,是Java编程语言开发的集成环境,目前在业界内被公认为最好的java开发工具

​			IDEA官网：https://www.jetbrains.com/idea/

### 5. eclipse开发工具

​			eclipse官网：http://www.eclipse.org/downloads/eclipse-packages/

#### 			IDEA项目结构：

​				project（项目、工程）

​				module（模块）

​				package（包）

​				class（类）

​				![image-20221009124232997](D:\yjxz\Review_outline\yjxz\background\_01JavaSE\01JavaSE入门\document\assets\IDEA项目结构.png)

#### 	IDEA 常用快捷键：

​		main/psvm、sout . . .：快速导入相关带啊吗

​		ctrl + D：复制当前行数据到下一行

​		ctrl + Y：删除所在行

​		ctrl + Alt + L：格式化代码

​		Alt + Shift + ↑,↓：上下移动当前代码

​		ctrl + /：单行注释

​		ctrl + shift + /：多行注释

# 4）注释

​		注释即对代码进行解释说明的文字，方便自己和其他人理解、查看，不会影响程序的正常执行

​		三种注释：

​			单行注释：// 

​			多行注释：/* */

​			文档注释：/** */

# 5）字面量

​	字面量就是由字母,数字等构成的字符串或者数值

​	或说字面量就是用于表达源代码中一个固定值的表示法

![image-20221009125037999](D:\yjxz\Review_outline\yjxz\background\_01JavaSE\01JavaSE入门\document\assets\字面量类型.png)

# 6）常量

​	常量就是在程序运行过程中，其值不可以发生改变的量

​	6种常量：字符串常量、整数常量、小数常量、字符常量、布尔常量、空常量

![image-20221009170524484](D:\yjxz\Review_outline\yjxz\background\_01JavaSE\01JavaSE入门\document\assets\常量.png)

# 7）变量

​	变量就是在程序运行过程中,其值可以发生改变的量

​	也可以说变量就是存储一个数据的内存区域,且里面存储的数据可以变化

​	使用格式：

​			数据类型 变量名称 = 初始值;

# 8）数据类型

​	数据类型就是约束变量存储数据的形式

​	同时Java语言是强类型语言,对于每一种数据都给出了明确的数据类型

​	不同的数据类型也分配了不同的内存空间,所以它们表示的数据大小也是不一样的

![image-20221009170858707](D:\yjxz\Review_outline\yjxz\background\_01JavaSE\01JavaSE入门\document\assets\数据类型.png)

​	使用格式：

​			数据类型变量名称= 初始值;

​	Java数据类型分两类：

​			1. 引用数据类型：

​			2. 基本数据类型：

​				随便写一个整数字面值，默认是int类型的，如果希望随便写一个整数默认是long型的必须在数据后加L或者l表示

​				随便写一个小数字面值，默认是double类型的，如果希望这个小数是float类型的，必须在数据后加F或者f表示

​			基本数据类型分4类8种

![image-20221009170930935](D:\yjxz\Review_outline\yjxz\background\_01JavaSE\01JavaSE入门\document\assets\基础数据类型分类.png)

​		

# 9）ASCII

​			ASCII(American Standard Code for Information Interchange)即美国信息交换标准编码

​			就是一套现代英语、数字、和其他西欧字符（不含中文）的编号规则

​			字符在计算机底层就是存储其编号的二进制形式

​		![image-20221009125649179](D:\yjxz\Review_outline\yjxz\background\_01JavaSE\01JavaSE入门\document\assets\ASCII.png)

# 10）关键字、标志符

## 		关键字

​				关键字即Java自己保留的一些单词，作为特殊功能的，例如：public、class、byte、short、int、long、double… 

​				![image-20221009125829761](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20221009125829761.png)

## 	标识符

​			标志符就是由一些字符、符号组合起来的名称，用于给类，方法，变量等起名字的规范

### 		标识符要求：

​			标识符要求由数字、字母、下划线(_)和美元符($)等组成

​			区分大小写

​			不能以数字开头

​			不能是关键字

### 		命名规范：

​				小驼峰命名法：方法、变量名

​						标识符是一个单词的时候，首字母小写,如：name

​						标识符由多个单词组成的时候，第一个单词首字母小写，其他单词首字母大写,如：firstName

​				大驼峰命名法：类、接口

​						标识符是一个单词的时候，首字母大写,如： Student

​						标识符由多个单词组成的时候，每个单词的首字母大写,如：GoodStudent

# 11）类型转换

## 		自动类型转换

​					类型范围小的变量，可以直接赋值给类型范围大的变量

## 		表达式的自动类型转换

​					表达式的最终结果类型由表达式中的最高类型决定

​					在表达式中，byte、short、char 是直接转换成int类型参与运算的

## 		强制类型转换

​				强行将类型范围大的变量、数据赋值给类型范围小的变量,但是强制类型转换可能造成数据(丢失)溢出，

​				就如浮点型强转成整型，直接丢掉小数部分，保留整数部分返回

​				使用格式：

​					数据类型 变量2 = (数据类型)变量1、数据;

# 	12）运算符

## 		基本算数运算符

​					+	-	 *	 /	 %

## 		+符号做连接符

​					用于字符串拼接

## 		自增自减运算符

​					++	--

​					++ 、-- 只能操作变量，不能操作字面量

​					++ 、-- 既可以放在变量的后边,也可以放在变量的前边

​					如果单独使用放前后是没有区别的

​					如果非单独使用且在变量前,就会先进行变量自增/自减,再使用变量

​					如果非单独使用且在变量后,就会先使用变量,再进行变量自增/自减

## 		赋值运算符

​				=	+=	-=	*=	/=	%=

​				扩展赋值运算符隐含了强制类型转换

## 		关系运算符

​				==	!=	>	>=	<	<=

## 		逻辑运算符

​				&	|	!	^	&&	||

## 		三元运算符

​				条件表达式 ? 值1 : 值2;

## 		运算符优先级

​				无需记

​				![image-20221009132113723](D:\yjxz\Review_outline\yjxz\background\_01JavaSE\01JavaSE入门\document\assets\运算符优先级.png)

# 13）程序流程控制

## 	顺序结构

​				代码从上往下执行	

## 	分支结构

### 			if

​	![image-20221009132438938](D:\yjxz\Review_outline\yjxz\background\_01JavaSE\01JavaSE入门\document\assets\if格式.png)

### 	switch

​			表达式类型只能是byte、short、int、char，JDK5开始支持枚举，JDK7开始支持String、不支持double、float、long

​			case给出的值不允许重复且只能是字面量,即不能是变量

​			如果不写break跳出switch语句，会出现穿透现象

​			default就是case所给情况都不匹配，即会执行该默认代码

![image-20221009132513365](D:\yjxz\Review_outline\yjxz\background\_01JavaSE\01JavaSE入门\document\assets\switch.png)

## 	循环结构

​		什么时候用for循环，什么时候用while循环以及什么时候用do-while循环?

​			知道循环次数使用for，不知道循环次数建议使用while，

​			如果特殊要求必须先执行一次再判断循环条件那就用do-while

### 		for

​			![image-20221009132742020](D:\yjxz\Review_outline\yjxz\background\_01JavaSE\01JavaSE入门\document\assets\for循环.png)

### 		while

​				![image-20221009132828683](D:\yjxz\Review_outline\yjxz\background\_01JavaSE\01JavaSE入门\document\assets\while循环.png)

### 		do-while

​				do-while循环即先执行一次再判断循环条件

​				![image-20221009133009638](D:\yjxz\Review_outline\yjxz\background\_01JavaSE\01JavaSE入门\document\assets\do-while.png)

### 死循环

​	无限循环即如果没有其它条件干预循环，循环就不会停止下来

​	![image-20221009133121591](D:\yjxz\Review_outline\yjxz\background\_01JavaSE\01JavaSE入门\document\assets\死循环.png)

### 循环嵌套

​	循环嵌套即循环中又包含循环

​	![image-20221009133159662](D:\yjxz\Review_outline\yjxz\background\_01JavaSE\01JavaSE入门\document\assets\循环嵌套.png)

### 跳转关键字

​	break：只能用于结束所在循环, 或者结束所在switch分支的执行

​	continue：跳出当前循环的当次执行进入下一次循环,且只能在循环中使用

​	break可以用在嵌套循环中跳出整个外部循环并立即结束它

​	![image-20221009133757602](D:\yjxz\Review_outline\yjxz\background\_01JavaSE\01JavaSE入门\document\assets\跳转整个外部循环.png)

​	continue可以用在嵌套循环中跳出外部循环的当次执行进入外部循环的下一次

​    ![image-20221009133822699](D:\yjxz\Review_outline\yjxz\background\_01JavaSE\01JavaSE入门\document\assets\继续外部循环.png) 

# 14）数组

​		数组就是用来存储一批同种类型数据的内存区域

​		且数组变量名中存储的是数组在内存中的地址且数组是引用类型

​		且数组通过索引访问元素，访问格式为 数组名称[索引]

​		且数组固定长度，超过固定长度存储或者访问都会抛出异常错误

## 	数组定义：

### 		静态初始化数组

​				定义数组的时候直接给数组赋值

​					数据类型[] 数组名= new数据类型[]{元素1，元素2 ，元素3… };

​					数据类型[] 数组名= { 元素1，元素2 ，元素3，… };

### 		动态初始化数组

​				定义数组的时候只确定元素的类型和数组的长度进行默认初始化, 之后再存入具体数据

​					数据类型[] 数组名= new 数据类型[长度];

​				动态初始化数组后元素的默认值是什么样的？

​					byte、short、int 、char、long类型数组元素的默认值都是0

​					float、double类型数组元素的默认值都是0.0

​					boolean类型数组元素的默认值是false、String以及对象类型数组元素的默认值是null

### 		两种初始化应用场景：

​				动态初始化只指定数组长度,后期赋值,适合开始知道数据的数量,但是不确定具体元素值的业务场景

​				静态初始化开始就存入元素值,适合一开始就能确定元素值的业务场景

### 		数组遍历

​				遍历就是对容器中的数据一个一个的进行访问

### 		二维数组

​				二维数组就是元素为一维数组的数组

​				   ![image-20221009173454142](D:\yjxz\Review_outline\yjxz\background\_01JavaSE\01JavaSE入门\document\assets\二维数组.png)	

### 		N维数组

​				N维数组就是元素为N-1维数组的数组

### 		数组常见异常：

​					数组索引越界异常：

​						Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3

​					空指针异常：

​						Exception in thread "main" java.lang.NullPointerException: Cannot load from int array because "arr" is null

# 15）Debug

​			Debug即断点调试(排错),可以控制代码从断点开始一行一行的执行，然后详细观看程序执行的情况

# 16）方法

​					方法就是可以把一段代码封装成一个功能,以方便重复调用的一种语法结构，

​					方法的存在目的就是为了提高了代码的复用性且让程序的逻辑更清晰

​					有返回值的方法调用时可以选择定义变量接收结果,或者直接输出

​					无返回值方法的调用只能直接调用且不能使用return返回数据,但是可以直接return;

​					![image-20221009135632513](D:\yjxz\Review_outline\yjxz\background\_01JavaSE\01JavaSE入门\document\assets\方法.png)  

### 			方法的参数传递机制

#### 						基本类型的参数传递

​								基本类型的参数传递即值传递,也就是在传输实参给方法的形参的时候

​								并不是传输实参变量本身,而是传输实参变量中存储的值

#### 						引用类型的参数传递

​								引用类型的参数传递即地址传递,也就是传递堆内存的地址,就如传递数组、字符串、对象类型等

### 				方法重载

​									方法重载就是同一个类中方法名相同参数列表不同的方法

​									且与修饰符，返回值类型都无所谓,

​									且形参列表不同指的是形参的个数、类型、顺序不同

​									且不关心形参的名称

### 易错点（包装类问题）：

​		public static void sum(int n){}

​		public static void sum(Integer n){}

​		这两个方法属于方法重载, 虽然Integer是int的包装类, 但是满足方法重载条件, 参数类型不同,因此这两个方法为重载关系

# 17）入门级API

## 	Random

​			Random可以用来产生随机数

​			使用步骤：

​				1. import java.util.Random;（导包）

​				2. Random r = new Random();（创建对象）

​				3. int number = r.nextInt(n);(生成 [0,n) 的随机数,包左不包右)

## 	Scanner

​		Scanner可以用来进行键盘录入

​		使用步骤：

​			1. impot java.util.Scanner;（导包）

​			2. Scanner sc = new Scanner(System.in);（创建对象）

​			3. int i = sc.nextInt();（接收数据）
