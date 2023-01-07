package com.example.app2;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

public  class Studentslisradapter extends RecyclerView.Adapter<Studentslisradapter.MyViewHolder> {
    List <Students> studentsList;
    itemclick callback;

    public Studentslisradapter(List<Students> studentsList,itemclick cback) {
        this.studentsList = studentsList;
        this.callback=cback;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.studentslistitem,viewGroup,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {

        Students students=studentsList.get(i);
        myViewHolder.txtname.setText(students.getName());
        myViewHolder.txtemail.setText(students.getEmail());
        myViewHolder.btn.setText(students.getMobile());
        myViewHolder.btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              callback.itemclick();
            }
        });
    }

    @Override
    public int getItemCount() {
        return studentsList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{
        TextView txtname;
        TextView txtemail;
        Button btn;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            txtname=itemView.findViewById(R.id.textView);
            txtemail=itemView.findViewById(R.id.textView2);
            btn=itemView.findViewById(R.id.button);
        }
    }
}
