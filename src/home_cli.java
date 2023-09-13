import java.awt.*;
import java.util.Scanner;

public class home_cli {
    private String Accountnumber;
    private String Name;
    private String password;
    private int balance;
    public static void main(String[] args) {
        boolean isExit = false;
        boolean login = false;
        String accountID = "00199921111-01";
        String account_Name = "서준혁";
        int balance = 99999991;
        String account_infomation = "계좌번호 : " + accountID + " 예금주 " + account_Name + "\n잔액 : " + balance;
        while(!isExit) {
            Scanner scan = new Scanner(System.in);
            System.out.println("----- HTS 증권 거래 시스템 -----");
            if (!login) {
                System.out.println("1. 회원가입 ( HTS ) / 계좌개설");
                System.out.println("2. 로그인 ( HTS )");
                System.out.println("3. 종료");
                System.out.println("4. WebUI 접속");
                System.out.print("항목을 선택하세요 : ");
                int menu = Integer.parseInt(scan.nextLine());
                switch (menu) {
                    case 1 -> {
                    }
                    case 2 -> {
                    }
                    case 3 -> {
                    System.out.println("HTS 로그아웃 및 종료 ... ");
                    login = false;
                    isExit = true;}
                }
            } else {
                System.out.println(account_infomation);
                System.out.println("1. 주식 매수");
                System.out.println("2. 주식 매도");
                System.out.println("3. 잔고 조회");
                System.out.println("4. 로그아웃 ( HTS )");
                System.out.println("5. WebUI 접속");
                System.out.print("항목을 선택하세요 : ");
                int menu = Integer.parseInt(scan.nextLine());
                switch (menu) {
                    case 1 -> {
                    }
                    case 2 -> {
                    }
                    case 3 -> {
                    }
                    case 4 -> {isExit = true;
                        System.out.println("HTS를 종료합니다... ");}
                }
            }
        }
    }
}
