package lv4;

public class MenuItem {

    //속성
    private String menuName;
    private String menuInfomation;
    private Double price;
    private String category;

    //생성자
    public MenuItem(String menuName, Double price, String menuInfomation,String category){
        this.menuName = menuName;
        this.menuInfomation = menuInfomation;
        this.price = price;
        this.category=category;
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

    public String getCategory(){
        return this.category;
    }
}