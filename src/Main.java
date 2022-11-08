public class Main {
    public static void main(String[] args) {
        MagicBox <String> magicBox1 = new MagicBox<>(2);
        magicBox1.add("Инициализация ");
        magicBox1.add("проекта.");
        System.out.println(magicBox1.getItem(0) + magicBox1.getItem(1));
        boolean operation = magicBox1.add(" ");
        System.out.println("Результат операции: " + operation);

        MagicBox <String> magicBox2 = new MagicBox<>(3);
        magicBox2.add("Тестирование ");
        magicBox2.add("метода ");
        magicBox2.add("T pick().");
        System.out.println(magicBox2.pick());

        MagicBox <String> magicBox3 = new MagicBox<>(5);
        System.out.println(magicBox3.pick());

    }
}