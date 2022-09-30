import java.util.ArrayList;

public class Demo {
    int num;
    int ph;

    @Override
    public String toString() {
        return "Demo{" +
                "num=" + num +
                ", ph=" + ph +
                '}';
    }

    public Demo(int num, int ph) {
        this.num = num;
        this.ph = ph;
    }

    public static void main(String[] args) {
        Demo demo = new Demo(10,20);
        Demo demo1 = new Demo(20,40);
        ArrayList<Demo> array = new ArrayList<>();
        array.add(demo);
        array.add(demo1);
        System.out.println(array);
    }
}
