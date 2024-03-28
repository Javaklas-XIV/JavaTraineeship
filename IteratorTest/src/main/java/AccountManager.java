import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AccountManager implements Iterable<Account> {

    private List<Account> accounts = new ArrayList<>();

    public AccountManager() {
        this.accounts.add(new Account("Test Account"));
        this.accounts.add(new Account("Nog Een Test Account"));
    }

    @Override
    public Iterator<Account> iterator() {

        return new Iterator() {
            private int counter = 0;

            @Override
            public boolean hasNext() {
                return counter < AccountManager.this.accounts.size();
            }

            @Override
            public Account next() {
                Account account = AccountManager.this.accounts.get(counter);

                counter++;

                return account;
            }
        };
    }
}
