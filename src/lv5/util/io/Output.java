package lv5.util.io;

import lv5.MenuItem;

import java.util.List;

public class Output {







    // 메뉴판 출력
    public void printMenu(List<MenuItem> menu){
        int i=1;
        for(MenuItem menuItem:menu){
            System.out.printf("%2d. %-20s| W%-5.1f|\t%-5s\n",i++,menuItem.getName()
                    ,menuItem.getPrice()
                    ,menuItem.getInformation());
        }
    }

    //메뉴 넘버링 출력 "Num. 메뉴이름 | W 메뉴가격 | 메뉴설명"
    public void printNumberingMenu(int Num, MenuItem menuItem){
        System.out.printf("%2d. %-20s| W%-5.1f|\t%-5s\n",Num,menuItem.getName(),menuItem.getPrice(),menuItem.getInformation());
    }
}
