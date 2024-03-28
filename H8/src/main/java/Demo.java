import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

public class Demo {

    public static void main(String[] args) {
        Person person1 = new Person("Steven", 29, Gender.MALE);
        Person person2 = new Person("Steven", 29, Gender.MALE);

        Class<Person> personClass = Person.class;

        System.out.println(person1.equals(person2));

        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());

        for (Method method : personClass.getMethods()) {
            System.out.println(method);
        }

        for (Field field : personClass.getDeclaredFields()) {
            System.out.println(field);
        }

        Set<Person> personSet = new HashSet<>();
        personSet.add(person1);
        personSet.add(person2);

        System.out.println(personSet);

        Set<RecordPerson> recordPersonSet = new HashSet<>();
        recordPersonSet.add(new RecordPerson("Steven", 29, Gender.MALE));
        recordPersonSet.add(new RecordPerson("Steven", 29, Gender.MALE));

        System.out.println(recordPersonSet);
    }
}
