package com.pk4u.e_commerce.adapter;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.pk4u.e_commerce.CoursePage;
import com.pk4u.e_commerce.R;
import com.pk4u.e_commerce.model.Course;

import java.util.List;

public class CourseAdapter extends RecyclerView.Adapter<CourseAdapter.CourseViewHolder> {

    Context context;
    List<Course> corses;

    @NonNull
    @Override
    public CourseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View courseItems = LayoutInflater.from(context).inflate(R.layout.course_item,parent, false);
        return new CourseAdapter.CourseViewHolder(courseItems);
    }

    public CourseAdapter(Context context, List<Course> corses) {
        this.context = context;
        this.corses = corses;
    }

    @Override
    public void onBindViewHolder(@NonNull CourseViewHolder holder, int position) {
        holder.courseBg.setCardBackgroundColor(Color.parseColor(corses.get(position).getColor()));

        int imageId = context.getResources().getIdentifier("ic_" + corses.get(position).getImg(), "drawable", context.getPackageName());
        holder.courseImage.setImageResource(imageId);

        holder.courseTitle.setText(corses.get(position).getTitle());
        holder.courseDate.setText(corses.get(position).getDate());
        holder.courseLevel.setText(corses.get(position).getLevel());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, CoursePage.class);

                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation((Activity) context,new Pair<View,String>(holder.courseImage,"courseImage"));

                intent.putExtra("courseBg",Color.parseColor(corses.get(position).getColor()));
                intent.putExtra("courseImage",imageId);
                intent.putExtra("courseTitle",corses.get(position).getTitle());
                intent.putExtra("courseDate",corses.get(position).getDate());
                intent.putExtra("courseLevel",corses.get(position).getLevel());
                intent.putExtra("courseText",corses.get(position).getText());

                context.startActivity(intent,options.toBundle());
            }
        });
    }

    @Override
    public int getItemCount() {
        return corses.size();
    }

    public static final class CourseViewHolder extends RecyclerView.ViewHolder{

        CardView courseBg;
        ImageView courseImage;
        TextView courseTitle, courseDate, courseLevel;

        public CourseViewHolder(@NonNull View itemView) {
            super(itemView);

            courseBg = itemView.findViewById(R.id.courseBg);
            courseImage = itemView.findViewById(R.id.courseImage);
            courseTitle = itemView.findViewById(R.id.courseTitle);
            courseDate = itemView.findViewById(R.id.courseDate);
            courseLevel = itemView.findViewById(R.id.courseLevel);
            courseBg = itemView.findViewById(R.id.courseBg);
        }
    }
}
