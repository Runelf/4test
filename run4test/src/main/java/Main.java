import com.github.javafaker.Faker;
import com.github.javafaker.Name;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {


        for (int i = 0; i < 10; i++) {
            String y = generateName();
            System.out.println(y);
            split(y);
        }
    }

    public static void split(String y) {
        String[] words = y.split(" ");
        for (String word : words) {
            System.out.println(word);
        }
    }

    public static String generateName() {
        Faker faker = new Faker(new Locale("ru"));
        String x = faker.name().fullName();
        return x;
    }
}

