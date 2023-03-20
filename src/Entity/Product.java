package Entity;

public class Product {
    private int pid;
    private String name;
    private double price;
    private double low_price;
    private int tid;
    private int sid;
    private String sname;
    private String type;

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

    public Product(int pid, String name, double price, double low_price, String sname, String type) {
        this.pid = pid;
        this.name = name;
        this.price = price;
        this.low_price = low_price;
        this.sname = sname;
        this.type = type;
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
        return "编号：" + pid + "\t名称：" + name + "\t成本：" + price + "\t最低售价：" + low_price + "\t供应商：" + sname + "\t类型：" + type;
    }
}
