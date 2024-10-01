package operator;

public class Operator1 {

    public static void main(String[] args) {
        //변수초기화
        int a = 5;
        int b = 2;

        //덧셈
        int sum = a+b;
        System.out.println("a+b="+sum);

        //뻴셈
        int diff = a-b;
        System.out.println("a-b="+diff);

        //나눗셈
        int div = a/b;//int형끼리의 계산은 소수점 표현x
        System.out.println("a/b="+div);

        //곱셈
        int multi = a*b;
        System.out.println("a*b="+multi);

        //나머지
        int mod = a%b;
        System.out.println("a%b="+mod);
    }
}
