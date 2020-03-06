package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers2);
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("ONE","LUTTI"));
        words.add(new Word("TWO","OTIIKO"));
        words.add(new Word("THREE","TOLOKOOSU"));
        words.add(new Word("FOUR","OYYISA"));
        words.add(new Word("FIVE","MASSOKKA"));
        words.add(new Word("SIX","TEMMOKKA"));
        words.add(new Word("SEVEN","KENEKAKU"));
        words.add(new Word("EIGHT","KAWINTA"));
        words.add(new Word("NINE","WO'E"));
        words.add(new Word("TEN","NA'AACHA"));


        WordAdapter itemAdapter = new WordAdapter(this,words);
        ListView gridview = (ListView) findViewById(R.id.list);

        gridview.setAdapter(itemAdapter);





    }
}
