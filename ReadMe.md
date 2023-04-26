# Java学习心得

**[java11官方开发文档](https://docs.oracle.com/javase/11)**

 ### 1. 对话框 

```java
import javax.swing.JOptionPane;//使用前需声明；
JOptionPane.showInputDialog(null,String,Title,int);//输入对话框；
JOptionPane.showMessageDialog(null,String,Title,int);//消息对话框；
showConfirmDialog(Component parentComponent,Object message,String title,int optionType,int messageType, Icon icon);//选择对话框；
``` 

 ### 2.for 循环内声明的变量循环外不可用！！
 ```java
 int c=0;
 for (int i=0;i<=10;i++){
     int b=0;
     c++;
}
//其中i,b在循坏之外无法使用，但c可以正常使用
```

### 3.获取当前时间戳

```java
long time = System.currentTimeMillis();//获取毫秒级时间戳
long time = System.nanoTime();//获得纳秒级时间戳
```

### 4.获取用户输入的字符串
```java
import java.util.Scanner;//使用前需要声明；

java.util.Scanner weishengming = new java.util.Scanner(System.in);//也可以将Scanner替换为java.util.Scanner
Scanner input = new Scanner(System.in);
String str1 =input.next();//next()读取到字符结束后直接停止
String str2 =input.nextLine();//nextLine()读取下一整行;
System.out.print(str1+str2);
```

### 5.有关自增自减（即i++,++i等）的说明

| 操作符 |   名称   |              描述               |      示例（假设 i =1）      |
| :----: | :------: | :-----------------------------: | :-------------------------: |
| ++ var | 前置自增 |  将var加1，语句中使用新的var值  | int j = ++i;  // j为2，i为2 |
| var ++ | 后置自增 | 将var加1，语句中使用原来的var值 | int  j = i++; //j为1 ，i为2 |


实际上是遵循运算顺序的体现

### 6.有关JShell

**[有关Jshell的官方文档](https://docs.oracle.com/en/java/javase/11/jshell)**

JShell是java9引入的命令行互交式工具 可用cmd输入指令启动
```sh
jshell
```
相关指令
```java
//一些单句的java语法例如
int x=5;
 
System.out.print(x);

/vers //此指令可列出所有以声明的变量

/edit //打开编辑面板

```


### 7.有关Math类

**[有关Math类官方文档](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Math.html)**

```java
Math.sin();//获取某弧度制的正弦值；
Math.cos();//获取余弦值
Math.tan();//获取正切值
Math.toRadians();//度转换为弧度；
Math.toDegrees();//弧度转换为度；
Math.asin();//反三角函数；
Math.PI();//调用π值；
Math.E();//调用e；
Math.exp(x);//返回e的x次方；
Math.log(x);//返回e的自然对数;
Math.log10(x);//返回x的以10为底的自然对数；
Mah.pow(a,b);//返回a的b次方；
Math.sqrt(x);//返回根号x;
Math.ceil(x);//进一法；
Math.floor(x);//退一法；
Math.rint(x);//四舍五入，当位5时，返回至偶数值；
Mah.round(x;//返回floor(x+0.5);
Math.max(a,b);//返回a，b间的最大值；
Math.min(a,b);//返回最小值；
Math.abs(x);//返回绝对值；
Math.random();//生成0-1之间的随机数；
```

### 8.关于Character类

**[有关Character类的官方文档](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Character.html)**

```java
Character.isDigit(ch); //如果指定的字符为数字，返回true;
Character.isLetter(ch); //字符为字母，返回true;
Character.isLetterOrDigit(ch);//字符为数字或者字母，返回true;
Character.isLowerCase(ch);//小写字母返回true;
Character.isUpperCase(ch);//大写字母返回true;
Character.toLowerCase(ch);//返回指定字符的小写；
Character.toUpperCase(ch);//返回指定字符的大写；
```
### 9.有关String类

**[有关String类的官方文档](https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/lang/String.html)**

```java
String str="Hello world! ";
int length=str.length();
char c = str.charAt(1);//c='e'
String str1=str.toUpperCase;//所有字符转化为大写；
String str2=str.toLowerCase;//所有字符转化为小写；
String str3=str1.concat(str2);//连接字符串1和2，等价于str3=str1+str2;
String str4=str.trim();//去掉前后的空格；
boolean b = str.equals(str2);//判断两个字符串是否相等，相等返回true;
boolean b1 = str.equalsIgnoreCase(str2);//忽视大小写判断；
boolean b2 = str.startsWith("H");//判断字符串是否以H开头;
boolean b3 = str.endsWith("!");//判断字符串是否以！结尾;
boolean b4 =str.contains("wor");//判断包含关系；
String str1 = str.substring(2);//返回从指定位置开始到字符串结束的子串；
String str2 =str.substring(2,8);//返回指定位置之间的子字符串；
String str3 = "*".repeat(6); //jdk11引入的新String方法，其结果为str3="******";
```

### 10.Java中存在抵销错误

当我们处理很大的数字和一个很小的数字时，会产生抵消错误，小数可能会被忽略，因此有些题要注意计算方向，以提高精确度；
比如计算
1 + 1/2 + 1/3 + ... + 1/n
时，从右向左计算会更精确一些；

### 11.StringBuilder类和StringBuffer类

**[有关StringBuilder类的官方文档](https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/lang/StringBuilder.html)**

**[有关StringBuffer类的官方文档](https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/lang/StringBuffer.html)**
```java
/*
StringBuilder和StringBuffer类似于String类，区别在于String类是不可变的
下面是一些常用的StringBuilder的用法
*/
StringBuilder sb = new StringBuilder;//创建一个容量为16的空字符串构建器
StringBuilder sb1 = new StringBuilder(int capacity);//创建一个指定容量的字符串构建器；
StrinfBuilder sb2 = new StringBuilder(String s);//创建一个指定字符串的字符串构建器；

sb.append(char[] c,int offset,int len);//在构建器后面追加一个char数组,其中后两项参数可为空；
sb.append(String s);//追加String类；
sb.delete(int start,int end);//删除指定区域内的字符，前闭后开；
sb.insert(int start,calss className);//在指定位置插入char数组，字符串等；
sb.replace(int start,int end,String s);//替换指定位置的字符；
sb.reverse();//将字符倒置；
sb.setCharAt(int index,char c);//为指定的下标设置新的字符
```
### 12.多态与动态绑定
### 13.异常处理文本IO

#### java Exception
```java
try{
code 1;
}catch(Exception name){
code 2;
}
finally{
code 3;
}
//代码1有异常会执行代码2
//代码3内容无论是否有异常，都会被执行；
//可用throw语句抛出一个异常 抛出异常时需在方法后面声明throws Exception
//可以自定义自己的异常通过让其继承Exception来定义此异常
```
##### 有关File类

该类包含了获取文件目录属性的一些方法，也可以删除，重命名操作等；
**[有关File类的官方文档](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/File.html)**
```java
File files = new File(String path);//为指定的路径创建
files.exists(); //判断files所代表的目录是否存在，若存在返回true
files.canRead();
files.canWrite();//判断files所代表的文件是否可读，可写，
files.mkdir();//创建相关目录，创建成功返回true
files.delete();//删除相关目录
files.length();//返回文件的大小
files.listFile();//返回目录下的所有文件，返回类型为File[]
```

### 文件的输入与输出

可用Scanner从文件中读取数据
用PrintWriter向文件写入数据

**[有关Scanner类的官方文档](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Scanner.html)**
Printwriter暂时无法打开

### 14.有关main方法
 ```java
 public static void main(String[] args){}
 ```
  1.由于其为程序的入口，在jvm中运行时会首先调用main方法所以其必须是public
  
  2.关键字static可以不用通过创建一个类的实例，而是直接通过类名直接去访问一个方法，main方法定义为static，则对于虚拟机来说，在程序启动之后并不需要创建一个实例，也就可以去调用这个main方法，所以必须使用static修饰
  
  3.由于main方法是通过java虚拟机调用的，虚拟机无需返回值，所以main方法的返回值定义为void
  
  4.在程序执行时为更方便直接接入数据，main方法需要String[] 参数，其中参数名称是可变的不一定是args
 
 **[一个简单的摩斯码互转程序理解main方法中的args](https://github.com/EMO-Errors/learn-documents/blob/main/JAVA%20Code/getMorse/MorseMain.java)**
 
### 15.泛型

##### ·优点

​	在编译时而不是在运行时检测出错误



​	例如如下两个代码块：

```java	
Comparable c = new Date();
System.out.println(c.compareTo("red"));
```



  该语句在编译时可正常通过，但运行时会提示:

 <font color ="red" > java.lang.ClassCastException:  java.lang.String cannot be cast to java.util.Date</font>



```java 
Comparable<Date> c = new Date();
System.out.println(c.compareTo("red"));
```



如上代码，当时用泛型时在我们编译的时候就会提示 

<font color="red">java: 不兼容的类型: java.lang.String无法转换为java.util.Date</font>

所以使用泛型类型会更加可靠



##### ·定义泛型类与方法

定以一个泛型类时可直接在类名后添加 <E> 当有多个参数传入时可添加<A,B,C>

例如

```java
public class GenericStack<E>{}
public class MoreValue<A,B,C>{}
```

 tips:可以定义一个类或接口为一个泛型类或接口的子类型如String类的定义为

```java
public class String implements Comparable<String>{...}
```

 声明泛型方法时，应将泛型类型置于关键字 ``static`` 之后 如：

```java
public static <E> void printInformatioin(E e){...}
```

调用时可采取如下两种方式：

```java
ClassName.<Student>printInformation(Students);
printInformation(Students);
```

#### ·通配泛型 ####

常见三种形式 ``<?>``, ``<? extends T>`` ,``<? super T>``

``<?>`` 称为非受限通配，与``<? extends Object>``结果一样

``<? extends T>`` 称为受限通配，表示的为T或其子类型

``<? super T>`` 称为下限通配，表示T或其父类型



#### ·泛型的擦除和限制

泛型是通过使用类型擦除的方法来实现的，在进行编译时会通过类型信息去进行编译，随后又会将之擦除，所以泛型信息在运行时是不可用的.

比如：

```java
ArrayList<String> list = new ArrayList<>();
list.add("泛型");
String str = list.get(0);
```

编译器在编译如上代码时会先检测泛型是否被正确使用，然后会将它转化为如下的等价代码

```java
ArrayList list = new ArrayList();
list.add("泛型");
String str = (String)(list.get(0));
```

当对泛型类，接口，方法进行编译时，会用``Object``类型进行替代，如果泛型为受限的，那将用该受限类型来替代例如：

```java
public static <E> void print(E[] list){
    for(int i = 0;i < list.length; i++){
        System.out.print(list[i]);
    }
}

public static <E extends Person> int getAge(E person){
    return person.age;
}
```

上述代码会被编译器替换为

```java
public static void print(Object[] list){
    for(int i = 0;i < list.length; i++){
        System.out.print(list[i]);
    }
}

public static int getAge(Person person){
    return person.age;
}
```



由于其具有可擦除性，所以其也会有所限制：

1.不能使用 ``new E()``或``new E[]``

可以使用如下代码进行替代

```java
E[] obj = (E[])new Object[]; 
```

2.在静态上下文中不允许参数是泛型的

所以一下代码是非法的

```java
public class Test<E>{
    public static void m(E o){}//非法
    public static E o1;//非法
    static{
        E o2;
    }//非法
}
```

3.异常类不能为泛型的


