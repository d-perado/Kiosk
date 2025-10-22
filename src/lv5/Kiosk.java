package lv5;

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

        menu.addMenuItem(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menu.addMenuItem(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menu.addMenuItem(new MenuItem("ShackBurger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menu.addMenuItem(new MenuItem("ShackBurger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));
        menu.addMenuItem(new MenuItem("MinSang'sBurger", 110.0, "민상님의 비밀레시피로 만들어진 특제버거"));


        while(isKiosk){
            Scanner sc = new Scanner(System.in);


            System.out.println("[ SHAKESHACK MENU ]");
            for (int i = 0; i < this.menu.getMenuItems().size(); i++) {
                System.out.println((i+1)+".\t"+this.menu.getSelectItem(i).getMenuName()+"\t| W\t"+
                        this.menu.getSelectItem(i).getPrice()+"\t|\t"+this.menu.getSelectItem(i).getMenuInfomation());
            }
            System.out.println("0. 종료\t|\t종료");
            System.out.println("메뉴를 선택하세요.");
            Integer input = sc.nextInt();
            if(input==0){
                exit();
            } else {
                System.out.println(menu.getSelectItem(input-1).menuName+"을(를) 담았습니다.");
            }
        }
        System.out.println("키오스크를 종료합니다.");
    }

    public void exit(){
        this.isKiosk = false;
    }
}
