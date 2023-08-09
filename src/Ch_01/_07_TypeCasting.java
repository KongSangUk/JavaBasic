package Ch_01;

public class _07_TypeCasting {
    public static void main(String[] args) {

        /*
         형변환 TypeCasting
         정수형에서 실수형
         실수형에서 정수형
         */


        // 정수형에서 실수형
        int score = 93;
        System.out.println(score);
        System.out.println((float)score);
        System.out.println((double)score);

        System.out.println();


        // 실수형에서 정수형
        float score_f = 93.3F;
        double score_b = 98.8;
        System.out.println((int)score_f);
        System.out.println((int)score_b);

        System.out.println();


        // 정수와 실수 연산
        score = 93 + (int)98.7;
        System.out.println(score);

        score_b = (double) 93 + 98.7;
        System.out.println(score_b);

        System.out.println();


        // 변수에 형변횐된 데이터 집어넣기
        double convertedScoreDouble = score;    // 191 -> 191.0
        // int -> long -> float -> double (자동 형변환)

        int convertedScoreInt = (int) score_b;  // 191.8 -> 191
        // double -> float -> long -> int (수동 형변환)


        // 숫자를 문자열로
        String s1 = String.valueOf(93);
        s1 = Integer.toString(93);
        System.out.println(s1);


        // 숫자를 문자열로
        String s2 = String.valueOf(98.8);
        s2 = Double.toString(98.8);
        System.out.println(s2);


        // 문자열을 숫자로
        int i = Integer.parseInt("93");
        System.out.println(i);

        double d = Double.parseDouble("98.8");
        System.out.println(d);

    }
}
