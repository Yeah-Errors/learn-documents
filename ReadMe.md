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

思考：`i=i++`与`i=++i`结果，并说明原因？

`i = i++`的结果i仍为原值
`i = ++i`的结果i比原来大一

从JVM层进行分析
如下所示代码:
```java
int i = 6;
i = i++;
int a = 45;
a = ++a;
```
其通过 [`javap -c source.class`](https://docs.oracle.com/javase/8/docs/technotes/tools/unix/javap.html#BEHHDJGA) 可得其反汇编代码为

```assembly
0: bipush        6  	//将6进栈
2: istore_0		//将栈顶元素（即6）存入存储到局部变量表的0处（var0）
3: iload_0		//将局部变量表中位置0的整数值（即var0）推送到栈顶
4: iinc          0, 1	//将局部变量表中位置0的整数值（即var0）增加1。var0=7
7: istore_0		//弹出栈顶数值存储到局部变量表的位置0（仍是var0）var0 = 6

8: bipush        45	//同理将45入栈
10: istore_1		//存储到局部变量1处（var1）
11: iinc         1, 1  	//将局部变量表中位置1的整数值（即var1）增加1。var1=46
14: iload_1		//将局部变量表中位置1的整数值（即var1）推送到栈顶
15: istore_1		//弹出栈顶数值存储到局部变量表的位置1（仍是var）var1 = 46
16: return
```
 
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
**[有关PrintWrite类的官方文档](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/PrintWriter.html)**

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


### 16.数据类型
**[一个使用栈的算数计算器](https://github.com/Yeah-Errors/learn-documents/blob/main/JAVA%20Code/Computer/Computer.java)**

#### 原码剖析

##### HashSet&&HashMap

###### 1.HashSet底层原理实际调用HashMap

```java
	public HashSet() {
      	map = new HashMap<>();
	}

 	public boolean add(E e) {
        return map.put(e, PRESENT)==null;
    }
```

##### 2.add方法

```java
transient Node<K,V>[] table; //用于存放节点的数组 Node[];
static final int DEFAULT_INITIAL_CAPACITY = 1 << 4;//设置默认初始化大小 1<<4=16;
static final float DEFAULT_LOAD_FACTOR = 0.75f;//设置一个加载因子为0.75，当储存数量大于加载因子与容量时，会进行扩容操作，可以更好防止阻塞
static final int MAXIMUM_CAPACITY = 1 << 30;//设置默认的最大数组值为2的30次方；

final Node<K,V>[] resize() {
        //储存table相关数据，内容，大小，阈值等
    	Node<K,V>[] oldTab = table;
  		int oldCap = (oldTab == null) ? 0 : oldTab.length;
        int oldThr = threshold;
    
        int newCap, newThr = 0;
    
        if (oldCap > 0) {
            //判断就数组的大小是否大于默认最大值，如果大于等于则仅将临界值设置为int最大值
            if (oldCap >= MAXIMUM_CAPACITY) {
                threshold = Integer.MAX_VALUE;
                return oldTab;
            }
            //判断数组旧的大小的2倍小于默认最大值且不是第一次扩容（及其尺寸大于等于16）时将新尺寸设为原尺寸的2倍
            else if ((newCap = oldCap << 1) < MAXIMUM_CAPACITY &&
                     oldCap >= DEFAULT_INITIAL_CAPACITY)
                newThr = oldThr << 1; // double threshold
        }
    	//其他的如果旧尺寸为0，但其临界值大于0，则将新尺寸设为临界值，此情况一搬出现在使用含参数的HashMap构造中
        else if (oldThr > 0) // initial capacity was placed in threshold
            newCap = oldThr;
       
    //当其临界值也为0时，则设置新尺寸为默认尺寸16，新临界值为默认临界值16.0.75=12；
    	else {               
            newCap = DEFAULT_INITIAL_CAPACITY;
            newThr = (int)(DEFAULT_LOAD_FACTOR * DEFAULT_INITIAL_CAPACITY);
        }
    	
        if (newThr == 0) {
            float ft = (float)newCap * loadFactor;
            newThr = (newCap < MAXIMUM_CAPACITY && ft < (float)MAXIMUM_CAPACITY ?
                      (int)ft : Integer.MAX_VALUE);
        }
    	//用更新后的大小以及临界值重新创建新的table表
        threshold = newThr;
        @SuppressWarnings({"rawtypes","unchecked"})
        Node<K,V>[] newTab = (Node<K,V>[])new Node[newCap];
        table = newTab;
    	//判断就表是否为空，若为空则直接返回一个新的空表，如果不为空，将旧数据复制至新表，这里其索引位置也会重新进行计算
        if (oldTab != null) {
            for (int j = 0; j < oldCap; ++j) {
                Node<K,V> e;
                if ((e = oldTab[j]) != null) {
                    oldTab[j] = null;
                    if (e.next == null)
                        newTab[e.hash & (newCap - 1)] = e;
                    else if (e instanceof TreeNode)
                        ((TreeNode<K,V>)e).split(this, newTab, j, oldCap);
                    else { // preserve order
                        Node<K,V> loHead = null, loTail = null;
                        Node<K,V> hiHead = null, hiTail = null;
                        Node<K,V> next;
                        do {
                            next = e.next;
                            if ((e.hash & oldCap) == 0) {
                                if (loTail == null)
                                    loHead = e;
                                else
                                    loTail.next = e;
                                loTail = e;
                            }
                            else {
                                if (hiTail == null)
                                    hiHead = e;
                                else
                                    hiTail.next = e;
                                hiTail = e;
                            }
                        } while ((e = next) != null);
                        if (loTail != null) {
                            loTail.next = null;
                            newTab[j] = loHead;
                        }
                        if (hiTail != null) {
                            hiTail.next = null;
                            newTab[j + oldCap] = hiHead;
                        }
                    }
                }
            }
        }
        return newTab;
    }


final V putVal(int hash, K key, V value, boolean onlyIfAbsent,
                   boolean evict) {
    	 //1.定义辅助变量
        Node<K,V>[] tab; Node<K,V> p; int n, i;
      
    	//如果table为空执行resize，resize后大小为16;
    	if ((tab = table) == null || (n = tab.length) == 0)
            n = (tab = resize()).length;
    
    	//通过计算key的hash值，判断应该存储在table表的哪个索引位置；&为逻辑与运算，对于每个位，只有两个操作数的对应位都为1时结果才为1，其存储位置为 table表的长度&hash值，这确保了其不会产生越界异常；；最后计算所在位置若为空，对该位置进行直接存储Node(hash,key,value,null),null指该node的下一个next为空
        if ((p = tab[i = (n - 1) & hash]) == null)
            
            /*再此位置其使用了newNode方法去创建节点有以下好处（chatgpt）：
            这个设计决策是出于一种代码优化和可读性的考虑。尽管newNode方法最终返回new Node<>(hash, key, value, next);，但这种间接的方式可以让代码更加灵活和易于理解。以下是一些原因：
			代码一致性：putVal方法使用newNode方法来创建节点，这样可以保持代码的一致性。在HashMap的源代码中，可能有多个地方需要创建节点，使用统一的方法可以减少代码的重复，降低出错的概率。
			未来的扩展性：如果以后需要对节点的创建逻辑进行更改，只需修改newNode方法而不需要修改所有使用new Node(hash, key, value, null)的地方。这种封装可以使未来的维护工作更加容易。
			可读性：通过使用newNode方法，可以将节点创建的细节隐藏在一个方法内部，使putVal方法的代码更加清晰和易读。这有助于其他开发人员更容易理解和维护代码。
*/
            tab[i] = newNode(hash, key, value, null);
    //如果该索引位置，已存有元素，则分情况进行新一步操作
        else {
            
            Node<K,V> e; K k;
            //判断索引位置的hash值以及内容是否与所要存储的元素相同，若相同不进行存储,并将其赋值给e,用于后期判断输出
            if (p.hash == hash &&
                ((k = p.key) == key || (key != null && key.equals(k))))
                e = p;
            //判断该索引处是否为红黑树类型
            else if (p instanceof TreeNode)
                e = ((TreeNode<K,V>)p).putTreeVal(this, tab, hash, key, value);
            //其他的对该索引下元素进行遍历比较
            else {
                for (int binCount = 0; ; ++binCount) {
                    //判断当前元素下一个元素是否为空，若为空则将新元素储存在下一位
                    if ((e = p.next) == null) {
                        p.next = newNode(hash, key, value, null);
                        //判断其是否到达红黑树条件，及该链表长度是否>=7，若符合，则进行红黑树操作（在此步操作过程中需要满足当前表的大小为64
                        if (binCount >= TREEIFY_THRESHOLD - 1) // -1 for 1st
                            treeifyBin(tab, hash);
                        break;
                    }
                    //判断索要存储元素是否与当前索引下一位元素hash值以及内容相同，若相同直接结束存储操作
                    if (e.hash == hash &&
                        ((k = e.key) == key || (key != null && key.equals(k))))
                        break;
                    //将索引更新到下一位
                    p = e;
                }
            }
            if (e != null) { // existing mapping for key
                V oldValue = e.value;
                if (!onlyIfAbsent || oldValue == null)
                    e.value = value;
                afterNodeAccess(e);
                return oldValue;
            }
        }
    	//操作次数+1
        ++modCount;
    
    	//如果尺寸大于临界值，扩容
        if (++size > threshold)
            resize();
    
        afterNodeInsertion(evict);
    
        return null;
    }
```

##### 3.LinkedHashSet

`public class LinkedHashSet<E> extends HashSet<E> implements Set<E>, Cloneable, java.io.Serializable `

可看出其底层为HashSet -> HashMap， 其底层维护LinkedHashMap(为HashMap的子类),但其内部使用双向链表，所以其有序

在第一次添加时，会将table(其类型为HashMap$Node[])扩容到的16，存放点节点类型为LinkedHashMap$Entry(其为HashMap$Node[]的子类)

### 17.注解

#### @SuppressWarnings

当使用Java的@SuppressWarnings注解时，可以指定不同的参数来抑制不同类型的警告。以下是一些常见的参数及其作用：


| 参数          | 作用                                                         |
| ------------ | ------------------------------------------------------------ |
| "unchecked"  | 抑制与类型安全相关的警告，通常用于消除使用泛型时的不受检查转换警告。 |
| "deprecation" | 抑制使用被弃用的类、方法或字段时生成的警告。                     |
| "rawtypes"   | 抑制使用原始类型（raw type）时生成的警告。原始类型是指未指定泛型参数的泛型类或接口。 |
| "unused" 或 "unused参数名" | 抑制未使用的代码或变量相关的警告。可以通过具体的参数名指定抑制哪个未使用的元素。 |
| "cast"       | 抑制在进行类型转换时可能引发的警告。通常与强制类型转换相关。       |
| "serial"     | 抑制没有序列化ID的`Serializable`类可能引发的警告。              |
| "finally"    | 抑制在`finally`块内缺少`return`或`throw`语句可能引发的警告。     |
| "all"        | 抑制所有可以使用`@SuppressWarnings`抑制的警告，但不推荐广泛使用，因为它可能掩盖真正的问题。 |

请注意，虽然`@SuppressWarnings("all")`可以抑制所有警告，但并不推荐广泛使用，因为这可能掩盖真正的问题。最好在使用时选择性地指定具体的警告类型。

#### 其他常用注解

当使用Java编程时，注解（Annotations）是一种元数据形式，它们提供有关程序代码的信息，可以用于编写更干净、更安全、更具表达性的代码。以下是一些常用的Java注解及其作用：

1. **`@Override`**：
   - **作用：** 用于标识一个方法覆盖了父类的方法。如果使用该注解的方法没有正确地覆盖超类的方法，编译器将生成一个错误。

2. **`@Deprecated`**：
   - **作用：** 用于标记已过时的方法、类或字段。当使用被标记为过时的元素时，编译器会发出警告，提示开发者使用替代方法。

3. **`@FunctionalInterface`**：
   - **作用：** 用于标识一个接口是一个函数式接口，即只包含一个抽象方法的接口。这使得编译器能够检查接口是否符合函数式接口的标准。

4. **`@SafeVarargs`**：
   - **作用：** 用于标记方法使用了安全变长参数（varargs），即该方法不会对变长参数执行任何可能导致堆污染的操作。

5. **`@NonNull` / `@Nullable`**：
   - **作用：** 用于标记方法参数、返回值或字段是否可以为`null`。这样的注解有助于静态分析工具或IDE提供更好的代码检查和提示。

6. **`@Entity`**（通常与JPA一起使用）：
   - **作用：** 用于标记一个Java类是一个JPA（Java Persistence API）实体。它将Java对象映射到数据库表。

7. **`@Autowired`**（通常与Spring框架一起使用）：
   - **作用：** 用于自动装配Spring框架中的bean。通过`@Autowired`注解，Spring容器可以自动识别和连接应用程序中的组件。

8. **`@RequestMapping`**（通常与Spring MVC一起使用）：
    - **作用：** 用于映射HTTP请求到具体的处理方法。它是Spring MVC中用于定义控制器的一种方式。

这只是一小部分常用注解的示例，Java有很多其他注解，每个框架和库都可能有其自己的特定注解。注解可以帮助开发者编写更清晰、更可维护的代码，同时提供了一些元数据，用于支持运行时的框架和工具。
