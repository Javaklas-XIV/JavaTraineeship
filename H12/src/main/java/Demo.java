import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) {

        Class personClass = PersonH12.class;

        List<Annotation> annotations = new ArrayList<>();

        for (Method method : personClass.getDeclaredMethods()) {
            for (Annotation annotation : method.getDeclaredAnnotations()) {
                annotations.add(annotation);
            }
        }

        for (Annotation annotation : personClass.getDeclaredAnnotations()) {
            annotations.add(annotation);
        }

        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }
    }
}
