import java.util.ArrayList;

public class Fibo {

    public static void main(String[] args) {
        run(6);
    }

    private static void run(int number) {
        ArrayList<Integer> sequence = new ArrayList<>();

        int previousNumber = 0;
        int currentNumber = 1;

        sequence.add(currentNumber);

        for (int i = 0; i < number - 1; i++) {
            int nextNumber = previousNumber + currentNumber;

            sequence.add(nextNumber);

            previousNumber = currentNumber;
            currentNumber = nextNumber;
        }

        System.out.println(implode(sequence, " "));
    }

    public static String implode(ArrayList<Integer> arrayList, String delimiter) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < arrayList.size(); i++) {
            result.append(arrayList.get(i));
            if (i < arrayList.size() - 1) {
                result.append(delimiter);
            }
        }
        return result.toString();
    }
}
