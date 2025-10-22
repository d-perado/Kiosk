package lv5;

public class App {

    public static void main(String[] args) {

        Menu menu = new Menu();
        menu.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거","Bugger"));
        menu.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거","Bugger"));
        menu.add(new MenuItem("ShackBurger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거","Bugger"));
        menu.add(new MenuItem("ShackDrink", 6.4, "기본음료","Drink"));
        menu.add(new MenuItem("MinSang's Burger", 11.0, "민상님의 비밀레시피로 만들어진 특제버거","Bugger"));
        menu.add(new MenuItem("MinSang's Drink", 12.0, "민상님의 비밀레시피로 만들어진 특제음료","Drink"));
        menu.add(new MenuItem("Secret Drink", 110.0, "비밀의음료","Drink"));
        menu.add(new MenuItem("Dororong Cookies", 2.0, "도로롱쿠키","Dessert"));
        menu.add(new MenuItem("ZzubZzub Cookies", 0.0, "쩝쩝쿠키","Dessert"));
        menu.add(new MenuItem("NyamNyaam Cookies", 3.0, "냠냠쿠키","Dessert"));


        Kiosk kiosk = new Kiosk(menu);
        kiosk.start();
    }
}