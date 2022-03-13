package com.example.radiobutton;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class SecondPage extends AppCompatActivity {
    private Button nextBtn;
    private RadioGroup groupBtn;
    private RadioButton radioBtn1, radioBtn2, radioBtn3, radioBtn4, radioBtn5, radioBtn6, radioBtn7,
                        radioBtn8, radioBtn9, radioBtn10, radioBtn11, radioBtn12;
    private TextView resultText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);
        nextBtn=(Button)findViewById(R.id.nextBtn);
        groupBtn=(RadioGroup)findViewById(R.id.groupBtn);
        resultText=(TextView)findViewById(R.id.resultText);
        radioBtn1=(RadioButton)findViewById(R.id.radioBtn1);
        radioBtn2=(RadioButton)findViewById(R.id.radioBtn2);
        radioBtn3=(RadioButton)findViewById(R.id.radioBtn3);
        radioBtn4=(RadioButton)findViewById(R.id.radioBtn4);
        radioBtn5=(RadioButton)findViewById(R.id.radioBtn5);
        radioBtn6=(RadioButton)findViewById(R.id.radioBtn6);
        radioBtn7=(RadioButton)findViewById(R.id.radioBtn7);
        radioBtn8=(RadioButton)findViewById(R.id.radioBtn8);
        radioBtn9=(RadioButton)findViewById(R.id.radioBtn9);
        radioBtn10=(RadioButton)findViewById(R.id.radioBtn10);
        radioBtn11=(RadioButton)findViewById(R.id.radioBtn11);
        radioBtn12=(RadioButton)findViewById(R.id.radioBtn12);
        //resultText.setVisibility(View.GONE);
        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(radioBtn1.isChecked())
                {
                    resultText.setHint(null);
                    resultText.setError(null);
                    int selectedId=groupBtn.getCheckedRadioButtonId();
                    radioBtn1=(RadioButton) findViewById(selectedId);
                    String select_semister=radioBtn1.getText().toString();
                    //Toast.makeText(getApplicationContext(),"CGPA",Toast.LENGTH_SHORT).show();
                    FourPage(select_semister);
                }
                else if(radioBtn2.isChecked())
                {
                    resultText.setHint(null);
                    resultText.setError(null);
                    int selectedId=groupBtn.getCheckedRadioButtonId();
                    radioBtn2=(RadioButton) findViewById(selectedId);
                    String select_semister=radioBtn2.getText().toString();
                    //Toast.makeText(getApplicationContext(),"CGPA",Toast.LENGTH_SHORT).show();
                    FourPage(select_semister);
                }
                else if(radioBtn3.isChecked())
                {
                    resultText.setHint(null);
                    resultText.setError(null);
                    int selectedId=groupBtn.getCheckedRadioButtonId();
                    radioBtn3=(RadioButton) findViewById(selectedId);
                    String select_semister=radioBtn3.getText().toString();
                    //Toast.makeText(getApplicationContext(),"CGPA",Toast.LENGTH_SHORT).show();
                    FourPage(select_semister);
                }
                else if(radioBtn4.isChecked())
                {
                    resultText.setHint(null);
                    resultText.setError(null);
                    int selectedId=groupBtn.getCheckedRadioButtonId();
                    radioBtn4=(RadioButton) findViewById(selectedId);
                    String select_semister=radioBtn4.getText().toString();
                    //Toast.makeText(getApplicationContext(),"CGPA",Toast.LENGTH_SHORT).show();
                    FourPage(select_semister);
                }
                else if(radioBtn5.isChecked())
                {
                    resultText.setHint(null);
                    resultText.setError(null);
                    int selectedId=groupBtn.getCheckedRadioButtonId();
                    radioBtn5=(RadioButton) findViewById(selectedId);
                    String select_semister=radioBtn5.getText().toString();
                    //Toast.makeText(getApplicationContext(),"CGPA",Toast.LENGTH_SHORT).show();
                    FourPage(select_semister);
                }
                else if(radioBtn6.isChecked())
                {
                    resultText.setHint(null);
                    resultText.setError(null);
                    int selectedId=groupBtn.getCheckedRadioButtonId();
                    radioBtn6=(RadioButton) findViewById(selectedId);
                    String select_semister=radioBtn6.getText().toString();
                    //Toast.makeText(getApplicationContext(),"CGPA",Toast.LENGTH_SHORT).show();
                    FourPage(select_semister);
                }
                else if(radioBtn7.isChecked())
                {
                    resultText.setHint(null);
                    resultText.setError(null);
                    int selectedId=groupBtn.getCheckedRadioButtonId();
                    radioBtn7=(RadioButton) findViewById(selectedId);
                    String select_semister=radioBtn7.getText().toString();
                    //Toast.makeText(getApplicationContext(),"CGPA",Toast.LENGTH_SHORT).show();
                    FourPage(select_semister);
                }
                else if(radioBtn8.isChecked())
                {
                    resultText.setHint(null);
                    resultText.setError(null);
                    int selectedId=groupBtn.getCheckedRadioButtonId();
                    radioBtn8=(RadioButton) findViewById(selectedId);
                    String select_semister=radioBtn8.getText().toString();
                    //Toast.makeText(getApplicationContext(),"CGPA",Toast.LENGTH_SHORT).show();
                    FourPage(select_semister);
                }
                else if(radioBtn9.isChecked())
                {
                    resultText.setHint(null);
                    resultText.setError(null);
                    int selectedId=groupBtn.getCheckedRadioButtonId();
                    radioBtn9=(RadioButton) findViewById(selectedId);
                    String select_semister=radioBtn9.getText().toString();
                    //Toast.makeText(getApplicationContext(),"CGPA",Toast.LENGTH_SHORT).show();
                    FourPage(select_semister);
                }
                else if(radioBtn10.isChecked())
                {
                    resultText.setHint(null);
                    resultText.setError(null);
                    int selectedId=groupBtn.getCheckedRadioButtonId();
                    radioBtn10=(RadioButton) findViewById(selectedId);
                    String select_semister=radioBtn10.getText().toString();
                    //Toast.makeText(getApplicationContext(),"CGPA",Toast.LENGTH_SHORT).show();
                    FourPage(select_semister);
                }
                else if(radioBtn11.isChecked())
                {
                    resultText.setHint(null);
                    resultText.setError(null);
                    int selectedId=groupBtn.getCheckedRadioButtonId();
                    radioBtn11=(RadioButton) findViewById(selectedId);
                    String select_semister=radioBtn11.getText().toString();
                    //Toast.makeText(getApplicationContext(),"CGPA",Toast.LENGTH_SHORT).show();
                    FourPage(select_semister);
                }
                else if(radioBtn12.isChecked())
                {
                    resultText.setHint(null);
                    resultText.setError(null);
                    int selectedId=groupBtn.getCheckedRadioButtonId();
                    radioBtn12=(RadioButton) findViewById(selectedId);
                    String select_semister=radioBtn12.getText().toString();
                    //Toast.makeText(getApplicationContext(),"CGPA",Toast.LENGTH_SHORT).show();
                    FourPage(select_semister);
                }
               else
                {
                    //Toast.makeText(getApplicationContext(),"Please Fill All Field",Toast.LENGTH_SHORT).show();
                    resultText.setHint("Please Select Semister");
                    resultText.setError("Please Select Semister");
                }
                //resultText.setText("You have Selected:"+select_semister);

            }
        });
    }
    public void FourPage(String select_semister)
    {
        Intent intent = new Intent(SecondPage.this,FourPage.class);
        intent.putExtra("semi choose",select_semister);
        resultText.clearComposingText();
        startActivity(intent);
    }
}
//Developed By Sourabh Roy Biswes