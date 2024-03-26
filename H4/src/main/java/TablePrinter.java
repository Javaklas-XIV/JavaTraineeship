public class TablePrinter {

    public static void main(String[] args) {
        printTable(3);
    }

    public static void printTable(int number) {
        for (int row = 1; row <= 10; row++) {
            printTableRow(number, row);
        }
    }

    public static void printTableRow(int number, int rowNumber) {
        System.out.println(rowNumber + " x " + number + " = " + (rowNumber * number));
    }
}
