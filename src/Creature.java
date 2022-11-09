abstract public class Creature {
    protected String name;
    protected double weight;
    protected String sound;

    //all abstract methods must be overwritten

    public abstract void setName(String name);
    public abstract String getName();

    public abstract void setWeight(double weight);
    public abstract String getWeight();

}
