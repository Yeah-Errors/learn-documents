import  java.util.Scanner;

public class printPyramid {
     public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("请输入层数：");
        int floor =  input.nextInt();
        int length = floor*2-1;
        //控制每层的输出
        for (int i =1; i<= floor;i++){
            //控制每行的输出
            for(int a = 0;a<=length;a++){
                int b = 0;
                if(a+1<=(length+1)/2) b=floor-a+1;
                if(a+1>(length+1)/2) b=floor-length+a;
                if(b>i) System.out.print("     ");
                if(b<=i&&b!=0)System.out.printf("%5d",b);
            }
            System.out.println();
        }
    }
}
