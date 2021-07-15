public class User {
    String name;
    short age;
    int height;

    public User(String name, Short age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public User(Short age, String name, int height) {
        this.age = age;
        this.name = name;
        this.height = height;
    }

    public User(Short age, int height, String name) {
        this.age = age;
        this.height = height;
        this.name = name;
    }

    public User(int height, String name, Short age) {
        this.height = height;
        this.name = name;
        this.age = age;
    }

    public User(int height, Short age, String name) {
        this.height = height;
        this.age = age;
        this.name = name;
    }

    public static void main(String[] args) {
        User ania = new User("Аня", (short) 18, 160);
        User sveta = new User(170, (short) 19, "Света");
        User vera = new User("Вера", (short) 20, 180);
        System.out.println(ania.age);
        System.out.println(sveta.name);
        System.out.println(vera.height);
    }
}
