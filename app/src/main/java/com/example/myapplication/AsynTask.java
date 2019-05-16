package com.example.myapplication;

import android.os.AsyncTask;

import com.example.myapplication.model.Student;

import java.sql.Date;


public class AsynTask extends AsyncTask<MainActivity,Void, Void>
{
   private final static String[] random_name={"Vasiliev Vasya Vasilyevich","Matushkina Arina Sergeevna","Nuzambekov Nuzambek Shotovich","Ponomareva Maria Nikolavna","Klochkov Dmitry Denisovich"};

    public static String[] getRandom_name() {
        return random_name;
    }

    @Override
    protected Void doInBackground(MainActivity... splasches) {

        //Keys[] k =JsonLoader.getData();
        MainActivity m=splasches[0];
        //m.CallMainAndDie(k.clone());
        AppDatabase db= AppDatabase.getDatabace(m);


        m.CallMainAndDie();

        return null;


    }

    @Override
    protected void onPostExecute(Void v)
    {

    }
}
