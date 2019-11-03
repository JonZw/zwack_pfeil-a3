package de.unihd.isw.zwack_pfeil_a3.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.util.Consumer;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

import java.util.List;
import de.unihd.isw.zwack_pfeil_a3.R;
import de.unihd.isw.zwack_pfeil_a3.data.Pokemon;

public class SimpleStringAdapter extends Adapter<SimpleStringHolder> {
    private LayoutInflater inflater;
    private List<Pokemon> originalData;
   // private Consumer<String> onItemClick;

    public SimpleStringAdapter(final Context context, final List<Pokemon> originalData) {
        this.inflater = LayoutInflater.from(context);
        this.originalData = originalData;
    }

   /*private void onItemClick(final View view) {
        final ViewHolder holder = (ViewHolder) view.getTag();
        final int pos = holder.getAdapterPosition();
        final Pokemon elem = originalData.get(pos);
        if(onItemClick != null) {
            onItemClick.accept(elem);
        }
    }

    public void setOnItemClick(final Consumer<String> onItemClick) {
        this.onItemClick = onItemClick;
    }*/

    @NonNull
    @Override
    public SimpleStringHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new SimpleStringHolder(inflater.inflate(R.layout.listitem_string, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull SimpleStringHolder holder, int position) {
        holder.setTextFromPokemon(originalData.get(position));
    }

    @Override
    public int getItemCount() {
        return originalData.size();
    }
}

class SimpleStringHolder extends RecyclerView.ViewHolder {

    private final TextView textViewName;
    private final TextView textViewTyp;
    private final TextView textViewID;
    private final TextView textViewTrainerName;
    private final TextView textViewSwapCount;
    private final TextView textViewCompetitionCount;

    public SimpleStringHolder(@NonNull final View itemView) {
        super(itemView);
        textViewName = itemView.findViewById(R.id.textViewName);
        textViewTyp = itemView.findViewById(R.id.textViewTyp);
        textViewID = itemView.findViewById(R.id.textViewID);
        textViewTrainerName = itemView.findViewById(R.id.textViewTrainerName);
        textViewSwapCount = itemView.findViewById(R.id.textViewSwapCount);
        textViewCompetitionCount = itemView.findViewById(R.id.textViewCompetitionCount);
        itemView.setTag(this);
    }

    public void setTextFromPokemon(final Pokemon poke) {
        this.textViewName.setText(poke.getName());
        this.textViewID.setText(String.format("# %s", poke.getNumber()));
        this.textViewTyp.setText(poke.getType().toString());
        this.textViewTrainerName.setText(String.format("%s %s", poke.getTrainer().getFirstName(), poke.getTrainer().getLastName()));
        this.textViewCompetitionCount.setText(String.format("Competition: %s", poke.getCompetitions().size()));
    }
}