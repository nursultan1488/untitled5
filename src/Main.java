// Интерфейс Printable
interface Printable {
    void print();
}

// 1-й класс - родительский класс
class ParentClass {
    private int id;

    public ParentClass(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}

// 2-й класс - дочерний класс
class SecondClass extends ParentClass implements Printable {
    private String name;

    public SecondClass(int id, String name) {
        super(id);
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("SecondClass - ID: " + getId() + ", Name: " + name);
    }
}

// 3-й класс - дочерний класс
class ThirdClass extends ParentClass implements Printable {
    private String description;

    public ThirdClass(int id, String description) {
        super(id);
        this.description = description;
    }

    @Override
    public void print() {
        System.out.println("ThirdClass - ID: " + getId() + ", Description: " + description);
    }
}

// 4-й класс - дочерний класс
class FourthClass extends ParentClass implements Printable {
    private String status;

    public FourthClass(int id, String status) {
        super(id);
        this.status = status;
    }

    @Override
    public void print() {
        System.out.println("FourthClass - ID: " + getId() + ", Status: " + status);
    }
}

// Главный класс
public class Main {
    public static Printable createObject(String className) {
        switch (className) {
            case "2nd":
                return new SecondClass(1, "Second Object");
            case "3rd":
                return new ThirdClass(2, "Third Object Description");
            case "4th":
                return new FourthClass(3, "Fourth Object Status");
            default:
                return null;
        }
    }

    public static void main(String[] args) {
        Printable object2 = createObject("2nd");
        Printable object3 = createObject("3rd");
        Printable object4 = createObject("4th");

        Printable[] objects = {object2, object3, object4};

        for (Printable obj : objects) {
            obj.print();
        }
    }
}
