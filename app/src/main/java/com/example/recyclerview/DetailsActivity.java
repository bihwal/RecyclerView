package com.example.recyclerview;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class DetailsActivity extends AppCompatActivity {
    ImageView imgProfile;
    TextView tvName, tvPhone;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        imgProfile=findViewById(R.id.imgProfiles);
        tvName=findViewById(R.id.tvNames);
        tvPhone=findViewById(R.id.tvPhones);

        Bundle bundle=getIntent().getExtras();

        if (bundle !=null){
            imgProfile.setImageResource(bundle.getInt("image"));
            tvName.setText(bundle.getString("name"));
            tvPhone.setText(bundle.getString("phone"));
        }



    }
}
