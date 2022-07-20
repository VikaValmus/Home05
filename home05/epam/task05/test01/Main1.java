package home05.epam.task05.test01;

public class Main1 {
    public static void main(String[] args) {
        Test01 test01 = new Test01();

        test01.variableChanges(5, 3);
        test01.print();
        System.out.println("sum = " + test01.sum());

    }
}
