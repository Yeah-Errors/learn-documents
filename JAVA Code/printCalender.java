import java.util.Scanner;
public class printCalender {
    static int[] c ={1,3,5,7,8,10,12};
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入年份（1949之后）：");
        int userYear = input.nextInt();
        System.out.print("请输入月份：");
        int userMouth = input.nextInt();
        printMouth(userYear,userMouth);
    }
    //返回当年第一天为周几
    public static int  getText(int i){
        int distance = i -1949;
        int totalDay = distance * 365+distance/4;
        return (totalDay%7+6)%7;
    }
    //返回当月第一天为周几
    public static int getText2(int a,int b){
        int janDay = getText(a);
        int totalDay = (b-1)*30;
        for(int m=1;m<b;m++){
            for (int i : c) {
                if (m == i) totalDay += 1;
            }
        }
        if(b>2) totalDay -= (30-getFebDay(a));
        return (totalDay%7+janDay)%7;
    }
    //判断二月的时长
    public static int getFebDay(int i){
        int a = 28;
        if((i%4==0&&i%100!=0)||i%400==0) a=29;
        return a;
    }
    public static void printMouth(int year,int mouth) {
        int mouthTotalDay = 30;
        if (mouth == 2) mouthTotalDay = getFebDay(year);
        for (int i : c) {
            if (mouth == i) {
                mouthTotalDay = 31;
                break;
            }
        }
        System.out.printf("\t%d 年  %d 月\n", year, mouth);
        System.out.println("  一   二   三  四  五  六  日");
        System.out.println("--------------------------------");
        for(int i =1,k =1;true;i++){
            if(i<getText2(year,mouth)) {
                System.out.print("    ");
                continue;
            }
            System.out.printf("%4d",k);
            k++;
            if(i%7==0) System.out.println();
            if(k> mouthTotalDay) break;
            }
        }
 }

