

public class aula_01 {

    public static void main(String[] args) {
        String input = "Let's Code";
        String name = Optional.ofNullable(input).orElse(() -> getRandomName());
        System.out.println(name);
    }
    private static String getRandomName() {
        System.out.println("Providing a random name");
        return "John Doe";
    }

}

