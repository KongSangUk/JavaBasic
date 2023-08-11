package Ch_04;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class _03_ElseIf {
    public static void main(String[] args) {

        // 조건문 Else-if

        // 한라봉 에이드가 있으면 주문
        // 또는 망공 주스가 있으면 주문
        // 또는 아이스 아메리카노 주문

        boolean halallingAde = false;
        boolean mongoJuice = true;

        if (halallingAde == true){
            System.out.println("한라봉 에이드 +1");
        } else if (mongoJuice == true) {
            System.out.println("망공 주스 +1");
        }else {
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("주문 완료!");

        System.out.println();


        // Else-if 여러번 사용 가능
        boolean orangeJuice = true;
        halallingAde = false;
        mongoJuice = false;


        if (halallingAde){
            System.out.println("한라봉 에이드 +1");
        } else if (mongoJuice == true) {
            System.out.println("망공 주스 +1");
        } else if (orangeJuice) {
            System.out.println("오렌지 주스 +1");
        } else {
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("주문 완료!!");
        System.out.println();


        // Else 없어도 가능
        orangeJuice = false;
        halallingAde = false;
        mongoJuice = false;


        if (halallingAde){
            System.out.println("한라봉 에이드 +1");
        } else if (mongoJuice == true) {
            System.out.println("망공 주스 +1");
        } else if (orangeJuice) {
            System.out.println("오렌지 주스 +1");
        }
        System.out.println("주문 완료!!!");

    }
}
