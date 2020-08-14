package com.example.hotel;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class VerticalRVAdapter extends RecyclerView.Adapter<VerticalRVAdapter.VerticalRVViewHolder> {
    Context context;
    ArrayList<VerticalModel> arrayList;

    public VerticalRVAdapter(Context context, ArrayList<VerticalModel> arrayList) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public VerticalRVViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_vertical, parent, false);
        return new VerticalRVViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull VerticalRVViewHolder holder, int position) {
        final VerticalModel verticalModel = arrayList.get(position);
        String title = verticalModel.getTitle();
        ArrayList<HorizontalModel> singleItem = verticalModel.getArrayList();

        holder.tvtitle.setText(title);
        HorizontalRVAdapter HRV = new HorizontalRVAdapter(context, singleItem);
        holder.rv.setHasFixedSize(true);
        holder.rv.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
        holder.rv.setAdapter(HRV);
        holder.btnMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, verticalModel.getTitle(), Toast.LENGTH_SHORT).show();

            }
        });
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class VerticalRVViewHolder extends RecyclerView.ViewHolder {
        RecyclerView rv;
        TextView tvtitle;
        Button btnMore;

        public VerticalRVViewHolder(@NonNull View itemView) {
            super(itemView);
            rv = (RecyclerView) itemView.findViewById(R.id.recyclerView1);
            tvtitle = (TextView) itemView.findViewById(R.id.title2);
            btnMore = (Button) itemView.findViewById(R.id.btnMore);

        }
    }
}

