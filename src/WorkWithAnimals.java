public class WorkWithAnimals {

    int justANum;
    public static void main(String[] args) {
        Dog fido = new Dog();

        fido.setName("Fido");
        System.out.println(fido.getName());
        fido.digHole();
        fido.setWeight(-1);

        System.out.println(fido.getName());
        changeObjectName(fido);
        System.out.println(fido.getName());

        Animal doggy =  new Dog();
        Animal kitty = new Cat();

        System.out.println("Doggy says " + doggy.getSound());
        System.out.println("Doggy says " + kitty.getSound());

        Animal[] animals = new Animal[4];
        animals[0]= doggy;
        animals[1]=kitty;

        System.out.println("Doggy says "+animals[0].getSound());
        System.out.println("Doggy says "+animals[1].getSound());

        speakAnimal(doggy);

        ((Dog)doggy).digHole();

        fido.accessPrivate();

        Giraffe giraffe = new Giraffe();
        giraffe.setName("Frank");
        System.out.println(giraffe.getName());






    }

    public static void changeObjectName (Dog fido){
        fido.setName("Marcus");
    }

    public static void speakAnimal(Animal randAnimal){
        System.out.println("Animal says: " + randAnimal.getSound());
    }

    public void sayHello(){
        System.out.println("Hello");
    }
}