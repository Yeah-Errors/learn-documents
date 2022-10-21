public class Marx {
    public static void main(String[] args) {
        int man, women, child, totalMoney = 50, totalPeople = 30 , ifAllChild = 30,i = 0;
        for(man = 0; man <= totalMoney / 3 ; man++){
            women = (totalMoney - (ifAllChild + 2 * man ));
            child = totalMoney - women * 2 - man*3;
            if(women + child +man == totalPeople && women > 0 && child > 0) {
                System.out.printf("男人 %d 位，女人 %d 位，孩子 %d 位;\n",man,women,child);
                i ++ ;
            }
        }
        System.out.printf("共有以上 %d 种答案",i);
    }
}
