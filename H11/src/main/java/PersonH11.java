import lombok.Data;

@Data
public class PersonH11 extends PersonH10 {

    private HistoryRecord[] historyRecords = new HistoryRecord[100];

    private int historyRecordCount = 0;

    public PersonH11(String name) {
        super(name);
    }

    public void addHistory(String desc) {
        this.historyRecords[this.historyRecordCount] = new HistoryRecord(desc);
        this.historyRecordCount++;
    }

    public void printHistory() {
        System.out.println("--- Available history records ---");

        if (this.historyRecordCount == 0) {
            System.out.println("There are no history records available yet");
        } else {
            for (int i = 0; i < this.historyRecordCount; i++) {
                System.out.println(this.historyRecords[i]);
            }
        }
    }

    public Human createSubHuman(String name) {
        return new Human(name);
    }

    @Data
    private class HistoryRecord {

        private String description;

        public HistoryRecord(String description) {
            this.description = description;
        }

        @Override
        public String toString() {
            return this.description;
        }
    }

    private class Human extends PersonH10 {
        public Human(String name) {
            super(name);
        }

        @Override
        public void greet() {
            System.out.println("Sub is the best.");
        }
    }
}
