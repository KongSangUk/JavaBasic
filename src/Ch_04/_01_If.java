package Ch_04;

public class _01_If {
    public static void main(String[] args) {

        // 조건문 If
        int hour = 10;
        boolean morningCoffee = false;


        //if 문 내에서 하나의 문장을 실행할 때는  { } 생략 가눙
        if (hour < 15)
            System.out.println("커피를 주문.");
        System.out.println();


        // if 문 내에서 2개 이상의 문정을 샐행 때는 { } 생략 불가
        if (hour < 14) {
            System.out.println("커피를 주문.");
            System.out.println("썃추가");
        }
        System.out.println("커피 주문 완료!");
        System.out.println();


        // 오후 2시 이전, 모닝 커피를 마시지 않은 경우?
//        if (hour < 14 && morningCoffee == false){
        if (hour < 14 && !morningCoffee){
            System.out.println("커피를 주문.");
        }
        System.out.println("커피 주문 완료!!");
        System.out.println();

        // 오후 2시 이후이거나 모닝 커피를 마신 경우 = 디카페인
        hour = 15;
        morningCoffee = true;

//        if (hour >= 14 || morningCoffee == true){
        if (hour >= 14 || morningCoffee){
            System.out.println("커피를 주문. (디카페인)");
        }
        System.out.println("커피 주문 완료!!!");


    }
}
