package com.e.healthbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class DiseaseActivity extends AppCompatActivity {
    private int lab;
    private TextView def,sym,remedy,nname;
    private ArrayList<String> definition, symphtons,cure,name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disease);
        lab = getIntent().getIntExtra("label",0);
        def = findViewById(R.id.definition);
        sym = findViewById(R.id.symptons);
        remedy = findViewById(R.id.remedy);
        nname = findViewById(R.id.name);
        definition = new ArrayList<>();
        symphtons = new ArrayList<>();
        cure = new ArrayList<>();
        name = new ArrayList<>();
        name.add("FEVER");
        name.add("COMMON COLD");
        name.add("MIGRAINE");
        name.add("LOOSE STOOLS");
        definition.add("A person has a fever if their body temperature rises above the normal range of 98–100°F (36–37°C). It is a common sign of an infection.");
        definition.add("The common cold is a viral infection of your nose and throat (upper respiratory tract). It's usually harmless, although it might not feel that way. Many types of viruses can cause a common cold.");
        definition.add("");
        definition.add("");
        symphtons.add("Feeling unwell\n" +
                "Feeling hot and sweaty\n" +
                "Shivering\n" +
                "Chattering teeth\n" +
                "Flushed face.");
        symphtons.add("a blocked or runny nose\n" +
                "a sore throat\n" +
                "headaches\n" +
                "muscle aches\n" +
                "coughs\n" +
                "sneezing\n" +
                "a raised temperature\n" +
                "pressure in your ears and face\n" +
                "loss of taste and smell");
        symphtons.add("");
        symphtons.add("");
        cure.add("Take paracetamol or ibuprofen in appropriate doses to help bring your temperature down.\n" +
                "Drink plenty of fluids, particularly water.\n" +
                "Avoid alcohol, tea and coffee as these drinks can cause slight dehydration.\n" +
                "Sponge exposed skin with tepid water. To boost the cooling effect of evaporation, you could try standing in front of a fan.\n" +
                "Avoid taking cold baths or showers. Skin reacts to the cold by constricting its blood vessels, which will trap body heat. The cold may also cause shivering, which can generate more heat.\n" +
                "Make sure you have plenty of rest, including bed rest.");
        cure.add(" Stay hydrated. Water, juice, clear broth or warm lemon water with honey helps loosen congestion and prevents dehydration. Avoid alcohol, coffee and caffeinated sodas, which can make dehydration worse.\n" +
                " Rest. Your body needs rest to heal.\n" +
                "\n" +
                " Soothe a sore throat. A saltwater gargle — 1/4 to 1/2 teaspoon salt dissolved in an 8-ounce glass of warm water — can temporarily relieve a sore or scratchy throat. Children younger than 6 years are unlikely to be able to gargle properly.\n" +
                "\n" +
                "You can also try ice chips, sore throat sprays, lozenges or hard candy. Use caution when giving lozenges or hard candy to children because they can choke on them. Don't give lozenges or hard candy to children younger than 6 years.\n" +
                "\n" +
                "Combat stuffiness. Over-the-counter saline nasal drops and sprays can help relieve stuffiness and congestion.");
        cure.add("");
        cure.add("");
        def.setText(definition.get(lab));
        nname.setText(name.get(lab));
        sym.setText(symphtons.get(lab));
        remedy.setText(cure.get(lab));
    }
}