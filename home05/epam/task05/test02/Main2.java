package home05.epam.task05.test02;

public class Main2 {
    public static void main(String[] args) {
        Test02 test02 = new Test02(6, 7);


        Test02 tes = new Test02();

        tes.setX(3);
        tes.setY(5);

        System.out.println("x = " + tes.getX());
        System.out.println("y = " + tes.getY());


    }
}
