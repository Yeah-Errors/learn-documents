
public class ArraySort {
    public static void main(String[] args) {
        double[] userArrays = StringToArray.getNum();
        for(int i=0;i<userArrays.length;i++){
            double temp= 0;
            for(int j = i; j < userArrays.length ; j++){
                if(userArrays[j]<userArrays[i]){
                    temp = userArrays[i];
                    userArrays[i] = userArrays[j];
                    userArrays[j]= temp;
                }
            }
        }
        for(double i : userArrays){
            System.out.println(i);
        }
    }
}

