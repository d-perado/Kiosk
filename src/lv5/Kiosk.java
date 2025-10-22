package lv5;

import lv5.util.io.Category;
import lv5.util.io.Output;

import java.util.Scanner;

public class Kiosk {
    //속성
    private boolean isKiosk; //키오스크 전원
    private Menu menu; //키오스크에 등록할 메뉴
    private Output output = new Output();
    //생성자
    Kiosk(Menu menu){
        this.isKiosk = true; //키오스크 전원
        this.menu = menu;
    }

    //기능
    //키오스크 시작
    public void start(){

        while(isKiosk) {
            Scanner sc = new Scanner(System.in);
            Menu currentCategoryMenu = null;

            System.out.println("[ MAIN MENU ]");
            System.out.println("1. Buggers");
            System.out.println("2. Drinks");
            System.out.println("3. Desserts");
            System.out.printf("%2d. %-20s\n", 0, "종료");

            Integer input = sc.nextInt();
            if (input == 0) {
                exit();
                System.out.println(":::키오스크를 종료합니다:::");
                break;
            }

            switch (input) {
                case 1 -> {
                    currentCategoryMenu = new Menu(menu.getSelectCategory(Category.BUGGER));
                    System.out.println("[ Bugger MENU ]");
                    output.printMenu(currentCategoryMenu);
                }
                case 2 -> {
                    currentCategoryMenu = new Menu(menu.getSelectCategory(Category.DRINK));
                    System.out.println("[ Drink MENU ]");
                    output.printMenu(currentCategoryMenu);
                }

                case 3 -> {
                    currentCategoryMenu = new Menu(menu.getSelectCategory(Category.DESSERT));
                    System.out.println("[ Dessert MENU ]");
                    output.printMenu(currentCategoryMenu);
                }
            }


            System.out.printf("%2d. %-20s\n",0,"뒤로가기");
            System.out.println(":::메뉴를 선택하세요:::");
            input = sc.nextInt();
            if(input==0){
                continue;
            } else {
                System.out.println(":::"+currentCategoryMenu.getSelectItem(input-1).getMenuName()+"을(를) 담았습니다:::");
            }
        }

    }

    public void exit(){
        this.isKiosk = false;
    }
}
