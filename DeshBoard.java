package com.example.cc.uidesing;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DeshBoard extends AppCompatActivity { //DeshBord is used for Logout
    TextView username,phone,email;

    Button logout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desh_board);

        logout=findViewById(R.id.logout);
        username=(TextView)findViewById(R.id.textView_username);
        phone=findViewById(R.id.textView_phone);
        email=findViewById(R.id.textView_email);



        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharePre.Logout(DeshBoard.this);
                startActivity(new Intent(DeshBoard.this,login.class));
            }
        });


        username.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                String emailString=email.getText().toString();
                String phoneString=phone.getText().toString();
                String usernameString=username.getText().toString();


                Api api=ApiClient.apiclient().create(Api.class);

                Call<DeshboardModel> call=api.profile(emailString,phoneString,usernameString);

                call.enqueue(new Callback<DeshboardModel>() {
                    @Override
                    public void onResponse(Call<DeshboardModel> call, Response<DeshboardModel> response) {
                        if (response.body().getSuccess().equalsIgnoreCase("1")){
                            Toast.makeText(DeshBoard.this,response.body().getDetails().getEmail()+"",Toast.LENGTH_SHORT).show();
                        }else {
                            Toast.makeText(DeshBoard.this,response.body().getMessage()+"",Toast.LENGTH_SHORT).show();


                        }

                    }

                    @Override
                    public void onFailure(Call<DeshboardModel> call, Throwable t) {
                        Toast.makeText(DeshBoard.this, t+"", Toast.LENGTH_SHORT).show();


                    }
                });


            }
        });


    }


}
