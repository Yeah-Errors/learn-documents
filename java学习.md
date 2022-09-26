# Java对话框

**[官方文档](https://docs.oracle.com/javase/7/docs/api/javax/swing/JOptionPane.html)**

### 1. 使用前需声明

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
