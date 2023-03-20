package Entity;

public class Type {
    private int tid;
    private String type;

    public Type() {
    }

    public Type(int tid, String type) {
        this.tid = tid;
        this.type = type;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Type{" +
                "tid=" + tid +
                ", type='" + type + '\'' +
                '}';
    }
}
