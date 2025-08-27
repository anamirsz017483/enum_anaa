public class ConstrutorAnimal {
    public static void main(String [] args) {
        Animal animal1 = new Animal();
    Animal animal2 = new Animal(5 );
    Animal animal3 = new Animal(5, "marrom");

    System.out.println("-----animal1-----");
    System.out.println("-----animal2-----");
    System.out.println("tamanho"+animal2.getTamanho());
    System.out.println("-----animal3-----");
    System.out.println("tamanho"+animal3.getTamanho());
    System.out.println("cor"+animal3.getCor());
    }
}