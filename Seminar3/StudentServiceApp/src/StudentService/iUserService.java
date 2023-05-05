package StudentService;
import java.util.*;

public interface iUserService<T> {
    /**
     * Интерфейс для работы с различными сущностями университета
     */
    List<T> getAll();
    void create(String firstName, String secondName, int age);
}
