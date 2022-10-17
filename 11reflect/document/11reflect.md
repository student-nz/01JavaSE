# 十、网络编程（网络通信：概念）

## 1）什么是网络编程

​		1. 网络编程从大的方面说就是对信息的发送到接收，中间传输为物理线路的作用

​		2. 网络编程最主要的工作就是在发送端把信息通过规定好的协议进行组装包，在接收端按照规定好的协议把包进行解析，

​			从而提取出对应的信息，达到通信的目的

## 2）网络通信基本模式

### 1. Client-Server(CS)

​		CS（Client/Server）即客户端、服务器架构模式，客户端需要安装专用的客户端软件

​		在 CS 结构中，通常采取两层结构。服务器负责数据的管理，客户机负责完成与用户的交互任务

#### 	1）C/S架构

##### 		1. 服务器

​			服务器部分是多个用户共享的信息与功能，执行后台服务，如控制共享数据库的操作等。

##### 		2. 客户机

​			客户端部分为用户所专有，负责执行前台功能，在出错提示、在线帮助等方面都有强大的功能，并且可以在子程序间自由切换

#### 	2）C/S架构特点

​			交互性强、具有安全的存取模式、响应速度快、利于处理大量数据

#### 	3）C/S架构详解

​			1. 客户机又称为用户工作站，是用户与网络打交道的设备，一般由用户【PC】担任

​				每一个客户机都运行在它自己的、并为服务器所认可的操作系统环境中。

​				客户机主要通过服务器享受网络上提供的各种资源

​			2. 客户机是连接【服务器】的计算机，使用服务器共享的文件、打印机和其他资源

​			3. 客户机是网络软件运行的一种形式，通常采用客户机/服务器（C/S）结构的系统，有一台或多台服务器以及大量的客户机。

​				服务器配备【大容量存储器】【大容量存储器?】并安装【数据库系统】，用于数据存放和数据检索；

​				客户端安装专用的软件，负责数据的输入、运算和输出

​			4. 客户机和服务器都是独立的计算机，

​				当一台连入网络的计算机向其他计算机提供各种网络服务（如数据、文件的共享等）时，就被叫做服务器

​				那些用于访问服务器资料的计算机则被叫做客户机

### 2. Browser/Server(BS)

​		BS（Browser/Server）即浏览器、服务器架构模式，客户端采用浏览器运行软件

​		在BS结构中，每个网络节点分为浏览器端、服务器端和中间件，通过它们之间的链接和交互来完成系统的功能任务

#### 	1）B/S架构

##### 		1. 浏览器端：

​			浏览器端：即用户使用的浏览器，是用户操作系统的接口，用户通过浏览器界面向服务器端提出请求，

​			并对服务器端返回的结果进行处理并展示，通过界面可以将系统的逻辑功能更好的表现出来		

##### 		2. 服务器端：

​			服务器端：提供数据服务，操作数据，然后把结果返回中间层，结果显示在系统界面上

##### 		3. 中间件：

​			中间件：这是运行在浏览器和服务器之间的。这层主要完成系统逻辑，实现具体的功能，

​			接受用户的请求并把这些请求传送给服务器，然后将服务器的结果返回给用户，

​			浏览器端和服务器端需要交互的信息是通过中间件完成的

#### 	2）B/S架构特点

​			具有更好的通用性，对应用环境的依赖性较小，在开发维护上更加便利，可以减少系统开发和维护的成本

### 	3. C/S架构与B/S架构主要区别

#### 		1）开发和维护成本

​				1. CS开发和维护的成本高于BS。

​				2. CS结构软件安装调试升级都需要在所有客户机上进行。

​				3. BS结构只需要将服务器上的软件版本升级即可，不必安装与维护

#### 		2）硬件环境

​				1. CS结构要求必须有相同的操作系统，BS结构因为在浏览器上运行只要有操作系统和浏览器就行

​				2. CS客户端的计算机电脑配置要求较高。BS客户端的计算机电脑配置要求较低

​				3. CS的每一个客户端都必须安装和配置软件。BS客户端在浏览器上运行不必安装

#### 		3）负载

​				1. CS客户端负载大

​				2. CS客户端与用户交互、收集信息，向后台请求

​				3. BS客户端由后台处理数据，前端只显示内容

#### 		4）安全性

​				1. CS安全性高，可以通过严格的管理来应用于指定人群

​				2. BS使用人数多，无法精确控制，安全性低

## 3）网络通信三要素

### 	1. IP

#### 		1）IP是什么？

​				IP（Internet Protocol）：全称”互联网协议地址”，是分配给上网设备的唯一标志

#### 		2）IP地址形式

​				公网地址、和私有地址(局域网使用)

​				192.168. 开头的就是常见的局域网地址，范围即为192.168.0.0--192.168.255.255，专门为组织机构内部使用

#### 		3）IP常用命令

​				ipconfig：查看本机IP地址

​				ping IP地址：检查网络是否连通

#### 		4）特殊IP地址

​				本机IP: 127.0.0.1或者localhost：称为回送地址也可称本地回环地址，只会寻找当前所在本机

#### 		5）常见IP分类

​				常见的IP分类为：IPv4和IPv6

##### 			1. IPv4	

​				IPv4：32位（4字节）

​				点分十进制表示法

##### ![image-20221017123642340](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20221017123642340.png)

##### 			2. IPv6

​				IPv6：128位（16个字节），号称可以为地球每一粒沙子编号

​				IPv6分成8个整数，每个整数用四个十六进制位表示， 数之间用冒号（：）分开

![image-20221017123700941](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20221017123700941.png)

#### 		6）问题

​				1. IP地址的代表类是谁？

​					InetAddress类

​				2. 如何获取本机IP对象

​					public static InetAddress getLocalHost()

​				3. 如何判断与该IP地址对象是否互通？

​					public boolean isReachable(int timeout)

### 	2. 端口

#### 		1）端口是什么？

​					端口号：标识正在计算机设备上运行的进程（程序），被规定为一个 16 位的二进制，范围是 0~65535

#### 		2）端口类型

##### 				1. 周知端口

​					周知端口：0~1023，被预先定义的知名应用占用（如：HTTP占用 80，FTP占用21）

##### 				2. 注册端口

​					注册端口：1024~49151，分配给用户进程或某些应用程序。（如：Tomcat占 用8080，MySQL占用3306）

##### 				3. 动态端口

​					动态端口：49152到65535，之所以称为动态端口，是因为它 一般不固定分配某种进程，而是动态分配

#### 		3）问题

​			1. 端口号的作用是什么？

​				唯一标识正在计算机设备上运行的进程（程序）

​			2. 一个设备中，能否出现2个应用程序的端口号一样，为什么？

​				不可以，如果一样会出现端口冲突错误

### 	3. 协议

#### 		1）协议是什么？

​				连接和通信数据的规则被称为网络通信协议

#### 		2）网络通信协议有两套参考模型

##### 				1. OSI参考模型

​					OSI参考模型：世界互联协议标准，全球通信规范，由于此模型过于理想化，未能在因特网上进行广泛推广

##### 				2. TCP/IP参考模型

​					TCP/IP参考模型(或TCP/IP协议)：事实上的国际标准

​					![image-20221017090922603](D:\yjxz\Review_outline\yjxz\background\_01JavaSE\10network\document\assets\image-20221017090922603.png)

#### 	3）传输层的2个常见协议

##### 		1. TCP协议：

![image-20221017124149053](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20221017124149053.png)

###### 			1）什么是TCP协议

​				TCP(Transmission Control Protocol) ：传输控制协议

###### 			2）TCP协议特点：

​				1. 使用TCP协议，必须双方先建立连接，是一种面向连接，安全、可靠的传输数据的协议

​				2. 传输前，采用“三次握手”方式建立连接，点对点通信，所以是可靠的 

​				3. 在连接中可进行大数据量的传输

 				4. 连接、发送数据都需要确认，且传输完毕后，还需释放已建立的连接，通信效率较低

###### 			3）TCP协议通信场景

​				对信息安全要求较高的场景，例如：文件下载、金融等数据通信

###### 			4）TCP三次握手确立连接

​		![image-20221017123559588](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20221017123559588.png)

###### 			5）TCP四次挥手断开连接

##### 			![image-20221017091743196](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20221017091743196.png)    		

##### 	2. UDP协议

###### 		1）什么是UDP协议

​			UDP(User Datagram Protocol)：用户数据报协议

###### 		2）UDP协议特点

​			1. UDP是一种无连接、不可靠传输的协议

​			2. 将数据源IP、目的地IP和端口封装成数据包，不需要建立连接 

​			3. 每个数据包的大小限制在64KB内 

​			4. 发送不管对方是否准备好，接收方收到也不确认，故是不可靠的 

​			5.  可以广播发送 ，发送数据结束时无需释放资源，开销小，速度快

###### 		3）UDP协议通信场景

​			语音通话，视频会话等

#### 	4）问题

​		1. 通信协议是什么？

​			计算机网络中，连接和通信数据的规则被称为网络通信协议

​		2. TCP通信协议的特点是什么样的?

​			1. 它是一种面向连接的可靠通信协

​			2. 传输前，采用“三次握手”方式建立连接，点对点的通信，所以可靠

​			3. 在连接中可进行大数据量的传输

​			4. 通信效率较低

​		3. UDP协议的特点是什么样的？

​			1. 用户数据报协议(User Datagram Protocol)

​			2. UDP是面向无连接，不可靠传输的通信协议

​			3. 速度快，有大小限制一次最多发送64K，数据不安全，易丢失数据

# 十、网络编程（Java进行网络通信相关API）

## 1）InetAddress（操作IP）

​		Java中的InetAddress，此类表示Internet协议（IP）地址

### 	1. 常见API：

​			public static InetAddress getLocalHost()：返回本主机的IPv4地址对象

​			public static InetAddress getByName(String host)：得到指定主机的IP地址对象，参数是域名或者IP地址

​			public String getHostName()：获取此IP地址的主机名

​			public String getHostAddress()：返回IP地址字符串

​			public boolean isReachable(int timeout)：在指定毫秒内连通该IP地址对应的主机，连通返回true

## 2）操作UDP

### 	1. DatagramPacket（操作UDP）

​				DatagramPacket：数据包对象

#### 		1）常见API：

​			public DatagramPacket(byte[] buf, int length, InetAddress address, int port)：创建发送端数据包对象

​					buf：要发送的内容，字节数组

​					length：要发送内容的字节长度

​					address：接收端的IP地址对象

​					port：接收端的端口号

​			public DatagramPacket(byte[] buf, int length)：创建接收端的数据包对象

​					buf：用来存储接收的内容

​					length：能够接收内容的长度

​			public int getLength()：获得实际接收到的字节个数

​					

### 	2. DatagramSocket（操作UDP）

​				DatagramSocket：发送端和接收端对象

#### 		1）常见API：

​				public DatagramSocket()：创建发送端的Socket对象，系统会随机分配一个端口号

​				public DatagramSocket(int port)：创建接收端的Socket对象并指定端口号

​				public void send(DatagramPacket dp)：发送数据包

​				public void receive(DatagramPacket p) ：接收数据包

### 	3. 发送端实现步骤

​			1. 创建DatagramSocket对象（发送端对象）

​			2. 创建DatagramPacket对象封装需要发送的数据（数据包对象）

​			3. 使用DatagramSocket对象的send方法传入DatagramPacket对象

​			4. 释放资源

### 	4. 接收端实现步骤

​			1. 创建DatagramSocket对象并指定端口（接收端对象）

​			2. 创建DatagramPacket对象接收数据（数据包对象）

​			3. 使用DatagramSocket对象的receive方法传入DatagramPacket对象

​			4. 释放资源

### 	5. UDP通信：多发多收

​		具体要求：

​			1. 发送端可以一直发送消息

​			2. 接收端可以不断的接收多个发送端的消息展示

​			3. 发送端输入了exit则结束发送端程序

​		客户端实现步骤：

​			1. 创建DatagramSocket对象（发送端对象）

​			2. 使用while死循环不断的接收用户的数据输入，如果用户输入的exit则退出程序

​			3. 如果用户输入的不是exit,  把数据封装成DatagramPacket

​			4. 使用DatagramSocket对象的send方法将数据包对象进行发送

​			5. 释放资源

​		接收端实现步骤：

​			1. 创建DatagramSocket对象并指定端口（接收端对象）

​			2. 创建DatagramPacket对象接收数据（数据包对象）

​			3. 使用while死循环不断的进行第4步

​			4. 使用DatagramSocket对象的receive方法传入DatagramPacket对象

### 	6. UDP操作相关问题

​		1. UDP发送端和接收端的对象是哪个？

​			public DatagramSocket()：创建发送端的Socket对象

​			public DatagramSocket(int port)：创建接收端的Socket对象

​		2. 数据包对象是哪个？

​			DatagramPacket

​		3. 如何发送、接收数据包

​			使用DatagramSocket的如下方法：

​				public void send(DatagramPacket dp)：发送数据包

​				public void receive(DatagramPacket dp) ：接收数据包

​		4. 采用UDP协议时，接收端为什么可以接收很多发送端的消息？？

​				UDP能够多发多收原因：接收端只负责接收数据包，无所谓是哪个发送端的数据包

### 	7. UDP的三种通信方式

![image-20221017123537781](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20221017123537781.png)

#### 			1）单播：

​					单播：单台主机与单台主机之间的通信（前面演示都为单播通信）

#### 			2）广播：

​					广播：当前主机与所在网络中的所有主机通信

#### 			3）组播：

​					组播：当前主机与选定的一组主机的通信

#### 		 UDP如何实现广播

​			使用广播地址：255.255.255.255

​			具体操作：

​				1. 发送端发送的数据包的目的地写的是广播地址、且指定端口（255.255.255.255  ,   9999）

​				2. 本机所在网段的其他主机的程序只要注册对应端口就可以收到消息了（9999）

#### 		 UDP如何实现组播

​			使用组播地址：224.0.0.0 ~ 239.255.255.255

​			具体操作：

​				1. 发送端的数据包的目的地是组播IP  (例如：224.0.1.1,  端口：9999)

​				2. 接收端必须绑定该组播IP(224.0.1.1)，端口还要注册发送端的目的端口9999 ，这样即可接收该组播消息

​				3. DatagramSocket的子类MulticastSocket可以在接收端绑定组播IP

#### 		MulticastSocket和InetAddress对比

##### 			1. MulticastSocket

​				MulticastSocket可以将数据报以广播的方式发送到多个客户端。

###### 			三个构造器：

 			public MulticastSocket()：使用本机默认地址，随机端口来创建MulticastSocket对象。
		 	public MulticastSocket(int portNumber)：使用本机默认地址，指定端口创建MulticastSocket对象。
		 	public MulticastSocket(SocketAddress bindaddr)：使用本机指定IP地址，指定端口来创建MulticastSocket对象

###### 			加入指定组或离开指定组：

​				创建MulticastSocket对象后，还需要将MulticastSocket加入到指定的多点广播地址 

​				joinGroup(InetAddress addr)：MulticastSocket使用joinGroup()方法加入指定组；

​				leaveGroup(InetAddress addr)：MulticastSocket使用leaveGroup()方法脱离一个组

​		MulticastSocket类中有一个setTimeToLive(int  ttl)

​			当ttl为0时，指定数据报应停留在本地主机，

​			为1时，指定数据报发送到本地局域网网，

​			为32时，发送到本站点的网络上。

​			为64时，发送到本地区，

​			128时，发送到本大洲，

​			255为全球。

​		默认情况下，该ttl的值为1。

​			 IP协议为多点广播提供了这批特殊的IP地址，这些IP地址的范围是224.0.0.0至239.255.255.255。

##### 		2. InetAddress

​			 InetAddress 类没有提供构造，而提供如下两个静态方法来获取InetAddress对象

​				getByName(String host):如getByName("localhost"),getByName(www.baidu.com);

​				getByAddress(byte [] addr):如getByAddress(new byte[]{127,0,0,1});

### 		UDP通信相关问题：

​				1. 如何实现广播，具体怎么操作？

​					发送端目的IP使用广播IP： 255.255.255.255  999

​					所在网段的其他主机对应了端口（9999）即可接收消息

​				2. 如何实现组播，具体怎么操作？

​					发送端目的IP使用组播IP，且指定端口

​					所在网段的其他主机注册了该组播IP和对应端口即可接收消息

## 3）操作TCP

​			在java中只要是使用java.net.Socket类实现通信，底层即是使用了TCP协议

### 	1. 常见API

#### 		1）Socket（客户端）

​				public Socket(String host , int port)：创建发送端的Socket对象与服务端连接，参数为服务端程序的ip和端口

​				OutputStream getOutputStream()：获得字节输出流对象

​				InputStream getInputStream()：获得字节输入流对象

#### 		2）ServerSocket(服务端)

​				public ServerSocket(int port)：注册服务端端口

​				public Socket accept()：等待接收客户端的Socket通信连接，连接成功返回Socket对象与客户端建立端到端通信

### 	2. 客户端实现步骤

​			1. 创建客户端的Socket对象，请求与服务端的连接

​			2. 使用socket对象调用getOutputStream()方法得到字节输出流

​			3. 使用字节输出流完成数据的发送

​			4. 释放资源：关闭socket管道

### 	3. 服务端实现步骤

​			1. 创建ServerSocket对象，注册服务端端口

​			2. 调用ServerSocket对象的accept()方法，等待客户端的连接，并得到Socket管道对象

​			3. 通过Socket对象调用getInputStream()方法得到字节输入流、完成数据的接收

​			4. 释放资源：关闭socket管道

### 	4. TCP操作相关问题

​			1. TCP通信的客户端的代表类是谁？

​				Socket类

​				public Socket(String host , int port)

​			2. TCP通信如何使用Socket管道发送、接收数据

​				OutputStream getOutputStream()：获得字节输出流对象（发）

​				InputStream getInputStream()：获得字节输入流对象（收）

​			3. TCP通信服务端用的代表类？

​				ServerSocket类,注册端口

​				调用accept()方法阻塞等待接收客户端连接。得到Socket对象

​			4. TCP通信的基本原理？

​				客户端怎么发，服务端就应该怎么收

​				客户端如果没有消息，服务端会进入阻塞等待

​				Socket一方关闭或者出现异常、对方Socket也会失效或者出错

### 5. TCP通信-多发多收消息（d6_socket2）

​		具体要求：

​			1. 可以使用死循环控制服务端收完消息继续等待接收下一个消息

​			2. 客户端也可以使用死循环等待用户不断输入消息

​			3. 客户端一旦输入了exit，则关闭客户端程序，并释放资源

​		实现思路参考代码：

​		案例后的问题：

​			1. 本案例实现了多发多收，那么是否可以同时接收多个客户端的消息？

​				不可以的

​				因为服务端现在只有一个线程，只能与一个客户端进行通信

​			2. 本次多发多收是如何实现的？

​				客户端使用循环反复地发送消息

​				服务端使用循环反复地接收消息

​			3. 现在服务端为什么不可以同时接收多个客户端的消息

​				目前服务端是单线程的，每次只能处理一个客户端的消息

### 6. TCP通信-同时接受多个客户端消息（d7_socket3）

#### 		问题引入：

​			1. 之前我们的通信是否可以同时与多个客户端通信，为什么？

​				不可以的

​				单线程每次只能处理一个客户端的Socket通信

​			2. 如何才可以让服务端可以处理多个客户端的通信需求？

​				引入多线程

​				![image-20221017123426038](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20221017123426038.png)

#### 		案例后的问题：

​			1. 本次是如何实现服务端接收多个客户端的消息的

​				主线程定义了循环负责接收客户端Socket管道连接

​				每接收到一个Socket通信管道后分配一个独立的线程负责处理它

### 7. TCP通信-使用线程池优化（d8_socket4）

#### 		问题引入：

![image-20221017124252303](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20221017124252303.png)

#### 		目前的通信架构存在什么问题？

​				客户端与服务端的线程模型是： N-N的关系

​				客户端并发越多，系统瘫痪的越快

#### 		引入线程池处理多个客户端消息：

​				![image-20221017123341903](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20221017123341903.png)

​		案例后问题：
​			本次使用线程池的优势在哪里？

​				服务端可以复用线程处理多个客户端，可以避免系统瘫痪

​				适合客户端通信时长较短的场景

### 8. TCP通信实战案例-即时通信

#### 	问题引入：

​		即时通信是什么含义，要实现怎么样的设计？

​			即时通信，是指一个客户端的消息发出去，其他客户端可以接收到

​			之前我们的消息都是发给服务端的

​			即时通信需要进行端口转发的设计思想

#### 	即时通信-端口转发：

​		![image-20221017124602599](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20221017124602599.png)

#### 	即时通信如何设计？

​			即时通信，是指一个客户端的消息发出去，其他客户端可以接收到

​			即时通信需要进行端口转发的设计思想

​			服务端需要把在线的Socket管道存储起来

​			一旦收到一个消息要推送给其他管道

### 9. TCP通信实战案例-模拟BS系统

#### 	问题引入：

​	1. 之前的客户端都是什么样的？

​			其实就是CS架构，客户端实需要我们自己开发实现的

​	2. BS结构是什么样的，需要开发客户端吗？

​			浏览器访问服务端，不需要开发客户端

#### 	实现BS开发：（JavaWeb体系专攻这一块，目前了解即可）

​		![image-20221017124846466](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20221017124846466.png)

#### 	HTTP响应数据的协议格式：

​		HTTP响应数据的协议格式：就是给浏览器显示的网页信息

​	![image-20221017124900340](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20221017124900340.png)
