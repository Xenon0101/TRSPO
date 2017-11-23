package lab1;

abstract class Abs {
    void voice() {}
}

class Metal extends Abs {
    void voice() {
        System.out.println("МИТООООЛ!!!");
    }
}

class Pop extends Abs {
    void voice() {
        System.out.println("Ля-ля-ля...");
    }
}

class Opera extends Abs {
    void voice() {
        System.out.println("о-о-а-а-а-а-о-а-у-э");
    }
}

class Main {
    public static void main(String[] args) {
        Abs m = new Metal();
        Abs p = new Pop();
        Abs c = new Opera();
        m.voice();
        p.voice();
        c.voice();
    }
}