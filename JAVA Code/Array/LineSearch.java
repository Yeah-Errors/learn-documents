/*
首先录入所有数据，采用字符串转换的方式
然后进行线性搜索；
之所以不采取二分法是因为，二分法在前期排序时也遍历了整个数组，其效果不如线性查找；
 */


import java.util.*;
public class LineSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] userInput = StringToArray.getNum();
        System.out.print("输入要搜索的值: ");
        double search = input.nextDouble();
        for (int i = 0; i < userInput.length; i++) {
            if (userInput[i] == search) {
                System.out.printf("这个数在第%d个\n", i + 1);
                break;
            } else if (i == userInput.length - 1) {
                System.out.print("不存在这个数字");
            }
        }
    }
}   //将数据录入一个数组之中，其数组大小自己获取