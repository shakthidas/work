package com.example.admin.loginregister;

import android.graphics.drawable.RippleDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class loginActivity extends AppCompatActivity implements View.OnClickListener {

    Button bsave, bshowusers;
    EditText etname, etemail, etphone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etname = (EditText) findViewById(R.id.etname);
        etemail = (EditText) findViewById(R.id.etemail);
        etphone = (EditText) findViewById(R.id.etphone);
        bsave = (Button) findViewById(R.id.bsave);
        bshowusers = (Button) findViewById(R.id.bShowusers);



        bsave.setOnClickListener(this);
        bshowusers.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bsave:
        }
    }
}
