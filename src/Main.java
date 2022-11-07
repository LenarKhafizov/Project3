public class Main {
    public static void main(String[] args) {
        MagicBox <String> magicBox = new MagicBox<>(2);
        magicBox.add("Инициализация ");
        magicBox.add("проекта.");
        System.out.println(magicBox.getItem(0) + magicBox.getItem(1));
        boolean operation = magicBox.add(" ");
        System.out.println("Результат операции: " + operation);
    }
}