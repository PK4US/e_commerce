package com.pk4u.e_commerce.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.pk4u.e_commerce.R;
import com.pk4u.e_commerce.model.Category;
import java.util.List;

public class CategoryAdapter extends RecyclerView.Adapter <CategoryAdapter.CategoryViewHolder> {

    Context context;
    List<Category> categories;

    public CategoryAdapter(Context context, List<Category> categories) {
        this.context = context;
        this.categories = categories;
    }
    
    @Override
    @NonNull
    public CategoryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View categoryItems = LayoutInflater.from(context).inflate(R.layout.category_item,parent, false);
        return new CategoryViewHolder(categoryItems);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder holder, int position) {
        holder.categoryTitle.setText(categories.get(position).getTitle());
    }


    @Override
    public int getItemCount() {
        return categories.size();
    }

    public static final class CategoryViewHolder extends  RecyclerView.ViewHolder{
        TextView categoryTitle;

        public CategoryViewHolder( View itemView) {
            super(itemView);

            categoryTitle = itemView.findViewById(R.id.categoryTitle);
        }
    }

}
