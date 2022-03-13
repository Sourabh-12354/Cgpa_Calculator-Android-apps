package com.example.radiobutton;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Method;

public class FourPage extends AppCompatActivity {
    ScrollView Scroll_id;
    TextView Semi1_sgpa;
    EditText Semi1_credit;
    EditText Semi2_sgpa;
    EditText Semi2_credit;
    EditText Semi3_sgpa;
    EditText Semi3_credit;
    EditText Semi4_sgpa;
    EditText Semi4_credit;
    EditText Semi5_sgpa;
    EditText Semi5_credit;
    EditText Semi6_sgpa;
    EditText Semi6_credit;
    EditText Semi7_sgpa;
    EditText Semi7_credit;
    EditText Semi8_sgpa;
    EditText Semi8_credit;
    EditText Semi9_sgpa;
    EditText Semi9_credit;
    EditText Semi10_sgpa;
    EditText Semi10_credit;
    EditText Semi11_sgpa;
    EditText Semi11_credit;
    EditText Semi12_sgpa;
    EditText Semi12_credit;
    TextView s1sgpa;
    TextView s2sgpa;
    TextView s3sgpa;
    TextView s4sgpa;
    TextView s5sgpa;
    TextView s6sgpa;
    TextView s7sgpa;
    TextView s8sgpa;
    TextView s9sgpa;
    TextView s10sgpa;
    TextView s11sgpa;
    TextView s12sgpa;
    TextView s1crdt;
    TextView s2crdt;
    TextView s3crdt;
    TextView s4crdt;
    TextView s5crdt;
    TextView s6crdt;
    TextView s7crdt;
    TextView s8crdt;
    TextView s9crdt;
    TextView s10crdt;
    TextView s11crdt;
    TextView s12crdt;



    TextView result_Id;
    Button btn_id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four_page);
        Scroll_id = (ScrollView) findViewById(R.id.Scroll_id);
        Semi1_sgpa = (EditText)findViewById(R.id.Semi1_sgpa);
        Semi1_credit = (EditText) findViewById(R.id.Semi1_credit);
        Semi2_sgpa = (EditText) findViewById(R.id.Semi2_sgpa);
        Semi2_credit = (EditText) findViewById(R.id.Semi2_credit);
        Semi3_sgpa = (EditText) findViewById(R.id.Semi3_sgpa);
        Semi3_credit = (EditText) findViewById(R.id.Semi3_credit);
        Semi4_sgpa = (EditText) findViewById(R.id.Semi4_sgpa);
        Semi4_credit = (EditText) findViewById(R.id.Semi4_credit);
        Semi5_sgpa = (EditText) findViewById(R.id.Semi5_sgpa);
        Semi5_credit = (EditText) findViewById(R.id.Semi5_credit);
        Semi6_sgpa = (EditText) findViewById(R.id.Semi6_sgpa);
        Semi6_credit = (EditText) findViewById(R.id.Semi6_credit);
        Semi7_sgpa = (EditText) findViewById(R.id.Semi7_sgpa);
        Semi7_credit = (EditText) findViewById(R.id.Semi7_credit);
        Semi8_sgpa = (EditText) findViewById(R.id.Semi8_sgpa);
        Semi8_credit = (EditText) findViewById(R.id.Semi8_credit);
        Semi9_sgpa = (EditText) findViewById(R.id.Semi9_sgpa);
        Semi9_credit = (EditText) findViewById(R.id.Semi9_credit);
        Semi10_sgpa = (EditText) findViewById(R.id.Semi10_sgpa);
        Semi10_credit = (EditText) findViewById(R.id.Semi10_credit);
        Semi11_sgpa = (EditText) findViewById(R.id.Semi11_sgpa);
        Semi11_credit = (EditText) findViewById(R.id.Semi11_credit);
        Semi12_sgpa = (EditText) findViewById(R.id.Semi12_sgpa);
        Semi12_credit = (EditText) findViewById(R.id.Semi12_credit);
        result_Id = (TextView) findViewById(R.id.result_Id);
        s1sgpa = (TextView) findViewById(R.id.s1sgpa);
        s2sgpa = (TextView) findViewById(R.id.s2sgpa);
        s3sgpa = (TextView) findViewById(R.id.s3sgpa);
        s4sgpa = (TextView) findViewById(R.id.s4sgpa);
        s5sgpa = (TextView) findViewById(R.id.s5sgpa);
        s6sgpa = (TextView) findViewById(R.id.s6sgpa);
        s7sgpa = (TextView) findViewById(R.id.s7sgpa);
        s8sgpa = (TextView) findViewById(R.id.s8sgpa);
        s9sgpa = (TextView) findViewById(R.id.s9sgpa);
        s10sgpa = (TextView) findViewById(R.id.s10sgpa);
        s11sgpa = (TextView) findViewById(R.id.s11sgpa);
        s12sgpa = (TextView) findViewById(R.id.s12sgpa);
        s1crdt = (TextView) findViewById(R.id.s1crdt);
        s2crdt = (TextView) findViewById(R.id.s2crdt);
        s3crdt = (TextView) findViewById(R.id.s3crdt);
        s4crdt = (TextView) findViewById(R.id.s4crdt);
        s5crdt = (TextView) findViewById(R.id.s5crdt);
        s6crdt = (TextView) findViewById(R.id.s6crdt);
        s7crdt = (TextView) findViewById(R.id.s7crdt);
        s8crdt = (TextView) findViewById(R.id.s8crdt);
        s9crdt = (TextView) findViewById(R.id.s9crdt);
        s10crdt = (TextView) findViewById(R.id.s10crdt);
        s11crdt = (TextView) findViewById(R.id.s11crdt);
        s12crdt = (TextView) findViewById(R.id.s12crdt);


        Intent i = getIntent();
        String choosen_semi = i.getStringExtra("semi choose");
        btn_id = (Button) findViewById(R.id.btn_id);

        //result_Id.setText(choosen_semi);
        if (choosen_semi.equals("1st")) {
            s2sgpa.setVisibility(View.GONE);
            s3sgpa.setVisibility(View.GONE);
            s4sgpa.setVisibility(View.GONE);
            s5sgpa.setVisibility(View.GONE);
            s6sgpa.setVisibility(View.GONE);
            s7sgpa.setVisibility(View.GONE);
            s8sgpa.setVisibility(View.GONE);
            s9sgpa.setVisibility(View.GONE);
            s10sgpa.setVisibility(View.GONE);
            s11sgpa.setVisibility(View.GONE);
            s12sgpa.setVisibility(View.GONE);
            s2crdt.setVisibility(View.GONE);
            s3crdt.setVisibility(View.GONE);
            s4crdt.setVisibility(View.GONE);
            s5crdt.setVisibility(View.GONE);
            s6crdt.setVisibility(View.GONE);
            s7crdt.setVisibility(View.GONE);
            s8crdt.setVisibility(View.GONE);
            s9crdt.setVisibility(View.GONE);
            s10crdt.setVisibility(View.GONE);
            s11crdt.setVisibility(View.GONE);
            s12crdt.setVisibility(View.GONE);


            Semi2_sgpa.setVisibility(View.GONE);
            Semi2_credit.setVisibility(View.GONE);
            Semi3_sgpa.setVisibility(View.GONE);
            Semi3_credit.setVisibility(View.GONE);
            Semi4_sgpa.setVisibility(View.GONE);
            Semi4_credit.setVisibility(View.GONE);
            Semi5_sgpa.setVisibility(View.GONE);
            Semi5_credit.setVisibility(View.GONE);
            Semi6_sgpa.setVisibility(View.GONE);
            Semi6_credit.setVisibility(View.GONE);
            Semi7_sgpa.setVisibility(View.GONE);
            Semi7_credit.setVisibility(View.GONE);
            Semi8_sgpa.setVisibility(View.GONE);
            Semi8_credit.setVisibility(View.GONE);
            Semi9_sgpa.setVisibility(View.GONE);
            Semi9_credit.setVisibility(View.GONE);
            Semi10_sgpa.setVisibility(View.GONE);
            Semi10_credit.setVisibility(View.GONE);
            Semi11_sgpa.setVisibility(View.GONE);
            Semi11_credit.setVisibility(View.GONE);
            Semi12_sgpa.setVisibility(View.GONE);
            Semi12_credit.setVisibility(View.GONE);
        }
        if (choosen_semi.equals("2nd")) {
            s3sgpa.setVisibility(View.GONE);
            s4sgpa.setVisibility(View.GONE);
            s5sgpa.setVisibility(View.GONE);
            s6sgpa.setVisibility(View.GONE);
            s7sgpa.setVisibility(View.GONE);
            s8sgpa.setVisibility(View.GONE);
            s9sgpa.setVisibility(View.GONE);
            s10sgpa.setVisibility(View.GONE);
            s11sgpa.setVisibility(View.GONE);
            s12sgpa.setVisibility(View.GONE);
            s3crdt.setVisibility(View.GONE);
            s4crdt.setVisibility(View.GONE);
            s5crdt.setVisibility(View.GONE);
            s6crdt.setVisibility(View.GONE);
            s7crdt.setVisibility(View.GONE);
            s8crdt.setVisibility(View.GONE);
            s9crdt.setVisibility(View.GONE);
            s10crdt.setVisibility(View.GONE);
            s11crdt.setVisibility(View.GONE);
            s12crdt.setVisibility(View.GONE);


            Semi3_sgpa.setVisibility(View.GONE);
            Semi3_credit.setVisibility(View.GONE);
            Semi4_sgpa.setVisibility(View.GONE);
            Semi4_credit.setVisibility(View.GONE);
            Semi5_sgpa.setVisibility(View.GONE);
            Semi5_credit.setVisibility(View.GONE);
            Semi6_sgpa.setVisibility(View.GONE);
            Semi6_credit.setVisibility(View.GONE);
            Semi7_sgpa.setVisibility(View.GONE);
            Semi7_credit.setVisibility(View.GONE);
            Semi8_sgpa.setVisibility(View.GONE);
            Semi8_credit.setVisibility(View.GONE);
            Semi9_sgpa.setVisibility(View.GONE);
            Semi9_credit.setVisibility(View.GONE);
            Semi10_sgpa.setVisibility(View.GONE);
            Semi10_credit.setVisibility(View.GONE);
            Semi11_sgpa.setVisibility(View.GONE);
            Semi11_credit.setVisibility(View.GONE);
            Semi12_sgpa.setVisibility(View.GONE);
            Semi12_credit.setVisibility(View.GONE);
        }
        if (choosen_semi.equals("3rd")) {
            s4sgpa.setVisibility(View.GONE);
            s5sgpa.setVisibility(View.GONE);
            s6sgpa.setVisibility(View.GONE);
            s7sgpa.setVisibility(View.GONE);
            s8sgpa.setVisibility(View.GONE);
            s9sgpa.setVisibility(View.GONE);
            s10sgpa.setVisibility(View.GONE);
            s11sgpa.setVisibility(View.GONE);
            s12sgpa.setVisibility(View.GONE);
            s4crdt.setVisibility(View.GONE);
            s5crdt.setVisibility(View.GONE);
            s6crdt.setVisibility(View.GONE);
            s7crdt.setVisibility(View.GONE);
            s8crdt.setVisibility(View.GONE);
            s9crdt.setVisibility(View.GONE);
            s10crdt.setVisibility(View.GONE);
            s11crdt.setVisibility(View.GONE);
            s12crdt.setVisibility(View.GONE);
            Semi4_sgpa.setVisibility(View.GONE);
            Semi4_credit.setVisibility(View.GONE);
            Semi5_sgpa.setVisibility(View.GONE);
            Semi5_credit.setVisibility(View.GONE);
            Semi6_sgpa.setVisibility(View.GONE);
            Semi6_credit.setVisibility(View.GONE);
            Semi7_sgpa.setVisibility(View.GONE);
            Semi7_credit.setVisibility(View.GONE);
            Semi8_sgpa.setVisibility(View.GONE);
            Semi8_credit.setVisibility(View.GONE);
            Semi9_sgpa.setVisibility(View.GONE);
            Semi9_credit.setVisibility(View.GONE);
            Semi10_sgpa.setVisibility(View.GONE);
            Semi10_credit.setVisibility(View.GONE);
            Semi11_sgpa.setVisibility(View.GONE);
            Semi11_credit.setVisibility(View.GONE);
            Semi12_sgpa.setVisibility(View.GONE);
            Semi12_credit.setVisibility(View.GONE);
        }
        if (choosen_semi.equals("4th")) {
            s5sgpa.setVisibility(View.GONE);
            s6sgpa.setVisibility(View.GONE);
            s7sgpa.setVisibility(View.GONE);
            s8sgpa.setVisibility(View.GONE);
            s9sgpa.setVisibility(View.GONE);
            s10sgpa.setVisibility(View.GONE);
            s11sgpa.setVisibility(View.GONE);
            s12sgpa.setVisibility(View.GONE);
            s5crdt.setVisibility(View.GONE);
            s6crdt.setVisibility(View.GONE);
            s7crdt.setVisibility(View.GONE);
            s8crdt.setVisibility(View.GONE);
            s9crdt.setVisibility(View.GONE);
            s10crdt.setVisibility(View.GONE);
            s11crdt.setVisibility(View.GONE);
            s12crdt.setVisibility(View.GONE);
            Semi5_sgpa.setVisibility(View.GONE);
            Semi5_credit.setVisibility(View.GONE);
            Semi6_sgpa.setVisibility(View.GONE);
            Semi6_credit.setVisibility(View.GONE);
            Semi7_sgpa.setVisibility(View.GONE);
            Semi7_credit.setVisibility(View.GONE);
            Semi8_sgpa.setVisibility(View.GONE);
            Semi8_credit.setVisibility(View.GONE);
            Semi9_sgpa.setVisibility(View.GONE);
            Semi9_credit.setVisibility(View.GONE);
            Semi10_sgpa.setVisibility(View.GONE);
            Semi10_credit.setVisibility(View.GONE);
            Semi11_sgpa.setVisibility(View.GONE);
            Semi11_credit.setVisibility(View.GONE);
            Semi12_sgpa.setVisibility(View.GONE);
            Semi12_credit.setVisibility(View.GONE);
        }
        if (choosen_semi.equals("5th")) {
            s6sgpa.setVisibility(View.GONE);
            s7sgpa.setVisibility(View.GONE);
            s8sgpa.setVisibility(View.GONE);
            s9sgpa.setVisibility(View.GONE);
            s10sgpa.setVisibility(View.GONE);
            s11sgpa.setVisibility(View.GONE);
            s12sgpa.setVisibility(View.GONE);
            s6crdt.setVisibility(View.GONE);
            s7crdt.setVisibility(View.GONE);
            s8crdt.setVisibility(View.GONE);
            s9crdt.setVisibility(View.GONE);
            s10crdt.setVisibility(View.GONE);
            s11crdt.setVisibility(View.GONE);
            s12crdt.setVisibility(View.GONE);
            Semi6_sgpa.setVisibility(View.GONE);
            Semi6_credit.setVisibility(View.GONE);
            Semi7_sgpa.setVisibility(View.GONE);
            Semi7_credit.setVisibility(View.GONE);
            Semi8_sgpa.setVisibility(View.GONE);
            Semi8_credit.setVisibility(View.GONE);
            Semi9_sgpa.setVisibility(View.GONE);
            Semi9_credit.setVisibility(View.GONE);
            Semi10_sgpa.setVisibility(View.GONE);
            Semi10_credit.setVisibility(View.GONE);
            Semi11_sgpa.setVisibility(View.GONE);
            Semi11_credit.setVisibility(View.GONE);
            Semi12_sgpa.setVisibility(View.GONE);
            Semi12_credit.setVisibility(View.GONE);
        }
        if (choosen_semi.equals("6th")) {
            s7sgpa.setVisibility(View.GONE);
            s8sgpa.setVisibility(View.GONE);
            s9sgpa.setVisibility(View.GONE);
            s10sgpa.setVisibility(View.GONE);
            s11sgpa.setVisibility(View.GONE);
            s12sgpa.setVisibility(View.GONE);
            s7crdt.setVisibility(View.GONE);
            s8crdt.setVisibility(View.GONE);
            s9crdt.setVisibility(View.GONE);
            s10crdt.setVisibility(View.GONE);
            s11crdt.setVisibility(View.GONE);
            s12crdt.setVisibility(View.GONE);
            Semi7_sgpa.setVisibility(View.GONE);
            Semi7_credit.setVisibility(View.GONE);
            Semi8_sgpa.setVisibility(View.GONE);
            Semi8_credit.setVisibility(View.GONE);
            Semi9_sgpa.setVisibility(View.GONE);
            Semi9_credit.setVisibility(View.GONE);
            Semi10_sgpa.setVisibility(View.GONE);
            Semi10_credit.setVisibility(View.GONE);
            Semi11_sgpa.setVisibility(View.GONE);
            Semi11_credit.setVisibility(View.GONE);
            Semi12_sgpa.setVisibility(View.GONE);
            Semi12_credit.setVisibility(View.GONE);
        }
        if (choosen_semi.equals("7th")) {
            s8sgpa.setVisibility(View.GONE);
            s9sgpa.setVisibility(View.GONE);
            s10sgpa.setVisibility(View.GONE);
            s11sgpa.setVisibility(View.GONE);
            s12sgpa.setVisibility(View.GONE);
            s8crdt.setVisibility(View.GONE);
            s9crdt.setVisibility(View.GONE);
            s10crdt.setVisibility(View.GONE);
            s11crdt.setVisibility(View.GONE);
            s12crdt.setVisibility(View.GONE);
            Semi8_sgpa.setVisibility(View.GONE);
            Semi8_credit.setVisibility(View.GONE);
            Semi9_sgpa.setVisibility(View.GONE);
            Semi9_credit.setVisibility(View.GONE);
            Semi10_sgpa.setVisibility(View.GONE);
            Semi10_credit.setVisibility(View.GONE);
            Semi11_sgpa.setVisibility(View.GONE);
            Semi11_credit.setVisibility(View.GONE);
            Semi12_sgpa.setVisibility(View.GONE);
            Semi12_credit.setVisibility(View.GONE);
        }
        if (choosen_semi.equals("8th")) {
            s9sgpa.setVisibility(View.GONE);
            s10sgpa.setVisibility(View.GONE);
            s11sgpa.setVisibility(View.GONE);
            s12sgpa.setVisibility(View.GONE);
            s9crdt.setVisibility(View.GONE);
            s10crdt.setVisibility(View.GONE);
            s11crdt.setVisibility(View.GONE);
            s12crdt.setVisibility(View.GONE);
            Semi9_sgpa.setVisibility(View.GONE);
            Semi9_credit.setVisibility(View.GONE);
            Semi10_sgpa.setVisibility(View.GONE);
            Semi10_credit.setVisibility(View.GONE);
            Semi11_sgpa.setVisibility(View.GONE);
            Semi11_credit.setVisibility(View.GONE);
            Semi12_sgpa.setVisibility(View.GONE);
            Semi12_credit.setVisibility(View.GONE);
        }
        if (choosen_semi.equals("9th")) {
            s10sgpa.setVisibility(View.GONE);
            s11sgpa.setVisibility(View.GONE);
            s12sgpa.setVisibility(View.GONE);
            s10crdt.setVisibility(View.GONE);
            s11crdt.setVisibility(View.GONE);
            s12crdt.setVisibility(View.GONE);
            Semi10_sgpa.setVisibility(View.GONE);
            Semi10_credit.setVisibility(View.GONE);
            Semi11_sgpa.setVisibility(View.GONE);
            Semi11_credit.setVisibility(View.GONE);
            Semi12_sgpa.setVisibility(View.GONE);
            Semi12_credit.setVisibility(View.GONE);
        }
        if (choosen_semi.equals("10th")) {
            s11sgpa.setVisibility(View.GONE);
            s12sgpa.setVisibility(View.GONE);
            s11crdt.setVisibility(View.GONE);
            s12crdt.setVisibility(View.GONE);
            Semi11_sgpa.setVisibility(View.GONE);
            Semi11_credit.setVisibility(View.GONE);
            Semi12_sgpa.setVisibility(View.GONE);
            Semi12_credit.setVisibility(View.GONE);
        }
        if (choosen_semi.equals("11th")) {
            s12sgpa.setVisibility(View.GONE);
            s12crdt.setVisibility(View.GONE);
            Semi12_sgpa.setVisibility(View.GONE);
            Semi12_credit.setVisibility(View.GONE);
        }
        if(choosen_semi.equals("1st")) {
            btn_id.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(Semi1_sgpa.length()==0)
                    {
                        Semi1_sgpa.setError("Please Enter Semiter1 Sgpa");
                    }
                    if(Semi1_credit.length()==0)
                    {
                        Semi1_credit.setError("Please Enter Semiter1 Credit");
                    }
                    else {
                        float sgpa = Float.parseFloat(Semi1_sgpa.getText().toString());
                        int credit = Integer.parseInt(Semi1_credit.getText().toString());
                        float result = ((sgpa * credit) / credit);
                        result_Id.setText("Your CGPA is: " + Float.toString(result));
                    }

                }
            });
        }
        if(choosen_semi.equals("2nd"))
        {
            btn_id.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(Semi1_sgpa.length()==0)
                    {
                        Semi1_sgpa.setError("Please Enter Semister1 Sgpa");
                    }
                    if(Semi1_credit.length()==0)
                    {
                        Semi1_credit.setError("Please Enter Semsiter1 Credit");
                    }
                    if(Semi2_sgpa.length()==0)
                    {
                        Semi2_sgpa.setError("Please Enter Semister2 Sgpa");
                    }
                    if(Semi2_credit.length()==0)
                    {
                        Semi2_credit.setError("Please Enter Semister2 Credit");
                    }
                    else {
                        float sgpa1 = Float.parseFloat(Semi1_sgpa.getText().toString());
                        int credit1 = Integer.parseInt(Semi1_credit.getText().toString());
                        float sgpa2 = Float.parseFloat(Semi2_sgpa.getText().toString());
                        int credit2 = Integer.parseInt(Semi2_credit.getText().toString());
                        float sum_credit = credit1 + credit2;
                        float total1 = (sgpa1 * credit1);
                        float total2 = (sgpa2 * credit2);
                        float total = (total1 + total2);
                        float result = (total / sum_credit);
                        String result1 = String.format("%.2f", result);
                        result_Id.setText(result1);
                    }
                }
            });
        }
        if(choosen_semi.equals("3rd"))
        {
            btn_id.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (Semi1_sgpa.length() == 0) {
                        Semi1_sgpa.setError("Please Enter Semister1 Sgpa");
                    }
                    if (Semi1_credit.length() == 0) {
                        Semi1_credit.setError("Please Enter Semister1 Credit");
                    }
                    if (Semi2_sgpa.length() == 0) {
                        Semi2_sgpa.setError("Please Enter Semister2 Sgpa");
                    }
                    if (Semi2_credit.length() == 0) {
                        Semi2_credit.setError("Please Enter Semister2 Credit");
                    }
                    if (Semi3_sgpa.length() == 0) {
                        Semi3_sgpa.setError("Please Enter Semister3 Sgpa");
                    }
                    if (Semi3_credit.length() == 0) {
                        Semi3_credit.setError("Please Enter Semister3 Credit");
                    }
                    else {
                    float sgpa1 = Float.parseFloat(Semi1_sgpa.getText().toString());
                    int credit1= Integer.parseInt(Semi1_credit.getText().toString());
                    float sgpa2 = Float.parseFloat(Semi2_sgpa.getText().toString());
                    int credit2= Integer.parseInt(Semi2_credit.getText().toString());
                    float sgpa3 = Float.parseFloat(Semi3_sgpa.getText().toString());
                    int credit3= Integer.parseInt(Semi3_credit.getText().toString());
                    float sum_credit=credit1+credit2+credit3;
                    float total1=(sgpa1*credit1);
                    float total2 =(sgpa2*credit2);
                    float total3 =(sgpa3*credit3);
                    float total=(total1+total2+total3);
                    float result=(total/sum_credit);
                    String result1=String.format("%.2f",result);
                    result_Id.setText(result1);
                }
                }
            });
        }
        if(choosen_semi.equals("4th"))
        {
            btn_id.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (Semi1_sgpa.length() == 0) {
                        Semi1_sgpa.setError("Please Enter Semister1 Sgpa");
                    }
                    if (Semi1_credit.length() == 0) {
                        Semi1_credit.setError("Please Enter Semister1 Credit");
                    }
                    if (Semi2_sgpa.length() == 0) {
                        Semi2_sgpa.setError("Please Enter Semister2 Sgpa");
                    }
                    if (Semi2_credit.length() == 0) {
                        Semi2_credit.setError("Please Enter Semister2 Credit");
                    }
                    if (Semi3_sgpa.length() == 0) {
                        Semi3_sgpa.setError("Please Enter Semister3 Sgpa");
                    }
                    if (Semi3_credit.length() == 0) {
                        Semi3_credit.setError("Please Enter Semister3 Credit");
                    }
                    if (Semi4_sgpa.length() == 0) {
                        Semi4_sgpa.setError("Please Enter Semister4 Sgpa");
                    }
                    if (Semi4_credit.length() == 0) {
                        Semi4_credit.setError("Please Enter Semister4 Credit");
                    }
                    else {
                        float sgpa1 = Float.parseFloat(Semi1_sgpa.getText().toString());
                        int credit1 = Integer.parseInt(Semi1_credit.getText().toString());
                        float sgpa2 = Float.parseFloat(Semi2_sgpa.getText().toString());
                        int credit2 = Integer.parseInt(Semi2_credit.getText().toString());
                        float sgpa3 = Float.parseFloat(Semi3_sgpa.getText().toString());
                        int credit3 = Integer.parseInt(Semi3_credit.getText().toString());
                        float sgpa4 = Float.parseFloat(Semi4_sgpa.getText().toString());
                        int credit4 = Integer.parseInt(Semi4_credit.getText().toString());
                        float sum_credit = credit1 + credit2 + credit3 + credit4;
                        float total1 = (sgpa1 * credit1);
                        float total2 = (sgpa2 * credit2);
                        float total3 = (sgpa3 * credit3);
                        float total4 = (sgpa4 * credit4);
                        float total = (total1 + total2 + total3 + total4);
                        float result = (total / sum_credit);
                        String result1 = String.format("%.2f", result);
                        result_Id.setText(result1);
                    }
                }
            });
        }
        if(choosen_semi.equals("5th"))
        {
            btn_id.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (Semi1_sgpa.length() == 0) {
                        Semi1_sgpa.setError("Please Enter Semister1 Sgpa");
                    }
                    if (Semi1_credit.length() == 0) {
                        Semi1_credit.setError("Please Enter Semister1 Credit");
                    }
                    if (Semi2_sgpa.length() == 0) {
                        Semi2_sgpa.setError("Please Enter Semister2 Sgpa");
                    }
                    if (Semi2_credit.length() == 0) {
                        Semi2_credit.setError("Please Enter Semister2 Credit");
                    }
                    if (Semi3_sgpa.length() == 0) {
                        Semi3_sgpa.setError("Please Enter Semister3 Sgpa");
                    }
                    if (Semi3_credit.length() == 0) {
                        Semi3_credit.setError("Please Enter Semister3 Credit");
                    }
                    if (Semi4_sgpa.length() == 0) {
                        Semi4_sgpa.setError("Please Enter Semister4 Sgpa");
                    }
                    if (Semi4_credit.length() == 0) {
                        Semi4_credit.setError("Please Enter Semister4 Credit");
                    }
                    if (Semi5_sgpa.length() == 0) {
                        Semi5_sgpa.setError("Please Enter Semister5 Sgpa");
                    }
                    if (Semi5_credit.length() == 0) {
                        Semi5_credit.setError("Please Enter Semister5 Credit");
                    } else {
                        float sgpa1 = Float.parseFloat(Semi1_sgpa.getText().toString());
                        int credit1 = Integer.parseInt(Semi1_credit.getText().toString());
                        float sgpa2 = Float.parseFloat(Semi2_sgpa.getText().toString());
                        int credit2 = Integer.parseInt(Semi2_credit.getText().toString());
                        float sgpa3 = Float.parseFloat(Semi3_sgpa.getText().toString());
                        int credit3 = Integer.parseInt(Semi3_credit.getText().toString());
                        float sgpa4 = Float.parseFloat(Semi4_sgpa.getText().toString());
                        int credit4 = Integer.parseInt(Semi4_credit.getText().toString());
                        float sgpa5 = Float.parseFloat(Semi5_sgpa.getText().toString());
                        int credit5 = Integer.parseInt(Semi5_credit.getText().toString());
                        float sum_credit = credit1 + credit2 + credit3 + credit4 + credit5;
                        float total1 = (sgpa1 * credit1);
                        float total2 = (sgpa2 * credit2);
                        float total3 = (sgpa3 * credit3);
                        float total4 = (sgpa4 * credit4);
                        float total5 = (sgpa5 * credit5);
                        float total = (total1 + total2 + total3 + total4 + total5);
                        float result = (total / sum_credit);
                        String result1 = String.format("%.2f", result);
                        result_Id.setText("Your CGPA is: " + result1);
                    }
                }
            });
        }
        if(choosen_semi.equals("6th"))
        {
            btn_id.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (Semi1_sgpa.length() == 0) {
                        Semi1_sgpa.setError("Please Enter Semister1 Sgpa");
                    }
                    if (Semi1_credit.length() == 0) {
                        Semi1_credit.setError("Please Enter Semister1 Credit");
                    }
                    if (Semi2_sgpa.length() == 0) {
                        Semi2_sgpa.setError("Please Enter Semister2 Sgpa");
                    }
                    if (Semi2_credit.length() == 0) {
                        Semi2_credit.setError("Please Enter Semister2 Credit");
                    }
                    if (Semi3_sgpa.length() == 0) {
                        Semi3_sgpa.setError("Please Enter Semister3 Sgpa");
                    }
                    if (Semi3_credit.length() == 0) {
                        Semi3_credit.setError("Please Enter Semister3 Credit");
                    }
                    if (Semi4_sgpa.length() == 0) {
                        Semi4_sgpa.setError("Please Enter Semister4 Sgpa");
                    }
                    if (Semi4_credit.length() == 0) {
                        Semi4_credit.setError("Please Enter Semister4 Credit");
                    }
                    if (Semi5_sgpa.length() == 0) {
                        Semi5_sgpa.setError("Please Enter Semister5 Sgpa");
                    }
                    if (Semi5_credit.length() == 0) {
                        Semi5_credit.setError("Please Enter Semister5 Credit");
                    }
                    if (Semi6_sgpa.length() == 0) {
                        Semi6_sgpa.setError("Please Enter Semister6 Sgpa");
                    }
                    if (Semi6_credit.length() == 0) {
                        Semi6_credit.setError("Please Enter Semister6 Credit");
                    } else {
                        float sgpa1 = Float.parseFloat(Semi1_sgpa.getText().toString());
                        int credit1 = Integer.parseInt(Semi1_credit.getText().toString());
                        float sgpa2 = Float.parseFloat(Semi2_sgpa.getText().toString());
                        int credit2 = Integer.parseInt(Semi2_credit.getText().toString());
                        float sgpa3 = Float.parseFloat(Semi3_sgpa.getText().toString());
                        int credit3 = Integer.parseInt(Semi3_credit.getText().toString());
                        float sgpa4 = Float.parseFloat(Semi4_sgpa.getText().toString());
                        int credit4 = Integer.parseInt(Semi4_credit.getText().toString());
                        float sgpa5 = Float.parseFloat(Semi5_sgpa.getText().toString());
                        int credit5 = Integer.parseInt(Semi5_credit.getText().toString());
                        float sgpa6 = Float.parseFloat(Semi6_sgpa.getText().toString());
                        int credit6 = Integer.parseInt(Semi6_credit.getText().toString());
                        float sum_credit = credit1 + credit2 + credit3 + credit4 + credit5 + credit6;
                        float total1 = (sgpa1 * credit1);
                        float total2 = (sgpa2 * credit2);
                        float total3 = (sgpa3 * credit3);
                        float total4 = (sgpa4 * credit4);
                        float total5 = (sgpa5 * credit5);
                        float total6 = (sgpa6 * credit6);
                        float total = (total1 + total2 + total3 + total4 + total5 + total6);
                        float result = (total / sum_credit);
                        String result1 = String.format("%.2f", result);
                        result_Id.setText("Your CGPA is: " + result1);
                    }
                }
            });
        }
        if(choosen_semi.equals("7th"))
        {
            btn_id.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (Semi1_sgpa.length() == 0) {
                        Semi1_sgpa.setError("Please Enter Semister1 Sgpa");
                    }
                    if (Semi1_credit.length() == 0) {
                        Semi1_credit.setError("Please Enter Semister1 Credit");
                    }
                    if (Semi2_sgpa.length() == 0) {
                        Semi2_sgpa.setError("Please Enter Semister2 Sgpa");
                    }
                    if (Semi2_credit.length() == 0) {
                        Semi2_credit.setError("Please Enter Semister2 Credit");
                    }
                    if (Semi3_sgpa.length() == 0) {
                        Semi3_sgpa.setError("Please Enter Semister3 Sgpa");
                    }
                    if (Semi3_credit.length() == 0) {
                        Semi3_credit.setError("Please Enter Semister3 Credit");
                    }
                    if (Semi4_sgpa.length() == 0) {
                        Semi4_sgpa.setError("Please Enter Semister4 Sgpa");
                    }
                    if (Semi4_credit.length() == 0) {
                        Semi4_credit.setError("Please Enter Semister4 Credit");
                    }
                    if (Semi5_sgpa.length() == 0) {
                        Semi5_sgpa.setError("Please Enter Semister5 Sgpa");
                    }
                    if (Semi5_credit.length() == 0) {
                        Semi5_credit.setError("Please Enter Semister5 Credit");
                    }
                    if (Semi6_sgpa.length() == 0) {
                        Semi6_sgpa.setError("Please Enter Semister6 Sgpa");
                    }
                    if (Semi6_credit.length() == 0) {
                        Semi6_credit.setError("Please Enter Semister6 Credit");
                    }
                    if (Semi7_sgpa.length() == 0) {
                        Semi7_sgpa.setError("Please Enter Semister7 Sgpa");
                    }
                    if (Semi7_credit.length() == 0) {
                        Semi7_credit.setError("Please Enter Semister7 Credit");
                    } else {
                        float sgpa1 = Float.parseFloat(Semi1_sgpa.getText().toString());
                        int credit1 = Integer.parseInt(Semi1_credit.getText().toString());
                        float sgpa2 = Float.parseFloat(Semi2_sgpa.getText().toString());
                        int credit2 = Integer.parseInt(Semi2_credit.getText().toString());
                        float sgpa3 = Float.parseFloat(Semi3_sgpa.getText().toString());
                        int credit3 = Integer.parseInt(Semi3_credit.getText().toString());
                        float sgpa4 = Float.parseFloat(Semi4_sgpa.getText().toString());
                        int credit4 = Integer.parseInt(Semi4_credit.getText().toString());
                        float sgpa5 = Float.parseFloat(Semi5_sgpa.getText().toString());
                        int credit5 = Integer.parseInt(Semi5_credit.getText().toString());
                        float sgpa6 = Float.parseFloat(Semi6_sgpa.getText().toString());
                        int credit6 = Integer.parseInt(Semi6_credit.getText().toString());
                        float sgpa7 = Float.parseFloat(Semi7_sgpa.getText().toString());
                        int credit7 = Integer.parseInt(Semi7_credit.getText().toString());
                        float sum_credit = credit1 + credit2 + credit3 + credit4 + credit5 + credit6 + credit7;
                        float total1 = (sgpa1 * credit1);
                        float total2 = (sgpa2 * credit2);
                        float total3 = (sgpa3 * credit3);
                        float total4 = (sgpa4 * credit4);
                        float total5 = (sgpa5 * credit5);
                        float total6 = (sgpa6 * credit6);
                        float tota7 = (sgpa7 * credit7);
                        float total = (total1 + total2 + total3 + total4 + total5 + total6 + tota7);
                        float result = (total / sum_credit);
                        String result1 = String.format("%.2f", result);
                        result_Id.setText("Your CGPA is: " + result1);
                    }
                }
            });
        }
        if(choosen_semi.equals("8th"))
        {
            btn_id.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (Semi1_sgpa.length() == 0) {
                        Semi1_sgpa.setError("Please Enter Semister1 Sgpa");
                    }
                    if (Semi1_credit.length() == 0) {
                        Semi1_credit.setError("Please Enter Semister1 Credit");
                    }
                    if (Semi2_sgpa.length() == 0) {
                        Semi2_sgpa.setError("Please Enter Semister2 Sgpa");
                    }
                    if (Semi2_credit.length() == 0) {
                        Semi2_credit.setError("Please Enter Semister2 Credit");
                    }
                    if (Semi3_sgpa.length() == 0) {
                        Semi3_sgpa.setError("Please Enter Semister3 Sgpa");
                    }
                    if (Semi3_credit.length() == 0) {
                        Semi3_credit.setError("Please Enter Semister3 Credit");
                    }
                    if (Semi4_sgpa.length() == 0) {
                        Semi4_sgpa.setError("Please Enter Semister4 Sgpa");
                    }
                    if (Semi4_credit.length() == 0) {
                        Semi4_credit.setError("Please Enter Semister4 Credit");
                    }
                    if (Semi5_sgpa.length() == 0) {
                        Semi5_sgpa.setError("Please Enter Semister5 Sgpa");
                    }
                    if (Semi5_credit.length() == 0) {
                        Semi5_credit.setError("Please Enter Semister5 Credit");
                    }
                    if (Semi6_sgpa.length() == 0) {
                        Semi6_sgpa.setError("Please Enter Semister6 Sgpa");
                    }
                    if (Semi6_credit.length() == 0) {
                        Semi6_credit.setError("Please Enter Semister6 Credit");
                    }
                    if (Semi7_sgpa.length() == 0) {
                        Semi7_sgpa.setError("Please Enter Semister7 Sgpa");
                    }
                    if (Semi7_credit.length() == 0) {
                        Semi7_credit.setError("Please Enter Semister7 Credit");
                    }
                    if (Semi8_sgpa.length() == 0) {
                        Semi8_sgpa.setError("Please Enter Semister8 Sgpa");
                    }
                    if (Semi8_credit.length() == 0) {
                        Semi8_credit.setError("Please Enter Semister8 Credit");
                    } else {
                        float sgpa1 = Float.parseFloat(Semi1_sgpa.getText().toString());
                        int credit1 = Integer.parseInt(Semi1_credit.getText().toString());
                        float sgpa2 = Float.parseFloat(Semi2_sgpa.getText().toString());
                        int credit2 = Integer.parseInt(Semi2_credit.getText().toString());
                        float sgpa3 = Float.parseFloat(Semi3_sgpa.getText().toString());
                        int credit3 = Integer.parseInt(Semi3_credit.getText().toString());
                        float sgpa4 = Float.parseFloat(Semi4_sgpa.getText().toString());
                        int credit4 = Integer.parseInt(Semi4_credit.getText().toString());
                        float sgpa5 = Float.parseFloat(Semi5_sgpa.getText().toString());
                        int credit5 = Integer.parseInt(Semi5_credit.getText().toString());
                        float sgpa6 = Float.parseFloat(Semi6_sgpa.getText().toString());
                        int credit6 = Integer.parseInt(Semi6_credit.getText().toString());
                        float sgpa7 = Float.parseFloat(Semi7_sgpa.getText().toString());
                        int credit7 = Integer.parseInt(Semi7_credit.getText().toString());
                        float sgpa8 = Float.parseFloat(Semi8_sgpa.getText().toString());
                        int credit8 = Integer.parseInt(Semi8_credit.getText().toString());
                        float sum_credit = credit1 + credit2 + credit3 + credit4 + credit5 + credit6 + credit7 + credit8;
                        float total1 = (sgpa1 * credit1);
                        float total2 = (sgpa2 * credit2);
                        float total3 = (sgpa3 * credit3);
                        float total4 = (sgpa4 * credit4);
                        float total5 = (sgpa5 * credit5);
                        float total6 = (sgpa6 * credit6);
                        float tota7 = (sgpa7 * credit7);
                        float tota8 = (sgpa8 * credit8);
                        float total = (total1 + total2 + total3 + total4 + total5 + total6 + tota7 + tota8);
                        float result = (total / sum_credit);
                        String result1 = String.format("%.2f", result);
                        result_Id.setText("Your CGPA is: " + result1);
                    }
                }
            });
        }
        if(choosen_semi.equals("9th"))
        {
            btn_id.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (Semi1_sgpa.length() == 0) {
                        Semi1_sgpa.setError("Please Enter Semister1 Sgpa");
                    }
                    if (Semi1_credit.length() == 0) {
                        Semi1_credit.setError("Please Enter Semister1 Credit");
                    }
                    if (Semi2_sgpa.length() == 0) {
                        Semi2_sgpa.setError("Please Enter Semister2 Sgpa");
                    }
                    if (Semi2_credit.length() == 0) {
                        Semi2_credit.setError("Please Enter Semister2 Credit");
                    }
                    if (Semi3_sgpa.length() == 0) {
                        Semi3_sgpa.setError("Please Enter Semister3 Sgpa");
                    }
                    if (Semi3_credit.length() == 0) {
                        Semi3_credit.setError("Please Enter Semister3 Credit");
                    }
                    if (Semi4_sgpa.length() == 0) {
                        Semi4_sgpa.setError("Please Enter Semister4 Sgpa");
                    }
                    if (Semi4_credit.length() == 0) {
                        Semi4_credit.setError("Please Enter Semister4 Credit");
                    }
                    if (Semi5_sgpa.length() == 0) {
                        Semi5_sgpa.setError("Please Enter Semister5 Sgpa");
                    }
                    if (Semi5_credit.length() == 0) {
                        Semi5_credit.setError("Please Enter Semister5 Credit");
                    }
                    if (Semi6_sgpa.length() == 0) {
                        Semi6_sgpa.setError("Please Enter Semister6 Sgpa");
                    }
                    if (Semi6_credit.length() == 0) {
                        Semi6_credit.setError("Please Enter Semister6 Credit");
                    }
                    if (Semi7_sgpa.length() == 0) {
                        Semi7_sgpa.setError("Please Enter Semister7 Sgpa");
                    }
                    if (Semi7_credit.length() == 0) {
                        Semi7_credit.setError("Please Enter Semister7 Credit");
                    }
                    if (Semi8_sgpa.length() == 0) {
                        Semi8_sgpa.setError("Please Enter Semister8 Sgpa");
                    }
                    if (Semi8_credit.length() == 0) {
                        Semi8_credit.setError("Please Enter Semister8 Credit");
                    }
                    if (Semi9_sgpa.length() == 0) {
                        Semi9_sgpa.setError("Please Enter Semister9 Sgpa");
                    }
                    if (Semi9_credit.length() == 0) {
                        Semi9_credit.setError("Please Enter Semister9 Credit");
                    } else {
                        float sgpa1 = Float.parseFloat(Semi1_sgpa.getText().toString());
                        int credit1 = Integer.parseInt(Semi1_credit.getText().toString());
                        float sgpa2 = Float.parseFloat(Semi2_sgpa.getText().toString());
                        int credit2 = Integer.parseInt(Semi2_credit.getText().toString());
                        float sgpa3 = Float.parseFloat(Semi3_sgpa.getText().toString());
                        int credit3 = Integer.parseInt(Semi3_credit.getText().toString());
                        float sgpa4 = Float.parseFloat(Semi4_sgpa.getText().toString());
                        int credit4 = Integer.parseInt(Semi4_credit.getText().toString());
                        float sgpa5 = Float.parseFloat(Semi5_sgpa.getText().toString());
                        int credit5 = Integer.parseInt(Semi5_credit.getText().toString());
                        float sgpa6 = Float.parseFloat(Semi6_sgpa.getText().toString());
                        int credit6 = Integer.parseInt(Semi6_credit.getText().toString());
                        float sgpa7 = Float.parseFloat(Semi7_sgpa.getText().toString());
                        int credit7 = Integer.parseInt(Semi7_credit.getText().toString());
                        float sgpa8 = Float.parseFloat(Semi8_sgpa.getText().toString());
                        int credit8 = Integer.parseInt(Semi8_credit.getText().toString());
                        float sgpa9 = Float.parseFloat(Semi9_sgpa.getText().toString());
                        int credit9 = Integer.parseInt(Semi9_credit.getText().toString());
                        float sum_credit = credit1 + credit2 + credit3 + credit4 + credit5 + credit6 + credit7 + credit8 + credit9;
                        float total1 = (sgpa1 * credit1);
                        float total2 = (sgpa2 * credit2);
                        float total3 = (sgpa3 * credit3);
                        float total4 = (sgpa4 * credit4);
                        float total5 = (sgpa5 * credit5);
                        float total6 = (sgpa6 * credit6);
                        float tota7 = (sgpa7 * credit7);
                        float tota8 = (sgpa8 * credit8);
                        float tota9 = (sgpa9 * credit9);
                        float total = (total1 + total2 + total3 + total4 + total5 + total6 + tota7 + tota8 + tota9);
                        float result = (total / sum_credit);
                        String result1 = String.format("%.2f", result);
                        result_Id.setText("Your CGPA is: " + result1);
                    }
                }
            });
        }
        if(choosen_semi.equals("10th"))
        {
            btn_id.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (Semi1_sgpa.length() == 0) {
                        Semi1_sgpa.setError("Please Enter Semister1 Sgpa");
                    }
                    if (Semi1_credit.length() == 0) {
                        Semi1_credit.setError("Please Enter Semister1 Credit");
                    }
                    if (Semi2_sgpa.length() == 0) {
                        Semi2_sgpa.setError("Please Enter Semister2 Sgpa");
                    }
                    if (Semi2_credit.length() == 0) {
                        Semi2_credit.setError("Please Enter Semister2 Credit");
                    }
                    if (Semi3_sgpa.length() == 0) {
                        Semi3_sgpa.setError("Please Enter Semister3 Sgpa");
                    }
                    if (Semi3_credit.length() == 0) {
                        Semi3_credit.setError("Please Enter Semister3 Credit");
                    }
                    if (Semi4_sgpa.length() == 0) {
                        Semi4_sgpa.setError("Please Enter Semister4 Sgpa");
                    }
                    if (Semi4_credit.length() == 0) {
                        Semi4_credit.setError("Please Enter Semister4 Credit");
                    }
                    if (Semi5_sgpa.length() == 0) {
                        Semi5_sgpa.setError("Please Enter Semister5 Sgpa");
                    }
                    if (Semi5_credit.length() == 0) {
                        Semi5_credit.setError("Please Enter Semister5 Credit");
                    }
                    if (Semi6_sgpa.length() == 0) {
                        Semi6_sgpa.setError("Please Enter Semister6 Sgpa");
                    }
                    if (Semi6_credit.length() == 0) {
                        Semi6_credit.setError("Please Enter Semister6 Credit");
                    }
                    if (Semi7_sgpa.length() == 0) {
                        Semi7_sgpa.setError("Please Enter Semister7 Sgpa");
                    }
                    if (Semi7_credit.length() == 0) {
                        Semi7_credit.setError("Please Enter Semister7 Credit");
                    }
                    if (Semi8_sgpa.length() == 0) {
                        Semi8_sgpa.setError("Please Enter Semister8 Sgpa");
                    }
                    if (Semi8_credit.length() == 0) {
                        Semi8_credit.setError("Please Enter Semister8 Credit");
                    }
                    if (Semi9_sgpa.length() == 0) {
                        Semi9_sgpa.setError("Please Enter Semister9 Sgpa");
                    }
                    if (Semi9_credit.length() == 0) {
                        Semi9_credit.setError("Please Enter Semister9 Credit");
                    }
                    if (Semi10_sgpa.length() == 0) {
                        Semi10_sgpa.setError("Please Enter Semister10 Sgpa");
                    }
                    if (Semi10_credit.length() == 0) {
                        Semi10_credit.setError("Please Enter Semister10 Credit");
                    } else {
                        float sgpa1 = Float.parseFloat(Semi1_sgpa.getText().toString());
                        int credit1 = Integer.parseInt(Semi1_credit.getText().toString());
                        float sgpa2 = Float.parseFloat(Semi2_sgpa.getText().toString());
                        int credit2 = Integer.parseInt(Semi2_credit.getText().toString());
                        float sgpa3 = Float.parseFloat(Semi3_sgpa.getText().toString());
                        int credit3 = Integer.parseInt(Semi3_credit.getText().toString());
                        float sgpa4 = Float.parseFloat(Semi4_sgpa.getText().toString());
                        int credit4 = Integer.parseInt(Semi4_credit.getText().toString());
                        float sgpa5 = Float.parseFloat(Semi5_sgpa.getText().toString());
                        int credit5 = Integer.parseInt(Semi5_credit.getText().toString());
                        float sgpa6 = Float.parseFloat(Semi6_sgpa.getText().toString());
                        int credit6 = Integer.parseInt(Semi6_credit.getText().toString());
                        float sgpa7 = Float.parseFloat(Semi7_sgpa.getText().toString());
                        int credit7 = Integer.parseInt(Semi7_credit.getText().toString());
                        float sgpa8 = Float.parseFloat(Semi8_sgpa.getText().toString());
                        int credit8 = Integer.parseInt(Semi8_credit.getText().toString());
                        float sgpa9 = Float.parseFloat(Semi9_sgpa.getText().toString());
                        int credit9 = Integer.parseInt(Semi9_credit.getText().toString());
                        float sgpa10 = Float.parseFloat(Semi10_sgpa.getText().toString());
                        int credit10 = Integer.parseInt(Semi10_credit.getText().toString());
                        float sum_credit = credit1 + credit2 + credit3 + credit4 + credit5 + credit6 + credit7 + credit8 + credit9 + credit10;
                        float total1 = (sgpa1 * credit1);
                        float total2 = (sgpa2 * credit2);
                        float total3 = (sgpa3 * credit3);
                        float total4 = (sgpa4 * credit4);
                        float total5 = (sgpa5 * credit5);
                        float total6 = (sgpa6 * credit6);
                        float tota7 = (sgpa7 * credit7);
                        float tota8 = (sgpa8 * credit8);
                        float tota9 = (sgpa9 * credit9);
                        float tota10 = (sgpa10 * credit10);
                        float total = (total1 + total2 + total3 + total4 + total5 + total6 + tota7 + tota8 + tota9 + tota10);
                        float result = (total / sum_credit);
                        String result1 = String.format("%.2f", result);
                        result_Id.setText("Your CGPA is: " + result1);
                    }
                }
            });
        }
        if(choosen_semi.equals("11th"))
        {
            btn_id.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (Semi1_sgpa.length() == 0) {
                        Semi1_sgpa.setError("Please Enter Semister1 Sgpa");
                    }
                    if (Semi1_credit.length() == 0) {
                        Semi1_credit.setError("Please Enter Semister1 Credit");
                    }
                    if (Semi2_sgpa.length() == 0) {
                        Semi2_sgpa.setError("Please Enter Semister2 Sgpa");
                    }
                    if (Semi2_credit.length() == 0) {
                        Semi2_credit.setError("Please Enter Semister2 Credit");
                    }
                    if (Semi3_sgpa.length() == 0) {
                        Semi3_sgpa.setError("Please Enter Semister3 Sgpa");
                    }
                    if (Semi3_credit.length() == 0) {
                        Semi3_credit.setError("Please Enter Semister3 Credit");
                    }
                    if (Semi4_sgpa.length() == 0) {
                        Semi4_sgpa.setError("Please Enter Semister4 Sgpa");
                    }
                    if (Semi4_credit.length() == 0) {
                        Semi4_credit.setError("Please Enter Semister4 Credit");
                    }
                    if (Semi5_sgpa.length() == 0) {
                        Semi5_sgpa.setError("Please Enter Semister5 Sgpa");
                    }
                    if (Semi5_credit.length() == 0) {
                        Semi5_credit.setError("Please Enter Semister5 Credit");
                    }
                    if (Semi6_sgpa.length() == 0) {
                        Semi6_sgpa.setError("Please Enter Semister6 Sgpa");
                    }
                    if (Semi6_credit.length() == 0) {
                        Semi6_credit.setError("Please Enter Semister6 Credit");
                    }
                    if (Semi7_sgpa.length() == 0) {
                        Semi7_sgpa.setError("Please Enter Semister7 Sgpa");
                    }
                    if (Semi7_credit.length() == 0) {
                        Semi7_credit.setError("Please Enter Semister7 Credit");
                    }
                    if (Semi8_sgpa.length() == 0) {
                        Semi8_sgpa.setError("Please Enter Semister8 Sgpa");
                    }
                    if (Semi8_credit.length() == 0) {
                        Semi8_credit.setError("Please Enter Semister8 Credit");
                    }
                    if (Semi9_sgpa.length() == 0) {
                        Semi9_sgpa.setError("Please Enter Semister9 Sgpa");
                    }
                    if (Semi9_credit.length() == 0) {
                        Semi9_credit.setError("Please Enter Semister9 Credit");
                    } else {
                        float sgpa1 = Float.parseFloat(Semi1_sgpa.getText().toString());
                        int credit1 = Integer.parseInt(Semi1_credit.getText().toString());
                        float sgpa2 = Float.parseFloat(Semi2_sgpa.getText().toString());
                        int credit2 = Integer.parseInt(Semi2_credit.getText().toString());
                        float sgpa3 = Float.parseFloat(Semi3_sgpa.getText().toString());
                        int credit3 = Integer.parseInt(Semi3_credit.getText().toString());
                        float sgpa4 = Float.parseFloat(Semi4_sgpa.getText().toString());
                        int credit4 = Integer.parseInt(Semi4_credit.getText().toString());
                        float sgpa5 = Float.parseFloat(Semi5_sgpa.getText().toString());
                        int credit5 = Integer.parseInt(Semi5_credit.getText().toString());
                        float sgpa6 = Float.parseFloat(Semi6_sgpa.getText().toString());
                        int credit6 = Integer.parseInt(Semi6_credit.getText().toString());
                        float sgpa7 = Float.parseFloat(Semi7_sgpa.getText().toString());
                        int credit7 = Integer.parseInt(Semi7_credit.getText().toString());
                        float sgpa8 = Float.parseFloat(Semi8_sgpa.getText().toString());
                        int credit8 = Integer.parseInt(Semi8_credit.getText().toString());
                        float sgpa9 = Float.parseFloat(Semi9_sgpa.getText().toString());
                        int credit9 = Integer.parseInt(Semi9_credit.getText().toString());
                        float sum_credit = credit1 + credit2 + credit3 + credit4 + credit5 + credit6 + credit7 + credit8 + credit9;
                        float total1 = (sgpa1 * credit1);
                        float total2 = (sgpa2 * credit2);
                        float total3 = (sgpa3 * credit3);
                        float total4 = (sgpa4 * credit4);
                        float total5 = (sgpa5 * credit5);
                        float total6 = (sgpa6 * credit6);
                        float tota7 = (sgpa7 * credit7);
                        float tota8 = (sgpa8 * credit8);
                        float tota9 = (sgpa9 * credit9);
                        float total = (total1 + total2 + total3 + total4 + total5 + total6 + tota7 + tota8 + tota9);
                        float result = (total / sum_credit);
                        String result1 = String.format("%.2f", result);
                        result_Id.setText("Your CGPA is: " + result1);
                    }
                }
            });
        }
        if(choosen_semi.equals("10th"))
        {
            btn_id.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (Semi1_sgpa.length() == 0) {
                        Semi1_sgpa.setError("Please Enter Semister1 Sgpa");
                    }
                    if (Semi1_credit.length() == 0) {
                        Semi1_credit.setError("Please Enter Semister1 Credit");
                    }
                    if (Semi2_sgpa.length() == 0) {
                        Semi2_sgpa.setError("Please Enter Semister2 Sgpa");
                    }
                    if (Semi2_credit.length() == 0) {
                        Semi2_credit.setError("Please Enter Semister2 Credit");
                    }
                    if (Semi3_sgpa.length() == 0) {
                        Semi3_sgpa.setError("Please Enter Semister3 Sgpa");
                    }
                    if (Semi3_credit.length() == 0) {
                        Semi3_credit.setError("Please Enter Semister3 Credit");
                    }
                    if (Semi4_sgpa.length() == 0) {
                        Semi4_sgpa.setError("Please Enter Semister4 Sgpa");
                    }
                    if (Semi4_credit.length() == 0) {
                        Semi4_credit.setError("Please Enter Semister4 Credit");
                    }
                    if (Semi5_sgpa.length() == 0) {
                        Semi5_sgpa.setError("Please Enter Semister5 Sgpa");
                    }
                    if (Semi5_credit.length() == 0) {
                        Semi5_credit.setError("Please Enter Semister5 Credit");
                    }
                    if (Semi6_sgpa.length() == 0) {
                        Semi6_sgpa.setError("Please Enter Semister6 Sgpa");
                    }
                    if (Semi6_credit.length() == 0) {
                        Semi6_credit.setError("Please Enter Semister6 Credit");
                    }
                    if (Semi7_sgpa.length() == 0) {
                        Semi7_sgpa.setError("Please Enter Semister7 Sgpa");
                    }
                    if (Semi7_credit.length() == 0) {
                        Semi7_credit.setError("Please Enter Semister7 Credit");
                    }
                    if (Semi8_sgpa.length() == 0) {
                        Semi8_sgpa.setError("Please Enter Semister8 Sgpa");
                    }
                    if (Semi8_credit.length() == 0) {
                        Semi8_credit.setError("Please Enter Semister8 Credit");
                    }
                    if (Semi9_sgpa.length() == 0) {
                        Semi9_sgpa.setError("Please Enter Semister9 Sgpa");
                    }
                    if (Semi9_credit.length() == 0) {
                        Semi9_credit.setError("Please Enter Semister9 Credit");
                    }
                    if (Semi10_sgpa.length() == 0) {
                        Semi10_sgpa.setError("Please Enter Semister10 Sgpa");
                    }
                    if (Semi10_credit.length() == 0) {
                        Semi10_credit.setError("Please Enter Semister10 Credit");
                    }
                    if (Semi11_sgpa.length() == 0) {
                        Semi11_sgpa.setError("Please Enter Semister11 Sgpa");
                    }
                    if (Semi11_credit.length() == 0) {
                        Semi11_credit.setError("Please Enter Semister11 Credit");
                    } else {
                        float sgpa1 = Float.parseFloat(Semi1_sgpa.getText().toString());
                        int credit1 = Integer.parseInt(Semi1_credit.getText().toString());
                        float sgpa2 = Float.parseFloat(Semi2_sgpa.getText().toString());
                        int credit2 = Integer.parseInt(Semi2_credit.getText().toString());
                        float sgpa3 = Float.parseFloat(Semi3_sgpa.getText().toString());
                        int credit3 = Integer.parseInt(Semi3_credit.getText().toString());
                        float sgpa4 = Float.parseFloat(Semi4_sgpa.getText().toString());
                        int credit4 = Integer.parseInt(Semi4_credit.getText().toString());
                        float sgpa5 = Float.parseFloat(Semi5_sgpa.getText().toString());
                        int credit5 = Integer.parseInt(Semi5_credit.getText().toString());
                        float sgpa6 = Float.parseFloat(Semi6_sgpa.getText().toString());
                        int credit6 = Integer.parseInt(Semi6_credit.getText().toString());
                        float sgpa7 = Float.parseFloat(Semi7_sgpa.getText().toString());
                        int credit7 = Integer.parseInt(Semi7_credit.getText().toString());
                        float sgpa8 = Float.parseFloat(Semi8_sgpa.getText().toString());
                        int credit8 = Integer.parseInt(Semi8_credit.getText().toString());
                        float sgpa9 = Float.parseFloat(Semi9_sgpa.getText().toString());
                        int credit9 = Integer.parseInt(Semi9_credit.getText().toString());
                        float sgpa10 = Float.parseFloat(Semi10_sgpa.getText().toString());
                        int credit10 = Integer.parseInt(Semi10_credit.getText().toString());
                        float sgpa11 = Float.parseFloat(Semi11_sgpa.getText().toString());
                        int credit11 = Integer.parseInt(Semi11_credit.getText().toString());
                        float sum_credit = credit1 + credit2 + credit3 + credit4 + credit5 + credit6 + credit7 + credit8 + credit9 + credit10 + credit11;
                        float total1 = (sgpa1 * credit1);
                        float total2 = (sgpa2 * credit2);
                        float total3 = (sgpa3 * credit3);
                        float total4 = (sgpa4 * credit4);
                        float total5 = (sgpa5 * credit5);
                        float total6 = (sgpa6 * credit6);
                        float tota7 = (sgpa7 * credit7);
                        float tota8 = (sgpa8 * credit8);
                        float tota9 = (sgpa9 * credit9);
                        float tota10 = (sgpa10 * credit10);
                        float tota11 = (sgpa11 * credit11);
                        float total = (total1 + total2 + total3 + total4 + total5 + total6 + tota7 + tota8 + tota9 + tota10 + tota11);
                        float result = (total / sum_credit);
                        String result1 = String.format("%.2f", result);
                        result_Id.setText("Your CGPA is: " + result1);
                    }
                }
            });
        }
        if(choosen_semi.equals("12th"))
        {
            btn_id.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (Semi1_sgpa.length() == 0) {
                        Semi1_sgpa.setError("Please Enter Semister1 Sgpa");
                    }
                    if (Semi1_credit.length() == 0) {
                        Semi1_credit.setError("Please Enter Semister1 Credit");
                    }
                    if (Semi2_sgpa.length() == 0) {
                        Semi2_sgpa.setError("Please Enter Semister2 Sgpa");
                    }
                    if (Semi2_credit.length() == 0) {
                        Semi2_credit.setError("Please Enter Semister2 Credit");
                    }
                    if (Semi3_sgpa.length() == 0) {
                        Semi3_sgpa.setError("Please Enter Semister3 Sgpa");
                    }
                    if (Semi3_credit.length() == 0) {
                        Semi3_credit.setError("Please Enter Semister3 Credit");
                    }
                    if (Semi4_sgpa.length() == 0) {
                        Semi4_sgpa.setError("Please Enter Semister4 Sgpa");
                    }
                    if (Semi4_credit.length() == 0) {
                        Semi4_credit.setError("Please Enter Semister4 Credit");
                    }
                    if (Semi5_sgpa.length() == 0) {
                        Semi5_sgpa.setError("Please Enter Semister5 Sgpa");
                    }
                    if (Semi5_credit.length() == 0) {
                        Semi5_credit.setError("Please Enter Semister5 Credit");
                    }
                    if (Semi6_sgpa.length() == 0) {
                        Semi6_sgpa.setError("Please Enter Semister6 Sgpa");
                    }
                    if (Semi6_credit.length() == 0) {
                        Semi6_credit.setError("Please Enter Semister6 Credit");
                    }
                    if (Semi7_sgpa.length() == 0) {
                        Semi7_sgpa.setError("Please Enter Semister7 Sgpa");
                    }
                    if (Semi7_credit.length() == 0) {
                        Semi7_credit.setError("Please Enter Semister7 Credit");
                    }
                    if (Semi8_sgpa.length() == 0) {
                        Semi8_sgpa.setError("Please Enter Semister8 Sgpa");
                    }
                    if (Semi8_credit.length() == 0) {
                        Semi8_credit.setError("Please Enter Semister8 Credit");
                    }
                    if (Semi9_sgpa.length() == 0) {
                        Semi9_sgpa.setError("Please Enter Semister9 Sgpa");
                    }
                    if (Semi9_credit.length() == 0) {
                        Semi9_credit.setError("Please Enter Semister9 Credit");
                    }
                    if (Semi10_sgpa.length() == 0) {
                        Semi10_sgpa.setError("Please Enter Semister10 Sgpa");
                    }
                    if (Semi10_credit.length() == 0) {
                        Semi10_credit.setError("Please Enter Semister10 Credit");
                    }
                    if (Semi11_sgpa.length() == 0) {
                        Semi11_sgpa.setError("Please Enter Semister11 Sgpa");
                    }
                    if (Semi11_credit.length() == 0) {
                        Semi11_credit.setError("Please Enter Semister11 Credit");
                    }
                    if (Semi12_sgpa.length() == 0) {
                        Semi12_sgpa.setError("Please Enter Semister12 Sgpa");
                    }
                    if (Semi12_credit.length() == 0) {
                        Semi12_credit.setError("Please Enter Semister12 Credit");
                    } else {
                        float sgpa1 = Float.parseFloat(Semi1_sgpa.getText().toString());
                        int credit1 = Integer.parseInt(Semi1_credit.getText().toString());
                        float sgpa2 = Float.parseFloat(Semi2_sgpa.getText().toString());
                        int credit2 = Integer.parseInt(Semi2_credit.getText().toString());
                        float sgpa3 = Float.parseFloat(Semi3_sgpa.getText().toString());
                        int credit3 = Integer.parseInt(Semi3_credit.getText().toString());
                        float sgpa4 = Float.parseFloat(Semi4_sgpa.getText().toString());
                        int credit4 = Integer.parseInt(Semi4_credit.getText().toString());
                        float sgpa5 = Float.parseFloat(Semi5_sgpa.getText().toString());
                        int credit5 = Integer.parseInt(Semi5_credit.getText().toString());
                        float sgpa6 = Float.parseFloat(Semi6_sgpa.getText().toString());
                        int credit6 = Integer.parseInt(Semi6_credit.getText().toString());
                        float sgpa7 = Float.parseFloat(Semi7_sgpa.getText().toString());
                        int credit7 = Integer.parseInt(Semi7_credit.getText().toString());
                        float sgpa8 = Float.parseFloat(Semi8_sgpa.getText().toString());
                        int credit8 = Integer.parseInt(Semi8_credit.getText().toString());
                        float sgpa9 = Float.parseFloat(Semi9_sgpa.getText().toString());
                        int credit9 = Integer.parseInt(Semi9_credit.getText().toString());
                        float sgpa10 = Float.parseFloat(Semi10_sgpa.getText().toString());
                        int credit10 = Integer.parseInt(Semi10_credit.getText().toString());
                        float sgpa11 = Float.parseFloat(Semi11_sgpa.getText().toString());
                        int credit11 = Integer.parseInt(Semi11_credit.getText().toString());
                        float sgpa12 = Float.parseFloat(Semi12_sgpa.getText().toString());
                        int credit12 = Integer.parseInt(Semi12_credit.getText().toString());
                        float sum_credit = credit1 + credit2 + credit3 + credit4 + credit5 + credit6 + credit7 + credit8 + credit9 + credit10 + credit11 + credit12;
                        float total1 = (sgpa1 * credit1);
                        float total2 = (sgpa2 * credit2);
                        float total3 = (sgpa3 * credit3);
                        float total4 = (sgpa4 * credit4);
                        float total5 = (sgpa5 * credit5);
                        float total6 = (sgpa6 * credit6);
                        float tota7 = (sgpa7 * credit7);
                        float tota8 = (sgpa8 * credit8);
                        float tota9 = (sgpa9 * credit9);
                        float tota10 = (sgpa10 * credit10);
                        float tota11 = (sgpa11 * credit11);
                        float tota12 = (sgpa12 * credit12);
                        float total = (total1 + total2 + total3 + total4 + total5 + total6 + tota7 + tota8 + tota9 + tota10 + tota11 + tota12);
                        float result = (total / sum_credit);
                        String result1 = String.format("%.2f", result);
                        result_Id.setText("Your CGPA is: " + result1);
                    }
                }
            });
        }
    }
    private TextWatcher pass =new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            String cgpa1= Semi1_sgpa.getText().toString().trim();
            String credit1= Semi1_credit.getText().toString().trim();
            String cgpa2= Semi2_sgpa.getText().toString().trim();
            String credit2= Semi2_credit.getText().toString().trim();
            String cgpa3= Semi3_sgpa.getText().toString().trim();
            String credit3= Semi3_credit.getText().toString().trim();
            String cgpa4= Semi4_sgpa.getText().toString().trim();
            String credit4= Semi4_credit.getText().toString().trim();
            String cgpa5= Semi5_sgpa.getText().toString().trim();
            String credit5= Semi5_credit.getText().toString().trim();
            String cgpa6= Semi6_sgpa.getText().toString().trim();
            String credit6= Semi6_credit.getText().toString().trim();
            String cgpa7= Semi7_sgpa.getText().toString().trim();
            String credit7= Semi7_credit.getText().toString().trim();
            String cgpa8= Semi8_sgpa.getText().toString().trim();
            String credit8= Semi8_credit.getText().toString().trim();
            String cgpa9= Semi9_sgpa.getText().toString().trim();
            String credit9= Semi9_credit.getText().toString().trim();
            String cgpa10= Semi10_sgpa.getText().toString().trim();
            String credit10= Semi10_credit.getText().toString().trim();
            String cgpa11= Semi11_sgpa.getText().toString().trim();
            String credit11= Semi11_credit.getText().toString().trim();
            String cgpa12= Semi12_sgpa.getText().toString().trim();
            String credit12= Semi12_credit.getText().toString().trim();
            btn_id.setEnabled(!cgpa1.isEmpty()&&!credit1.isEmpty()&&!cgpa2.isEmpty()&&!credit2.isEmpty()&&!cgpa3.isEmpty()&&!credit3.isEmpty()&&!cgpa4.isEmpty()&&!credit4.isEmpty()&&!cgpa5.isEmpty()&&!credit5.isEmpty()&&!cgpa6.isEmpty()&&!credit6.isEmpty()&&!cgpa7.isEmpty()&&!credit7.isEmpty()&&!cgpa8.isEmpty()&&!credit8.isEmpty()&&!cgpa9.isEmpty()&&!credit9.isEmpty()&&!cgpa10.isEmpty()&&!credit10.isEmpty()&&!cgpa11.isEmpty()&&!credit11.isEmpty()&&!cgpa12.isEmpty()&&!credit12.isEmpty());
        }

        @Override
        public void afterTextChanged(Editable editable) {

        }
    };
}
//Developed By Sourabh Roy Biswes