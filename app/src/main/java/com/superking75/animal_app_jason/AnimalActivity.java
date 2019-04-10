package com.superking75.animal_app_jason;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class AnimalActivity extends AppCompatActivity {

    private TextView output;
    private ArrayList<Animal> mAnimals;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);
        mAnimals = new ArrayList<Animal>();
        output = (TextView)findViewById(R.id.output);

        Duck duck = new Duck();
        Fish fish = new Fish();
        Seal flexSeal = new Seal();


        mAnimals.add(fish);
        mAnimals.add(flexSeal);
        mAnimals.add(duck);


        for (Animal n: mAnimals)
        {
           this.output.append("\n" + n.getType() + " say " + n.say());

        }
       // this.output.append("\nDuck say: " + mAnimals.get(1).say());
       // this.output.append("\nFish goes: " + fish.say());


    }
}
