package com.example.slee7357.sqlitetest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText txtSignUpEmail = findViewById(R.id.txt_email);
        final EditText txtSignUpPassWord = findViewById(R.id.txt_password);

    }

    public void signIn_activity(View view){
        Log.d("MainActivity_error","txtSignInEmail:"+ txt +)
    }


    public void signUp_activity(View view){
        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        startActivity(intent);
    }
}
