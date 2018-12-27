package com.example.cc.uidesing;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class login extends AppCompatActivity {

    EditText Email,Password;
    Button Login;
    TextView tvSingUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        Email=findViewById(R.id.email);
        Password=findViewById(R.id.password);
        tvSingUp=findViewById(R.id.tv_singup);
        Login=findViewById(R.id.login);

        tvSingUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(login.this,SingUp.class);
                startActivity(intent);

                 }
        });


        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String EmailString=Email.getText().toString();
                String PasswordString=Password.getText().toString();
                Api api=ApiClient.apiclient().create(Api.class);


                Call<LoginModel> call=api.login(EmailString,PasswordString,"android","1");

                call.enqueue(new Callback<LoginModel>() {
                    @Override
                    public void onResponse(Call<LoginModel> call, Response<LoginModel> response) {
                        if (response.body().getSuccess().equalsIgnoreCase("1")){
                            SharePre.SetToken(login.this); // setToken means to load the activity
                            startActivity(new Intent(login.this,DeshBoard.class)); //Login to Deshboard
                            finish();
                            Toast.makeText(login.this, response.body().getMessage()+"", Toast.LENGTH_SHORT).show();
                        }else {
                            Toast.makeText(login.this, response.body().getMessage()+"", Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onFailure(Call<LoginModel> call, Throwable t) {
                        Toast.makeText(login.this, t+"", Toast.LENGTH_SHORT).show();

                    }
                });
            }
        });
    }
}
