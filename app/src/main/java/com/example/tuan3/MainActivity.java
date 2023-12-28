package com.example.tuan3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvContact = findViewById(R.id.lv);
        ArrayList<Contact> arrContact = new ArrayList<>();
        Contact contact1 = new Contact("nguyen van A", "nguyen van A", "RED");
        Contact contact2 = new Contact("nguyen van B", "nguyen van B", "BLUE");
        arrContact.add(contact1);
        arrContact.add(contact2);

        customAdapter adapter = new customAdapter(this, R.layout.item_listviiew, arrContact);
        lvContact.setAdapter(adapter);
    }
}