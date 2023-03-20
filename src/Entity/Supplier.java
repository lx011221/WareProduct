package Entity;

public class Supplier {
    private int sid;
    private String sname;
    private String address;
    private String people;
    private String phone;
    private String mail;

    public Supplier() {
    }

    public Supplier(String sname, String address, String people, String phone, String mail) {
        this.sname = sname;
        this.address = address;
        this.people = people;
        this.phone = phone;
        this.mail = mail;
    }

    public Supplier(int sid, String sname, String address, String people, String phone, String mail) {
        this.sid = sid;
        this.sname = sname;
        this.address = address;
        this.people = people;
        this.phone = phone;
        this.mail = mail;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPeople() {
        return people;
    }

    public void setPeople(String people) {
        this.people = people;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", address='" + address + '\'' +
                ", people='" + people + '\'' +
                ", phone='" + phone + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }
}