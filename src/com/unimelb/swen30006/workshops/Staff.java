import java.util.Date;

public class Staff extends Person{

    public Staff(Date dob, String address, String name) {
        super(dob, address, name);
    }

    private String[] roles;
    private String staffID;
}
