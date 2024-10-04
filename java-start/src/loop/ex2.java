package loop;

public class ex2 {

    public static void main(String[] args) {

        for(int i=0; i<10; i++){
            if(i%2==0){
                System.out.println("for문"+i);
            }
        }

        int count = 0;

        while(count<10){
            if(count%2==0){
                System.out.println("while문"+count);
            }
            count++;
        }
    }
}
