package com.pk4u.e_commerce;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import com.pk4u.e_commerce.adapter.CategoryAdapter;
import com.pk4u.e_commerce.adapter.CourseAdapter;
import com.pk4u.e_commerce.model.Category;
import com.pk4u.e_commerce.model.Course;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView categoryRecycler,courseRecycler;
    CategoryAdapter categotyAdapter;
    CourseAdapter courseAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Category> categoryList = new ArrayList<>();
        categoryList.add(new Category(1, "Игры"));
        categoryList.add(new Category(2, "Сайты"));
        categoryList.add(new Category(3, "Языки"));
        categoryList.add(new Category(4, "Прочее"));

        setCategoryRecycler(categoryList);

        List<Course> courseList = new ArrayList<>();
        courseList.add(new Course(1, "java","Профессия Java\nразработчик", "1 января", "начальный","#424345","test"));
        courseList.add(new Course(2, "python","Профессия Python\nразработчик", "10 января", "начальный","#9FA52D","test"));

        setCourseRecycler(courseList);
    }

    private void setCourseRecycler(List<Course> courseList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);

        courseRecycler= findViewById(R.id.courseRecycler);
        courseRecycler.setLayoutManager(layoutManager);

        courseAdapter = new CourseAdapter(this,courseList);
        courseRecycler.setAdapter(courseAdapter);
    }

    private void setCategoryRecycler(List<Category> categoryList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);

        categoryRecycler= findViewById(R.id.categoryRecycler);
        categoryRecycler.setLayoutManager(layoutManager);

        categotyAdapter = new CategoryAdapter(this,categoryList);
        categoryRecycler.setAdapter(categotyAdapter);
    }
}