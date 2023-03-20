package Entity;

public class Product {
    private int pid;
    private String name;
    private double price;
    private double low_price;
    private int tid;
    private int sid;

    public Product() {
    }

    public Product(int pid, String name, double price, double low_price, int tid, int sid) {
        this.pid = pid;
        this.name = name;
        this.price = price;
        this.low_price = low_price;
        this.tid = tid;
        this.sid = sid;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getLow_price() {
        return low_price;
    }

    public void setLow_price(double low_price) {
        this.low_price = low_price;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    @Override
    public String toString() {
        return "Product{" +
                "pid=" + pid +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", low_price=" + low_price +
                ", tid=" + tid +
                ", sid=" + sid +
                '}';
    }
}
