
import User.*;

import java.io.IOException;

import static UtilityMethods.Utils.*;

class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        task1();
        task2();
        task3();
    }

    public static void task1() throws IOException, InterruptedException {
        User user = createTestUser();
        System.out.println("It's Task 1");
        SERVICES.addNewUser(user);
        SERVICES.updateUser(user);
        SERVICES.deleteUser(user);
        System.out.println(GSON_PRETTY.toJson(SERVICES.getAllUser()));
        System.out.println(GSON_PRETTY.toJson(SERVICES.getUserById(2)));
        System.out.println(GSON_PRETTY.toJson(SERVICES.getUserByUsername("Kamren")));
        System.out.println();
    }

    public static void task2() throws IOException, InterruptedException {
        System.out.println("It's Task 2");
        COMMENTS.getUserComments(7);
        System.out.println();
    }

    public static void task3() throws IOException, InterruptedException {
        System.out.println("It's Task 3");
        TODOS.getAllToDos(3);
        System.out.println();
    }

    public static User createTestUser() {
        User user = new User();
        user.setId(1);
        user.setName("Maks Maks");
        user.setUsername("Mikhaylov");
        user.setEmail("example@gmail.com");

        Address address = new Address();
        address.setCity("Kherson");
        address.setGeo(new Geo("11.11", "22.22"));

        user.setAddress(address);
        user.setPhone("+1324322342");
        user.setWebsite("mycoolsite.com");

        Company company = new Company();
        company.setName("My Company");
        company.setCatchPhrase("Random text");
        company.setBs("text text text");

        user.setCompany(company);
        return user;
    }

}