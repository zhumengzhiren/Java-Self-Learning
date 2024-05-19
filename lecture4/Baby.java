import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Baby {
    String name;
    int age;
    double weight;
    int numPoops = 0;

    void poop () {
        numPoops++;
        System.out.println(name + " has pooped " + numPoops + " times.");
    }

    void DoSomething(int x, int[] ys, Baby b) {
        x = 5;
        ys[0] = 5;
        b.name = "Bobby";
    }
    public static void main(String[] args) {
        Baby b = new Baby();
        b.name = "Bobby";
        b.age = 1;
        b.weight = 20.0;
        b.poop();
        b.poop();
        b.poop();
        System.out.println(b.name + " is " + b.age + " years old and weighs " + b.weight + " pounds.");
        int x = 3;
        int[] ys = {3, 4, 5};
        Baby b2 = new Baby();
        b2.name = "Sally";
        b2.DoSomething(x, ys, b2);
        System.out.println("x = " + x);
        System.out.println("ys[0] = " + ys[0]);
        System.out.println("b2.name = " + b2.name);
    }
}
