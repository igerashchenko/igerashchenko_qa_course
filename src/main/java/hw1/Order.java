package hw1;

/*
1. Реализовать иерархию классов Order, ProductOrder, ServiceOrder
2. Все объекты типа Order должны содержать свойство price(сумма заказа с точностью до двух знаков после запятой), name, массив items строкового типа(в виде имён), orderDate(дата создания заказа).
3. Конечный пользователь не должен иметь возможности создать объект Order, но должен беспрепятственно создавать ProductOrder, ServiceOrder.
4. ServiceOrder должен содержать свойство строкового типа serviceType.
5. Все объекты типа Order должны предоставлять следующие публичные методы
 - getOrder():String - возвращающий информацию о заказе в строковм виде в формате "%ORDER_NAME%-%PRICE%-%ORDER_DATE%", объект типа ServiceOrder в формате "%ORDER_NAME%-%SERVICE_TYPE%-%PRICE%-%ORDER_DATE%"
 - addItem(String item, Number itemPrice):void - добавлять новый item в массив items и обновлять свойство price объекта Order

Все поля и прочие служебные методы не должны быть доступны для пользователя классов Order из вне.*/

import javax.swing.*;
import java.util.Date;
import java.util.HashMap;

public abstract class Order {
    static String nameOrder;
    static String priceOrder;
    static Date dateOrder;
    static HashMap<String, Number> items = new HashMap<>();
    public Order(String priceOrder, String nameOrder, Date dateOrder){
        this.priceOrder = String.format("%.2f", priceOrder);
        this.nameOrder = nameOrder;
        this.dateOrder = dateOrder;

    }
    public String getOrder(){
        return nameOrder+"-"+priceOrder+"-"+dateOrder;
    }
    public void addItem(String itemName, Number itemPrice){
            items.put(itemName, itemPrice);
    }
}
