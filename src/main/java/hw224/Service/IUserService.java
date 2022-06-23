package hw224.Service;

import hw224.Entity.UserEntity;
import org.springframework.validation.annotation.Validated;

import java.util.List;

public interface IUserService {
    void addUser (@Validated UserEntity fio);
    List<UserEntity> getUsers();
}