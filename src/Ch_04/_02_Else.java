package Ch_04;

public class _02_Else {
    public static void main(String[] args) {

        // 조건문 if-Else
        int hour = 10;
        boolean morningCoffee;

        if (hour < 14){
            System.out.println("아이스 아메리카노 +1");
        }else{
            System.out.println("아이스 아메리카노 (디카페인 +1)");
        }
        System.out.println("커피 주문 완료!");
        System.out.println();

        // 오후 2시 이후 이거나 모닝 커피를 마신 경우
        hour = 15;
        morningCoffee = true;
        if (hour < 15 || morningCoffee == true){
            System.out.println("아이스 아메리카노 (디카페인 +1)");
        }else {
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("커피 주문 완료!!");


    }
}
