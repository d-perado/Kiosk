package lv3;

import lv5.Menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    //속성
    boolean isKiosk;
    Menu menu;
    //생성자
    Kiosk(){
        this.isKiosk = true;
        this.menu = new Menu();
    }
    //기능
    public void start(){

        boolean isKiosk = true;
        List<MenuItem> menu = new ArrayList<>();


        menu.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menu.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menu.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menu.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));
        menu.add(new MenuItem("MinSang'sBurger", 110.0, "민상님의 비밀레시피로 만들어진 특제버거"));


        while(isKiosk){
            Scanner sc = new Scanner(System.in);


            System.out.println("[ SHAKESHACK MENU ]");
            for (int i = 0; i < menu.size(); i++) {
                System.out.printf("%2d. %-20s| W%-5.1f|\t%-5s\n",i+1,menu.get(i).menuName,menu.get(i).price,menu.get(i).menuInfomation);
            }
            System.out.printf("%2d. %-20s\n",0,"종료");
            System.out.println(":::메뉴를 선택하세요:::");
            Integer input = sc.nextInt();
            if(input==0){
                isKiosk=false;
            } else {
                System.out.println(":::"+menu.get(input-1).menuName+"을(를) 담았습니다:::");
            }
        }
        System.out.println(":::키오스크를 종료합니다:::");
    }

    public void exit(){
        this.isKiosk = false;
    }
}
