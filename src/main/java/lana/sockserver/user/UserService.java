package lana.sockserver.user;


import lana.sockserver.user.exception.UserExistException;
import lana.sockserver.user.exception.UserNotExistException;

public interface UserService {
    // get the user by name or id, in case one of those property is missing.
    User get(User user) throws UserNotExistException;

    User create(User user) throws UserExistException;

    void save(User user);

    boolean authorize(User user);
}