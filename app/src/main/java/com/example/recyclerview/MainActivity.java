package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView RecycleView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecycleView=findViewById(R.id.recyclerView);

        List<Contacts> contactsList=new ArrayList<>();
        contactsList.add(new Contacts("Mountain 1","8585858585",R.drawable.nepal1));
        contactsList.add(new Contacts("Mountain 2","8585858585",R.drawable.nepal2));
        contactsList.add(new Contacts("Mountain 3","8585858585",R.drawable.nepal));

        ContactsAdapter contactsAdapter=new ContactsAdapter(this,contactsList);
        RecycleView.setAdapter(contactsAdapter);
        RecycleView.setLayoutManager(new LinearLayoutManager(this));
    }
}
