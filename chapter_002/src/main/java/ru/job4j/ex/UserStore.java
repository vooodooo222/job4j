package ru.job4j.ex;

public class UserStore {

    /**
     * Поиск пользователя
     * @param users - список пользователей
     * @param login - логин пользователя
     * @return Возвращает ссылку на пользователя в случае успеха, иначе кидает UserNotFoundException
     * @throws UserNotFoundException
     *          Если пользователя не нашли в списке
     */
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        boolean isFound = false;
        User user = null;
        for (int index = 0; index < users.length; index++) {
            if (users[index].getUsername().equals(login)) {
                user = users[index];
                isFound = true;
                break;
            }
        }
        if (!isFound) {
            throw new UserNotFoundException("User not found");
        }
        return user;
    }

    /**
     * Валидация имени пользователя
     * @param user - пользователь
     * @return Возвращает true в случае успеха, иначе кидает UserInvalidException
     * @throws UserInvalidException
     *          Если пользователь не валидный или если имя пользователя состоит из менее трех символов
     */
    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid() || user.getUsername().length() < 3) {
            throw new UserInvalidException("User invalid");
        }
        return true;
    }

    public static void main(String[] args) {
        try {
            User[] users = {
                    new User("Petr Arsentev", true),
                    // Комментарий только в для учебных материалов:
                    // new User("Mr. Igor", false),        // UserNotFoundException
                    // new User("Mr", true)                // UserInvalidException
            };
            User user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
            // Комментарий только в для учебных материалов:
            // user = findUser(users, "Mr. Igor");
            // if (validate(user)) {
            //     System.out.println("This user has an access");
            // }
            // user = findUser(users, "Mr");
            // if (validate(user)) {
            //     System.out.println("This user has an access");
            // }
        } catch (UserInvalidException ue) {
            ue.printStackTrace();
        } catch (UserNotFoundException un) {
            un.printStackTrace();
        }
    }
}
