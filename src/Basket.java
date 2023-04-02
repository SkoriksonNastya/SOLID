import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.SIZE;

public class Basket {

    // I — Interface Segregation (Принцип разделения интерфейсов). Каждый класс делает то,
    // что от него требуется, и ничего больше.
    protected Product[] orders = new Product[SIZE];
    public void makeOrder(String title, int amount) {
        for (int i = 0; i < orders.length; i ++){
            if (orders[i] == null){
                orders[i] = new Product(title,amount);
                return;
            }
            if (orders[i].title.equals(title)){
               orders[i].amount += amount;
               return;
            }
        }
    }

    public int sum (List<Product> orderSum){
        int sum = 0;
        System.out.println("Ваша корзина:");
        for (int i = 0; i < orders.length; i ++){
            Product product = orders[i];
            if (product == null) continue;
            System.out.println(product.title + " - " + product.amount + " штук.");
                for (int y = 0; y < orderSum.size(); y++){
                    if (orderSum.get(y).getTitle().equals(product.title)){
                        sum += product.amount * orderSum.get(y).getPrice();
                    }
                }
        }
        System.out.println("Итого к оплате: " + sum + " рублей.");
        return sum;
    }
}
