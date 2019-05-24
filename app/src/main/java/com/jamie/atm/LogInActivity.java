package com.jamie.atm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LogInActivity extends AppCompatActivity {

    private EditText etUserId;
    private EditText etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        etUserId = findViewById(R.id.et_userid);
        etPassword = findViewById(R.id.et_password);


    }

    protected void login(View view){
        String userID = etUserId.getText().toString();
        String password = etPassword.getText().toString();
        if(userID.equals("Jack") && password.equals("0000")){
            // 將帳號密碼傳回去
            setResult(RESULT_OK);
            finish();

        }
    }

    public void quit(View view){
        finish();
    }
}
