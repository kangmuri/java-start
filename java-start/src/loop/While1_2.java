package loop;

public class While1_2 {

    public static void main(String[] args) {

        int count = 0;
        while(count < 3) {//조건이 거짓이 될때까지 계속 안의 코드 반복
            count = count + 1;
            System.out.println("현재숫자는:" + count);
        }

    }
}
