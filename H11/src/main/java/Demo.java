public class Demo {

    public static void main(String[] args) {
        PersonH11 person = new PersonH11("Steven");
        person.addHistory("Description of a history");
        person.addHistory("Another description of a history");
        person.printHistory();

        Human subHuman = person.createSubHuman("Sub human");
        subHuman.greet();
    }
}
