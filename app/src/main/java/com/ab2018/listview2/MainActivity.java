package com.ab2018.listview2;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends Activity {

    ArrayList<Movie> movies;
    ListView listim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("OnCreate", "list initialization");
        listim = findViewById(R.id.myList);

        // nerede gösterecem, nasil gösterecem, ne gösterecem sorularına cevap verir adaptör
        MovieAdapter adapter = new MovieAdapter(this,R.layout.movie_item, createDummyData());
        listim.setAdapter(adapter);

    }

    ArrayList<Movie> createDummyData()
    {
        movies = new ArrayList<Movie>();
        movies.add(0, new Movie(0, "Dunkirk", "abc", "en", R.drawable.dunkirk, 8.8));
        movies.add(0, new Movie(1, "It", "abc", "tr", R.drawable.it, 7.6));
        return movies;
    }
}
