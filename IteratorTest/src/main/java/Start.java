public class Start {

    public static void main(String[] args) {
        for (Account a : new AccountManager()) {
            System.out.println(a);
        }
    }
}
