package com.example.dbflowtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.raizlabs.android.dbflow.config.FlowManager;

import java.util.List;

import static com.example.dbflowtest.MyUtil.delete;
import static com.example.dbflowtest.MyUtil.insert;
import static com.example.dbflowtest.MyUtil.selectAll;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FlowManager.init(this);
        insert();
        List<Student> students = selectAll();
        for (int i=0; i< students.size(); i++){
            Student student = students.get(i);
            System.out.println("姓名："+student.name
                                +"年龄"+student.age);
        }
        //update();
        //selectAll();
        // delete();
        //selectAll();
    }
}
