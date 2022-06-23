package hw224.Service;

import hw224.Entity.UserEntity;
import org.springframework.validation.annotation.Validated;

import java.util.ArrayList;
import java.util.List;

public class UserService implements IUserService{
    List<UserEntity> userList = new ArrayList<>();

    public UserService(){}
    @Override
    public void addUser(@Validated UserEntity fio) {
        UserEntity user = new UserEntity(fio.firstName, fio.lastName, fio.patronymic);
        userList.add(user);
    }
    @Override
    public List<UserEntity> getUsers() {
        return userList;
    }
}