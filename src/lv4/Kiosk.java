package lv4;

import java.util.ArrayList;
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

        menu.addMenuItem(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거","Bugger"));
        menu.addMenuItem(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거","Bugger"));
        menu.addMenuItem(new MenuItem("ShackBurger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거","Bugger"));
        menu.addMenuItem(new MenuItem("ShackDrink", 6.4, "기본음료","Drink"));
        menu.addMenuItem(new MenuItem("MinSang's Burger", 11.0, "민상님의 비밀레시피로 만들어진 특제버거","Bugger"));
        menu.addMenuItem(new MenuItem("MinSang's Drink", 12.0, "민상님의 비밀레시피로 만들어진 특제음료","Drink"));
        menu.addMenuItem(new MenuItem("Secret Drink", 110.0, "비밀의음료","Drink"));
        menu.addMenuItem(new MenuItem("Dororong Cookies", 2.0, "도로롱쿠키","Dessert"));
        menu.addMenuItem(new MenuItem("ZzubZzub Cookies", 0.0, "쩝쩝쿠키","Dessert"));
        menu.addMenuItem(new MenuItem("NyamNyaam Cookies", 3.0, "냠냠쿠키","Dessert"));


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
