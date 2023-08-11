package Ch_04;

public class _05_For {
    public static void main(String[] args) {

        // 반복문 For

        // 나코 매장
        System.out.println("어서오세요. 나코 입니다.");
        System.out.println();

        // 또다른 손님이 들어오면?
        System.out.println("어서오세요. 나코 입니다.");
        System.out.println("어서오세요. 나코 입니다.");
        System.out.println("어서오세요. 나코 입니다.");
        System.out.println();

        // 만약 인사법이 바뀌먄?
        System.out.println("환영합니다. 나코 입니다.");
        System.out.println("환영합니다. 나코 입니다.");
        System.out.println("환영합니다. 나코 입니다.");
        System.out.println();

        // 매장 이름이 바뀌면?
        // 나코 -> 코나
        System.out.println("환영합니다. 코나 입니다.");
        System.out.println("환영합니다. 코나 입니다.");
        System.out.println("환영합니다. 코나 입니다.");
        System.out.println();

        System.out.println("==== 반복문 사용 ====");

        // 반복문 fot 사용
        //  for ( (선언); (조건); (증감))
        for (int i = 0; i < 10; i++){
            System.out.println("환영합니다. 나코 입니다." + i);
        }
        
        System.out.println();

        
        // 짝수만 출력
        for (int i = 0; i < 10; i+=2) {
            System.out.print(i);
        }
        System.out.println();

        // 홀수만 출력
        for (int i = 1; i < 10; i+=2) {
            System.out.print(i);
        }
        System.out.println();


        // 거꾸로 출력하자
        // 5, 4, 3, 2, 1
        for (int i = 5; i > 0; i--) {
            System.out.print(i);
        }
        System.out.println();

        // 1부터 10 까지의 수들의 합
        int sum = 0;
        for (int i = 0; i <= 10 ; i++) {
            System.out.println(sum += i);
        }
    }
}
