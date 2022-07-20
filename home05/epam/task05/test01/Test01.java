package home05.epam.task05.test01;

//Создайте класс Test1 двумя переменными.
// Добавьте метод вывода на экран и методы изменения этих переменных.
// Добавьте метод, который находит сумму значений этих переменных,
// и метод, который находит наибольшее значение из этих двух переменных.

public class Test01 {
    private int x;
    private int y;

    public void print() {
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }

    public void variableChanges(int _x, int _y) {
        x = _x;
        y = _y;
    }

    public int sum() {
        int sum = x + y;
        return sum;
    }

    public int max() {
        int max = Math.max(x, y);
        return max;
    }

}
