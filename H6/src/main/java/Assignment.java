import java.util.*;

public class Assignment {

    public static void main(String[] args) {
//        opdracht1En2();
//        opdracht3();
//        opdracht4();
//        opdracht6();
        opdracht7();
    }

    public static void opdracht1En2() {
        // What is the value of row[2] after executing this code
        System.out.println("Opdracht 1:");
        System.out.println("Ik denk dat het antwoord 4 is, omdat beide arrays nu verwijzen naar dezelfde array instance verwijzen");

        long[] row = new long[4];
        row[2] = 3;
        long[] copy = row;
        copy[2]++;

        System.out.println("Resultaat: " + copy[2]);

        // What is the value of row[4] in the above code?
        System.out.println("Opdracht 2:");
        System.out.println("Ik denk dat deze code een java.lang.ArrayIndexOutOfBoundsException zal throwen, omdat de index van een array bij 0 begint en dus tot 3 zal gaan en index 4 niet bestaat");

        System.out.println("Resultaat:");

        try {
            System.out.println(row[4]);
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Er is inderdaad een ArrayIndexOutOfBoundsException afgevuurd.");
        }
    }

    public static void opdracht3() {
        System.out.println("Opdracht 3:");

        long[] arrayOfLongs = new long[4];

        for (int i = 0; i < arrayOfLongs.length; i++) {
            arrayOfLongs[i] = i + 1;
        }

        doubleSize(arrayOfLongs);
    }

    public static void doubleSize(long[] array) {
        long[] newArray = new long[array.length * 2];

        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }

        System.out.println(Arrays.toString(newArray));
    }

    public static void opdracht4() {
        int length = 10;
        long[] array = new long[10];

        for (int i = 0; i < length; i++) {
            array[i] = i;
        }

        System.out.println("Opdracht 4:");
        System.out.println("De originele array:");
        System.out.println(Arrays.toString(array));

        int multiplier = 5;

        System.out.println("De array na het aanroepen van multiply() met een multiplier van 5");

        System.out.println(Arrays.toString(multiply(array, multiplier)));
    }

    public static long[] multiply(long[] input, int multiplier) {
        for (int i = 0; i < input.length; i++) {
            input[i] *= multiplier;
        }
        return input;
    }

    public static void opdracht6() {
        System.out.println("Opdracht 6: ");
        System.out.println("Ik heb 10 getallen van je nodig. ");
        Scanner scanner = new Scanner(System.in);

        int[] integers = new int[10];

        for (int i = 0; i < integers.length; i++) {
            System.out.println((i + 1) + ") Voer een getal in:");
            integers[i] = Integer.parseInt(scanner.nextLine());
        }

        System.out.println("De som van je getallen is: " + Arrays.stream(integers).sum());
    }

    public static void opdracht7() {
        int rows = 3;

        int columns = 3;

        int[] sudokuNumbers = getRandomlyFilledArrayOfIntegers(rows * columns);

        int[][] grid = new int[rows][columns];

        int index = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                grid[i][j] = sudokuNumbers[index++];
            }
        }

        System.out.println(Arrays.deepToString(grid));
    }

    public static int[] getRandomlyFilledArrayOfIntegers(int number) {
        int[] numbers = new int[number];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        return shuffleArray(numbers);
    }

    public static int[] shuffleArray(int[] array) {
        List<Integer> list = new ArrayList<>();

        for (int i : array) {
            list.add(i);
        }

        Collections.shuffle(list);

        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }

        return array;
    }
}
