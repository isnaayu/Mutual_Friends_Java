package model;


import java.util.ArrayList;
import java.util.Iterator;
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

    public void matchFriend(PersonRepository person1, PersonRepository person2){
        for (Person friend1 : person1.getFriends()){
            for (Person friend2 : person2.getFriends()){
                if (friend1.getName().contains(friend2.getName())){
                    System.out.println("Match friends = "+friend1);
                }
            }
        }
    }

    public void deleteFriend(String friendName){
        Iterator<Person> iterator = friends.iterator();
        while (iterator.hasNext()){
            Person person = iterator.next();
            if (person.getName().equals(friendName)){
                iterator.remove();
                System.out.println("Friend Deleted!");
            }
        }
    }
}
