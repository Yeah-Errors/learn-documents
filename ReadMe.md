# Java学习心得

**[官方文档](https://docs.oracle.com/javase/18)**

### 1. 使用对话框前需声明

```java
import javax.swing.JOptionPane;
```

### 2. 输入对话框

```java
JOptionPane.showInputDialog(null,String,Title,int);
```

### 3.消息框

```java
JOptionPane.showMessageDialog(null,String,Title,int);
```

### 4.确认对话框

```java
showConfirmDialog(Component parentComponent,Object message,String title,int optionType,int messageType, Icon icon)
```
 ### 5.for 循环内声明的变量循环外不可用！！
 ```java
 int c=0;
 for (int i=0;i<=10;i++){
     int b=0;
     c++;
}
//其中i,b在循坏之外无法使用，但c可以正常使用
```

### 6.获取当前时间戳

```java
long time = System.currentTimeMillis();//获取毫秒级时间戳
long time = System.nanoTime();//获得纳秒级时间戳
```

### 7.获取用户输入的字符串
```java
import java.util.Scanner;//使用前需要声明；
Scanner input = new Scanner(System.in);
String str1 =input.next();//next()读取到字符结束后直接停止
String str2 =input.nextLine();//nextLine()读取下一整行;
System.out.print(str1+str2);
```

### 8.有关自增自减（即i++,++i等）的说明

| 操作符 |   名称   |              描述               |      示例（假设 i =1）      |
| :----: | :------: | :-----------------------------: | :-------------------------: |
| ++ var | 前置自增 |  将var加1，语句中使用新的var值  | int j = ++i;  // j为2，i为2 |
| var ++ | 后置自增 | 将var加1，语句中使用原来的var值 | int  j = i++; //j为1 ，i为2 |


实际上是遵循运算顺序的体现

### 9.有关JShell

JShell是java9引入的命令行互交式工具 可用cdm输入指令启动
```shell
jshell
```
相关指令
```shell
//一些单句的java语法例如
int x=5;
 
System.out.print(x);

/vers //此指令可列出所有以声明的变量

/edit //打开编辑面板

```
