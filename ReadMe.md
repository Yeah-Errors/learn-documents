# Java学习心得

**[java18官方开发文档](https://docs.oracle.com/javase/18)**

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

JShell是java9引入的命令行互交式工具 可用cdm输入指令启动
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
/*StringBuilder和StringBuffer类似于String类，区别在于String类是不可变的
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




