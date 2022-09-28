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
long time = System.currentTimeMillis();//后续补充其他方法
```

### 7.获取用户输入的字符串
```java
import java.util.Scanner;//使用前需要声明；
Scanner input = new Scanner(System.in);
String str =input.nextLine();
System.out.print(str);
```
