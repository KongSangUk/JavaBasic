package Ch_04;

public class _07_DoWhile {
    public static void main(String[] args) {

        // 반복문 do while

        int distance = 25;
        int move = 0;
        int height = 2;

        while(move + height < distance) {
            System.out.println("발차기를 계속 합니다");
            System.out.println("현재 이동 거리 : " + move);
            move += 3;
        }
        System.out.println("도착!");
        System.out.println();

        System.out.println("==========");

        // 키가 엄청나게 큰 사람
        move = 0;
        height = 25;

        while(move + height < distance) {
            System.out.println("발차기를 계속 합니다");
            System.out.println("현재 이동 거리 : " + move);
            move += 3;
        }
        System.out.println("도착!!");
        System.out.println();


        System.out.println("==========");
        /*
        do {

        } while ( 조건 );
        */

        // do while 반복문
        do {
            System.out.println("발차기를 계속 합니다");
            System.out.println("현재 이동 거리 : " + move);
            move += 3;
        } while (move + height < distance);
        System.out.println("도착!!!");


    }
}
