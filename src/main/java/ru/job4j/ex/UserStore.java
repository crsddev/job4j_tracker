package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User rsl = null;
        for (User user : users) {
            if (user.getUsername().equals(login)) {
                rsl = user;
                break;
            }
        }
        if (rsl == null) {
            throw new UserNotFoundException("User is not found");
        }
        return rsl;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (user.getUsername().length() < 3 || !user.isValid()) {
            throw new UserInvalidException("User is not a valid");
        }
        return true;
    }

    public static void main(String[] args) {
        User user;
        User[] users = {
                new User("Petr Arsentev", true),
                new User("Yo Mira", true),
                new User("Stan Smith", false)
        };
        String[] login = {"Petr Arsentev", "Yo Mira", "Stan Smith", "Joe Doe"};
        for (String logins: login) {
            try {
                user = findUser(users, logins);
                if (validate(user)) {
                    System.out.println("This user has an access: " + user.getUsername());
                }
            } catch (UserInvalidException ex) {
                System.out.println("User is not found");
            } catch (UserNotFoundException ex) {
                System.out.println("User is not validate");
            }

        }
    }
}
