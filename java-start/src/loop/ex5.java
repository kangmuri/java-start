package loop;

public class ex5 {

    public static void main(String[] args) {
        //피라미드 출력
        int row = 3;

        for(int i=1; i<=row; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
