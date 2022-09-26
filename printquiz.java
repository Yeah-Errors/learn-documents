import java.util.Scanner;
public class printquiz {
    public static void main(String[] args){
        Scanner getint = new Scanner(System.in);
        System.out.print("请输入长：");
        int l = getint.nextInt();
        System.out.print("请输入宽：");
        int h = getint.nextInt();
        System.out.print("        ");
        for(int i =0;i<h;i++){
            for(int i2=0;i2<l;i2++) System.out.print("*");
            System.out.print("\n        ");
        }

    }
}
