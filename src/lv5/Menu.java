package lv5;

import lv5.util.Category;

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
    //인덱스 i 의 메뉴아이템 반환
    public MenuItem getSelectItem(int i){
        return this.menuItems.get(i);
    }

    //전체 메뉴 반환
    public List<MenuItem> getMenuItems() {
        return this.menuItems;
    }
    //선택한 카테고리에 해당하는 물품리스트 반환
    public List<MenuItem> getSelectCategory(Category category){
        return this.menuItems.stream()
                .filter(menuItem->menuItem.getCategory().equals(category))
                .collect(Collectors.toList());
    }
}
