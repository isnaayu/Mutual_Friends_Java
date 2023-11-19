package model;


import java.util.ArrayList;
import java.util.List;

public class PersonRepository {
    private List<Person> friends = new ArrayList<Person>();

    public PersonRepository(List<Person> friends) {
        this.friends = friends;
    }

    public PersonRepository() {
    }

    public void add(Person person){
        friends.add(person);
    }

    public List<Person> getFriends() {
        return friends;
    }

    public void setFriends(List<Person> friends) {
        this.friends = friends;
    }
}
