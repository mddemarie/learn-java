public class Scope {
    public static void main(String[] args) {
        String line = "This is the chorus";
        System.out.println(line);

        verse();
        System.out.println(line);
    }

    public static void verse() {
        String line = "This is my verse";
        System.out.println(line);
    }
}
