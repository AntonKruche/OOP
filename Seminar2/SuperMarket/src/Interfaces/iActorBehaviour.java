package Interfaces;

import Classes.Actor;
/**
 * Интерфейс, описывающий способы взаимодействия с покупателями
 */
public interface iActorBehaviour {
    /**
     * Метод для реализации поведения создания заказа
     * @param makeOrder 
     */
    void setMakeOrder(boolean makeOrder);
    /**
     * Метод для реализации поведения получения заказа
     * @param pickUpOrder
     */
    void setTakeOrder(boolean pickUpOrder);
    /**
     * Метод, возвращающий информацию о том, сделал клиент заказ или нет
     * @return возвращает True в случае, если клиент сделал заказ и False 
     * в противоположном случае
     */
    boolean isMakeOrder();
    /**
     * Метод, возвращающий информацию о том, получучил клиент заказ или нет
     * @return True в случае, если клиент получил заказ и False в 
     * противоположном случае
     */
    boolean isTakeOrder();
    /**
     * Метод, возвращающий экземпляр класса Actor
     * @return
     */
    Actor getActor();
}
