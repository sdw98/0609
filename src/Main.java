public class Main {
    public static void main (String[] args) {
        String message = "Hello, Java!";

        System.out.println(message);
        System.out.println(message.length()); //크기
        System.out.println(message.toUpperCase()); //대문자변환
        System.out.println(message.toLowerCase()); //소문자변환
        System.out.println(message.indexOf("l")); //해당 글자 위치(중복이면 첫글자로)
        System.out.println(message.charAt(5)); //한글자 출력

        System.out.println(message.substring(2,6)); //2부터 6까지 출력
        System.out.println(message.substring(message.length() - 3)); //뒤에서 3글자출력
    }
}
