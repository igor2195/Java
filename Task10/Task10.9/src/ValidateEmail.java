public class ValidateEmail {

    public static Boolean validate (String email) {
        String regexp = "[a-zA-Z0-9._-]+@[a-zA-Z0-9._-]+\\.[a-zA-Z0-9_-]+";
        return email.matches(regexp);
    }
}
