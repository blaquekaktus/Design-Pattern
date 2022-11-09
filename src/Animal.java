public class Animal {
    private String name;
    private double height;
    private int weight;
    private String sound;

    private String favFood;

    private double speed;

    public Flys flyingType;

    public void setName(String newName) {
        this.name = newName;
    }

    public String getName(){
        return name;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setWeight(int weight) {
        if(weight > 0) {
            this.weight = weight;
        }else{
            System.out.println("Weight must be more than 0");
        }
    }

    public int getWeight() {
        return weight;
    }

    public void setFavFood(String favFood) {
        this.favFood = favFood;
    }

    public String getFavFood() {
        return favFood;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }

    public String tryToFly(){
        return flyingType.fly();
    }

    public void setFlyingAbility(Flys flyingType){
        this.flyingType = flyingType;
    }
}
