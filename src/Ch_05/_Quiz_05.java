package Ch_05;

public class _Quiz_05 {
    public static void main(String[] args) {

        // 배열을 활용하여 쇼핑몰에서 구매 가능한 신발 사이즈 옵션을 출력하는 프로그램을 작성.

        /* 조건
        - 신발 사이즈는 250 부터 295 까지 5 단위로 증가
        - 신발 사이즈 수는 총 10 가지
          (250, 255, 260, 265, 270, 275, 280, 285, 290, 295)
        - 사이즈 250 (재고있음)에서 [사이즈, (재고있음)]은 표시만 | 사이즈 데이터를(250) 배열 활용

        결과
        사이즈 250 (재고있음)
        사이즈 255 (재고있음)
        사이즈 260 (재고있음)
        사이즈 265 (재고있음)
        .....
        ....
        */

        int[] sizeArray = new int[10];

        for (int i = 0; i < sizeArray.length; i++) {
            sizeArray[i] = 250 + (5 * i);
        }

        for (int size : sizeArray) {
            System.out.println("사이즈 : "+ size + "재고있음");
        }

    }
}
