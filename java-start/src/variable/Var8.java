package variable;

public class Var8 {

    public static void main(String[] args) {

        //정수 long > int > short > byte
        byte b = 127; // 범위: -128 ~ 127 // 파일전송, 파일복사등에 주로 사용
        short s = 32767;// 범위:-32,768 ~ 32,767
        int i = 2147483647; // 범위: -2,147,483,648 ~ 2,147,483,648(약 20억)
        long l = 9223372036854775807L; //

        //실수
        float f = 10.0f;
        double d = 10.0;

        //주로 int와 double,boolean을 씀
    }
}
