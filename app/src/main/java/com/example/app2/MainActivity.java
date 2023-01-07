package com.example.app2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements itemclick {

    List<Students> Name;
    RecyclerView rvlist;
    Studentslisradapter studentslisradapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvlist=findViewById(R.id.rvlist);
        Name =new ArrayList<>();



        Name.add(new Students("riz","1654654","jhfjgds"));
        Name.add(new Students("riz","1654654","jhfjgds"));
        Name.add(new Students("riz","1654654","jhfjgds"));
        Name.add(new Students("riz","1654654","jhfjgds"));
        Name.add(new Students("dgklg","1654654","jhfjgds"));
        Name.add(new Students("riz","1654654","jhfjgds"));
        Name.add(new Students("riz","1654654","jhfjgds"));
        Name.add(new Students("ldgldgjdg","1654654","jhfjgds"));
        Name.add(new Students("riz","1654654","jhfjgds"));
        Name.add(new Students("riz","1654654","jhfjgds"));
        Name.add(new Students("dgjdojgodgd","1654654","jhfjgds"));
        Name.add(new Students("riz","1654654","jhfjgds"));
        Name.add(new Students("riz","1654654","jhfjgds"));
        Name.add(new Students("riz","1654654","jhfjgds"));
        Name.add(new Students("riz","1654654","jhfjgds"));
        Name.add(new Students("riz","1654654","jhfjgds"));
        Name.add(new Students("riz","1654654","jhfjgds"));
        Name.add(new Students("riz","1654654","jhfjgds"));
        Name.add(new Students("riz","1654654","jhfjgds"));
        Name.add(new Students("riz","1654654","jhfjgds"));
        studentslisradapter=new Studentslisradapter(Name,this);
        rvlist.setLayoutManager(new LinearLayoutManager(this));
        rvlist.setAdapter(studentslisradapter);
    }

    @Override
    public void itemclick() {
        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();

    }
}