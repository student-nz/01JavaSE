# 十一、单元测试、反射、注解、动态代理

# 1. 单元测试

## 	1）什么是单元测试？

​				单元测试就是针对最小的功能单元编写测试代码，进而测试代码的正确性

​				Java程序最小的功能单元是方法，因此Java中的单元测试就是针对Java方法的测试，进而检查方法的正确性

## 	2）Junit单元测试框架?

​				JUnit是使用Java语言实现的单元测试框架，开源的，几乎所有的IDE工具都集成了JUnit

## 	3）如何使用单元测试？	

​			1. 将JUnit的jar包导入到项目中

​			2. 编写测试方法：该测试方法必须是公共的无参数无返回值的非静态方法

​			3. 在测试方法上使用@Test注解：标注该方法是一个测试方法

​			4. 在测试方法中完成被测试方法的预期正确性测试

​			5. 选中测试方法，选择“JUnit运行” ，如果测试良好则是绿色；如果测试失败，则是红色

## 	4）Junit测试全部方法怎么处理？成功的标志是什么？

​			1. 测试某个方法直接右键该方法启动测试

​			2. 测试全部方法，可以选择类或者模块启动

​			3. 红色失败，绿色通过

## 	5）Junit常用注解

​			1. @Test：测试方法

​			2. @Before：用来修饰实例方法，该方法会在每一个测试方法执行之前执行一次。

​			3. @After：用来修饰实例方法，该方法会在每一个测试方法执行之后执行一次。

​			4. @BeforeClass：用来静态修饰方法，该方法会在所有测试方法之前只执行一次。

​			5. @AfterClass：用来静态修饰方法，该方法会在所有测试方法之后只执行一次。

## 6）单元测试使用@Test注解的要求

			1. 测试类类名一般不取Test.java,难以导包（注解使用@org.junit.Test）
​			2. 使用注解的类必须是主类，须加public
​			3. 测试方法必须是public void，即没有返回值，不带任何参数
​			4. 当项目很大时，建一个包存放测试类
​			5. 测试单元中每个方法必须可以独立测试执行，测试方法间不能有任何的依赖
​			6. 测试用例不是证明你的代码是对的，而是证明你的代码有没有错误
​			7. 测试方法使用Test作为后缀或者test作为前缀的方法名，这个不是必须的

## 	1）什么是反射

​			1. 反射是指对于任何一个Class类，在"运行的时候"都可以直接得到这个类全部成分

​			2. 在运行时,可以直接得到这个类的构造器对象：Constructor

​			3. 在运行时,可以直接得到这个类的成员变量对象：Field

​			4. 在运行时,可以直接得到这个类的成员方法对象：Method

​			这种运行时动态获取类信息以及动态调用类中成分的能力称为Java语言的反射机制

## 	2）反射的第一步是什么？

​			获取Class类对象，如此才可以解析类的全部成分

## 	3）获取Class类的对象的三种方式

​			方式一：Class c1 = Class.forName(“全类名”);

​			方式二：Class c2 = 类名.class

​			方式三：Class c3 = 对象.getClass();

## 	4）反射获取构造器对象

​			Constructor<?>[] getConstructors()：返回所有构造器对象的数组（只能拿public的）

​			Constructor<?>[] getDeclaredConstructors()：返回所有构造器对象的数组，存在就能拿到

​			Constructor<T> getConstructor(Class<?>... parameterTypes)：返回单个构造器对象（只能拿public的）

​			Constructor<T> getDeclaredConstructor(Class<?>... parameterTypes)：返回单个构造器对象，存在就能拿到

​			T newInstance(Object... initargs)：根据指定的构造器创建对象

​			 public void  setAccessible(boolean flag)：设置为true,表示取消访问检查，进行暴力反射

## 	5）反射获取成员变量对象

​			Field[] getFields()：返回所有成员变量对象的数组（只能拿public的）

​			Field[] getDeclaredFields()：返回所有成员变量对象的数组，存在就能拿到

​			Field getField(String name)：返回单个成员变量对象（只能拿public的）

​			Field getDeclaredField(String name)：返回单个成员变量对象，存在就能拿到

​			void set(Object obj, Object value)：赋值

​			Object get(Object obj)：获取值

​			setAccessible(boolean)：暴力反射（打开权限）

## 	6）反射获取方法对象

​			Method[] getMethods()：返回所有成员方法对象的数组返回（所有成员方法对象的数组（只能拿public的）

​			Method[] getDeclaredMethods()：返回所有成员方法对象的数组，存在就能拿到

​			Method getMethod(String name, Class<?>... parameterTypes) ：返回单个成员方法对象（只能拿public的）

​			Method getDeclaredMethod(String name, Class<?>... parameterTypes)：返回单个成员方法对象，存在就能拿到

​			Object invoke(Object obj, Object... args)：运行方法

​					参数一：用obj对象调用该方法

​					参数二：调用方法的传递的参数（如果没有就不写）

​					返回值：方法的返回值（如果没有就不写）

## 	7）其他方法

​			public String getSimpleName()：获取当前类名

​			public String getName()：获取全限名：包名+类名

## 	8）反射为什么能绕过编译阶段为集合添加数据？

​					因为反射是作用在运行时的技术，泛型只是在编译阶段可以约束集合只能操作某种数据类型，

​					在编译成Class文件进入运行阶段的时候，泛型会自动擦除

## 	9）反射的作用？

​			1. 可以在运行时得到一个类的全部成分然后操作

​			2. 可以破坏封装性。（很突出）

​			3. 可以破坏泛型的约束性

​			4. 适合做Java高级框架

​			5. 基本上主流框架都会基于反射设计一些通用技术功能

# 3. 注解

## 	1）什么是注解？

​			Java 注解（Annotation）又称 Java 标注，是 JDK5.0 引入的一种注释机制

​			Java 语言中的类、构造器、方法、成员变量、参数等都可以被注解进行标注

## 	2）注解的作用是什么？

​			对Java中类、方法、成员变量做标记，然后进行特殊处理

​			例如：JUnit框架中，标记了注解@Test的方法就可以被当成测试方法执行，而没有标记的就不能当成测试方法执行

## 	3）自定义注解

### 		1. 格式：

​				public @interface 注解名称 {   

​					 public 属性类型 属性名() default 默认值 ;

​				}

​			属性类型：Java支持的数据类型基本上都支持

### 		2. 特殊属性：

​				value属性，如果只有一个value属性的情况下，使用value属性的时候可以省略value名称不写

​				但是如果有多个属性,  且多个属性没有默认值，那么value名称是不能省略的

## 	4）元注解	

​				元注解：就是注解注解的注解

### 		元注解有两个：

​				@Target: 约束自定义注解只能在哪些地方使用，即约束自定义注解可以标记的范围

​				@Retention：申明注解的生命周期，即约束自定义注解的存活范围

​			@Target中可使用的值定义在ElementType枚举类中，常用值如下

​				TYPE，类，接口 

​				FIELD, 成员变量

​				METHOD, 成员方法

​				PARAMETER, 方法参数

​				CONSTRUCTOR, 构造器

​				LOCAL_VARIABLE, 局部变量

​			@Retention中可使用的值定义在RetentionPolicy枚举类中，常用值如下

​				SOURCE： 注解只作用在源码阶段，生成的字节码文件中不存在

​				CLASS：  注解作用在源码阶段，字节码文件阶段，运行阶段不存在，默认值

​				 RUNTIME：注解作用在源码阶段，字节码文件阶段，运行阶段（开发常用）

## 5）注解解析				

​		注解的操作中经常需要进行解析，注解的解析就是判断是否存在注解，存在注解就解析出内容

### 	与注解解析相关的接口

​		Annotation: 注解的顶级接口，注解都是Annotation类型的对象

​		AnnotatedElement:该接口定义了与注解解析相关的解析方法

​		Annotation[]    getDeclaredAnnotations()：获得当前对象上使用的所有注解，返回注解数组

​		T getDeclaredAnnotation(Class<T> annotationClass)：根据注解类型获得对应注解对象

​		boolean isAnnotationPresent(Class<Annotation> annotationClass)：

​			判断当前对象是否使用了指定的注解，如果使用了则返回true，否则false

​		所有的类成分Class, Method , Field , Constructor，都实现了AnnotatedElement接口他们都拥有解析注解的能力：

### 	解析注解的技巧

​		1. 注解在哪个成分上，我们就先拿哪个成分对象

​		2. 比如注解作用成员方法，则要获得该成员方法对应的Method对象，再来拿上面的注解

​		3. 比如注解作用在类上，则要该类的Class对象，再来拿上面的注解

​		 4. 比如注解作用在成员变量上，则要获得该成员变量对应的Field对象，再来拿上面的注解

# 4. 动态代理（政哥设计模式复习那详解）

​	
