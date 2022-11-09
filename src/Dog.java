public class Dog extends Animal{
    public void digHole(){
        System.out.println("Dug a Hole");
    }

    public Dog(){
        super();

        setSound("Bark");

        flyingType = new CantFly();
    }

    private void bePrivate(){
        System.out.println("I am a private Method");
    }

    public void accessPrivate(){
        bePrivate();
    }
}
