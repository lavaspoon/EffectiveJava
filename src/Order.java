import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;

public class Order {
    private boolean prime;
    private boolean urgent;
    //private Product product;

    public OrderStatus orderStatus;

    public static void main(String[] args) {
        Order order = new Order();
        if (order.orderStatus == OrderStatus.DELIVERRED) {
            System.out.println("delivered");
        }
        Arrays.stream(OrderStatus.values()).forEach(System.out::println);
        //EnumMap
        Map<OrderStatus, String> enumMap = new EnumMap<>(OrderStatus.class);
    }
}
