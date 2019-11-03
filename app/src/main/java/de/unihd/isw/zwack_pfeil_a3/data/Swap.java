package de.unihd.isw.zwack_pfeil_a3.data;
import java.util.Date;

public class Swap {

    private Pokemon pokemon1;
    private Pokemon pokemon2;
    private Trainer trainer1;
    private Trainer trainer2;
    private Date date;
    private String id;

    public Swap (){
        this.date = new Date();
        this.id = "ID: " + this.date.toString();
    }
    public void execute(Pokemon p1, Pokemon p2) {

        this.pokemon1 = p1;
        this.pokemon2 = p2;
        this.trainer1 = p1.getTrainer();
        this.trainer2 = p2.getTrainer();

        if (!pokemon1.getSwapAllow()) {
            System.err.println("Pokemon " +pokemon1.getName() + "is not open for trade!");
        }
        if (!pokemon2.getSwapAllow()) {
            System.err.println("Pokemon " +pokemon2.getName() + "is not open for trade!");
        }
        else if (pokemon1.getSwapAllow() && pokemon2.getSwapAllow()) {
            if (pokemon1.getTrainer() == null) {
                System.err.println("Pokemon has not trainer");
            }
            if (pokemon2.getTrainer() == null) {
                System.err.println("Pokemon has no trainer");
            } else {

                if (pokemon1.getTrainer() == pokemon2.getTrainer()) {
                    System.err.println("Warnung: Beide Pokemon haben den gleichen Trainer!");
                } else {
                    pokemon1.setTrainer(trainer2);
                    pokemon2.setTrainer(trainer1);

                    this.pokemon1.addSwap(this);
                    this.pokemon2.addSwap(this);

                    this.trainer1.popPokemon(pokemon1);
                    this.trainer2.popPokemon(pokemon2);
                }

            }
        }
    }


    //Getter of attributes
    public Pokemon getPokemon1() {
        return pokemon1;
    }

    public Pokemon getPokemon2() {
        return pokemon2;
    }


    public Trainer getTrainer1() {
        return trainer1;
    }

    public Trainer getTrainer2() {
        return trainer2;
    }

    public Date getDate() {
        return date;
    }

    public String getId() {
        return id;
    }
}