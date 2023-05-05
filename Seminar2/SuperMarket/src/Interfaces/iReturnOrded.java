package Interfaces;

import Classes.Product;
/**
 * Интерфейс, который реализует процесс возврата товара
 */
public interface iReturnOrded {
    /**
     * метод для получения денег за возврат товара
     * @param price цена товара, который вернули
     */
    void takeMooneyBack(Integer price);
    /**
     * метод для возврата товара
     * @param product экземпляр класса Product, который будет возвращён
     */
    void returnProduct(Product product);
}

