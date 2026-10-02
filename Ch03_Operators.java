public class Ch03_Operators {
    public static void main(String[] args) {
        int a = 4;
        int b = 5 % a; // modulus operator
        System.out.println(b);
        System.out.println(6 == 8); // comparison operator

        int x = 55;
        int y = 8;
        int z = 68;

        // logical operators
        System.out.println(x > 7 && x > 9);
        System.out.println(x > y || x > z);
    }
}
