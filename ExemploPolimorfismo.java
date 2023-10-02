class Animal {
    public void fazerSom() {
        System.out.println("Animal faz um som.");
    }
}

class Cachorro extends Animal {
    @Override
    public void fazerSom() {
        System.out.println("Cachorro late.");
    }
}

class Gato extends Animal {
    @Override
    public void fazerSom() {
        System.out.println("Gato mia.");
    }
}

public class ExemploPolimorfismo {
    public static void main(String[] args) {
        Animal animal1 = new Cachorro();
        Animal animal2 = new Gato();

        animal1.fazerSom(); // Output: Cachorro late.
        animal2.fazerSom(); // Output: Gato mia.
    }
}