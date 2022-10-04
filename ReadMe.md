# Java学习心得

**[java官方开发文档](https://docs.oracle.com/javase/18)**

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

**[有关Jshell的官方文档](https://docs.oracle.com/en/java/javase/11/jshell)**

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

### 8.关于Character类

```java
Character.isDigit(ch); //如果指定的字符为数字，返回true;
Character.isLetter(ch); //字符为字母，返回true;
Character.isLetterOrDigit(ch);//字符为数字或者字母，返回true;
Character.isLowerCase(ch);//小写字母返回true;
Character.isUpperCase(ch);//大写字母返回true;
Character.toLowerCase(ch);//返回指定字符的小写；
Character.toUpperCase(ch);//返回指定字符的大写；
```

