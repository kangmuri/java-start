package cond;

public class CondEx {

    public static void main(String[] args) {
        //설정된 평점 이상인 영화를 출력해라
        double rating = 7.1;

        if(rating <= 9){
            System.out.println("어바웃타임추천");
        }

        if(rating <= 8){
            System.out.println("토이스토리추천");
        }

        if(rating <= 7){
            System.out.println("고질라추천");
        }


    }
}
