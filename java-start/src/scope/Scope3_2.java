package scope;

public class Scope3_2 {
    public static void main(String[] args) {

        int m = 10;

        if(m>0){//temp는 if문 안에서만 쓰므로 if문안에서만 쓸수있게 범위를 지정해주는게 좋음
            int temp = m*2;
            System.out.println("temp="+temp);
        }
        System.out.println("m="+m);
    }
}
