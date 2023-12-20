package lt.techin.sample.controller;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lt.techin.sample.model.request.User;
import lt.techin.sample.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
//@NoArgsConstructor
public class UserController {

//    1 - autowired
//    @Autowired
//    UserService userService;

//    2 - standartinis konstruktorius
//    UserService userService;
//    public UserController(UserService userService) {
//        this.userService = userService;
//    }

//    3 - @RequiredArgsConstructor
    private final UserService userService;

    @GetMapping
    public Object getUser() {
        return "@";
    }

    @GetMapping("/different")
    public Object getAnotherUser() {
        return "@@@";
    }

    @PostMapping
    public Object returnWhatWasReceived(
            @RequestParam String input
    ) {
        return input;
    }

    @PostMapping("/body")
    public User tryPassBody(
            @RequestBody User body
    ) {
        return userService.capitalizeName(body);
    }

}
