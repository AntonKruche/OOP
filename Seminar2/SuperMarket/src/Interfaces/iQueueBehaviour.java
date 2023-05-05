package Interfaces;

import Classes.Actor;
/**
 * Интерфейс реалузующий взаимодействие клиентов и магазина
 */
public interface iQueueBehaviour {
    /**
     * Метод для добавления клиента класса Actor в очередь
     * @param actor экземпляр класса Actor, реализующий интерфейс iActorBehaviour
     */
    void takeInQueue(iActorBehaviour actor);
    /**
     * Метод, реализующий выход клиента из очереди после получения заказа
     */
    void releaseFromQueue();
    /**
     * Метод для получения заказа
     */
    void takeOrder();
    /**
     * Метод для создания заказа
     */
    void giveOrder();
}
