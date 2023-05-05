package Interfaces;

import java.util.List;

import Classes.Actor;
/**
 * Интерфейс, реализующий поведение магазина
 */
public interface iMarketBehaviour {
    /**
     * Метод, добавляющий клиента в реестр магазина при входе
     * @param actor клиент, который вошёл в магазин
     */
    void acceptToMarket(iActorBehaviour actor);
    /**
     * Метод, реализуюший уход клиентов из магазина
     * @param actors список клиентов, которые совершили покупки
     */
    void releaseFromMarket(List<Actor> actors);
    /**
     * Метод, запускающий процесс взаимодействия клиентов и магазина
     */
    void update();
    
    
}
