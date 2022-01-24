public class User {
    String name;
    int age;
public User(String name, int age) {
    this.name = name;
    this.age = age;
}

    public static void main (String[] arge)
    {
        int user[] = new int[5];
        User anna = new User ("Anna",20);
        User marek = new User ("Marek",32);
        User maciek = new User ("Maciek",21);
        User karol = new User("Karol",17);
        User karolina = new User("Karolina",12);

        User[] users = {anna, marek, maciek, karol, karolina};
        int result = 0;
        for(int i = 0; i< user.length; i++) {
            result = result + user[i];
        }
            System.out.println(result);

    }
}
