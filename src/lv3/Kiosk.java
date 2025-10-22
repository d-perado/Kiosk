package lv3;

import lv5.Menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {

    //속성
    boolean isKiosk;
    private ArrayList<MenuItem> menu;

    //생성자
    Kiosk(ArrayList<MenuItem> menu){
        this.isKiosk = true;
        this.menu = menu;
    }

    //기능
    public void start(){


        while(this.isKiosk){
            Scanner sc = new Scanner(System.in);

            System.out.println("[ SHAKESHACK MENU ]");

            for (int i = 0; i < this.menu.size(); i++) {
                System.out.printf("%2d. %-20s| W%-5.1f|\t%-5s\n",i+1,this.menu.get(i).getMenuName()
                        ,this.menu.get(i).getPrice(),this.menu.get(i).getMenuInfomation());
            }

            System.out.printf("%2d. %-20s\n",0,"종료");
            System.out.println(":::메뉴를 선택하세요:::");

            Integer input = sc.nextInt();

            if(input==0){
                exit();
            } else {
                System.out.println(":::"+this.menu.get(input-1).getMenuName()+"을(를) 담았습니다:::");
            }
        }
        System.out.println(":::키오스크를 종료합니다:::");
    }

    public void exit(){
        this.isKiosk = false;
    }
}
