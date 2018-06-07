package com.example.android.miniplayer;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // set content of home screen to use activity_main.xml layout
        setContentView(R.layout.activity_main);

        // Find the View that shows the pop category
        ImageView pop = findViewById(R.id.pop_list);

        // Set onClickListener to pop view
        pop.setOnClickListener(new View.OnClickListener() {
            // method will be executed when the pop View is clicked on
            @Override
            public void onClick(View view) {
                // Create a new intent to open the PopActivity
                Intent popIntent = new Intent(MainActivity.this, PopActivity.class);
                // Start the new activity
                startActivity(popIntent);
            }
        });

        // Find the View that shows the rock category
        ImageView rock = findViewById(R.id.rock_list);

        // set onClickListener to rock view
        rock.setOnClickListener(new View.OnClickListener() {
            // method will be execute when the rock view is clicked on
            @Override
            public void onClick(View v) {
                // Create a new intent to open the RockActivity
                Intent rockIntent = new Intent(MainActivity.this, RockActivity.class);
                // Start the new activity
                startActivity(rockIntent);
            }
        });

        // Find the View that shows the classical category
        ImageView classical = findViewById(R.id.classical_list);

        // set onClickListener to classical view
        classical.setOnClickListener(new View.OnClickListener() {
            // method will be execute when the rock view is clicked on
            @Override
            public void onClick(View v) {
                // Create a new intent to open the RockActivity
                Intent classicalIntent = new Intent(MainActivity.this, ClassicalActivity.class);
                // Start the new activity
                startActivity(classicalIntent);
            }
        });

        // Find the View that shows the library category
        ImageView library = findViewById(R.id.library_list);

        // set onClickListener to library view
        library.setOnClickListener(new View.OnClickListener() {
            // method will be execute when the rock view is clicked on
            @Override
            public void onClick(View v) {
                // Create a new intent to open the RockActivity
                Intent libraryIntent = new Intent(MainActivity.this, MyLibraryActivity.class);
                // Start the new activity
                startActivity(libraryIntent);
            }
        });
    }
}


