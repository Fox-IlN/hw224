package hw224.Service;

import hw224.Entity.UserEntity;

import java.util.List;

public interface IUserService {
    void addUser (String firstName, String lastName, String patronymic);
    List<UserEntity> getUsers();
}