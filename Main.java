//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    enum type{ O,A,B,AB}

    public static void main(String[] args) {
    bloodData blood = new bloodData("a","+");
    bloodData blood2 = new bloodData();
    System.out.println(blood.toString());
    System.out.println(blood2.toString());

    blood.setRH("-");
    blood.setType("ab");
    System.out.println(blood.toString());
    Patient p = new Patient();
    System.out.println(p.toString());

    new GUI();

    }
}
