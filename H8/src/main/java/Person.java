import lombok.Data;

@Data
public class Person {
    private String name;
    private int age;
    private Gender gender;

    public Person() {
        this("Test Person", 0, Gender.DEFAULT);
    }

    public Person(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String toString() {
        return this.getName() + " (" + this.getAge() + ") is " + this.getGender() + ".";
    }

    public int hashCode() {
        return this.age * this.name.hashCode() * this.gender.hashCode();
    }
}
