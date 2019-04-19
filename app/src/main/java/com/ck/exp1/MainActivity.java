package com.ck.exp1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String CheckId,CheckPass;
    EditText Id,pass;
    Button Submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Id = findViewById(R.id.editText);
        pass = findViewById(R.id.editText2);
        Submit = findViewById(R.id.sub);

        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CheckId = Id.getText().toString();
                CheckPass = pass.getText().toString();
                if(CheckId.equals("admin")&&CheckPass.equals("password"))
                {
                    Toast.makeText(MainActivity.this,"Correct Id and Password",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this,"Try Again",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
