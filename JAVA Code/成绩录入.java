import java.util.Scanner;
public class 成绩录入{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String name=null,maxname=name;
		int num=0,score=0,i=1,maxscore=score;
		System.out.print("输入学生人数：");
		num =input.nextInt();
		for(i=1;i<=num;i++){
			int temp= score;
			System.out.print("请输入姓名：");
			name = input.next();
			System.out.printf("输入 %s 的分数：",name);
			score = input.nextInt();
			if(score>=temp){
				maxscore=score;
				maxname=name;
			}
		}
		System.out.printf("最高分为 %d ,他/她的名字是 %s\n ",maxscore,maxname);
	}
}
