import java.util.Date;

public abstract class Person {

    private Date dob;
    private String address;

    public Person(Date dob, String address, String name) {
        this.dob = dob;
        this.address = address;
        this.name = name;
    }

    private String name;
}
