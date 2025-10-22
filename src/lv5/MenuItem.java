package lv5;

import lv5.util.io.Category;

public class MenuItem {

    //속성
    private String menuName;
    private String menuInfomation;
    private Double price;
    private Category category;

    //생성자
    public MenuItem(String menuName, Double price, String menuInfomation,Category category){
        this.menuName = menuName;
        this.menuInfomation = menuInfomation;
        this.price = price;
        this.category=category;
    }

    //기능
    //메뉴 이름 반환
    public String getMenuName() {
        return this.menuName;
    }
    //메뉴 가격 반환
    public Double getPrice() {
        return this.price;
    }

    //메뉴 정보 반환
    public String getMenuInfomation() {
        return this.menuInfomation;
    }

    //메뉴 카테고리 반환
    public Category getCategory(){
        return this.category;
    }
}