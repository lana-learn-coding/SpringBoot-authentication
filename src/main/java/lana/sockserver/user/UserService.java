package lana.sockserver.user;


public interface UserService {
    UserEntity save(UserEntity user);

    boolean authorize(UserEntity user);
}
