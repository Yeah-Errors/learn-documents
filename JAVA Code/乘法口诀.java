public class 乘法口诀{
    public static void main(String[] args){
        int h,s;
        System.out.println("            乘法口诀");
        System.out.print("       ");
        for(h=1,s=1;h<=9;h++) System.out.printf("%d   ",h);
        System.out.println("\n--------------------------------------------");
            for(s=1;s<=9;s++){
                System.out.print(s+" | ");
                for(h=1;h<=9;h++) System.out.printf("%4d",h*s);
                System.out.println();
        }
    }
}
