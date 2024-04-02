public class Employee extends PersonH10 {
    public Employee(String name) {
        super(name);
    }

    @Override
    public void greet() {
        System.out.println("I'm tired of working. This is inhuman!");
    }
}
