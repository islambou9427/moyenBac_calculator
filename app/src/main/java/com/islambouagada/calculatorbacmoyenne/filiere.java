package com.islambouagada.calculatorbacmoyenne;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.islambouagada.calculatorbacmoyenne.filireee.moy_arab;
import com.islambouagada.calculatorbacmoyenne.filireee.moy_gest;
import com.islambouagada.calculatorbacmoyenne.filireee.moy_langue;
import com.islambouagada.calculatorbacmoyenne.filireee.moy_math;
import com.islambouagada.calculatorbacmoyenne.filireee.moy_science;
import com.islambouagada.calculatorbacmoyenne.filireee.moy_tm;

public class filiere extends AppCompatActivity {
CardView btn_sc,btn_tm,btn_math,btn_ges,btn_arab,btn_lang;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.filiere);
        btn_sc = findViewById(R.id.btn_sc);
        btn_tm = findViewById(R.id.btn_tm);
        btn_math = findViewById(R.id.btn_math);
        btn_ges = findViewById(R.id.btn_ges);
        btn_arab = findViewById(R.id.btn_arab);
        btn_lang = findViewById(R.id.btn_lang);


        btn_sc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(filiere.this, moy_science.class);
                startActivity(a);
            }
        });
        btn_tm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(filiere.this, moy_tm.class);
                startActivity(a);
            }
        });
        btn_math.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(filiere.this, moy_math.class);
                startActivity(a);
            }
        });
        btn_ges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(filiere.this, moy_gest.class);
                startActivity(a);
            }
        });
        btn_arab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(filiere.this, moy_arab.class);
                startActivity(a);
            }
        });
        btn_lang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(filiere.this, moy_langue.class);
                startActivity(a);
            }
        });
    }
}
