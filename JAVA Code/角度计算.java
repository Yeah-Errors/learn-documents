import java.util.Scanner;
public class 角度计算 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("请输入它的三条边：");
        double l1 = input.nextDouble();
        double l2 = input.nextDouble();
        double l3 = input.nextDouble();
        double A = Math.toDegrees(Math.acos((l1*l1+l2*l2-l3*l3)/(2*l1*l2)));
        double B = Math.toDegrees(Math.acos((l1*l1+l3*l3-l2*l2)/(2*l1*l3)));
        double C = Math.toDegrees(Math.acos((l2*l2+l3*l3-l1*l1)/(2*l2*l3)));
        System.out.print("三个角分别是："+Math.round(A*100)/100.0+" "+" "+Math.round(B*100)/100.0+" " +Math.round(C*100)/100.0);
    }
}
