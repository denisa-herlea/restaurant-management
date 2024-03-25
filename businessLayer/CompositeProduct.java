package businessLayer;

import java.util.ArrayList;
import java.util.List;

public class CompositeProduct extends MenuItem{

    private List<MenuItem> products = new ArrayList<>();
    private String title;
    private float ratings;
    private float calories;
    private float proteins;
    private float fats;
    private float sodium;
    private float price;

    public CompositeProduct(String title, float ratings, float calories, float proteins, float fats, float sodium, float price) {
        this.title = title;
        this.ratings = ratings;
        this.calories = calories;
        this.proteins = proteins;
        this.fats = fats;
        this.sodium = sodium;
        this.price = price;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getRatings() {
        return ratings;
    }

    public void setRatings(float ratings) {
        this.ratings = ratings;
    }

    public float getCalories() {
        return calories;
    }

    public void setCalories(float calories) {
        this.calories = calories;
    }

    public float getProteins() {
        return proteins;
    }

    public void setProteins(float proteins) {
        this.proteins = proteins;
    }

    public float getFats() {
        return fats;
    }

    public void setFats(float fats) {
        this.fats = fats;
    }

    public float getSodium() {
        return sodium;
    }

    public void setSodium(float sodium) {
        this.sodium = sodium;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public Object getProducts() {
        Object[] produse = new Object[7];
        produse[0]=title;
        produse[1]=String.valueOf(ratings);
        produse[2]=String.valueOf(calories);
        produse[3]=String.valueOf(proteins);
        produse[4]=String.valueOf(fats);
        produse[5]=String.valueOf(sodium);
        produse[6]=String.valueOf(price);
        return produse;
    }
}
