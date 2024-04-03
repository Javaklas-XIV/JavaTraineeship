import org.example.annotations.MyAnnotation;
import org.example.annotations.MyAnnotation2;

@MyAnnotation
public class PersonH12 {

    private String name;

    public PersonH12(String name) {
        this.name = name;
    }

    @MyAnnotation2
    public void greet() {
        System.out.println("Hello, my name is " + this.name);
    }
}
