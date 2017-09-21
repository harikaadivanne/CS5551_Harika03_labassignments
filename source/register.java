package com.example.harika.lab4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.common.SignInButton;


public class Login extends AppCompatActivity{
private SignInButton mGoogleBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        mGoogleBtn=(SignInButton) findViewById(R.id.googleBtn);



        final Button contact = (Button) findViewById(R.id.button2);
        contact.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent act1 = new Intent(view.getContext(), maps.class);
                startActivity(act1);
            }
        });
    }
}
