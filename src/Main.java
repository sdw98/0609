public class Main {
    public static int add(int a, int b){
        return a+b;
    }

    public static int add(int a, int b, int c){
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println("a + b = " + add(1,2));
        System.out.println("a + b + c = " + add(3, 4, 5));

        System.out.println(1);
        System.out.println(1.1);
        System.out.println("adc");
    }
}
