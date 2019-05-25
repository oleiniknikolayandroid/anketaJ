package com.example.anketaj;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    EditText etName;
    EditText etSurname;
    EditText etAge;
    EditText etOther;
    Button save;
    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //init user
        user = new User("Name","Surname","14", "other");
        //find views by ids
        etName = (EditText) findViewById(R.id.tiet_main_name);
        etSurname = (EditText) findViewById(R.id.tiet_main_surname);
        etAge = (EditText) findViewById(R.id.tiet_main_age);
        etOther = (EditText) findViewById(R.id.tiet_main_another);
        save = (Button) findViewById(R.id.btn_main_sub);
        //spend data by view of init user
        etName.setText(user.getName());
        etSurname.setText(user.getSurname());
        etAge.setText(user.getAge());
        etOther.setText(user.getOther());

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //if all views(TextInputEditText) with content (chars array length more 2 item) - update user by any value
                if (isAllValid(etName.getText().toString(), etSurname.getText().toString(), etAge.getText().toString(), etOther.getText().toString())){
                    user.setName(etName.getText().toString());
                    user.setSurname(etSurname.getText().toString());
                    user.setAge(etAge.getText().toString());
                    user.setOther(etOther.getText().toString());
                    Toast.makeText(getApplicationContext(),"User saved",Toast.LENGTH_LONG);
                }
                // if any view (TextInputEditText) with content (chars length less 2 item) - don't update user
                else {
                    Toast.makeText(getApplicationContext(),"data is not valid",Toast.LENGTH_LONG);
                }
            }
        });





    }

    private boolean isValid(String string){
        return string.length() > 2;
    }
    private boolean isAllValid(String s1, String s2, String s3, String s4){
        return isValid(s1) && isValid(s2) && isValid(s3) && isValid(s4);

    }
}