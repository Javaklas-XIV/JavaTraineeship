import lombok.Data;

@Data
public class Account {

    public String name;

    public Account(String name) {
        this.name = name;
    }
}
