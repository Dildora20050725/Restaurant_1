public class Food {
    int id;
    String type;
    String name;
    double price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }



    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Food(int id, String name, double price, String type) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.price = price;
    }

    public void showFoodInfo(){
        System.out.printf("ID: %s\nType: %s\nName: %s\nPrice: %s so'm",id, type, name, price);
    }
}
