package Classes;

import Interfaces.iActorBehaviour;
import Interfaces.iReturnOrded;

public abstract class Actor implements iActorBehaviour, iReturnOrded {
    /**
     * @param name поле, содержащее Имя клиента
     * @param isTakeOrder поле, содержащее информацию о том забрал клиент заказ или нет
     * @param isMakeOrder полк, содержащее информацию о том сделал клиент заказ или нет 
     */
    protected String name;
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;
    /**
     * Констуктор абстрактного класса Actor от строковой переменной name
     * @param name Имя клиента 
     */
    public Actor(String name) {
        this.name = name;
    }


    /**
     * Метод, возвращающий значение поля, содержащего Имя клиента
     * @return name
     */
    public abstract String getName(); 

}
