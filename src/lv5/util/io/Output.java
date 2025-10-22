package lv5.util.io;

import lv5.Menu;
import lv5.MenuItem;

public class Output {


    // 메뉴판 출력
    public void printMenu(Menu menu){
        int i=1;
        for(MenuItem menuItem:menu.getMenuItems()){
            System.out.printf("%2d. %-20s| W%-5.1f|\t%-5s\n",i++,menuItem.getMenuName()
                    ,menuItem.getPrice()
                    ,menuItem.getMenuInfomation());
        }
    }

    //메뉴 넘버링 출력 "Num. 메뉴이름 | W 메뉴가격 | 메뉴설명"
    public void printNumberingMenu(int Num, String menuName,Double price, String menuInformation){
        System.out.printf("%2d. %-20s| W%-5.1f|\t%-5s\n",Num++,menuName,price,menuInformation);
    }
}
