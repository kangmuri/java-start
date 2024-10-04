package loop;

public class Nested1 {

    public static void main(String[] args) {
        //중첩반복문
        for(int i=0; i<3; i++){
            System.out.println("외부for시작 i="+i);
            for(int j=0; j<3; j++){
                System.out.println("내부For"+i+"-"+j);
            }
            System.out.println("외부for종료 i:"+i);
            System.out.println();
        }
    }
}
