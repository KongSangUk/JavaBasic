package Ch_01;

public class _05_VariablesNaming {
    public static void main(String[] args) {

        /* 변수 이름 짓는 방법
        1. 저장할 값에 어울리는 이름
        2. 밑불(_), 문자(abc), 숫자(123) 사용 가능 (공백 사용 불가)
        3. 밑줄 또는 문자로 시작 가능
        4. 한 단어 또는 2개 이상 단어의 연속
        5. 소문자로 시작, 각 다너의 시가 글자는 대문자
        6. 예약어 사용 불가
        */

        // 입국 신고서 (여행)
        String nationality = "대한민국";
        String firstName = "상욱";
        String lastName = "공";
        String dateOfBirth = "1997-04-19";
        String residentialAddress = "신라 호텔";
        String purposeOfVisit = "관광";

        String flightNo = "KE678";
        String _flightNo = "KE678";
        String flight_no_2 = "KE678";

        int accompany = 2;
        int lengthOfStay = 5;

        String item1 = "시계";
        String item2 = "가방";

        // 절대 변하지 않는 상수는 대문자로
        final  String CODE = "KR";

    }
}
