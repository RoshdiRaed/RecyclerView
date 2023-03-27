package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyHolder> {
    Context c;
    ArrayList<Employee> employees;

    public MyAdapter(Context c, ArrayList<Employee> employees) {
        this.c = c;
        this.employees = employees;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(c).inflate(R.layout.emp_item,null,false);
        MyHolder mh = new MyHolder(v);
        return mh;
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {
        Employee e = employees.get(position);
        holder.tv_name.setText(e.getName());
        holder.tv_id.setText(e.getId());
        holder.tv_title.setText(e.getTitle());
        holder.img.setImageResource(e.getImage());
    }

    @Override
    public int getItemCount() {
        return employees.size();
    }

    class MyHolder extends RecyclerView.ViewHolder {

        TextView tv_name,tv_id,tv_title;
        ImageView img;

        public MyHolder(@NonNull View itemView) {
            super(itemView);
            tv_name = itemView.findViewById(R.id.textView);
            tv_id = itemView.findViewById(R.id.textView2);
            tv_title = itemView.findViewById(R.id.textView3);
            img = itemView.findViewById(R.id.imageView);

        }
    }

}
