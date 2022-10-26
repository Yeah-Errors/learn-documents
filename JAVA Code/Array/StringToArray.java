import java.util.Scanner;

public class StringToArray {
    public static double[] getNum() {
        Scanner input = new Scanner(System.in);
        System.out.print("请录入数据（数据间用空格隔开）：");
        String str = input.nextLine();
        double[] userDouble = new double[getLength(str)];
        for (int i = 0, b = 0; i <= userDouble.length; i++) {
            int temp = b;
            b = str.indexOf(' ', b + 1);
            if (b != -1) userDouble[i] = Double.parseDouble(str.substring(temp, b));
            if (b == -1) {
                userDouble[i] = Double.parseDouble(str.substring(temp));
                break;
            }
        }
        return userDouble;


    }

    //获取所需数组长度；
    public static int getLength(String str) {
        int length = 0, i = 0;
        while (i != -1) {
            i = str.indexOf(' ', i + 1);
            length++;
        }
        return length;
    }
}
