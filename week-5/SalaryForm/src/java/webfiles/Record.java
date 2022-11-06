package webfiles;

public class Record {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;
    private String rank;

    public Record() {
    } // + Record (empty)

    public Record(int id, String firstName, String lastName, int salary, String rank) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.rank = rank;
    } // + Record

    public Record(String firstName, String lastName, int salary, String rank) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.rank = rank;
    } // + Record (form)

    public int getId() {
        return id;
    } // + int getId

    public void setId(int id) {
        this.id = id;
    } // + void setId

    public String getFirstName() {
        return firstName;
    } // + String getFirstName

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    } // + void setFirstName

    public String getLastName() {
        return lastName;
    } // + String getLastName

    public void setLastName(String lastName) {
        this.lastName = lastName;
    } // + void setLastName

    public int getSalary() {
        return salary;
    } // + int getSalary

    public void setSalary(int salary) {
        this.salary = salary;
    } // + void setSalary

    public String getRank() {
        return rank;
    } // + String getRank

    public void setRank(String rank) {
        this.rank = rank;
    } // + void setRank

    @Override
    public String toString() {
        return "Record{" + "id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary + ", rank=" + rank + '}';
    } // + String toString
    
} // + class Record