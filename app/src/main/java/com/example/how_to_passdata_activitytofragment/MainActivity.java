package com.example.how_to_passdata_activitytofragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText mobile,email;
    Button add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mobile=findViewById(R.id.mobile);
        email=findViewById(R.id.email);
        add=findViewById(R.id.add);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Mobile=mobile.getText().toString();
                String Email=email.getText().toString();

                Fragment fragment=new Once_Fragment();
                Bundle bundle=new Bundle();

                bundle.putString("userMobile",Mobile);
                bundle.putString("userEmail",Email);

                fragment.setArguments(bundle);
                FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.container,fragment).commit();





            }
        });
    }
}