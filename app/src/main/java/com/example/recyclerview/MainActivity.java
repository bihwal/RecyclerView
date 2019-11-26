package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView RecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Contacts> contactsList=new ArrayList<>();
        contactsList.add(new Contacts("Mountain","8585858585",R.drawable.nepal1));
        contactsList.add(new Contacts("Mountain","8585858585",R.drawable.nepal2));
        contactsList.add(new Contacts("Mountain","8585858585",R.drawable.nepal));

        ContactsAdapter contactsAdapter=new ContactsAdapter(this,contactsList);
        RecyclerView.setAdapter(contactsAdapter);
        RecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
