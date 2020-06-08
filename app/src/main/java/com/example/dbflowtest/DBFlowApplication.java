package com.example.dbflowtest;

import android.app.Application;

import com.raizlabs.android.dbflow.config.FlowManager;

import java.util.List;

import static com.example.dbflowtest.MyUtil.delete;
import static com.example.dbflowtest.MyUtil.insert;
import static com.example.dbflowtest.MyUtil.selectAll;
import static com.example.dbflowtest.MyUtil.update;

public class DBFlowApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
    }


}
