package scope;

public class Scope3_1 {
    public static void main(String[] args) {
        //스코프 존재 이유
        //변수의 범위를 한정해줌으로써
        // 불필요한 메모리 낭비 방지, 유지보수관점에서 좋음
        int m = 10;
        int temp = 0;

        if(m>0){//temp는 if문 안에서만 쓰므로 if문안에서만 쓸수있게 범위를 지정해주는게 좋음
            temp = m*2;
            System.out.println("temp="+temp);
        }
        System.out.println("m="+m);
    }
}
