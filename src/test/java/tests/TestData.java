package tests;

import com.github.javafaker.Faker;

import java.util.Locale;

public class TestData {
    static Faker faker = new Faker(new Locale("ru"));
    public static String
            name = faker.name().fullName(),
            phone = faker.phoneNumber().subscriberNumber(11);
}
