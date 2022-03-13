package com.example.radiobutton;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private RadioGroup groupBtn;
    private Button btn;
    private RadioButton radioBtn1,radioBtn2;
    private TextView resultText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        groupBtn=(RadioGroup)findViewById(R.id.groupBtn);
        btn = (Button)findViewById(R.id.Semi1_cgpa);
        resultText=(TextView)findViewById(R.id.resultText);
        radioBtn1=(RadioButton)findViewById(R.id.radioBtn1);
        radioBtn2=(RadioButton)findViewById(R.id.radioBtn2);
        //resultText.setVisibility(View.GONE);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //int selectedId=groupBtn.getCheckedRadioButtonId();
                //radioBtn1=(RadioButton) findViewById(selectedId);
                //String value=radioBtn1.getText().toString();
                if(radioBtn1.isChecked())
                {
                    //Toast.makeText(getApplicationContext(),"CGPA",Toast.LENGTH_SHORT).show();
                    SecondPage();
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Please Choose Any Button",Toast.LENGTH_SHORT).show();
                }
                //resultText.setText("You have Selected:"+value);

            }
        });
    }
    public void SecondPage()
    {
        Intent intent = new Intent(MainActivity.this,SecondPage.class);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
       builder.setMessage("Are you want to Exit?");
             builder.setCancelable(false);
             builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                 @Override
                 public void onClick(DialogInterface dialogInterface, int i) {
                     //finish();
                     MainActivity. super.onBackPressed();

                 }
             });
             builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                 @Override
                 public void onClick(DialogInterface dialogInterface, int i) {
                     dialogInterface.cancel();
                 }
             });
             AlertDialog alertDialog=builder.create();
             alertDialog.show();
    }
}
//Developed By sourabh roy Biswes