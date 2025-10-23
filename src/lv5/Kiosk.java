package lv5;

import lv5.util.Category;
import lv5.util.io.Output;

import java.util.Scanner;

public class Kiosk {
    //속성
    private boolean isKiosk; //키오스크 전원
    private Menu menu; //키오스크에 등록할 메뉴
    private Output output = new Output();//출력 객체
    private Cart cart = new Cart();

    //생성자
    Kiosk(Menu menu) {
        this.isKiosk = true; //키오스크 전원 On
        this.menu = menu;
    }

    //기능
    //키오스크 시작
    public void start() {

        while (isKiosk) {

            Scanner sc = new Scanner(System.in);
            Menu currentCategoryMenu = null;

            System.out.println("[ MAIN MENU ]");
            System.out.println("1. Buggers");
            System.out.println("2. Drinks");
            System.out.println("3. Desserts");
            System.out.printf("%2d. %-20s\n", 0, "종료");
            System.out.printf("%2s. %-20s\n", "#", "장바구니");

            String input = sc.nextLine();
            if (input.equals("0")) {
                /* 키오스크 종료 */
                exit();
                System.out.println(":::키오스크를 종료합니다:::");
                break;
            }

            switch (input.charAt(0)) {
                case '1' -> {
                    /* 버거 메뉴 출력 */
                    currentCategoryMenu = new Menu(menu.getSelectCategory(Category.BUGGER));
                    System.out.println(":::[ Bugger MENU ]:::");
                    output.printMenu(currentCategoryMenu.getMenuItems());
                    System.out.println(":::메뉴를 선택하세요:::");
                }
                case '2' -> {
                    /* 음료 메뉴 출력 */
                    currentCategoryMenu = new Menu(menu.getSelectCategory(Category.DRINK));
                    System.out.println(":::[ Drink MENU ]:::");
                    output.printMenu(currentCategoryMenu.getMenuItems());
                    System.out.println(":::메뉴를 선택하세요:::");
                }

                case '3' -> {
                    /* 디저트 메뉴 출력 */
                    currentCategoryMenu = new Menu(menu.getSelectCategory(Category.DESSERT));
                    System.out.println(":::[ Dessert MENU ]:::");
                    output.printMenu(currentCategoryMenu.getMenuItems());
                    System.out.println(":::메뉴를 선택하세요:::");
                }
                case '#' -> {
                    /* 주문 버튼 */
                    if (this.cart.getCart().isEmpty()) {
                        System.out.println(":::장바구니에 담긴 상품이 없습니다.:::");
                    } else {
                        double sum = cart.sumPrice();
                        System.out.println("[ Orders ]");
                        output.printMenu(this.cart.getCart());
                        System.out.println("===================================");
                        System.out.printf("결제하실 총 금액은 W %3.1f 입니다.\n", sum);
                        System.out.printf("%2s. %-20s\n", "#", "주문");
                        input = sc.nextLine();

                        if(input.equals("#")){
                            System.out.println(":::주문 하시겠습니까? y/n:::");
                            input = sc.nextLine();
                            if(input.equals("y")) {
                            System.out.println(":::주문이 완료되었습니다.:::");
                            this.cart.clear();
                            }
                        } else {
                            int userSelect = Integer.parseInt(input)-1;
                            if(this.cart.getCart().size()>userSelect){
                                System.out.println("취소하시려는 상품이 맞습니까? y/n");
                                output.printNumberingMenu(userSelect,this.cart.getCartItem(userSelect));
                                input = sc.nextLine();
                                if (input.equals("y")){
                                    System.out.println(":::상품이 취소되었습니다.:::");
                                    this.cart.remove(userSelect);
                                }
                            }
                        }
                    }
                }


            }


            System.out.printf("%2d. %-20s\n", 0, "뒤로가기");
            input = sc.nextLine();
            if (input.equals("0")) {
                continue;
            } else { //출력된 상품 선택 및 장바구니 담기.
                cart.add(currentCategoryMenu.getSelectItem(Integer.parseInt(input) - 1));
                System.out.println(":::" + currentCategoryMenu.getSelectItem(Integer.parseInt(input) - 1).getName() + "을(를) 담았습니다:::");
            }
        }

    }

    public void exit() {
        this.isKiosk = false;
    }
}
