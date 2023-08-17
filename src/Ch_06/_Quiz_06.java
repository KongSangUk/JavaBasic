package Ch_06;

    // 개인 정보 중 일부를 비공개로 전환하는 프로그램을 작성

    /* 조건
    - 개인정보를 비공개로 전환하는 베소드 작성
    - 하나의 메소드에서 모든 동작 처리
    - 각 정보는 아래 위치부터 비공대 적용

    이름 : 2번째 글자 (공 | 상욱)
    주민번호 : 9번째 글자 (910411-2 | 234567)
    전화번호 : 10번째 글자 (010-1234- | 5668)
    */

public class _Quiz_06 {

    public static String getHiddenData (String data, int index) {

        String hiddenData = data.substring(0, index);
//        for (int i = index; i < data.length(); i++) {
        for (int i = 0; i < data.length() - index; i++) {
            hiddenData += "*";
        }

        return hiddenData;
    }

    public static void main(String[] args) {

        String name = "공상욱";
        String id = "910411-2234567";
        String phone = "010-1234-5668";

        System.out.println("이름 : " + getHiddenData(name, 1));
        System.out.println("주민번호 : " + getHiddenData(id, 8));
        System.out.println("전화번호 : " + getHiddenData(phone,9));


    }
}
