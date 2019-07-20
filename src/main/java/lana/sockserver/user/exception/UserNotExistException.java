package lana.sockserver.user.exception;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class UserNotExistException extends Exception {
    public UserNotExistException(String message, Throwable cause) {
        super(message, cause);
    }

    public UserNotExistException(String message) {
        super(message);
    }
}
