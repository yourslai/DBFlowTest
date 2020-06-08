package com.example.dbflowtest;

import com.raizlabs.android.dbflow.config.FlowManager;
import com.raizlabs.android.dbflow.sql.language.SQLite;

import java.util.List;

public class MyUtil {

    //添加数据
    public static void insert(){
        Student student = new Student();
        student.id = 1;
        student.name = "xiaomin";
        student.age = 23;

        FlowManager.getModelAdapter(Student.class).insert(student);
        System.out.println("添加数据成功!");
    }
    //修改数据
    public static void update(){
        Student student = SQLite.select()
                .from(Student.class)
                .where(Student_Table.name.eq("xiaomin"))
                .querySingle();
        if(student != null){
            student.name = "xiaohong";
            student.update();
            System.out.println("修改数据成功！");
        }
        
    }

    //查询全部
    public static List<Student> selectAll(){
        List<Student> studnets = SQLite.select()
                .from(Student.class)
                .where()
                .queryList();//返回的list不为空，可能为empty
        return studnets;
    }

    //删除数据
    public static void delete(){
        Student student = SQLite.select()
                .from(Student.class)
                .where(Student_Table.name.eq("xiaomin"))
                .querySingle();
        if(student != null){
            student.delete();
            System.out.println("删除数据成功！");
        }
    }
}
