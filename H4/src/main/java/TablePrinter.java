public class TablePrinter {

    public static void main(String[] args) {
        printTable(3);
    }

    public static void printTable(int number) {
        printTable(number, 10);
    }

    public static void printTable(int number, int rows) {
        if (rows > 0) {
            printTableRow(number, rows);
            printTable(number, rows - 1);
        }
    }

    public static void printTableRow(int number, int rowNumber) {
        System.out.println(rowNumber + " x " + number + " = " + (rowNumber * number));
    }
}
