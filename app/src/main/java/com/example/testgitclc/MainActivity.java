package com.example.testgitclc;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button B1,B2,B3,B4,B5,B6,B7,B8,B9,B0,Badd,Bsub,Bmlt,Bdiv,Bequ,Bpoint,BAC,BMOD;
    double var1,var2;
    boolean add,sub,mul,div,mod;
    TextView ans;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        B1 = findViewById(R.id.b1);
        B2 = findViewById(R.id.b2);
        B3 = findViewById(R.id.b3);
        B4 = findViewById(R.id.b4);
        B5 = findViewById(R.id.b5);
        B6 = findViewById(R.id.b6);
        B7 = findViewById(R.id.b7);
        B8 = findViewById(R.id.b8);
        B9 = findViewById(R.id.b9);
        B0 = findViewById(R.id.bzero);
        Badd = findViewById(R.id.badd);
        Bsub = findViewById(R.id.bsub);
        Bmlt = findViewById(R.id.bmlt);
        Bdiv = findViewById(R.id.bdiv);
        Bequ = findViewById(R.id.bequ);
        Bpoint = findViewById(R.id.bpoint);
        BAC = findViewById(R.id.bAC);
        BMOD = findViewById(R.id.bMOD);
        ans = (TextView) findViewById(R.id.content);


        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText() + "1");


            }
        });
        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText() + "2");

            }
        });
        B3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText() + "3");

            }
        });
        B4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ans.setText(ans.getText() + "4");
            }
        });
        B5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText() + "5");

            }
        });
        B6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ans.setText(ans.getText() + "6");
            }
        });
        B7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ans.setText(ans.getText() + "7");
            }
        });
        B8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText() + "8");

            }
        });

        B9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ans.setText(ans.getText() + "9");
            }
        });
        B0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText() + "0");

            }
        });

        Badd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(ans==null){
                    ans.setText("");
                }
                else{
                    var1=Double.parseDouble(ans.getText()+"");
                    add=true;
                    ans.setText(null);
                }
            }
        });
        Bsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(ans==null){
                    ans.setText("");
                }
                else{
                    var1=Double.parseDouble(ans.getText()+"");
                    sub=true;
                    ans.setText(null);
                }
            }
        });
        Bmlt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(ans==null){
                    ans.setText("");
                }
                else{
                    var1=Double.parseDouble(ans.getText()+"");
                    mul=true;
                    ans.setText(null);
                }

            }
        });
        Bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ans==null){
                    ans.setText("");
                }
                else{
                    var1=Double.parseDouble(ans.getText()+"");
                    div=true;
                    ans.setText(null);
                }

            }
        });
        Bpoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText()+".");

            }
        });
        BAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ans.setText(null);
            }
        });
        BMOD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ans==null){
                    ans.setText("");
                }
                else{
                    var1=Double.parseDouble(ans.getText()+"");
                    mod=true;
                    ans.setText(null);
                }

            }
        });

        Bequ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var2=Double.parseDouble(ans.getText()+"");
                if(add==true){
                    ans.setText(var1+var2+"");
                    add=false;
                }
                if(sub==true){
                    ans.setText(var1-var2+"");
                    sub=false;
                }
                if(mul==true){
                    ans.setText(var1*var2+"");
                    mul=false;
                }
                if(div==true){
                    ans.setText(var1/var2+"");
                    div=false;
                }
                if(mod==true){
                    if(var2==0){
                        ans.setText("error");
                    }
                    else{
                        ans.setText(var1%var2+"");
                        mod=false;
                    }
                }


            }
        });

    }

}
