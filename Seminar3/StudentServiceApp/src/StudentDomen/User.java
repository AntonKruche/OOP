package StudentDomen;

public class User {
    /**
     * Класс Юзер для описания общих полей сотрудников либо учящихся в университете 
     */
    private String firstName;
    private String secondName;
    private int age;
    /**
     * Констуктор класса User 
     * @param firstName поле Имя 
     * @param secondName поле Фамилия 
     * @param age поле возраст
     */
    public User(String firstName, String secondName, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
    }
    /**
     * Геттер для получения метода
     * @return
     */
    public String getFirstName() {
        return firstName;
    }
    /**
     * Сеттер для установливания значения Имени
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    /**
     * Геттер для получения Фамилии 
     * @return
     */
    public String getSecondName() {
        return secondName;
    }
    /**
     * Сеттер для задания значения полю Фамилия
     * @param secondName
     */
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
    /**
     * Геттер для получения значеня возраста
     * @return
     */
    public int getAge() {
        return age;
    }
    /**
     * Сеттер для установления значения поля Возраст
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }
    /**
     * Переопределение метода ToString для вывода Имени, Фамилии и возраста субъекта класса User
     */
    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age=" + age +
                '}';
    }
}
