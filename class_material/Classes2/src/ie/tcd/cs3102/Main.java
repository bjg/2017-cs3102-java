package ie.tcd.cs3102;

public class Main {

    public static void main(String[] args) {
	// write your code here
        User user1 = new User();
        user1.setName("Leanne Graham");
        user1.setUsername("Bret");
        user1.setEmail("Sincere@april.biz");
        System.out.println(user1);


        User user2 = new User();
        user2.setName("Ervin Howell");
        user2.setUsername("Ervin Howell");
        user2.setEmail("Shanna@melissa.tv");
        System.out.println(user2);

        User user3 = new User(
                "Clementine Bauch",
                "Samantha",
                "Nathan@yesenia.net"
        );
        System.out.println(user3);


        User user4 = new User(
                "Patricia Lebsack",
                "Karianne",
                "Julianne.OConner@kory.org",
                "493-170-9623 x156"
        );
        user4.setAddress(new Address("53919-4257"));
        System.out.println(user4);
        System.out.println(User.Type.CUSTOMER);
    }
}
