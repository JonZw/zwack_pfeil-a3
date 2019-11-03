package de.unihd.isw.zwack_pfeil_a3.data;
import java.util.ArrayList;
import java.util.List;

public class Trainer {

    private String firstName;
    private String lastName;
    private List<Pokemon> pokemons = new ArrayList<>();

    //Constructors
    public Trainer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Trainer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    //Getter
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public List<Pokemon> getPokemons() { return pokemons; }

    //Setter
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    //popPokemon for Swap
    public Pokemon popPokemon (Pokemon pokemon) {
        for (Pokemon x: pokemons) {
            if(x == pokemon) {
                Pokemon toReturn;
                toReturn = x;
                pokemons.remove(x);
                return toReturn;
            }
        }
        return null;
    }

    //add Pokemon to Trainer
    public void addPokemon (Pokemon newPokemon){
        if (newPokemon != null) {
            newPokemon.setTrainer(this);
            this.pokemons.add(newPokemon);
        }
    }

    public Pokemon getPokemon(int index) {
        return pokemons.get(index);
    }

    //get statt prints
    public List<Pokemon> getPokemonsOfType(Type type) {
        List<Pokemon> pokemonsOfType = new ArrayList<>();
        for (Pokemon p : getPokemons()) {
            if (p.getType() == type) {
                pokemonsOfType.add(p);
            }
        }
        return pokemonsOfType;
    }

}
