package Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fistyfy.ProductDetails;
import com.example.fistyfy.R;

import java.util.ArrayList;

import Model.CocoProductListGridmodel;


public class CocoProductListGrideAdapter extends RecyclerView.Adapter<CocoProductListGrideAdapter.ViewHolder> {
    private Context context;
    private ArrayList<CocoProductListGridmodel> models;

    public CocoProductListGrideAdapter(Context context, ArrayList<CocoProductListGridmodel> models) {
        this.context = context;
        this.models = models;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_coco_product_list_grid,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, int position) {
        holder.mobi.setImageResource(models.get(position).getMobi());
        holder.mobi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(context, ProductDetails.class);
                context.startActivity(i);
            }
        });
    }
    @Override
    public int getItemCount() {
        return models.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView mobi;
        public ViewHolder(View itemView) {
            super(itemView);
            mobi = itemView.findViewById(R.id.mobi);
        }
    }
}