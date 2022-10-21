public class  ChickenAndRabbit {
    public static void main(String[] args) {
        int chicken,rabbit,totalHead=35,totalFoot=94;
        for(chicken = 0; chicken <= totalHead ; chicken++){
            for(rabbit = 0; rabbit <= totalHead ; rabbit++ ){
                if(chicken * 2 + rabbit * 4 == totalFoot && chicken + rabbit == totalHead) System.out.printf("共有 %d 只鸡， %d 只兔",chicken,rabbit);
            }
        }
    }
}
