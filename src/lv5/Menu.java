package lv5;

import java.util.ArrayList;

public class Menu {

    //속성
    private ArrayList<MenuItem> menuItems;

    //생성자
    public Menu(){
        this.menuItems = new ArrayList<MenuItem>();
    }

    //기능
    //메뉴 추가
    public void addMenuItem(MenuItem menuItem){
        this.menuItems.add(menuItem);
    }

    public MenuItem getSelectItem(int i){
        return this.menuItems.get(i);
    }

    public ArrayList<MenuItem> getMenuItems() {
        return this.menuItems;
    }
}
