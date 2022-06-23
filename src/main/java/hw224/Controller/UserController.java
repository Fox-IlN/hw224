package hw224.Controller;

import hw224.Entity.UserEntity;
import hw224.Service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class UserController {

    @Autowired
    private IUserService users;

    @GetMapping
    public String getUsers (Model model){
        model.addAttribute("users", users.getUsers());
        return "index";
    }
    @PostMapping
    public String addUser (@Validated UserEntity fio, Model model){
        users.addUser(fio);
        model.addAttribute("users", users.getUsers());
        return "index";
    }
}