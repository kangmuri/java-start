package casting;

public class Casting3 {

    public static void main(String[] args) {

        long maxIntValue = 2147483647;//int 최고값
        long maxIntOver = 2147483648L;//int 최고값+1
        int intValue = 0;

        intValue = (int) maxIntValue;
        System.out.println(intValue);

        intValue = (int) maxIntOver;//int범위를 초과하여 오버플로우발생
        System.out.println(intValue);

    }
}
