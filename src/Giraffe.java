public class Giraffe extends Creature{

    private String name;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setWeight(double weight) {

    }

    @Override
    public String getWeight() {
        return null;
    }
}
