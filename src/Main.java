import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Product> shopProducts = new ArrayList<>();
        shopProducts.add(0, new Product("Молоко", 30, 73));
        shopProducts.add(1, new Product("Творог", 16, 105));
        shopProducts.add(2, new Product("Йогурт", 8, 56));
        shopProducts.add(3, new Product("Яйца", 21, 98));

        System.out.println("Продукты в наличие:");
        // магических чисел нет,количество продуктов может поменяться, используем в цикле размер листа
        for (int i = 0; i < shopProducts.size(); i++){
            System.out.println((i+1) + ". " + shopProducts.get(i));
        }

        // принцип DRY - не повторяем свой код, графический элемент вынесен в отдельный метод
        printCheck();
        System.out.println("Чтобы заказать продукт, введите его название и количество (через пробел)." +
                " Для отмены введите end");
        Scanner sc = new Scanner(System.in);
        Basket basket = new Basket();

        while (true){
            String line = sc.nextLine();
            if ("end".equals(line)){
                break;
            }
            String[] parts = line.split(" ");
            String productOrder = parts[0];
            int amountOrder = Integer.parseInt(parts[1]);
            basket.makeOrder(productOrder, amountOrder);
        }
        // принцип DRY - не повторяем свой код, графический элемент вынесен в отдельный метод
        printCheck();
        int sum = basket.sum(shopProducts);
    }
    private static void printCheck() {
        System.out.println("---------------------------------------------------");
    }
}
