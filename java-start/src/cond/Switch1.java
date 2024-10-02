package cond;

public class Switch1 {

    public static void main(String[] args) {
        //if문은 비교 연산자를 사용할수있지만 , switch문은 단순히 값이 같은지만 비교
        int grade = 2;

        int coupon;

        switch (grade){
            case 1:
                coupon = 1000;
                break;
            case 2:
                coupon = 2000;
                break;
            case 3:
                coupon = 3000;
                break;
            default:
                coupon = 500;
        }

        System.out.println(coupon);
    }
}
