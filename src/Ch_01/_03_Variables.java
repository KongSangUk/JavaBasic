package Ch_01;

public class _03_Variables {
    public static void main(String[] args) {

        String name = "공상욱";    // 문자열
        int hour = 15;           // 정수
        double score = 90.5;     // 실수
        char grade = 'A';        // 문자
        boolean pass = true;     //
        double d = 3.14123456789;
        float f = 3.14123456789F;

        System.out.println(name + "님, 배송이 시작됩니다. " + hour + "시에 방문 예정입니다.");
        System.out.println(name + "님, 배송이 완료되어습니다.");

        System.out.println();

        name = "나변경";
        System.out.println(name + "닝의 평균 점수는" + score + "점 입니다.");
        System.out.println(name + "닝의 학점은" + grade + "입니디.");

        System.out.println();

        name = "더블";
        System.out.println(name + "님의 최종 합격 결과는" + pass);

        System.out.println();

        System.out.println(d);
        System.out.println(f);

        System.out.println();

//        int l = 1000000000000;
        long l = 1000000000000l;
        l = 1_000_000_000_000L;
        System.out.println(l);

    }
}
