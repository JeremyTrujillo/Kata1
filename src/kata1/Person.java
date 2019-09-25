package kata1;

import java.time.LocalDate;
import java.time.Period;

public class Person {
    private final String name;
    private final LocalDate birthday;

    public Person(String name, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

        public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", birthday=" + birthday + ", age=" + getAge() + '}';
    }

    public LocalDate getBirthday() {
        return birthday;
    }
    
    public int getAge(){
        return Period.between(birthday,LocalDate.now()).getYears(); 
    }
}
