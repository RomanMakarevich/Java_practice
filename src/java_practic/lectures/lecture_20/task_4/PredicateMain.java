package java_practic.lectures.lecture_20.task_4;

import java_practic.lectures.lecture_20.task_3.User;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
//+
public class PredicateMain {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("Alex"));
        users.add(new User("Tom"));
        users.add(new User("Mihail"));
        users.add(new User("Pavel"));
        users.add(new User("Elys"));

        Predicate <User> nameA = (user) -> user.getName().startsWith("A");
        Predicate <User> nameP = (user) -> user.getName().startsWith("P");
        Predicate <User> nameE = (user) -> user.getName().startsWith("U");

        Predicate<User> names = nameA.or(nameE).or(nameP);
        filter(users, names);

        System.out.println(users);
    }
    static List<User> filter (List<User> users, Predicate<User> predicate){
        Iterator<User> iterator = users.iterator();

        while (iterator.hasNext()){
            User user = iterator.next();
            if (predicate.test(user)){
                iterator.remove();
            }
        }
        return users;
    }
}
