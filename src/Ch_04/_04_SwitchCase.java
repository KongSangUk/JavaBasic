package Ch_04;

public class _04_SwitchCase {
    public static void main(String[] args) {

        // Switch Case

        // 1등 : 전액 장학금
        // 2등  : 반액 장학금
        // 3등 : 반액 장학금
        // 그 외 : 장학금 대상 아님

        int ranking  = 1;

        // if else (여러 조건 또는 범위에 해당하는 조건)
        if (ranking == 1){
            System.out.println("1등 : 전액 장학금");
        } else if (ranking == 2) {
            System.out.println("2등  : 반액 장학금");
        } else if (ranking == 3) {
            System.out.println("3등  : 반액 장학금");
        }else {
            System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료!");
        System.out.println();


        // switch case (명확한 케이스가 있는 경우)
        ranking  = 2;

        switch (ranking){
            case 1 :
                System.out.println("1등 : 전액 장학금");
                break;
            case 2 :
                System.out.println("2등  : 반액 장학금");
                break;
            case 3 :
                System.out.println("3등  : 반액 장학금");
                break;
            default:
                System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료!!");
        System.out.println();


        // case 결과가 같을경우
        ranking  = 2;

        switch (ranking){
            case 1 :
                System.out.println("전액 장학금");
                break;
            case 2 :
            case 3 :
                System.out.println("반액 장학금");
                break;
            default:
                System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료!!!");
        System.out.println();


        // 중고 상품의 등급에 따른 가격을 책정 (1급 : 최상, 4급 : 최하)
        int grade = 2;
        int price = 7000;

        switch (grade){
            case 1:
                price += 1000;
            case 2:
                price += 1000;
            case 3:
                price += 1000;
        }
        System.out.println(grade + "등급 제품의 가격 : " + price + "원");


    }
}
