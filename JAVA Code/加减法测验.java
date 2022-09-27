import java.util.Scanner;
public class 加减法测验 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("输入出题数；");
        int getnum = input.nextInt();
        System.out.print("请输入每道题的分数：");
        int getscore =input.nextInt();
        System.out.print("程序初始化完成，输入1开始计时并执行；");
        int start=input.nextInt();
        int num1=0,num2=0,user=0,score=0;
        long time1=0,time2=0,titletime=0;
        if(start==1){
            time1 = System.currentTimeMillis();
            for(int i= 1;i<=getnum;i++){
                num1 =(int)(Math.random()*100);
                num2 =(int)(Math.random()*100);
                System.out.printf("%d. %d + %d = ",i,num1,num2);
                user = input.nextInt();
                if(user==num1+num2) score += getscore;
            }
            time2=System.currentTimeMillis();
            titletime=(time2-time1)/1000;
            System.out.printf("您的总成绩为%d ，总用时%d s",score,titletime);
        }
    }
}
