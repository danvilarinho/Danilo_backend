package com.example.danilo.danilo_pfc.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.danilo.danilo_pfc.R;

/**
 * Created by Danilo on 03/01/2017.
 */



public class MenuActivity extends Activity {

    private ImageButton imageButtonBack;
    private ImageButton imageButtonNext;
    private ImageButton imageButtonOpt;
    private ImageButton imageButtonLetras;
    private ImageButton imageButtonSilab;
    private ImageButton imageButtonSent;

    private RadioGroup radioGroupOpt;
    private RadioButton radioButtonLetras;
    private RadioButton radioButtonSilab;
    private RadioButton radioButtonSent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);


        radioGroupOpt = (RadioGroup) findViewById(R.id.rg_opt);
        radioButtonLetras = (RadioButton)findViewById(R.id.rb_letras);
        radioButtonSilab = (RadioButton) findViewById(R.id.rb_silab);
        radioButtonSent = (RadioButton) findViewById(R.id.rb_sent);

        imageButtonBack = (ImageButton) findViewById(R.id.btn_back);
        imageButtonNext = (ImageButton) findViewById(R.id.btn_next);
        imageButtonOpt = (ImageButton) findViewById(R.id.btn_opt);
        imageButtonLetras = (ImageButton) findViewById(R.id.btn_letras);
        imageButtonSilab = (ImageButton) findViewById(R.id.btn_silabas);
        imageButtonSent = (ImageButton) findViewById(R.id.btn_sentencas);


        imageButtonBack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                finish();
            }
        });

        imageButtonNext.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent intent = new Intent(MenuActivity.this, IconesActivity.class);

                if(radioGroupOpt.getCheckedRadioButtonId() == radioButtonLetras.getId()){

                    intent.putExtra("opt", "LETRAS");

                } else if(radioGroupOpt.getCheckedRadioButtonId() == radioButtonSilab.getId()){

                    intent.putExtra("opt", "SILABAS");

                } else if(radioGroupOpt.getCheckedRadioButtonId() == radioButtonSent.getId()){

                    intent.putExtra("opt", "SENTENCAS");

                }

                startActivity(intent);


            }


        });

        imageButtonOpt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



            }
        });

        imageButtonLetras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



            }
        });

        imageButtonSilab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



            }
        });

        imageButtonSent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



            }
        });


    }

}
