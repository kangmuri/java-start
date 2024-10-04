package loop;

public class DoWhile {

    public static void main(String[] args) {
        int i=1;

        do {
            System.out.println("현재숫자는:"+i);
            i++;
        }while(i<3);//조건이 거짓이 될때까지 do안의 코드 실행
    }
}
