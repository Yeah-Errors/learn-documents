import java.util.Scanner;

public class 素数{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("请输入一个大于二的整数：");
        int usernum=input.nextInt();
        int a,b,c;
        for(a=2;a<=usernum;a++){
            boolean pan=false;
            b=1;
            c=0;
            while(b<=a){
                    if(a%b==0) c++;
                    b++;
            }
            if(c==2) System.out.print(a+"\t");
        }
    }
}
