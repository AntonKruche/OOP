package Controllers;

import StudentDomen.User;
import StudentService.iUserService;

import java.util.List;

public class AverageAge<T extends User> {

    public Double getAverageAge(List<T> persons){
        Double AverageAge = 0.0;
        for(T person : persons){
            AverageAge += person.getAge();
        }
        AverageAge = AverageAge / persons.size();
        return AverageAge;   
    }
}
