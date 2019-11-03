package de.unihd.isw.zwack_pfeil_a3.data;

import java.util.ArrayList;
import java.util.List;

public class PokemonTest {

    public static void main(String[] args) {

        String p1name = "p1_name";
        Type p1type = Type.FIRE;
        boolean bool = true;
        Pokemon p1 = new Pokemon(p1name, p1type, bool);

        String p2name = "p2_name";
        Type p2type = Type.WATER;
        Pokemon p2 = new Pokemon(p2name, p2type, bool);

        String p3name = "p3_name";
        Type p3type = Type.POISON;
        Pokemon p3 = new Pokemon(p3name, p3type, bool);

        String t1firstname = "t1_firstname";
        String t1lastname = "t1_lastname";

        String t2firstname = "t2_firstname";
        String t2lastname = "t2_lastname";
        Trainer t2 = new Trainer(t2firstname, t2lastname);


        // Test of getter of name
        System.out.println();
        System.out.println("Testen von getName");
        System.out.println("Name von Pokemon p1:");
        System.out.println(p1.getName());
        if (!p1name.equals(p1.getName())){
            System.err.println("getName is not working correctly!");
        }
        // Test of getter of type
        System.out.println();
        System.out.println("Testen von getType");
        System.out.println("Typ von Pokemon p1:");
        System.out.println(p1.getType());
        if (!p1type.equals(p1.getType())){
            System.err.println("getType is not working correctly!");
        }

        //Test of toString()
        System.out.println();
        System.out.println("Testen von \"toString\"");

        String correctString = "";
        correctString += "Name: " + p1.getName() + "\n";
        correctString += "Type: " + p1.getType() + "\n";
        correctString += "Number: " + p1.getNumber();

        String testString = p1.toString();
        System.out.println(testString);
        if (!testString.equals(correctString)) {
            System.err.println("toString is not working correctly!");
        }


        // Test of setter of name
        System.out.println();
        System.out.println("Testen von setName");
        System.out.println("Vorheriger Name: ");
        System.out.println(p1name);
        p1.setName("newName");
        System.out.println("Name nach setName(\"newName\") ");
        System.out.println(p1.getName());
        if (!p1.getName().equals("newName")){
            System.err.println("setName is not working correctly!");
        }
        // Test of setter of type
        System.out.println();
        System.out.println("Testen von setType");
        System.out.println("Vorheriger Typ: ");
        System.out.println(p1type);
        p1.setType(Type.WATER);
        System.out.println("Typ nach setType(Type.WATER) ");
        System.out.println(p1.getType());
        if (p1.getType() != Type.WATER){
            System.err.println("setType is not working correctly!");
        }

        //-----------------Tests zu AUFGABE 2.1-----------------------

        //Test all functions of class "Trainer":

        //Construktor:
        System.out.println();
        System.out.println("Testen des Konstruktors, der Getter-Funktionen für fistname und lastname der Klasse Trainer");
        Trainer t1 = new Trainer(t1firstname, t1lastname);

        //Getter für firstname
        System.out.println();
        System.out.println("firstname von Trainer t1 ist:");
        System.out.println(t1.getFirstName());
        if ( !(t1.getFirstName().equals(t1firstname))){
            System.err.println("Constructor(String firstname, String lastName or Trainer.getFirstName is not working correctly)");
        }

        //Getter für lastname
        System.out.println();
        System.out.println("lastname von Trainer t1 ist:");
        System.out.println(t1.getLastName());
        if ( !(t1.getLastName().equals(t1lastname))){
            System.err.println("Constructor(String firstname, String lastName or Trainer.getLasttName is not working correctly)");
        }



        //teste "addPokemon()" und "getPokemons()"
        System.out.println();
        System.out.println("Testen der Funktionen addPokemon() und getPokemons der Klasse Trainer");
        System.out.println("folgende Pokemons werden dem Trainer t1 hinzugefügt:");
        System.out.println(p2.getName());
        t1.addPokemon(p2);
        System.out.println(p3.getName());
        t1.addPokemon(p3);

        ArrayList<Pokemon> compareArray = new ArrayList<>();
        compareArray.add(p2);
        compareArray.add(p3);
        System.out.println("folgende Pokemon gehören nun Trainer t1:");

        List<Pokemon> testpokemons = t1.getPokemons();
        for (int i=0; i < testpokemons.size(); i++){
            System.out.println(testpokemons.get(i).getName());
        }

        if (! t1.getPokemons().equals(compareArray)){
            System.err.println("addPokemon or addPokemon of Class Trainer does not work correctly!");
        }

        System.out.println("Teste ob auch für alle Pokemon je deren Membervariable trainer aktualisiert wurde:");
        for (int i = 0; i < testpokemons.size(); i++){
            System.out.println(testpokemons.get(i).getTrainer().getFirstName() + " " + testpokemons.get(i).getTrainer().getLastName());
        }

        // Test getPokemon(index)
        System.out.println();
        System.out.println("Testen von getPokemon(index)");
        System.out.println("Das 2. Pokemon von Trainer t1 (Index 1)");
        System.out.println(t1.getPokemon(1));

        // Test getPokemonOfType(type)
        System.out.println();
        System.out.println("Testen von getPokemonOfType");
        System.out.println("Pokemon von Trainer t1 vom Typ Water:");
        System.out.println(t1.getPokemonsOfType(Type.WATER));


        //teste Pokemon.setTrainer() !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        System.out.println();
        System.out.println("Testen von Pokemon.setTrainer und Pokemon.getTrainer");
        p1.setTrainer(t2);
        System.out.println("Trainer von Pokemon p1 VOR ändern des Trainer zu t1:");
        System.out.println(p1.getTrainer().getFirstName());
        System.out.println("Trainer von Pokemon p1 NACH ändern des Trainer zu t1:");
        p1.setTrainer(t1);
        System.out.println(p1.getTrainer().getFirstName());

        //-----------------Tests zu AUFGABE 2.2-----------------------


        //Test all functions of class "Swap":


        //Constructor Swap test
        System.out.println();
        System.out.println("Testen des Konstruktors und der Funktionen get.ID, get.Date der Klasse Swap");
        Swap swap1 = new Swap();


        //getDate test
        System.out.println();
        System.out.println("Datum des Swaps ist: ");
        System.out.println(swap1.getDate());


        //getId Test
        System.out.println();
        System.out.println("ID des Swaps ist: ");
        System.out.println(swap1.getId());

        //normal execute test
        Pokemon p4 = new Pokemon("squirtle", Type.POISON, true);
        Pokemon p5 = new Pokemon("not-squirtle", Type.FIRE, true);
        Trainer t4 = new Trainer ("t4", "trainer");
        Trainer t5 = new Trainer ("t5", "trainer");
        p4.setTrainer(t4);
        p5.setTrainer(t5);
        System.out.println();
        String exectest = "Name des ersten Pokemon: ";
        System.out.println("Testen einer durchführbaren execute() Funktion: ");
        System.out.println(exectest +p4.getName() + " mit zugehörigen Trainer: " + p4.getTrainer());
        System.out.println(exectest +p5.getName() + " mit zugehörigen Trainer: " + p5.getTrainer());
        swap1.execute(p4, p5);
        System.out.println(exectest + p4.getName() + " mit neuen Trainer: " + p4.getTrainer());
        System.out.println(exectest +p4.getName() + " mit neuen Trainer: " + p5.getTrainer());


        //execute with same trainer
        System.out.println();
        Swap swap2 = new Swap();
        System.out.println("Testen eines execute() mit den gleichen Trainer: ");
        Pokemon p6 = new Pokemon("squirtle from same trainer", Type.WATER, true);
        p6.setTrainer(t4);
        System.out.println("Pokemons benutzt: " + p4.getName() + " und " + p6.getName());
        swap2.execute(p4, p6);


        //execute() with no trainer
        Swap swap3 = new Swap();
        System.out.println();
        System.out.println("Testen eines execute() mit einem Pokemon ohne zugehörigen Trainer");
        Pokemon p7 = new Pokemon("yet another squirtle", Type.WATER, true);
        swap3.execute(p4,p7);


        //execute() with 2nd Pokemon not allowed to trade
        Swap swap4 = new Swap();
        System.out.println("Testen eines execute() mit zweiten Pokemon ohne Erlaubnis zu swappen:");
        p5.setSwapAllow(false);
        swap4.execute(p4,p5);

        //execute() wit 1st Pokemon not allowwed to trade
        Swap swap5 = new Swap();
        p5.setSwapAllow(true);
        p4.setSwapAllow(false);
        System.out.println("Testen eines execute() mit ersten Pokemon ohne Erlaubnis zu swappen:");
        swap5.execute(p4,p5);

        //execute() wit no Pokeom allowed to trade
        Swap swap6 = new Swap();
        p5.setSwapAllow(false);
        System.out.println("Testen eines execute() mit beiden Pokemon ohne Erlaubnis zu swappen:");
        swap6.execute(p4,p5);

        //Resetting for next tests
        p4.setSwapAllow(true);
        p5.setSwapAllow(true);
        swap1.execute(p4,p5);


        //getPokemon1 test
        System.out.println();
        System.out.println("Testen von getPokemon1(): ");
        System.out.println("Name von dem Pokemon: " + p4.getName());
        System.out.println("Name des durch getPokemon1() angegebenen Name: " + swap1.getPokemon1());

        //getPokemon2 test
        System.out.println();
        System.out.println("Testen von getPokemon2(): ");
        System.out.println("Name von dem Pokemon: " + p5.getName());
        System.out.println("Name des durch getPokemon1() angegebenen Name: " + swap1.getPokemon2());

        //getTrainer1 test
        System.out.println();
        System.out.println("Testen von getTrainer1(): ");
        System.out.println("Namen von Trainer: " + p4.getTrainer());
        System.out.println("Name des durch getTrainer1() angegebenen Name: " + swap1.getTrainer1());

        //get Trainer2 test
        System.out.println();
        System.out.println("Testen von getTrainer2(): ");
        System.out.println("Namen von Trainer: " + p5.getTrainer());
        System.out.println("Name des durch getTrainer2() angegebenen Name: " + swap1.getTrainer2());



        //------------------Tests zur Aufgabe 3.1--------------------------------------------------

        Competition comp = new Competition();
        String nam1 = "TObj1";
        String nam2 = "TObj2";
        Pokemon pok1 = new Pokemon(nam1, Type.FIRE, false);
        Pokemon pok2 = new Pokemon(nam2, Type.POISON, false);

        String firstn1 = "TTrain1";
        String firstn2 = "TTrain2";
        String lastnam = "...";
        Trainer trai1 = new Trainer(firstn1, lastnam);
        Trainer trai2 = new Trainer(firstn2, lastnam);

        pok1.setTrainer(trai1);
        pok2.setTrainer(trai1);

        //Testen bei gleichen Trainer
        System.out.println();
        System.out.println("Testen der execute() Funktion von der Klasse Competitions mit gleichen Trainer: ");
        comp.execute(pok1, pok2);

        //Testen bei einem gültigen Versuch
        System.out.println();
        System.out.println("Testen der execute() Funktion von der Klasse mit gültiger EIngabe: ");
        pok2.setTrainer(trai2);
        comp.execute(pok1, pok2);

        //Testen bei gleichen Typ
        System.out.println();
        System.out.println("Testen der execute() Funktion von der Klasse mit gleichen Typ (ebenfalls gültige Eingabe, ändert sich bei jeden Versuch): ");
        pok2.setType(Type.FIRE);
        comp.execute(pok1, pok2);


    }

}
