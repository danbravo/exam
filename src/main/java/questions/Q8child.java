package questions;

public class Q8child extends Q8parent{
    private String skinColor;

    public Q8child(String gender, String name, int age, String color) {
        super(gender, name, age);
        this.skinColor = color;
    }

    @Override
    public void meth() {
        System.out.println(65);
    }

}
