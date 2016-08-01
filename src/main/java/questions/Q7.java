package questions;

public class Q7 {
    private String str;
    private int var;
    private int specParam;

    public Q7(String str, int var) {
        this.str = str;
        this.var = var;
    }

    public Q7(int specParam) {
        this("asda", 12);
        this.specParam = specParam;
    }

    public Q7 getOject() {
        return this;
    }
}
