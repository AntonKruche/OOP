package Classes;

public class Product {
    /**
     * Класс, описывающий экземпляры товара в магазине
     * @param name поле, содержащее наименование товара
     * @param price поле, содержащее цену товара
     */
    private String name;
    private Integer price;
    /**
     * Конструктор класса Product с заданием наименования и цены товара
     * @param name Имя товара
     * @param price Цена товара
     */
    public Product(String name, Integer price){
        this.name = name;
        this.price = price;
    }
    /**
     * Метод для получения наименования товара
     * @return возвращает название товара
     */
    public String getName(){
        return this.name;
    }
    /**
     * Метод для получения цены товара
     * @return возвращает цену товара
     */
    public Integer getPrice(){
        return this.price;
    }
}
