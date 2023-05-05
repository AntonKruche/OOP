package StudentDomen;
import java.util.Iterator;
import java.util.List;

public class StudentStream implements Iterable<StudentGroup> {
    private int streamId;
    private List<StudentGroup> groups;
    /**
     * Конструктор класса Поток студентов, принимающий список групп, обучающихся на одном потоке, и Айди потока
     * @param groups
     * @param streamId
     */
    public StudentStream(List<StudentGroup> groups, int streamId){
        this.groups = groups;
        this.streamId = streamId;

    }
    /**
     * Сеттер для определения поля Айди потока
     * @param id
     */
    public void setId(int id){
        this.streamId = id;
    }
    /**
     * Геттер для получения поля Айди потока
     * @return
     */
    public int getId(){
        return this.streamId;
    }
    /**
     * Сеттер для определения списка групп в потоке
     * @param groups
     */
    public void setGroup(List<StudentGroup> groups){
        this.groups = groups;
    }
    /**
     * Геттер для получения списка групп на потоке
     * @return
     */
    public List<StudentGroup> getStudentGroups(){
        return this.groups;
    }
    /**
     * Переопределение метода Iterator для реализации перебора в цикле
     */
    @Override
    public Iterator<StudentGroup> iterator() {
        return new Iterator<StudentGroup>(){
            private int index = 0;
            @Override
            public boolean hasNext() {
               return index<groups.size();
            }
            @Override
            public StudentGroup next() {
                if(!hasNext())
                {
                    return null;
                }
                return groups.get(index++);        
            }

        };
    }
    /**
     * Переопределение метода ToString для вывода номера потока и всех групп в нём
     */
    @Override
    public String toString() {
        String result = String.format("Student Stream ID: %d\nCount of groups: %d\n", this.streamId, this.groups.size());
        for(StudentGroup group : this.groups){
            result += group.toString() + "\n";
        }
        return result;
    }

}
