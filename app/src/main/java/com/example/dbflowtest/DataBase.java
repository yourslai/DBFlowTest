package com.example.dbflowtest;



import com.raizlabs.android.dbflow.annotation.Database;

@Database(version = DataBase.VERSION,name = DataBase.NAME)
public class DataBase {
    public static final String NAME = "Database";

    public static final int VERSION = 1;
}
