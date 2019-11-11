package persons;

import java.util.Objects;

public class Staff extends Person {
    private String school;
    private double pay;

    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    @Override
    public String toString() {
        return "Staff[" + super.toString() + ", school = " + school + ", pay = " + pay +"]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Staff)) {
            return false;
        }
        Staff staff = (Staff) obj;
        return school.equals(staff.school) && pay == staff.pay && getName() == staff.getName() &&
                getAddress() == staff.getAddress();
    }

    @Override
    public int hashCode() {
        int code = 17;
        code = 31 * code + super.hashCode();
        code = 31 * code + school.hashCode();
        code = 31 * code + Objects.hashCode(pay);
        return code;
    }
}
