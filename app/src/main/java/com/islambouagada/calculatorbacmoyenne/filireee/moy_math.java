package com.islambouagada.calculatorbacmoyenne.filireee;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.islambouagada.calculatorbacmoyenne.R;
import com.islambouagada.calculatorbacmoyenne.filiere;

public class moy_math extends AppCompatActivity {

    Button btn_back,btn_result;
    EditText note_sc,note_phis,note_math,note_arab,note_fr,note_eng,note_fal,note_geo,note_isl,note_sport;
    TextView fi_txt,aff_moy,de_txt,aff_mo;
    ImageView image_pop,close_img,image_tris,close_im;
    Dialog epi_Dialog,epi_Dialog_Tris;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.moy_math);

        btn_back = findViewById(R.id.btn_back);
        close_im = findViewById(R.id.close_im);
        btn_result = findViewById(R.id.btn_result);
        de_txt = findViewById(R.id.de_txt);
        aff_mo = findViewById(R.id.aff_mo);

        image_tris = findViewById(R.id.image_tris);
        note_sc = findViewById(R.id.note_sc);
        note_phis = findViewById(R.id.note_phis);
        note_math = findViewById(R.id.note_math);
        note_arab = findViewById(R.id.note_arab);
        note_fr = findViewById(R.id.note_fr);
        note_eng = findViewById(R.id.note_eng);
        note_fal = findViewById(R.id.note_fal);
        note_geo = findViewById(R.id.note_geo);
        note_isl = findViewById(R.id.note_isl);
        note_sport = findViewById(R.id.note_sport);
        image_pop = findViewById(R.id.image_pop);

        aff_moy = findViewById(R.id.aff_moy);
        fi_txt = findViewById(R.id.fi_txt);
        close_img = findViewById(R.id.close_img);

        epi_Dialog = new Dialog(this);
        epi_Dialog_Tris = new Dialog(this);

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(moy_math.this, filiere.class);
                startActivity(a);
            }
        });

        btn_result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                shawMessage();
            }

        });



    }

    public void shawMessage() {
        epi_Dialog.setContentView(R.layout.popup);
        epi_Dialog_Tris.setContentView(R.layout.popupdesole);

        close_im = epi_Dialog.findViewById(R.id.close_im);
        fi_txt = epi_Dialog.findViewById(R.id.fi_txt);
        image_pop = epi_Dialog.findViewById(R.id.image_pop);
        aff_mo = epi_Dialog.findViewById(R.id.aff_mo);

        close_img = epi_Dialog_Tris.findViewById(R.id.close_img);
        de_txt = epi_Dialog_Tris.findViewById(R.id.de_txt);
        image_tris = epi_Dialog_Tris.findViewById(R.id.image_tris);
        aff_moy = epi_Dialog_Tris.findViewById(R.id.aff_moy);

        if(note_sc.length()==0 && note_arab.length()==0 && note_phis.length()==0 && note_math.length()==0 && note_eng.length()==0 && note_fal.length()==0 && note_fr.length()==0 && note_geo.length()==0 && note_isl.length()==0 && note_sport.length()==0){
            note_sc.setError("Entrer la note");
            note_arab.setError("Entrer la note");
            note_phis.setError("Entrer la note");
            note_math.setError("Entrer la note");
            note_eng.setError("Entrer la note");
            note_fal.setError("Entrer la note");
            note_fr.setError("Entrer la note");
            note_geo.setError("Entrer la note");
            note_isl.setError("Entrer la note");
            note_sport.setError("Entrer la note");
        }
        else {

            double n1 = Double.parseDouble(note_sc.getText().toString());
            double n2 = Double.parseDouble(note_phis.getText().toString());
            double n3 = Double.parseDouble(note_math.getText().toString());
            double n4 = Double.parseDouble(note_arab.getText().toString());
            double n5 = Double.parseDouble(note_fr.getText().toString());
            double n6 = Double.parseDouble(note_eng.getText().toString());
            double n7 = Double.parseDouble(note_fal.getText().toString());
            double n8 = Double.parseDouble(note_geo.getText().toString());
            double n9 = Double.parseDouble(note_isl.getText().toString());
            double n10 = Double.parseDouble(note_sport.getText().toString());
            double n11 = (n1 * 7 + n2 * 6 + n3 * 3 + n4 * 2 + n5 * 2 + n6 * 2 + n7 * 2 + n8 * 2 + n9 * 2 + n10 ) / 29 ;

            if( n11 >= 10.00){
                aff_mo.setText(   String.valueOf(n11));
                epi_Dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                epi_Dialog.show();

                close_im.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        epi_Dialog.dismiss();
                    }
                });
            }
            else {
                aff_moy.setText(   String.valueOf(n11));
                epi_Dialog_Tris.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                epi_Dialog_Tris.show();
                close_img.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        epi_Dialog_Tris.dismiss();
                    }
                });

            }








        }





    }
}
