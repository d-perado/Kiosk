package lv5;

import java.util.Scanner;

public class Kiosk {
    //속성
    private boolean isKiosk;
    private Menu menu;

    //생성자
    Kiosk(Menu menu){
        this.isKiosk = true; //키오스크 전원
        this.menu = menu; //키오스크에 등록될 물품 메뉴
    }
    //기능
    public void start(){

        while(isKiosk){
            Scanner sc = new Scanner(System.in);
            Menu currentCategoryMenu = null;

            System.out.println("[ MAIN MENU ]");
            System.out.println("1. Buggers");
            System.out.println("2. Drinks");
            System.out.println("3. Desserts");
            System.out.printf("%2d. %-20s\n",0,"종료");

            Integer input = sc.nextInt();
            if(input==0){
                exit();
                System.out.println(":::키오스크를 종료합니다:::");
                break;
            }
            switch(input){
                case 1-> {
                    int i=1;
                    currentCategoryMenu = new Menu(menu.getSelectCategory("Bugger"));
                    System.out.println("[ Bugger MENU ]");
                    for(MenuItem menuItem : currentCategoryMenu.getMenuItems() ){
                        System.out.printf("%2d. %-20s| W%-5.1f|\t%-5s\n",i++,menuItem.getMenuName()
                                ,menuItem.getPrice()
                                ,menuItem.getMenuInfomation());
                    }
                }
                case 2->{
                    currentCategoryMenu = new Menu(menu.getSelectCategory("Drink"));
                    int i=1;
                    System.out.println("[ DRINK MENU ]");
                    for(MenuItem menuItem:currentCategoryMenu.getMenuItems()){
                        System.out.printf("%2d. %-20s| W%-5.1f|\t%-5s\n",i++,menuItem.getMenuName()
                                ,menuItem.getPrice()
                                ,menuItem.getMenuInfomation());
                    }
                }
                case 3->{
                    currentCategoryMenu = new Menu(menu.getSelectCategory("Dessert"));
                    int i=1;
                    System.out.println("[ DRINK MENU ]");
                    for(MenuItem menuItem:currentCategoryMenu.getMenuItems()){
                        System.out.printf("%2d. %-20s| W%-5.1f|\t%-5s\n",i++,menuItem.getMenuName()
                                ,menuItem.getPrice()
                                ,menuItem.getMenuInfomation());
                    }
                }
            }

//            System.out.println("[ SHAKESHACK MENU ]");
//            for (int i = 0; i < this.menu.getMenuItems().size(); i++) {
//                System.out.printf("%2d. %-20s| W%-5.1f|\t%-5s\n",i+1,this.menu.getSelectItem(i).getMenuName()
//                        ,this.menu.getSelectItem(i).getPrice()
//                        ,this.menu.getSelectItem(i).getMenuInfomation());
//            }
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
