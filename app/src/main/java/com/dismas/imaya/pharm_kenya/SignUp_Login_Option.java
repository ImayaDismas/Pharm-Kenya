package com.dismas.imaya.pharm_kenya;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by imaya on 6/23/16.
 */
public class SignUp_Login_Option extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_login);
        addListenerOnButton();
        addListenerOnButton1();
    }
    public void addListenerOnButton() {

        final Context context = this;

        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, SignUpActivity.class);
                startActivity(intent);

            }

        });

    }
    public void addListenerOnButton1() {

        final Context context = this;

        button = (Button) findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, LoginActivity.class);
                startActivity(intent);

            }

        });

    }
}