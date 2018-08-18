package com.akaprod.agung.blablagit;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class customAdapter extends RecyclerView.Adapter<customAdapter.ViewHolder> {

    private Context context;
    private List<dataModel> model;

    public customAdapter(Context context, List<dataModel> model) {
        this.context = context;
        this.model = model;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.template,parent,false);
        ViewHolder vw = new ViewHolder(v);

        return vw;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        dataModel dm = model.get(position);
        holder.t1.setText(dm.getTy().toString());
        holder.t2.setText(dm.getDe().toString());
        holder.t3.setText(dm.getEx().toString());

    }

    @Override
    public int getItemCount() {
        return model.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView t1, t2, t3;

        public ViewHolder(View itemView) {
            super(itemView);

            t1 = (TextView)itemView.findViewById(R.id.tipe);
            t2 = (TextView)itemView.findViewById(R.id.definition);
            t3 = (TextView)itemView.findViewById(R.id.example);
        }
    }
}
