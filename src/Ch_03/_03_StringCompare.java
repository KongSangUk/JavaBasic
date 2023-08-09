package Ch_03;

public class _03_StringCompare {
    public static void main(String[] args) {

        // 문자열 비교
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals(s2)); // false
        System.out.println(s1.equals("Java")); // true
        System.out.println(s2.equals("python")); // false
        System.out.println(s2.equalsIgnoreCase("python")); // true
        System.out.println();

        // 문자열 비교 심화
        s1 = "1234"; // 벽에 붙은 메모지의 비밀번호 정보 (참조)
        s2 = "1234";

        System.out.println(s1.equals(s2)); // true(내용)
        System.out.println(s1 == s2); // true(참조)
        System.out.println();

        s1 = new String("1234");
        s2 = new String("1234");
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1 == s2); // false



    }
}
