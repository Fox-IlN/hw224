package hw224.Service;

import hw224.Entity.UserEntity;

import java.util.ArrayList;
import java.util.List;

public class UserService implements IUserService{
    List<UserEntity> userList = new ArrayList<>();

    public UserService(){}
    @Override
    public void addUser(String firstName, String lastName, String patronymic) {
        UserEntity user = new UserEntity(firstName, lastName, patronymic);
        userList.add(user);
    }
    @Override
    public List<UserEntity> getUsers() {
        return userList;
    }
}