package com.example.cc.uidesing;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import retrofit2.Call;


import retrofit2.Callback;
import retrofit2.Response;

public class SingUp extends AppCompatActivity {
    EditText name,email,password;
    TextView tvlogin;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sing_up);

        name=findViewById(R.id.et_fullname);
        email=findViewById(R.id.et_email);
        password=findViewById(R.id.et_password);
        btn=findViewById(R.id.btn);
        tvlogin=(TextView)findViewById(R.id.textview_login);

        tvlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SingUp.this,login.class);
                startActivity(intent);

            }
        });


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nameString=name.getText().toString();                 //ye hame input lene he isliye lenge
                String emailString=email.getText().toString();
                String passordString=password.getText().toString();

                Api api=ApiClient.apiclient().create(Api.class);

                Call<RegisterModel> call=api.register(nameString,emailString,passordString,"1","1");  //Register id means phone ki unique id device_type
                call.enqueue(new Callback<RegisterModel>() {
                    @Override
                    public void onResponse(Call<RegisterModel> call, Response<RegisterModel> response) {

                        if(response.body()!=null)                                                         // Check means if else isliye lgaya kyoki null pointer exception aye to crash na ho
                        {
                            if (response.body().getSuccess().equalsIgnoreCase("1")) { // yani ager edit text blank ho to
                                Toast.makeText(SingUp.this, response.body().getMessage() + "", Toast.LENGTH_SHORT).show();
                            } else {
                                Toast.makeText(SingUp.this, response.body().getMessage() + "", Toast.LENGTH_SHORT).show();
                            }
                        }
                        else
                        {
                            Toast.makeText(SingUp.this, "Something went wrong", Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onFailure(Call<RegisterModel> call, Throwable t) { //Koi error hoga to t me store hoga
                        Toast.makeText(SingUp.this,t+"",Toast.LENGTH_SHORT).show();

                    }
                });
            }
        });
    }




}
