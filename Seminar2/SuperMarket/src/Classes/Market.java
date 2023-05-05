package Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import Interfaces.iActorBehaviour;
import Interfaces.iMarketBehaviour;
import Interfaces.iQueueBehaviour;
/**
 * Класс, описывающий экземпляр магазина
 */
public class Market implements iMarketBehaviour,iQueueBehaviour{
    /**
     * @param queue поле, хранящее экземпляры клиентов
     * @param listOfDiscounts поле, хранящее наименования акций в магазине
     */
    private List<iActorBehaviour> queue;
    private Map<String, Integer> listOfDiscounts;
    /**
     * Конструктор класса Market
     * При создании инициализируется пустое поле queue
     */
    public Market() {
        this.queue = new ArrayList<iActorBehaviour>();
    }
    /**
     * Переопределение метода имплементированного интерфейса
     * Выводит сообщение и добавляет клиента в очередь
     */
    @Override
    public void acceptToMarket(iActorBehaviour actor) {
        System.out.println(actor.getActor().getName()+" клиент пришел в магазин ");
        takeInQueue(actor);
    }
    /**
     * метод, реализующий добавление клиента в очередь
     */
    @Override
    public void takeInQueue(iActorBehaviour actor) {
        this.queue.add(actor);
        System.out.println(actor.getActor().getName()+" клиент добавлен в очередь ");
    }
    /**
     * метод, реализующий уход клиента из магазина
     */
    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for(Actor actor:actors)
        {
            System.out.println(actor.getName()+" клиент ушел из магазина ");
            queue.remove(actor);
        }
        
    }
    /**
     * Метод для создания и выдачи заказа
     */
    @Override
    public void update() {
       takeOrder();
       giveOrder();
       releaseFromQueue();
    }
    /**
     * Метод для выдачи заказа клиенту
     */
    @Override
    public void giveOrder() {
        for(iActorBehaviour actor: queue)
        {
            if(actor.isMakeOrder())
            {
                actor.setTakeOrder(true);
                System.out.println(actor.getActor().getName()+" клиент получил свой заказ ");
            }
        }
        
    }
    /**
     * Метод, реализующий уход клиента из магазина
     */
    @Override
    public void releaseFromQueue() {
       List<Actor> releaseActors = new ArrayList<>();
       for(iActorBehaviour actor:queue)
       {
        if(actor.isTakeOrder())
        {
            releaseActors.add(actor.getActor());
            System.out.println(actor.getActor().getName()+" клиент ушел из очереди ");
        }

       }
    releaseFromMarket(releaseActors);
    }


    /**
     * Метод, реалузиющий получение заказа от клиента
     */
    @Override
    public void takeOrder() {
        for(iActorBehaviour actor:queue)
        {
            if(!actor.isMakeOrder())
            {
                actor.setMakeOrder(true);
                System.out.println(actor.getActor().getName()+" клиент сделал заказ ");

            }
        }
        
    }
    /**
     * Метод, реализующщий добавление акции и количества возможных участников
     * @param discountName поле с названием акции
     * @param countOfClients поле с количеством участников акции
     */
    public void addDiscount(String dicountName, Integer countOfClients){
        this.listOfDiscounts.put(dicountName, countOfClients);
    }
    public void sellWithDiscount(DiscontClient discountActor){
        if(listOfDiscounts.containsKey(discountActor.getDiscountName())){
            if(listOfDiscounts.get(discountActor.getDiscountName()) > 0){
                System.out.println("Товар " + discountActor.getDiscountName() +  " продан клиенту " + discountActor.getName() + " со скидкой");
            }
            else{
                System.out.println("Извините, но вы не успели, превышен лимит участников");
            }
        }
        else{
            System.out.println("Извините, но такой акции нету");
        }
    }
}
