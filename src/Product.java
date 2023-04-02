public class Product {
    // S – Single Responsibility: класс Product отвечает только за продукты
    protected String title;
    protected int amount;

    protected int price;

    public Product(String title, int amount, int price) {
        this.title = title;
        this.amount = amount;
        this.price = price;
    }
    public Product(String title, int amount){
        this.title = title;
        this.amount = amount;
    }


    public String getTitle() {
        return title;
    }

    public int getAmount() {
        return amount;
    }

    public int getPrice(){
        return price;
    }

    @Override
    public String toString() {
        return title + ", в количестве " + amount + " шт. Цена за единицу: " + price + " рублей.";
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
