package lv5;

import lv5.util.Category;

public class MenuItem {

    //속성
    private String name;
    private String information;
    private Double price;
    private Category category;

    //생성자
    public MenuItem(String name, Double price, String information,Category category){
        this.name = name;
        this.information = information;
        this.price = price;
        this.category=category;
    }

    //기능

    //메뉴 이름 반환
    public String getName() {
        return this.name;
    }

    //메뉴 가격 반환
    public Double getPrice() {
        return this.price;
    }

    //메뉴 정보 반환
    public String getInformation() {
        return this.information;
    }

    //메뉴 카테고리 반환
    public Category getCategory(){
        return this.category;
    }
}