package Ch_02;

public class _Quiz_02 {
    public static void main(String[] args) {
        // 문제 : 어린이 키에 따른 놀이 기구 탑승 가능 여부를 확인하는 프로그램 작성
        // 조건 : 120cm 이상인 경우에만 탑승 가능 , 삼항 연산자 이용

        int x = 120;
        int height = 115;
//        int height = 121;

        String result = (x < height) ? "키가 "+height+"cm 이므로 탑승 가능하다." : "키가 "+height+"cm 이므로 탑승 불가능하다.";
        System.out.println(result);

//        String result = (x < height) ? "키가 "+z+"cm 이므로 탑승 가능하다." : "키가 "+height+"cm 이므로 탑승 불가능하다.";
//        System.out.println(result);


    }
}
