package scope;

public class Scope1 {
    public static void main(String[] args) {
        //지역변수는 선언된 블록 안에서만 사용 가능
        int m = 10;

        if(true){
            int x = 20;
            System.out.println(m);
            System.out.println(x);
        }
        System.out.println(m);
        //System.out.println(x); 범위를 벗어났기때문에 사용x
    }
}
