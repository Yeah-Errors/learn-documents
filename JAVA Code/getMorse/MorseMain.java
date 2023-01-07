

import java.util.Scanner;
/*
-m 转化为morse码
-n 转化为字符
-h 显示帮助信息
 */
public class MorseMain {
    public static void main(String[] args) {
        if(args.length!=0){
            if(args[0].equals("-m")){
                for (int i = 1; i < args.length; i++) {
                    System.out.print(ToMorse.toMorse(args[i]));
                }
            }
            if(args[0].equals("-n")){
                for(int k=1;k<args.length;k++){
                    System.out.println(ToCh.basicToCh(ToCh.toBasic(args[k])));
                }
            }
            if(args[0].equals("-h")){
                System.out.println("摩斯码转换程序说明\n" +
                        "-m 将文字转换为摩斯码\n" +
                        "-n 将摩斯码转换为文字\n" +
                        "-h 显示帮助信息\n");
            }
        }
        else{
            System.out.println("摩斯码转换程序说明\n" +
                    "-m 将文字转换为摩斯码\n" +
                    "-n 将摩斯码转换为文字\n" +
                    "-h 显示帮助信息\n");
        }
    }
}
