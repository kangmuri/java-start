package cond;

public class CondEx2 {

    public static void main(String[] args) {
        //하점에 따라 성취로를 출력하는 프로그램
        String grade = "A";

        switch(grade){
            case "A":
                System.out.println("탁월한 성과입니다");
                break;
            case "B":
                System.out.println("좋은 성과입니다");
                break;
            case "C":
                System.out.println("준수한 성과입니다");
                break;
            case "D":
                System.out.println("향상이 필요합니다");
                break;
            case "F":
                System.out.println("불합격 입니다");
                break;
            default:
                System.out.println("잘못된학점입니다.");
        }


    }
}
