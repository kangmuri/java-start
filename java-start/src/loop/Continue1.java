package loop;

public class Continue1 {

    public static void main(String[] args) {
        int i = 1;

        while(i<=5){
            if(i == 3){
                i++;
                continue;//i=3일 경우 다음 코드 생략하고 i=4로 넘어간다
            }
            System.out.println(i);
            i++;
        }
    }
}
