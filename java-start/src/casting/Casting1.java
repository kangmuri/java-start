package casting;

public class Casting1 {

    public static void main(String[] args) {
        //int < long < double
        //작은범위에서 큰범위로 값을 대입하는것은 가능
        //큰범위에서 작은 범위로 대입하는것은 명시적인 형변환이 필요함 intValue = (int)longValue;
        int intValue = 10;
        long longValue;
        double doubleValue;

        longValue = intValue;//int -> long
        System.out.println(longValue);

        doubleValue = intValue; // int -> double
        System.out.println(doubleValue);

        doubleValue = 20L;//long->double
        System.out.println(doubleValue);

    }
}
