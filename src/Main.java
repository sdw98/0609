public class Main {
    public static void main (String[] args){
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};

//      for (int i = 0; i < 5; i ++){
//            System.out.println(numbers[i]);
//        }

        for (int i = numbers.length - 1; i > 0 ; i-- ){
            System.out.println(i);
        }
    }
}
