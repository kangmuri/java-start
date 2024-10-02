package cond;

public class Switch2 {

    public static void main(String[] args) {
        //if문은 비교 연산자를 사용할수있지만 , switch문은 단순히 값이 같은지만 비교
        int grade = 2;

        int coupon;

        switch (grade){
            case 1:
                coupon = 1000;
                break;
            case 2:
            case 3: // 2,3 같은 값을 주고싶을때 이런식으로 사용할수있음
                coupon = 3000;
                break;
            default:
                coupon = 500;
        }

        System.out.println(coupon);
    }
}
