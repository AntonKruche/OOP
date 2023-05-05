package Classes;
public class DiscontClient extends Actor {
    /**
     * Класс для клиента, пришедшего за акционными товарами
     * @param discontName поле, содержащее информацию о названии акции
     * @param idInDiscontQueue поле, содержащее информацию о номере клиента в очереди на акцию
     */
    public String discontName;
    public static Integer idInDiscontQueue = 0;
    /**
     * Переопределение конструктора базового класса для создания экземпляра клиента,
     * который пришёл по акции
     * @param name значение имени клиента
     * @param discontName значение наименования акции
     */
    public DiscontClient(String name, String discontName){
        super(name);
        this.discontName = discontName;
        idInDiscontQueue ++;
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
     * Метод, возвращающий экземпляр класса Actor
     */
    @Override
    public Actor getActor() {
        return this;
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
    public static Integer getidInDiscQueue(){
        return idInDiscontQueue;
    }

    public String getDiscountName(){
        return this.discontName;
    }
    

}
