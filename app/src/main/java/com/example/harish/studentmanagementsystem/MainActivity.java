package com.example.harish.studentmanagementsystem;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText username,phone,address,college;
    TextView displayText;

    Button add,display;
    ArrayList<Student> arraylist = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username =  findViewById(R.id.editText5);
        phone= findViewById(R.id.editText3);
        address=findViewById(R.id.editText4);
        college=findViewById(R.id.editText6);
        add = findViewById(R.id.button1);
        display= findViewById(R.id.button2);
        displayText=findViewById(R.id.DisplayText);

        add.setOnClickListener(new View.
                OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = username.getText().toString();
                int phoneno = Integer.parseInt(phone.getText().toString());
                String addresss=address.getText().toString();
                String collegeName=college.getText().toString();

            arraylist.add(new Student(name,addresss,phoneno,collegeName));
            }
        });
        display.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for(int i=0;i<arraylist.size();i++)
                {
                    displayText.setText(displayText.getText()+"\n username is:"+arraylist.get(i).userName);
                    displayText.setText(displayText.getText()+"\n phone number is:"+arraylist.get(i).phoneno);
                    displayText.setText(displayText.getText()+"\n address is:"+arraylist.get(i).address);
                    displayText.setText(displayText.getText()+"\n college name is:"+arraylist.get(i).collegeName);
                }

            }
        });
        displayText.setMovementMethod(new ScrollingMovementMethod());
    }
}
