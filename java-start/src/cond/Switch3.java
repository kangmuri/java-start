package cond;

public class Switch3 {

    public static void main(String[] args) {
        //새로운 switch문 자바14버전이상에서 쓸수있음

        int grade = 2;

        int coupon = switch (grade){
            case 1 -> 1000;
            case 2 -> 2000;
            case 3 -> 3000;
            default -> 500;
        };
        System.out.println(coupon);
    }
}
