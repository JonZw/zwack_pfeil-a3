package de.unihd.isw.zwack_pfeil_a3.data;
import java.util.ArrayList;
import java.util.List;

public class Pokemon {
    private String name;
    private Type type;
    private int number = nextNumber;
    private static int nextNumber = 0;
    private Trainer trainer = null;
    private ArrayList<Swap> swaps = new ArrayList<>();
    private List<Pokemon> competitions = new ArrayList<>();
    private boolean swapAllow;


    //Getter
    public String getName() {
        return this.name;
    }
    public Type getType() {
        return this.type;
    }
    public int getNumber(){
        return this.number;
    }
    public Trainer getTrainer() { return trainer; }
    public boolean getSwapAllow() {
        return swapAllow;
    }
    public List<Swap> getSwaps() {
        return swaps;
    }
    public List<Pokemon> getCompetitions() {return this.competitions;}
    //Setter
    //"this" is a reference to the current object whose method is called.
    public void setName(String name) {
        this.name = name;
    }
    public void setType(Type type) {
        this.type = type;
    }
    public void setTrainer(Trainer trainer) { this.trainer = trainer; }
    public void setSwapAllow(boolean swapAllow) {
        this.swapAllow = swapAllow;
    }

    //Constructors:
    public Pokemon(){
        number = nextNumber;
        nextNumber++;
    }
    public void addSwap(Swap swap) {
        this.swaps.add(swap);
    }

    public void addCompetition(Pokemon p){ this.competitions.add(p); }

    public Pokemon(String newName, Type newType, boolean sAllow){
        name = newName;
        type = newType;
        number = nextNumber;
        nextNumber++;
        this.swapAllow = sAllow;

    }

    public String toString(){
        String string = "";
        string += "Name: " + this.name + "\n";
        string += "Type: " + this.type + "\n";
        string += "Number: " + this.number;

        return string;
    }

}
