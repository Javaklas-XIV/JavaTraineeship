import lombok.Data;

@Data
public class PersonH10 extends Human {

    private String name;

    public PersonH10(String name) {
        this.setName(name);
    }

    @Override
    public void greet() {
        System.out.println("Hello, my name is " + this.getName() + ". Nice to meet you!");
    }
}
