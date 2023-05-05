package Classes;

public class SpecialClient extends Actor{
    /**
     * Поле, содержащее значение уникального номера особого клиента
     * @param idVIP
     */
    private int idVIP;

    /**
     * Переопределение конструктора базового класса от двух полей
     * @param name присваивает имя клиента
     * @param idVIP присваивает уникальный номер особого клиента
     */
    public SpecialClient(String name, int idVIP){
        super(name);
        this.idVIP = idVIP;
    }
    /**
     * Метод, который возвращает имя клиента
     * @param name имя клиента
     */
    @Override
    public String getName() {
        return super.name;
    }
    /**
     * Метод возваращающий значение поля idVip, содержащего уникальный идентификационный номер
     * @return idVip
     */
    public int getIdVIP() {
        return idVIP;
    }
    /**
     * Метод, возвращающий информацию о том сделал клиент заказ или нет
     * возвращает значение поля родительского класса
     */
    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }
    /*
     * Метод, возвращающий информацию о том забрал клиент заказ или нет
     * возвращает значение поля родительского класса
     */
    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }
    /**
     * Метод, устанавливающий значение поля родительского класса,
     * говорящего о том сделал клиент заказ или нет
     */
    @Override
    public void setMakeOrder(boolean makeOrder) {
       super.isMakeOrder = makeOrder;
    }
    /**
     * Метод, устанавливающий значение поля родительского класса,
     * говорящего о том забрал клиент заказ или нет
     */
    @Override
    public void setTakeOrder(boolean pickUpOrder) {
       super.isTakeOrder = pickUpOrder;   
    }
    /**
     * Метод, возвращающий экземпляр класса Actor
     */
    @Override
    public Actor getActor() {
        return this;
    }
    /**
     * Метод для возврата продукта в магазин
     */
    @Override
    public void returnProduct(Product product) {
        System.out.printf("Товар %s вернули в магазин", product.getName());
        
    }
    /**
     * Метод, реализующий возрат денег клиенту
     */
    @Override
    public void takeMooneyBack(Integer price) {
        System.out.println("Покупатель получил сумму возврата " + price);
        
    }

    
}