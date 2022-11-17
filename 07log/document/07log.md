# log

这章节了解一点，参考项目

## 1. 日志

​		日志就是专门用来记录一个系统运行的过程和详情

​		生活中的日志： 生活中的日志就好比日记，可以记录你生活的点点滴滴

​		程序中的日志： 程序中的日志可以用来记录程序运行过程中的信息，并可以进行永久存储

## 2. 输出语句的弊端

​			1. 信息只能展示在控制台

​			2. 不能将其记录到其他的位置（文件，数据库）

​			3. 想取消记录的信息需要修改代码才可以完成

## 3. 日志技术具备的优势

​			1. 可以将系统执行的信息选择性的记录到指定的位置（控制台、文件中、数据库中）

​			2. 可以随时以开关的形式控制是否记录日志，无需修改源代码

## 4. 日志技术体系

​			![image-20221117201650149](assets\image-20221117201650149.png)

​	日志规范：一些接口，提供给日志的实现框架设计的标准

​	日志框架：牛人或者第三方公司已经做好的日志记录实现代码，后来者直接可以拿去使用

​	因为对Commons Logging的接口不满意，有人就搞了SLF4J，因为对Log4j的性能不满意，有人就搞了Logback

​	依次类推，从而形式

## 5. Logback日志框架

​		Logback是由log4j创始人设计的另一个开源日志组件，性能比log4j要好

​		Logback是基于slf4j的日志规范实现的框架

​		官方网站：https://logback.qos.ch/index.html

### 1. Logback主要分为三个技术模块

​	 logback-core： logback-core 模块为其他两个模块奠定了基础，必须有	

​	logback-classic：logback-classic是log4j的一个改良版本，同时它完整实现了slf4j API

​	logback-access 模块与 Tomcat 和 Jetty 等 Servlet 容器集成，以提供 HTTP 访问日志功能

​	Logback的核心配置文件logback.xml：直接拷贝到src目录下

### 2. Logback入门使用步骤

​	1）在项目下新建文件夹lib，导入Logback的相关jar包到该文件夹下，并添加到项目依赖库中去

​	2）将Logback的核心配置文件logback.xml直接拷贝到src目录下（必须是src下）

​	3）在代码中获取日志的对象

​		public static final Logger LOGGER = LoggerFactory.getLogger("类对象");

​	4）使用日志对象LOGGER调用其方法输出不能的日志信息

## 6. Logback配置详解-输出位置、格式设置

​		Logback日志系统的特性都是通过核心配置文件logback.xml控制的

#### Logback日志输出位置、格式设置：

​	通过logback.xml 中的<append>标签可以设置输出位置和日志信息的详细格式

​	通常可以设置2个日志输出位置：一个是控制台、一个是系统文件中

##### 	输出到控制台的配置标志：

​		<appender name="CONSOLE" class="ch.qos.logback.core.ConsoleAppender">

##### 	输出到系统文件的配置标志：

​		<appender name="FILE" class="ch.qos.logback.core.rolling.RollingFileAppender">

## 7. Logback配置详解-日志级别设置

​		级别程度依次是：TRACE< DEBUG< INFO<WARN<ERROR  ; 默认级别是debug（忽略大小写），对应其方法

​		作用：用于控制系统中哪些日志级别是可以输出的，只输出级别不低于设定级别的日志信息

​		ALL  和 OFF分别是打开全部日志信息，及关闭全部日志信息

​		具体在<root level="INFO">标签的level属性中设置日志级别

​		<root level="INFO">   

​			 <appender-ref ref="CONSOLE"/>    

​			<appender-ref ref="FILE" />

​		</root>
