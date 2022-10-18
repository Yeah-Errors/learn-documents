import java.util.Scanner;

public class 获取因子 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入一个整数：");
        int userNum = input.nextInt();
        for(int i = 2; i <= userNum; i++){
            if(userNum%i==0){
                System.out.print(i+" ");
                userNum /=i;
                i=1;
            }
        }
    }
}


