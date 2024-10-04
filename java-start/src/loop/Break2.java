package loop;

public class Break2 {

    public static void main(String[] args) {

        int sum = 0;
        int endNum = 10;

        for(int i=1; i<endNum; i++){
            sum = sum + i;
            if(sum > 10) {
                System.out.println("i=" + i + "sum=" + sum);
                break;
            }
        }

    }
}
