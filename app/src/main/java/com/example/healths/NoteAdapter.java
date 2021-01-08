package com.example.healths;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.google.android.material.card.MaterialCardView;

import java.util.ArrayList;
import java.util.List;

public class NoteAdapter  extends RecyclerView.Adapter<NoteAdapter.NoteHolder>{
 private List<Note> notes = new ArrayList<>();
 private Context context;
 public static final String BREAKFAST_ID ="break_fast_name";

    public NoteAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public NoteHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
             View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.break_fast_list,parent,false);
        return new NoteHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NoteHolder holder, int position) {
        Note currentNotes = notes.get(position);
        holder.txt_Breakfast_name.setText(currentNotes.getTitle());
        holder.txt_short_disc.setText(currentNotes.getDescription());
        Glide.with(context)
                .asBitmap()
                .load(currentNotes.getImageUrl())
                .into(holder.imageView);

        holder.parent.setOnClickListener(v -> {
            Intent intent = new Intent(context,BreakFastDetailActivity.class);
            intent.putExtra(BREAKFAST_ID,notes.get(position).getId());
            context.startActivity(intent);
        });

    }

    @Override
    public int getItemCount() {
        return notes.size();
    }

    public void setNotes(List<Note> notes) {
        this.notes = notes;
        notifyDataSetChanged();
    }

    class NoteHolder extends RecyclerView.ViewHolder{
        MaterialCardView parent;
        ImageView imageView;
      TextView txt_Breakfast_name,txt_short_disc;
        public NoteHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.Breakfast_image);
            txt_Breakfast_name = itemView.findViewById(R.id.txt_Breakfast_name);
            txt_short_disc = itemView.findViewById(R.id.txt_short_disc);
            parent = itemView.findViewById(R.id.parent);
        }
    }
}
