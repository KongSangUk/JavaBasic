package Ch_04;

public class _11_Continue {
    public static void main(String[] args) {

        // Continue

        // 치킨 주문 손님중에 노쇼 손님이 있다고 가정
        // For

        int max = 20;
        int sold = 0;
        int noShow = 17;

        for (int i = 1; i < 50; i++) {
            System.out.println(i + "번 손님, 주문하신 치킨 나왔습니다.");

            // 손님이 없다면? (noShow)
            if (i == noShow){
                System.out.println(i + "번 손님, noShow");
                continue;
            }

            sold++; // 판매 처리
            if (sold == max){
                System.out.println("금일 재료가 모두 소진 되었습니다.");
                break;
            }
        }
        System.out.println("영업을 종료 합니다");


        System.out.println();
        System.out.println("===============");

        // while 문
        sold = 0;
        int index = 0;
//        while (index <= 50){
        while (true){
            index++;
            System.out.println(index + "번 손님, 주문하신 치킨 나왔습니다.");

            // 손님이 없다면? (noShow)
            if (index == noShow){
                System.out.println(index + "번 손님, noShow");
                continue;
            }

            sold++;
            if (sold == max){
                System.out.println("금일 재료가 모두 소진 되었습니다.");
                break;
            }
        }
        System.out.println("영업을 종료 합니다");


    }
}
