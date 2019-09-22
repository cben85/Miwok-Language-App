/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);


        // set Listener to NumbersActivity
        // Find View by ID
        TextView numbers = (TextView) findViewById(R.id.numbers);

        //  Assign event listener to the View
        numbers.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // TODO Define the action of the event listener, in this Case the opening of NumbersActivity.java

                Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(numbersIntent);
            }
        });


        // set Listener to FamiliyMembers
        //  Find View by ID
        TextView family = (TextView) findViewById(R.id.family);

        // Assign event listener to the View
        family.setOnClickListener(new View.OnClickListener() {

                                      @Override
                                      public void onClick(View view) {
                                          //  Define the action of the event listener, in this Case the opening of FamiliyMembers.java
                                          Intent familyIntent = new Intent(MainActivity.this, FamilyMembers.class);
                                          startActivity(familyIntent);

                                      }
                                  }
        );


        // set Listener to PhrasesActivity
        // Find View by ID
        TextView phrases = (TextView) findViewById(R.id.phrases);

        // Assign event listener to the View
        phrases.setOnClickListener(new View.OnClickListener() {

                                       // Define the action of the event listener, in this Case the opening of PhrasesActivity.java
                                       @Override
                                       public void onClick(View view) {
                                           Intent intentphrases = new Intent(MainActivity.this, PhrasesActivity.class);
                                           startActivity(intentphrases);

                                       }
                                   }
        );

        // set Listener to ColorsActivity
        //  Find View by ID
        TextView color = (TextView) findViewById(R.id.colors);

        // Assign event listener to the View
        color.setOnClickListener(new View.OnClickListener() {

            // TODO Define the action of the event listener, in this Case the opening of ColorsActivity.java
            @Override
            public void onClick(View view) {
                Intent colorIntent = new Intent(MainActivity.this, ColorsActivity.class);
                startActivity(colorIntent);
            }
        });


    }


}
