package loop;

public class ex3 {

    public static void main(String[] args) {
        int max = 100;
        int sum1 = 0;
        int sum2 = 0;
        int count = 0;

        for(int i=0; i<=max; i++){
            sum1 += i;
        }
        System.out.println("for문:"+sum1);


        while(count<=max){
            sum2 += count;
            count++;
        }
        System.out.println("while문"+sum2);
    }
}
