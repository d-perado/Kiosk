package lv5;

import java.util.ArrayList;

public class Cart {
    //속성
    private ArrayList<MenuItem> cart;

    //생성자
    Cart(){
        this.cart = new ArrayList<>();
    }

    //기능
    //카트 조회
    public ArrayList<MenuItem> getCart() {
        return this.cart;
    }

    //카트에서 물품 하나 조회
    public MenuItem getCartItem(int i){
        return this.cart.get(i);
    }
    //카트에 담기
    public void add(MenuItem menuItem) {
        this.cart.add(menuItem);
    }




    //카트 비우기
    public void clear() {
        this.cart.clear();
    }

    //카트에서 물품 지우기
    public void remove(int i){
        this.cart.remove(i);
    }

    //카트 가격 책정
    public Double sumPrice() {
        return this.cart.stream().mapToDouble(MenuItem::getPrice).sum();
    }
}
