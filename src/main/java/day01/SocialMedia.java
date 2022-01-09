package day01;

public class SocialMedia {
    public static void main(String[] args) {
        User user = new NormalUser("myemail@mail.hu", "mypassword");

        System.out.println(user.getEmail());
    }
}
