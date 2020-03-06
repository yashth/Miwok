package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView number = (TextView) findViewById(R.id.numbers);
        number.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(view.getContext(),"Open the list of numbers",Toast.LENGTH_SHORT).show();
                Intent number_intent = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(number_intent);
            }
        });

        TextView family = (TextView) findViewById(R.id.family);
        family.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(view.getContext(),"Open the list of Family Members",Toast.LENGTH_SHORT).show();
                Intent family_intent = new Intent(MainActivity.this, FamilyActivity.class);
                startActivity(family_intent);
            }
        });

        TextView color = (TextView) findViewById(R.id.colors);
        color.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(view.getContext(),"Open the list of Color",Toast.LENGTH_SHORT).show();
                Intent color_intent = new Intent(MainActivity.this, ColorActivity.class);
                startActivity(color_intent);
            }
        });

        TextView phrase = (TextView) findViewById(R.id.phrases);
        phrase.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(view.getContext(),"Open the list of Phrases",Toast.LENGTH_SHORT).show();
                Intent phrase_intent = new Intent(MainActivity.this, PhraseActivity.class);
                startActivity(phrase_intent);
        }
        });

    }


}
