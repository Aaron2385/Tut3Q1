package com.example.tut3;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    CheckBox c1, c2, c3, c4;
    TextView selection;
    Button selectButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        selection = findViewById(R.id.selection);
        c1 = findViewById(R.id.checkBox_Ham);
        c2 = findViewById(R.id.checkBox_Pineapple);
        c3 = findViewById(R.id.checkBox_Anchovies);
        c4 = findViewById(R.id.checkBox_Olives);
        selectButton = findViewById(R.id.select_button);

        // Set button click listener
        selectButton.setOnClickListener(v -> selectToppings());
    }

    public void selectToppings() {
        List<String> selectionText = new ArrayList<>();

        if (c1.isChecked()) {
            selectionText.add("Ham");
        }
        if (c2.isChecked()) {
            selectionText.add("Pineapple");
        }
        if (c3.isChecked()) {
            selectionText.add("Anchovies");
        }
        if (c4.isChecked()) {
            selectionText.add("Olives");
        }

        // Display the selected toppings in the TextView
        if (!selectionText.isEmpty()) {
            selection.setText("Your toppings are: " + String.join(" and ", selectionText));
        } else {
            selection.setText("No toppings selected.");
        }
    }
}
