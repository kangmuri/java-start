package scope;

public class Scope2 {
    public static void main(String[] args) {

        int m = 10;
        for(int i=0; i<2; i++){//블록 내부, for문 내
            System.out.println(m);//외부에서 내부로 접근은 가능
            System.out.println(i);
        }
        //여기서 i에 접근 불가
    }
}
