package Ch_05;

public class _05_ASCII {
    public static void main(String[] args) {

        // 아스키 코드 (ASCII) : 미국 표준 코드
        // 알파벳 대문자는 65 부터 시작, 소문자는 97 부터 시작, 숫자는 48부터 시작.
        char c = '0';
        System.out.println(c);
        System.out.println((int)c+"\n");

        c = '1';
        System.out.println(c);
        System.out.println((int)c+"\n");

        c++;
        System.out.println(c);
        System.out.println((int)c+"\n");


        // 세로 크기 10 x 가로 크기 15에 해당하는 영화관 좌석
        String[][] seats3 = new String[10][15];
        char ch = 'A';

        for (int i = 0; i < seats3.length; i++) {
            for (int j = 0; j < seats3[i].length; j++) {
                seats3[i][j] = String.valueOf(ch) + (j + 1);
            }
            ch++;
        }

        // 표 구매
        seats3[7][8] = "__";
        seats3[7][9] = "___";


        // 영화관 좌석 번호 확인
        for (int i = 0; i < seats3.length; i++) {
            for (int j = 0; j < seats3[i].length; j++) {
                System.out.print(seats3[i][j] + " ");
            }
            System.out.println();
        }

    }
}
