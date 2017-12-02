package com.example.slee7357.sqlitetest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    /*DatabaseHelper mDatabaseHelper;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final EditText txtEmail = findViewById(R.id.txt_userEmail);
        /*final EditText txtUserName = (EditText) findViewById(R.id.txt_userName);
        final EditText txtUserPassword1 = (EditText) findViewById(R.id.txt_userPassword1);
        final EditText txtUserPassword2 = (EditText) findViewById(R.id.txt_userPassword2);*/


        Button btnAdd = findViewById(R.id.btn_Add);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("hey","working"+ txtEmail.getText().toString());
                toastMessage("yo" );
                //String newUserEmail = txtEmail.getText().toString();
                /*String newUserName = txtUserName.getText().toString();
                String newUserPassword1 = txtUserPassword1.getText().toString();
                String newUserPassword2 = txtUserPassword2.getText().toString();*/

                //toastMessage("hey you are adding "+ txtEmail.toString() + " person");
                //toastMessage("hey you are adding "+ newUserEmail +newUserName + newUserPassword1+ newUserPassword2+ " person");
                /*AddData(newUserEmail,newUserPassword2,newUserName);
                txtEmail.setText("");
                txtUserName.setText("");
                txtUserPassword1.setText("");
                txtUserPassword2.setText("");*/

                /*if(txtEmail.length() == 0){
                    toastMessage("You must put Email Address");

                }else if(txtUserName.length() == 0){
                    toastMessage("You must put User Name");
                }else if(txtUserPassword1 != txtUserPassword2){
                    toastMessage("Password do not match");
                }else{
                    String newUserEmail = txtEmail.getText().toString();
                    String newUserName = txtEmail.getText().toString();
                    String newUserPassword1 = txtEmail.getText().toString();
                    String newUserPassword2 = txtEmail.getText().toString();

                    toastMessage("hey you are adding "+ newUserEmail +newUserName + newUserPassword1+ newUserPassword2+ " person");
                    AddData(newUserEmail,newUserName,newUserPassword2);
                    txtEmail.setText("");
                    txtUserName.setText("");
                    txtUserPassword1.setText("");
                    txtUserPassword2.setText("");
                }*/


            }
        });
    }

    /*public void AddData(String email, String password, String user_Name){
        boolean insertData = mDatabaseHelper.addData(email,password,user_Name);

        if(insertData){
            toastMessage("Data successfully Inserted!");
        } else{
            toastMessage("Something went wrong!");
        }
    }*/

    private void toastMessage(String message){
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show();

    }
}
