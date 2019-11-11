package persons;

public class Person {
    private String name;
    private String address;

    public Person() {
    }

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person[name = " + name + ", address = " + address + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Person)) {
            return false;
        }
        Person person = (Person) obj;
        return name.equals(person.name) && address.equals(person.address);
    }

    @Override
    public int hashCode() {
        int code = 17;
        code = 31 * code + name.hashCode();
        code = 31 * code + address.hashCode();
        return code;
    }
}
