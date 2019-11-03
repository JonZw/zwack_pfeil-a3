package de.unihd.isw.zwack_pfeil_a3.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import de.unihd.isw.zwack_pfeil_a3.R;
import de.unihd.isw.zwack_pfeil_a3.adapter.SimpleStringAdapter;
import de.unihd.isw.zwack_pfeil_a3.data.Competition;
import de.unihd.isw.zwack_pfeil_a3.data.Pokemon;
import de.unihd.isw.zwack_pfeil_a3.data.Swap;
import de.unihd.isw.zwack_pfeil_a3.data.Trainer;
import de.unihd.isw.zwack_pfeil_a3.data.Type;

public class MainActivity extends AppCompatActivity {

    private RecyclerView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = findViewById(R.id.list);
        setupList();
    }

    private static List<Pokemon> createSampleData() {
        final String sample = "Hello darkness, my old friend I've come to talk with you again";
        final String[] words = sample.split(" ");
        ArrayList<Pokemon> pokeList = new ArrayList<>();

        Pokemon p0 = new Pokemon("Pikachu", Type.POISON, true);
        Pokemon p1 = new Pokemon("Carapuce", Type.WATER, true);
        Pokemon p2 = new Pokemon("Raupy", Type.FIRE, true);
        Trainer t0 = new Trainer("Peter", "Lustig");
        Trainer t1 = new Trainer("Ally", "Traurig");

        t0.addPokemon(p0);
        t0.addPokemon(p1);
        t1.addPokemon(p2);

        Swap swap0 = new Swap();
        swap0.execute(p0, p2);

        Competition comp0 = new Competition();
        comp0.execute(p0, p1);

        pokeList.add(p0);
        pokeList.add(p1);
        pokeList.add(p2);
        return pokeList;
    }

    private RecyclerView.LayoutManager createLayoutManager(final Context context) {
        final LinearLayoutManager manager = new LinearLayoutManager(context);
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        return manager;
    }

    private void setupList() {
        //SimpleStringAdapter.setOnItemClick(row -> Toast.makeText(this, row, Toast.LENGTH_SHORT).show());
        final List<Pokemon> data = createSampleData();
        final SimpleStringAdapter adapter = new SimpleStringAdapter(this, data);
        final RecyclerView.LayoutManager manager = createLayoutManager(this);

        list.setLayoutManager(manager);
        list.setAdapter(adapter);
    }
}