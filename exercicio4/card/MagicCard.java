package card;

public abstract class MagicCard {
    protected String name;
    protected TypeSkill type;
    protected double cost;
    protected String effect;

    public TypeSkill getType () {
        return type;
    }

    public String getName () {
        return this.name;
    }

    public String getEffect () {
        return effect;
    }

    public double getCost (){
        return cost;
    }

    public MagicCard (String name, TypeSkill type, double cost, String effect) {
        this.name = name;
        this.type = type;
        this.cost = cost;
        this.effect = effect;
    }

}
