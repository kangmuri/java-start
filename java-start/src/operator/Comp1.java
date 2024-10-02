package operator;

public class Comp1 {

    public static void main(String[] args) {
        //비교연산자
        int a = 2;
        int b = 3;

        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);

        boolean result = a==b;//boolean변수에 담을수있음
        System.out.println("result = "+result);
    }
}
