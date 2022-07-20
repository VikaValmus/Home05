package home05.epam.task05.test02;

//Создйте класс Test2 двумя переменными.
//Добавьте конструктор с входными параметрами.
//Добавьте конструктор, инициализирующий члены класса по умолчанию.
//Добавьте set- и get- методы для полей экземпляра класса.

public class Test02 {
    private int x;
    private int y;

    public Test02() {
        x = 3;
        y = 6;
    }
    public Test02(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
