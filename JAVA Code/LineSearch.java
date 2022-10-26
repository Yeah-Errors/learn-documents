/*
首先录入所有数据，采用字符串转换的方式
然后进行线性搜索；
之所以不采取二分法是因为，二分法在前期排序时也遍历了整个数组，其效果不如线性查找；
 */


import java.util.*;
public class LineSearch{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] userInput = getNum();
        System.out.print("输入要搜索的值: ");
        double search = input.nextDouble();
        for (int i = 0 ;i<userInput.length;i++){
            if(userInput[i]==search){
                System.out.printf("这个数在第%d个",i+1);
                break;
            }
            else if(i==userInput.length-1) {
                System.out.print("不存在这个数字");
            }
        }
    }
    //将数据录入一个数组之中，其数组大小自己获取
    public static double[] getNum(){
        Scanner input = new Scanner(System.in);
        System.out.print("请录入数据（数据间用空格隔开）：");
        String str = input.nextLine();
        double[] userDouble = new double[getLength(str)];
        for(int i = 0,b=0;i<=userDouble.length;i++){
            int temp = b;
            b = str.indexOf(' ',b+1);
            if(b!=-1)userDouble[i] = Double.parseDouble(str.substring(temp,b));
            if(b==-1){
                userDouble[i] = Double.parseDouble(str.substring(temp));
                break;
            }
        }
        return userDouble;


    }
    //获取所需数组长度；
    public static int getLength(String str){
        int length = 0,i=0;
        while (i!=-1){
            i = str.indexOf(' ',i+1);
            length ++;
        }
        return length;
    }
}
