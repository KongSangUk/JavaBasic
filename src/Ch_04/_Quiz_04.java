package Ch_04;

public class _Quiz_04 {
    public static void main(String[] args) {

        /*
        조건문을 활용하여 주차 요금 정산 프로그램을 작성하시오.

        조건
        - 주차 요금은 시간장 4000원 (일일 최대 요금은 30000원)
        - 경차 또는 장애일 차량은 최종 요금에서 50% 할인

        주차요금 예시
        - 일반차량 5시간 주차 시 20000원
        - 경차 5시간 주차 시 10000원
        - 장애인 차량 10시간 주차시 15000원
        */

        int hour = 14;
        int sum = 0;
        int max = 30000;
        String input = "장애인차";
        // "경차" ,"장애인차"

        if (input.equals("일반차")){
            sum = hour * 4000;
            System.out.println("차량 종류 : " + input);
            System.out.println("주차한 시간 : " + hour);
            System.out.println("할인 대상 : " + input +"은 대상 아님" );

            if (sum > max){
                System.out.println("주차 요금 : 30000");
            }else {
                System.out.println("주차 요금 : " + sum);
            }
            System.out.println("정산");
        }

        if (input.equals("경차") || input.equals("장애인차")){
            sum = (hour * 4000) / 2;
            System.out.println("차량 종류 : " + input);
            System.out.println("주차한 시간 : " + hour);
            System.out.println("할인 대상 : " + input +"은 50% 할인" );

            if (sum > max){
                System.out.println("주차 요금 : 30000");
            }else {
                System.out.println("주차 요금 : " + sum);
            }
            System.out.println("정산");
        }


    }

}
