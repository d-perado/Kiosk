package lv5.util.io;

public enum Category {
    BUGGER("Bugger"),
    DRINK("Drink"),
    DESSERT("Dessert");

    private final String foodType;

    Category(String foodType){
        this.foodType = foodType;
    }

    public String getFoodType() {
        return foodType;
    }
}
