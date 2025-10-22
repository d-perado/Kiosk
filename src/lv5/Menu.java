package lv5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Menu {

    //속성
    private List<MenuItem> menuItems;

    //생성자
    public Menu(){
        this.menuItems=new ArrayList<>();
    }
    public Menu(List<MenuItem> menuItems){
        this.menuItems = menuItems;
    }

    //기능
    //메뉴 추가
    public void add(MenuItem menuItem){
        this.menuItems.add(menuItem);
    }

    public MenuItem getSelectItem(int i){
        return this.menuItems.get(i);
    }

    public List<MenuItem> getMenuItems() {
        return this.menuItems;
    }

    public List<MenuItem> getSelectCategory(String s){
        return this.menuItems.stream()
                .filter(menuItem->menuItem.getCategory().equals(s))
                .collect(Collectors.toList());
    }
}
