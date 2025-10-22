package lv3;

public class MenuItem {

    //속성
    String menuName;
    String menuInfomation;
    Double price;

    //생성자
    MenuItem(String menuName, Double price, String menuInfomation){
        this.menuName = menuName;
        this.menuInfomation = menuInfomation;
        this.price = price;
    }

    //기능
    public String getMenuName() {
        return this.menuName;
    }

    public Double getPrice() {
        return this.price;
    }

    public String getMenuInfomation() {
        return this.menuInfomation;
    }
}