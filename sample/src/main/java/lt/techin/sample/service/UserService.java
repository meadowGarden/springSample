package lt.techin.sample.service;

import lt.techin.sample.model.request.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    public User capitalizeName(User user) {

        System.out.println(user);
        return user;
    }



    public static void main (String[] args) {

        List<User> userList = List.of(
                User.builder()
                        .withId(1)
                        .build(),
                User.builder()
                        .withId(2)
                        .build(),
                User.builder()
                        .withId(3)
                        .build(),
                User.builder()
                        .withId(4)
                        .build());

//        for (User user : userList) {
//            if (user.getId() % 2 == 0) {
//                user.setName("name" + user.getId());
//                System.out.println(user);
//            }
//        }

        List<User> listToPrint = userList.stream()
                .filter((user) -> user.getId() % 2 == 0)
                .peek((user) -> user.setName("name" + user.getId()))
                .collect(Collectors.toList());
        System.out.println(listToPrint);
    }


}



//package lt.techin.sample.service;
//
//import lt.techin.sample.model.request.User;
//import org.springframework.stereotype.Service;
//
//@Service
//public class UserService {
//
//    public User capitalizeName(User user) {
////        User.Builder = new User.Builder()
////                .withID()
////                .withName()
////                .withAge()
////                .b
//
//        User user1 = new User.Builder()
//                .withName("a")
//                .withAge(5)
//                .Build();
//
////        user.name = user.name.toUpperCase();
//        System.out.println(user);
//        return user;
//    }
//
//
//}
