package lt.techin.sample.model.request;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//@Builder()
@Builder(setterPrefix = "with")
@ToString
@Getter
//@Setter
public class User {

    private int id;
    @Setter
    private String name;
    private int age;
}





//package lt.techin.sample.model.request;
//
//import java.util.UUID;
//
//public class User {
//
//    private User(int id, String name, int age) {
//        this.id = id;
//        this.name = name;
//        this.age = age;
//    }
//
//    private int id;
//    private String name;
//    private int age;
//
////    public User(String name, int age) {
//////        this.id = UUID.randomUUID();
////        this.name = name;
////        this.age = age;
////    }
//
//    public int getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    @Override
//    public String toString() {
//        return "User{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }
//
//    public static class Builder {
//        private int id;
//        private String name;
//        private int age;
//
//        public Builder withID(int id) {
//            this.id = id;
//            return this;
//        }
//
//        public Builder withName(String name) {
//            this.name = name;
//            return this;
//        }
//
//        public Builder withAge(int age) {
//            this.age = age;
//            return this;
//        }
//
//        public User Build() {
//            return new User(id, name, age);
//        }
//
//    }
//
//
//
//}
