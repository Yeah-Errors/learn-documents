import java.util.Scanner;
import java.util.Stack;

public class Computer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入四则运算表达式：");
        String input = scanner.nextLine();
        System.out.println("正在解析表达式……");
        String expression = parseExpression(input);
        System.out.println("解析完成，表达式为：" + expression + "=");
        System.out.println("正在计算……");
        double out = computer(expression);
        System.out.println("计算完成，结果为：" + out);
    }
    /*对用户输入的数学表达式进行规范化处理
    1.去除多余空格
    2.在符号与数字之间增加空格
    */
    public static String parseExpression(String userInput) {
        String[] input = userInput.split(" +");
        StringBuilder out = new StringBuilder();
        for (String s : input) {
            //使用正则表达式匹配运算符，对其进行操作
            if (s.matches("[+)(?*x/-]")) {
                out.append(" ").append(s).append(" ");
                continue;
            }
            //使用正则表达式匹配一个数字，对其进行操作
            if (s.matches("\\d+(\\.\\d+)")) {
                out.append(s);
                continue;
            }
            //对于无法匹配的，往往是数字与符号的混合体，进行注意匹配操作
            for (int j = 0; j < s.length(); j++) {
                if (s.substring(j, j + 1).matches("[+)(?*x/-]")) {
                    out.append(" ").append(s.charAt(j)).append(" ");
                    continue;
                }
                if (s.substring(j, j + 1).matches("\\d")) {
                    out.append(s.charAt(j));
                }
            }

        }
        //去除多余空格，保证符号与符号之间仅有一个空格，并返回
        return out.toString().replace("  ", " ").trim();
    }

    /*
    实现解析式计算功能：
    用两个栈进行操作
    分别为数据栈和符号栈
    对解析式每一个符号进行吸取，并动态存储
    1. +与-处理前面所有运算符
    2、*与/处理前面*与/运算符
    3.（仅进行入栈操作，）一直进行处理知道遇见左括号
    其中-为了避免与负号重叠，将其作为0-处理，及取后部数字的相反数
    可能的异常：
    除数为0 
    解析式错误
     */
    public static double computer(String expression) {
        Stack<Double> value = new Stack<>();
        Stack<Character> chars = new Stack<>();
        String[] tokens = expression.split(" ");
        for (String token :
                tokens) {
            if (token.matches("[+-]")) {
                while (!chars.isEmpty() && chars.peek().toString().matches("[+*/-]")) computerProcess(value, chars);
                chars.push(token.charAt(0));
            } else if (token.matches("[*/]")) {
                while (!chars.isEmpty() && chars.peek().toString().matches("[/*]")) computerProcess(value, chars);
                chars.push(token.charAt(0));
            } else if (token.equals("(")) {
                chars.push(token.charAt(0));
            } else if (token.equals(")")) {
                while (chars.peek() != '(') computerProcess(value, chars);
                chars.pop();
            } else {
                value.push(Double.valueOf(token));
            }
        }
        while (!chars.isEmpty()) computerProcess(value, chars);
        return value.pop();
    }

    public static void computerProcess(Stack<Double> operand, Stack<Character> operator) {
        char op = operator.pop();
        double op1 = operand.pop();
        double op2 = operand.pop();
        if (op == '+') operand.push(op2 + op1);
        if (op == '-') operand.push(op2 - op1);
        if (op == '*') operand.push(op2 * op1);
        if (op == '/') operand.push(op2 / op1);
    }
}

