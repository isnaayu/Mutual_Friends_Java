import model.Person;
import model.PersonRepository;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        PersonRepository personRepository = new PersonRepository();

        PersonRepository personA = new PersonRepository();
        personA.add(new Person("andi"));
        personA.add(new Person("susi"));
        personA.add(new Person("yuni"));

        PersonRepository personB = new PersonRepository();
        personB.add(new Person("andi"));
        personB.add(new Person("Juli"));
        personB.add(new Person("agus"));

        System.out.println(personA.getFriends());
        System.out.println(personB.getFriends());

        personRepository.matchFriend(personB, personA);


    }
}