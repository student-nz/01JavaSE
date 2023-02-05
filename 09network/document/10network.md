# 网络编程（网络通信）

# 1. 计算机网络

​	 计算机网络是指将地理位置不同的具有独立功能的多台计算机及其外部设备，通过通信线路连接起来，

​	在网络操作系统，网络管理软件及网络通信协议的管理和协调下，实现资源共享和信息传递的计算机系统

# 2. 网络编程

​		在网络通信协议下，不同计算机上运行的程序，可以进行数据传输

# 3. 网络编程三要素

## 	3.1 IP地址

### 1. IP地址

​	要想让网络中的计算机能够互相通信，必须为每台计算机指定一个标识号，

​	通过这个标识号来指定要接收数据的计算机和识别发送的计算机，而IP地址就是这个标识号。

​	也就是设备的标识

### 2. IP地址分为两大类

#### 			1. IPv4	

​	IPv4是给每个连接在网络上的主机分配一个32bit地址。

​	按照TCP/IP规定，IP地址用二进制来表示，每个IP地址长32bit，也就是4个字节。

​	例如：

​		一个采用二进制形式的IP地址是“11000000 10101000 00000001 01000010”，这么长的地址，处理起来非常费劲。

​		为了方便使用，IP地址经常被写成十进制的形式，中间使用符号“.”分隔不同的字节。

​		于是，上面的IP地址可以表示为“192.168.1.66”。

​		IPv4地址的这种表示法叫做“点分十进制表示法”

#### 2. IPv6

​	由于互联网的蓬勃发展，IP地址的需求量愈来愈大，但是网络地址资源有限，使得IP的分配越发紧张。

​	为了扩大地址空间，通过IPv6重新定义地址空间，采用128位地址长度，每16个字节一组，分成8组十六进制数，

​	这样就解决了网络地址资源数量不够的问题，每个整数用四个十六进制位表示， 数之间用冒号（ ：）分开，

​	IPv6的这种表示法叫作“冒分十六进制表示法”

​	如下图：

![image-20221017123700941](assets\image-20221017123700941.png)

### 		3. IP地址形式

​	IP地址形式可分为 公网地址、私有地址(局域网使用)

​	例如：

​		我们经常看到的 192.168. 开头的就是常见的局域网地址，范围为 192.168.0.0--192.168.255.255，专门为组织机构内部使用

### 		4. DOS常用命令

​		ipconfig：查看本机IP地址

​		ping IP地址：检查网络是否连通

### 		5. 特殊IP地址

​		127.0.0.1：是回送地址，可以代表本机地址，一般用来测试使用

## 	2.2 端口

### 		1. 端口

​	就是设备上应用程序的唯一标识，标识正在计算机设备上运行的进程（程序）！

![image-20221219212015694](assets\image-20221219212015694.png)

### 2. 端口号

​	就是用两个字节表示的整数，它的取值范围是0~65535，其实就是端口，是端口的 id 值！

​	其中：

​		0~1023之间的端口号用于一些知名的网络服务和应用，

​		普通的应用程序需要使用1024以上的端口号

​		一个设备中，不能出现2个应用程序的端口号一样，如果一样会出现端口冲突错误！

![image-20221219212145898](assets\image-20221219212145898.png)

### 		3. 端口类型

#### 					1.  周知端口

​		周知端口：0~1023，被预先定义的知名应用占用（如：HTTP占用 80，FTP占用21）

#### 					2. 注册端口

​		注册端口：1024~49151，分配给用户进程或某些应用程序（如：Tomcat占 用8080，MySQL占用3306）

#### 					3. 动态端口

​		动态端口：49152到65535，之所以称为动态端口，是因为它 一般不固定分配某种进程，而是动态分配

## 	2.3 协议

### 		1. 协议

​	计算机网络中，连接和通信的规则被称为网络通信协议

### 		2. 网络通信协议有两套参考模型

#### 					2.1 OSI参考模型

​		OSI参考模型：世界互联协议标准，全球通信规范，由于此模型过于理想化，未能在因特网上进行广泛推广

#### 					2.2 TCP/IP参考模型

​		TCP/IP参考模型(或TCP/IP协议)：事实上的国际标准

#### 2.3 两种参考模型对比：

![image-20221219212827804](D:\yjxz\Review_outline\yjxz\background\_01JavaSE\09network\document\assets\image-20221219212827804.png)

### 	3. 传输层的2个常见协议

#### 	1. UDP协议

##### 		1. 什么是UDP协议

​	UDP(User Datagram Protocol)：用户数据报协议

##### 		2. 特点

​	① UDP是无连接的、不可靠的通信协议，即在数据传输时，数据的发送端和接收端不建立逻辑连接。

​		简单来说：

​			当一台计算机向另外一台计算机发送数据时，发送端不会确认接收端是否存在，就会发出数据，

​			同样接收端在收到数据时，也不会向发送端反馈是否收到数据

​	② 每个数据包的大小限制在64KB内 ，由于使用UDP协议消耗系统资源小，通信效率高

​		所以通常都会用于音频、视频和普通数据的传输。

​		例如：

​			视频会议通常采用UDP协议，因为这种情况即使偶尔丢失一两个数据包，也不会对接收结果产生太大影响。

​			但是在使用UDP协议传送数据时，由于UDP协议的面向无连接性，不能保证数据的完整性，

​			因此在传输重要数据时不建议使用UDP协议

​	③ 可以广播发送 ，发送数据结束时无需释放资源，开销小，速度快

##### 		3. 应用场景

​	语音通话，视频会话等

#### 		2. TCP协议

![image-20221017124149053](assets\image-20221017124149053.png)

##### 			1. 什么是TCP协议

​	TCP(Transmission Control Protocol) ：传输控制协议

##### 			2. 特点

​	① TCP协议是面向连接的、可靠的通信协议，即传输数据之前，在发送端和接收端建立逻辑连接，然后再传输数据，

​		它提供了两台计算机之间可靠无差错的数据传输。

​		在TCP连接中必须要明确客户端与服务器端，由客户端向服务端发出连接请求，每次连接的创建都需要经过“三次握手”

​		 正因为采用TCP协议，传输数据前会采用“三次握手”方式建立连接，点对点通信，所以TCP协议是可靠的通信协议

- 三次握手：TCP协议中，在发送数据的准备阶段，客户端与服务器之间的三次交互，以保证连接的可靠

  - 第一次握手，客户端向服务器端发出连接请求，等待服务器确认


  - 第二次握手，服务器端向客户端回送一个响应，通知客户端收到了连接请求


  - 第三次握手，客户端再次向服务器端发送确认信息，确认连接

- 完成三次握手，连接建立后，客户端和服务器就可以开始进行数据传输了

  由于这种面向连接的特性，TCP协议可以保证传输数据的安全，所以应用十分广泛。

  例如：

  ​		上传文件、下载文件、浏览网页等

​	② 还有在TCP协议下进行网络通信，在连接中可进行大数据量的传输，

​		同时，连接、发送数据都需要确认，且传输完毕后，还需释放已建立的连接，通信效率相对 UDP协议 较低

##### 			3. TCP三次握手确立连接图解

![image-20221017123559588](assets\image-20221017123559588.png)



##### 4. TCP四次挥手断开连接图解

![image-20221017091743196](assets\image-20221017091743196.png)    		

##### 			3. 应用场景

​	正因为TCP协议具有三次握手、四次挥手特点，一般应用于对信息安全要求较高的场景，例如：文件下载、金融等数据通信

# 4. 网络编程正式开始

## 4.1 InetAddress 的使用

​		InetAddress：此类表示Internet协议（IP）地址

- InetAddress  API如下：

  | 方法名                                           | 说明                                             |
  | ------------------------------------------------ | ------------------------------------------------ |
  | public static InetAddress getLocalHost()         | 确返回本主机的地址对象                           |
  | public static InetAddress getByName(String host) | 得到指定主机的IP地址对象，参数是域名或者IP地址   |
  | public String getHostName()                      | 获取此IP地址的主机名                             |
  | public String getHostAddress()                   | public String getHostAddress()                   |
  | public boolean isReachable(int timeout)          | 在指定毫秒内连通该IP地址对应的主机，连通返回true |

## 4.2 UDP通信

### 1. UDP通信：快速入门

#### 	1.1 UDP协议特点

​		首先我们知道，UDP协议是一种无连接、不可靠传输的协议，

​		将数据源IP、目的地IP和端口以及数据封装成数据包，大小限制在64KB内，直接发送出去即可

#### 	1.2 UDP协议通信模型演示

![image-20221219214155360](assets\image-20221219214155360.png)

#### 	1.3 数据包对象：DatagramSocket（韭菜盘子）

​		**常见API:**

​				public DatagramPacket(byte[] buf, int length, InetAddress address, int port)：创建发送端数据包对象

​						buf：要发送的内容，字节数组

​						length：要发送内容的字节长度

​						address：接收端的IP地址对象

​						port：接收端的端口号

​				public DatagramPacket(byte[] buf, int length)：创建接收端的数据包对象

​				public int getLength()：获得实际接收到的字节个数

#### 	1.4 发送端和接收端对象：DatagramSocket（人）

​				public DatagramSocket()：创建发送端的Socket对象，系统会随机分配一个端口号

​				public DatagramSocket(int port)：创建接收端的Socket对象并指定端口号

​				public void send(DatagramPacket dp)：发送数据包

​				public void receive(DatagramPacket p) ：接收数据包

#### 	1.5 使用UDP通信实现：发送消息、接收消息

![image-20221219214422780](assets\image-20221219214422780.png)

![image-20221219214445389](assets\image-20221219214445389.png)

#### 	1.6 使用UDP通信实现：多发多收消息

![image-20221219214743086](assets\image-20221219214743086.png)

**发送端可以反复发送数据：**

![image-20221219214818253](assets\image-20221219214818253.png)

**接收端可以反复接收数据**

![image-20221219214851977](assets\image-20221219214851977.png)

### 	2. UDP的三种通信方式

#### 			2.1 单播：

​		就是单台主机与单台主机之间的通信（前面演示都为单播通信）

#### 			2.2 广播：

​		就是当前主机与所在网络中的所有主机通信

#### 			2.3 组播：

​		就是当前主机与选定的一组主机的通信

![image-20221017123537781](assets\image-20221017123537781.png)



#### 		 2.4 UDP如何实现广播

​		使用广播地址：255.255.255.255

​		具体操作：

​			① 发送端发送的数据包的目的地写的是广播地址、且指定端口（255.255.255.255  ,   9999）

​			② 本机所在网段的其他主机的程序只要注册对应端口就可以收到消息了（9999）

#### 		 2.5 UDP如何实现组播

​		使用组播地址：224.0.0.0 ~ 239.255.255.255

​		具体操作：

​			①  发送端的数据包的目的地是组播IP  (例如：224.0.1.1,  端口：9999)

​			② 接收端必须绑定该组播IP(224.0.1.1)，端口还要注册发送端的目的端口9999 ，这样即可接收该组播消息

​			③ DatagramSocket的子类MulticastSocket可以在接收端绑定组播IP

#### 		2.6 MulticastSocket和InetAddress对比

​	**MulticastSocket：**MulticastSocket可以将数据报以广播的方式发送到多个客户端

​	**三个构造器：**

​		public MulticastSocket()：使用本机默认地址，随机端口来创建MulticastSocket对象

​		public MulticastSocket(int portNumber)：使用本机默认地址，指定端口创建MulticastSocket对象

​		public MulticastSocket(SocketAddress bindaddr)：使用本机指定IP地址，指定端口来创建MulticastSocket对象

​	**加入指定组或离开指定组：**

​		创建MulticastSocket对象后，还需要将MulticastSocket加入到指定的多点广播地址 

​		joinGroup(InetAddress addr)：MulticastSocket使用joinGroup()方法加入指定组；

​		leaveGroup(InetAddress addr)：MulticastSocket使用leaveGroup()方法脱离一个组

​		MulticastSocket类中有一个setTimeToLive(int  ttl)

​			当 ttl 为0时，指定数据报应停留在本地主机，

​			为1时，指定数据报发送到本地局域网网，

​			为32时，发送到本站点的网络上。

​			为64时，发送到本地区，

​			128时，发送到本大洲，

​			255为全球。

​		默认情况下，该ttl的值为1

​			 IP协议为多点广播提供了这批特殊的IP地址，这些IP地址的范围是224.0.0.0至239.255.255.255。

## 4.3 TCP通信

### 	1. TCP通信：快速入门

#### 		1.1 TCP协议特点

​			 TCP是一种面向连接，安全、可靠的传输数据的协议 

​			传输前，采用“三次握手”方式，点对点通信，是可靠的  

​			在连接中可进行大数据量的传输

#### 		1.2 TCP通信模型

![image-20221219220213004](assets\image-20221219220213004.png)

​			在java中只要是使用java.net.Socket类实现通信，底层即是使用了TCP协议

#### 1.3 客户端：Socket

​		public Socket(String host , int port)：创建发送端的Socket对象与服务端连接，参数为服务端程序的ip和端口

​		OutputStream getOutputStream()：获得字节输出流对象

​		InputStream getInputStream()：获得字节输入流对象

#### 1.4 客户端发送消息

​	![image-20221219220415627](assets\image-20221219220415627.png)

#### 		1.5 服务端：ServerSocket

​				public ServerSocket(int port)：注册服务端端口

​				public Socket accept()：等待接收客户端的Socket通信连接，连接成功返回Socket对象与客户端建立端到端通信

#### 	1.6 服务端实现接收消息

![image-20221219220555071](assets\image-20221219220555071.png)



### 2. TCP通信-多发多收消息

![image-20221219220711840](assets\image-20221219220711840.png)

### 3. TCP通信-同时接受多个客户端消息

![image-20221219220810188](assets\image-20221219220810188.png)

### 4. TCP通信-使用线程池优化

![image-20221219220907615](assets\image-20221219220907615.png)

### 5. TCP通信实战案例-即时通信

![image-20221219220950931](assets\image-20221219220950931.png)

### 6. TCP通信实战案例-模拟BS系统

![image-20221219221014921](assets\image-20221219221014921.png)

### 7. 文件上传案例

​		客户端：将本地文件上传到服务器。接收服务器的反馈

​		服务器：接收客户端上传的文件，上传完毕之后给出反馈

- 案例需求

  客户端：数据来自于本地文件，接收服务器反馈

  服务器：接收到的数据写入本地文件，给出反馈

- 案例分析

  - 创建客户端对象，创建输入流对象指向文件，每读一次数据就给服务器输出一次数据，输出结束后使用shutdownOutput()方法告知服务端传输结束
  - 创建服务器对象，创建输出流对象指向文件，每接受一次数据就使用输出流输出到文件中，传输结束后。使用输出流给客户端反馈信息
  - 客户端接受服务端的回馈信息

- 相关方法

| 方法名                | 说明                               |
| --------------------- | ---------------------------------- |
| void shutdownInput()  | 将此套接字的输入流放置在“流的末尾” |
| void shutdownOutput() | 禁止用此套接字的输出流             |

### 8. 文件上传案例服务器优化

- 优化方案一

  + 需求

    服务器只能处理一个客户端请求，接收完一个图片之后，服务器就关闭了。

  + 解决方案

    使用循环

  + 代码实现

    ```java
    // 服务器代码如下,客户端代码同上个案例,此处不再给出
    public class ServerDemo {
        public static void main(String[] args) throws IOException {
            ServerSocket ss = new ServerSocket(10000);
    
            while (true) {
                Socket accept = ss.accept();
    
                //网络中的流,从客户端读取数据的
                BufferedInputStream bis = new BufferedInputStream(accept.getInputStream());
                //本地的IO流,把数据写到本地中,实现永久化存储
                BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("optimizeserver\\ServerDir\\copy.jpg"));
    
                int b;
                while((b = bis.read()) !=-1){
                    bos.write(b);
                }
    
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(accept.getOutputStream()));
                bw.write("上传成功");
                bw.newLine();
                bw.flush();
    
                bos.close();
                accept.close();
            }
            //ss.close();
            
        }
    }
    ```

- 优化方案二

  + 需求

    第二次上传文件的时候，会把第一次的文件给覆盖。

  + 解决方案

    UUID. randomUUID()方法生成随机的文件名

  + 代码实现

    ```java
    // 服务器代码如下,客户端代码同上个案例,此处不再给出
    public class ServerDemo {
        public static void main(String[] args) throws IOException {
            ServerSocket ss = new ServerSocket(10000);
    
            while (true) {
                Socket accept = ss.accept();
    
                //网络中的流,从客户端读取数据的
                BufferedInputStream bis = new BufferedInputStream(accept.getInputStream());
                //本地的IO流,把数据写到本地中,实现永久化存储
                BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("optimizeserver\\ServerDir\\" + UUID.randomUUID().toString() + ".jpg"));
    
                int b;
                while((b = bis.read()) !=-1){
                    bos.write(b);
                }
    
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(accept.getOutputStream()));
                bw.write("上传成功");
                bw.newLine();
                bw.flush();
    
                bos.close();
                accept.close();
            }
            //ss.close();
    
        }
    }
    ```

- 优化方案三

  - 需求

    使用循环虽然可以让服务器处理多个客户端请求。但是还是无法同时跟多个客户端进行通信。

  - 解决方案

    开启多线程处理

  - 代码实现

    ```java
    // 线程任务类
    public class ThreadSocket implements Runnable {
        private Socket acceptSocket;
    
        public ThreadSocket(Socket accept) {
            this.acceptSocket = accept;
        }
      
        @Override
        public void run() {
            BufferedOutputStream bos = null;
            try {
                //网络中的流,从客户端读取数据的
                BufferedInputStream bis = new BufferedInputStream(acceptSocket.getInputStream());
                //本地的IO流,把数据写到本地中,实现永久化存储
                bos = new BufferedOutputStream(new FileOutputStream("optimizeserver\\ServerDir\\" + UUID.randomUUID().toString() + ".jpg"));
    
                int b;
                while((b = bis.read()) !=-1){
                    bos.write(b);
                }
              
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(acceptSocket.getOutputStream()));
                bw.write("上传成功");
                bw.newLine();
                bw.flush();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if(bos != null){
                    try {
                        bos.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
    
                if (acceptSocket != null){
                    try {
                        acceptSocket.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
    // 服务器代码
    public class ServerDemo {
        public static void main(String[] args) throws IOException {
            ServerSocket ss = new ServerSocket(10000);
    
            while (true) {
                Socket accept = ss.accept();
                ThreadSocket ts = new ThreadSocket(accept);
                new Thread(ts).start();
            }
            //ss.close();
        }
    }
    ```

- 优化方案四

  - 需求

    使用多线程虽然可以让服务器同时处理多个客户端请求。但是资源消耗太大。

  - 解决方案

    加入线程池

  - 代码实现

    ```java
    // 服务器代码如下,线程任务类代码同上,此处不再给出
    public class ServerDemo {
        public static void main(String[] args) throws IOException {
            ServerSocket ss = new ServerSocket(10000);
            ThreadPoolExecutor pool = new ThreadPoolExecutor(
                    3,//核心线程数量
                    10,   //线程池的总数量
                    60,   //临时线程空闲时间
                    TimeUnit.SECONDS, //临时线程空闲时间的单位
                    new ArrayBlockingQueue<>(5),//阻塞队列
                    Executors.defaultThreadFactory(),//创建线程的方式
                    new ThreadPoolExecutor.AbortPolicy()//任务拒绝策略
            );
    
            while (true) {
                Socket accept = ss.accept();
                ThreadSocket ts = new ThreadSocket(accept);
                //new Thread(ts).start();
                pool.submit(ts);
            }
            //ss.close();
        }
    }
    ```

